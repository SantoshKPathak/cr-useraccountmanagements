package com.hzn.cr.uam.web.rest;

import com.hzn.cr.uam.service.UsrUserService;
import com.hzn.cr.uam.web.rest.errors.BadRequestAlertException;
import com.hzn.cr.uam.service.dto.UsrUserDTO;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.hzn.cr.uam.domain.UsrUser}.
 */
@RestController
@RequestMapping("/api")
public class UsrUserResource {

    private final Logger log = LoggerFactory.getLogger(UsrUserResource.class);

    private static final String ENTITY_NAME = "userAccountManagementUsrUser";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final UsrUserService usrUserService;

    public UsrUserResource(UsrUserService usrUserService) {
        this.usrUserService = usrUserService;
    }

    /**
     * {@code POST  /usr-users} : Create a new usrUser.
     *
     * @param usrUserDTO the usrUserDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new usrUserDTO, or with status {@code 400 (Bad Request)} if the usrUser has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/usr-users")
    public ResponseEntity<UsrUserDTO> createUsrUser(@Valid @RequestBody UsrUserDTO usrUserDTO) throws URISyntaxException {
        log.debug("REST request to save UsrUser : {}", usrUserDTO);
        if (usrUserDTO.getUsrUid() != null) {
            throw new BadRequestAlertException("A new usrUser cannot already have an ID", ENTITY_NAME, "idexists");
        }
        UsrUserDTO result = usrUserService.save(usrUserDTO);
        return ResponseEntity.created(new URI("/api/usr-users/" + result.getUsrUid()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getUsrUid().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /usr-users} : Updates an existing usrUser.
     *
     * @param usrUserDTO the usrUserDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated usrUserDTO,
     * or with status {@code 400 (Bad Request)} if the usrUserDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the usrUserDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/usr-users")
    public ResponseEntity<UsrUserDTO> updateUsrUser(@Valid @RequestBody UsrUserDTO usrUserDTO) throws URISyntaxException {
        log.debug("REST request to update UsrUser : {}", usrUserDTO);
        if (usrUserDTO.getUsrUid() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        UsrUserDTO result = usrUserService.save(usrUserDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, usrUserDTO.getUsrUid().toString()))
            .body(result);
    }

    /**
     * {@code GET  /usr-users} : get all the usrUsers.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of usrUsers in body.
     */
    @GetMapping("/usr-users")
    public List<UsrUserDTO> getAllUsrUsers() {
        log.debug("REST request to get all UsrUsers");
        return usrUserService.findAll();
    }

    /**
     * {@code GET  /usr-users/:usrUid} : get the "id" usrUser.
     *
     * @param usrUid the id of the usrUserDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the usrUserDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/usr-users/{usrUid}")
    public ResponseEntity<UsrUserDTO> getUsrUser(@PathVariable Integer usrUid) {
        log.debug("REST request to get UsrUser : {}", usrUid);
        Optional<UsrUserDTO> usrUserDTO = usrUserService.findOne(usrUid);
        return ResponseUtil.wrapOrNotFound(usrUserDTO);
    }

    /**
     * {@code DELETE  /usr-users/:usrUid} : delete the "id" usrUser.
     *
     * @param usrUid the usrUid of the usrUserDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/usr-users/{id}")
    public ResponseEntity<Void> deleteUsrUser(@PathVariable Integer usrUid) {
        log.debug("REST request to delete UsrUser : {}", usrUid);
        usrUserService.delete(usrUid);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, usrUid.toString())).build();
    }
}
