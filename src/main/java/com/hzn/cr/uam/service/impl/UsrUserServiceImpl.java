package com.hzn.cr.uam.service.impl;

import com.hzn.cr.uam.service.UsrUserService;
import com.hzn.cr.uam.domain.UsrUser;
import com.hzn.cr.uam.repository.UsrUserRepository;
import com.hzn.cr.uam.service.dto.UsrUserDTO;
import com.hzn.cr.uam.service.mapper.UsrUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link UsrUser}.
 */
@Service
@Transactional
public class UsrUserServiceImpl implements UsrUserService {

    private final Logger log = LoggerFactory.getLogger(UsrUserServiceImpl.class);

    private final UsrUserRepository usrUserRepository;

    private final UsrUserMapper usrUserMapper;

    public UsrUserServiceImpl(UsrUserRepository usrUserRepository, UsrUserMapper usrUserMapper) {
        this.usrUserRepository = usrUserRepository;
        this.usrUserMapper = usrUserMapper;
    }

    @Override
    public UsrUserDTO save(UsrUserDTO usrUserDTO) {
        log.debug("Request to save UsrUser : {}", usrUserDTO);
        UsrUser usrUser = usrUserMapper.toEntity(usrUserDTO);
        usrUser = usrUserRepository.save(usrUser);
        return usrUserMapper.toDto(usrUser);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsrUserDTO> findAll() {
        log.debug("Request to get all UsrUsers");
        return usrUserRepository.findAll().stream()
            .map(usrUserMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<UsrUserDTO> findOne(Integer usrUid) {
        log.debug("Request to get UsrUser : {}", usrUid);
        return usrUserRepository.findById(usrUid)
            .map(usrUserMapper::toDto);
    }

    @Override
    public void delete(Integer usrUid) {
        log.debug("Request to delete UsrUser : {}", usrUid);
        usrUserRepository.deleteById(usrUid);
    }
}
