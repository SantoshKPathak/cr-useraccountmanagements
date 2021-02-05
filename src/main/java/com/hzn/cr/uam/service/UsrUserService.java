package com.hzn.cr.uam.service;

import com.hzn.cr.uam.service.dto.UsrUserDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.hzn.cr.uam.domain.UsrUser}.
 */
public interface UsrUserService {

    /**
     * Save a usrUser.
     *
     * @param usrUserDTO the entity to save.
     * @return the persisted entity.
     */
    UsrUserDTO save(UsrUserDTO usrUserDTO);

    /**
     * Get all the usrUsers.
     *
     * @return the list of entities.
     */
    List<UsrUserDTO> findAll();


    /**
     * Get the "id" usrUser.
     *
     * @param usrUid the id of the entity.
     * @return the entity.
     */
    Optional<UsrUserDTO> findOne(Integer usrUid);

    /**
     * Delete the "usrUid" usrUser.
     *
     * @param usrUid the usrUid of the entity.
     */
    void delete(Integer usrUid);
}
