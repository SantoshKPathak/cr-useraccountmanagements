package com.hzn.cr.uam.repository;

import com.hzn.cr.uam.domain.UsrUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the UsrUser entity.
 *
 * @author santosh pathak
 */
@SuppressWarnings("unused")
@Repository
public interface UserAccountManagementRepository extends JpaRepository<UsrUser, Integer> {

    List<UsrUser> findByUsrId(String userId);
}
