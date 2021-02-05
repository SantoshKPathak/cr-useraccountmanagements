package com.hzn.cr.uam.service;

import com.hzn.cr.uam.domain.UsrUser;
import com.hzn.cr.uam.service.dto.UsrUserDTO;

import java.util.List;

/**
 * Service for managing {@link UsrUser}.
 */
public interface UserAccountManagementService {

    /**
     * Get all the usrUsers for a given userId.
     *
     * @return the list of UsrUserDTO.
     */
    List<UsrUserDTO> findUsersByUserId(String userId);

    UsrUserDTO activateUser(UsrUserDTO existingUser);

    Boolean isUserAccountDisabled(UsrUserDTO user);

    Boolean isUserAccountActive(UsrUserDTO user);

    UsrUserDTO getStaffAccountType(List<UsrUserDTO> dbUsers);
}
