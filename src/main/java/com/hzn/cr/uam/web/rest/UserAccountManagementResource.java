package com.hzn.cr.uam.web.rest;

import com.hzn.cr.uam.service.UserAccountManagementService;
import com.hzn.cr.uam.service.dto.UsrUserDTO;
import com.hzn.cr.uam.web.rest.errors.BadRequestAlertException;
import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * REST controller for managing {@link com.hzn.cr.uam.domain.UsrUser}.
 *
 * @author santosh pathak
 */
@RestController
@RequestMapping("/api")
public class UserAccountManagementResource {

    private final Logger log = LoggerFactory.getLogger(UserAccountManagementResource.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private static final String CR_ENTITY_NAME = "User";

    private final UserAccountManagementService userAccountManagementService;

    public UserAccountManagementResource(UserAccountManagementService userAccountManagementService) {
        this.userAccountManagementService = userAccountManagementService;
    }

    /**
     * {@code PUT  /cr-user/activate} : Activates an existing User account if expired.
     *
     * @param usrUserDTO the usrUserDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and
     * with message body e.g. "result: Success! Expired UserId C12345 is now activated."
     */
    @PutMapping("/user/activate")
    public ResponseEntity<Map<String, String>> activateUser(@Valid @RequestBody UsrUserDTO usrUserDTO) {
        String inputUserId = usrUserDTO.getUsrId().toUpperCase();
        log.debug("REST request to activate CR User : {}",inputUserId);

        Map<String, String> result = new HashMap<String, String>();
        HttpHeaders httpHeaders = null;
        String message = null;

        if (usrUserDTO.getUsrId() == null) {
            throw new BadRequestAlertException("Invalid usrId", CR_ENTITY_NAME, "usrId null");
        }
        List<UsrUserDTO> dbUsrList = userAccountManagementService.findUsersByUserId(usrUserDTO.getUsrId().toUpperCase());

        if (null == dbUsrList || dbUsrList.size() == 0) {
            message = String.format("Failure!! UserId %s not found in CareRadius.",inputUserId);
            result.put("result:",message);
            httpHeaders = HeaderUtil.createFailureAlert(applicationName, false, CR_ENTITY_NAME, inputUserId, message);
            return ResponseEntity.ok().headers(httpHeaders).body(result);
        }
        UsrUserDTO existingStaff = userAccountManagementService.getStaffAccountType(dbUsrList);

        if (userAccountManagementService.isUserAccountActive(existingStaff)) {
            message = String.format("UserId %s is already active in CareRadius.",inputUserId);
            result.put("result:",message);
            httpHeaders = HeaderUtil.createAlert(applicationName, message, inputUserId);
            return ResponseEntity.ok().headers(httpHeaders).body(result);
        }

        if (userAccountManagementService.isUserAccountDisabled(existingStaff)) {
            message = String.format("UserId %s is disabled in CareRadius.Please submit ACM to get access.",inputUserId);
            result.put("result:",message);
            httpHeaders = HeaderUtil.createFailureAlert(applicationName, false, CR_ENTITY_NAME, inputUserId, message);
            return ResponseEntity.ok().headers(httpHeaders).body(result);
        }

        UsrUserDTO updatedRecord = userAccountManagementService.activateUser(existingStaff);
        if(null!= updatedRecord) {
            message = String.format("Success! Expired UserId %s is now activated in CareRadius.",inputUserId);
            result.put("result:",message);
            httpHeaders = HeaderUtil.createAlert(applicationName, message, inputUserId);
            return ResponseEntity.ok().headers(httpHeaders).body(result);
        }
        result.put("result:","No record updated");
        return ResponseEntity.ok(result);
    }
}
