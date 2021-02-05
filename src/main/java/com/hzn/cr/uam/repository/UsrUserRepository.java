package com.hzn.cr.uam.repository;

import com.hzn.cr.uam.domain.UsrUser;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the UsrUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UsrUserRepository extends JpaRepository<UsrUser, Integer> {
}
