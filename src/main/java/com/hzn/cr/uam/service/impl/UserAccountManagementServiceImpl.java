package com.hzn.cr.uam.service.impl;

import com.hzn.cr.uam.domain.UsrUser;
import com.hzn.cr.uam.repository.UserAccountManagementRepository;
import com.hzn.cr.uam.service.UserAccountManagementService;
import com.hzn.cr.uam.service.dto.UsrUserDTO;
import com.hzn.cr.uam.service.mapper.UsrUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author santosh pathak
 */
@Service
@Transactional
public class UserAccountManagementServiceImpl implements UserAccountManagementService {
    private final Logger log = LoggerFactory.getLogger(UserAccountManagementServiceImpl.class);

    @Value("${application.api.user-record.lastUpdatedBy}")
    private Integer lastUpdatedBy;

    private final UserAccountManagementRepository userAccountManagementRepository;

    private final UsrUserMapper usrUserMapper;

    public UserAccountManagementServiceImpl(UserAccountManagementRepository userAccountManagementRepository, UsrUserMapper usrUserMapper) {
        this.userAccountManagementRepository = userAccountManagementRepository;
        this.usrUserMapper = usrUserMapper;
    }

    /**
     * Save a usrUser.
     *
     * @param usrUserDTO the entity to save.
     * @return the persisted UsrUserDTO.
     */
    public UsrUserDTO save(UsrUserDTO usrUserDTO) {
        log.debug("Request to save UsrUser : {}", usrUserDTO);
        UsrUser usrUser = usrUserMapper.toEntity(usrUserDTO);
        usrUser = userAccountManagementRepository.save(usrUser);
        return usrUserMapper.toDto(usrUser);
    }

    /**
     * Get all the UsrUserDTO for a given userId.
     *
     * @return the list of UsrUserDTO.
     */
    @Transactional(readOnly = true)
    public List<UsrUserDTO> findUsersByUserId(String userId) {
        log.debug("Request to get CR user list for a given userId : {}", userId);
        List<UsrUser> users =  userAccountManagementRepository.findByUsrId(userId);
        return users.stream()
            .map(usrUserMapper::toDto)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    public Boolean isUserAccountDisabled(UsrUserDTO existingUser){
       return existingUser.getUsrAccountStatus().equals("D");
    }

    public Boolean isUserAccountActive(UsrUserDTO existingUser){
       return existingUser.getUsrAccountStatus().equals("A")
           && existingUser.getUsrAccountLockedYN().equals("N")
           && (existingUser.getUsrDateAccountExpiration() == null
                || existingUser.getUsrDateAccountExpiration().isAfter(LocalDate.now()))
           && (existingUser.getUsrDatePasswordExpiration() == null
                || existingUser.getUsrDatePasswordExpiration().isAfter(LocalDate.now()));
    }

    public UsrUserDTO activateUser(UsrUserDTO existingUser){
        existingUser.setUsrAccountStatus("A"); //activate account from expired status
        existingUser.setUsrAccountLockedYN("N"); // unlock account
        existingUser.setUsrDateAccountExpiration(null);// remove expiration date
        existingUser.setUsrDatePasswordExpiration(null);
        existingUser.setUsrLastUpdateDate(LocalDate.now()); //current date
        existingUser.setUsrUsrUidUpdatedBy(lastUpdatedBy);// last updated user
        return save(existingUser);
    }


    public UsrUserDTO getStaffAccountType(List<UsrUserDTO> dbUsers){
        //filter the user with user type as STAFF (S)
        return dbUsers.stream()
            .filter(userDTO ->userDTO.getUsrUserType().equals("S")).findFirst().get();
    }

}
