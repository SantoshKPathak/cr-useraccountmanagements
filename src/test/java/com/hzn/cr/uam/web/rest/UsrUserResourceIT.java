package com.hzn.cr.uam.web.rest;

import com.hzn.cr.uam.UserAccountManagementApp;
import com.hzn.cr.uam.domain.UsrUser;
import com.hzn.cr.uam.repository.UsrUserRepository;
import com.hzn.cr.uam.service.UsrUserService;
import com.hzn.cr.uam.service.dto.UsrUserDTO;
import com.hzn.cr.uam.service.mapper.UsrUserMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link UsrUserResource} REST controller.
 */
@SpringBootTest(classes = UserAccountManagementApp.class)
@AutoConfigureMockMvc
@WithMockUser
public class UsrUserResourceIT {

    private static final Integer DEFAULT_USR_UID = 1;
    private static final Integer UPDATED_USR_UID = 2;

    private static final Integer DEFAULT_USR_STF_UID = 1;
    private static final Integer UPDATED_USR_STF_UID = 2;

    private static final String DEFAULT_USR_ID = "AAAAAAAAAA";
    private static final String UPDATED_USR_ID = "BBBBBBBBBB";

    private static final String DEFAULT_USR_ACCOUNT_STATUS = "A";
    private static final String UPDATED_USR_ACCOUNT_STATUS = "B";

    private static final LocalDate DEFAULT_USR_DATE_ACCOUNT_EXPIRATION = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_DATE_ACCOUNT_EXPIRATION = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_USR_ACCOUNT_LOCKED_YN = "A";
    private static final String UPDATED_USR_ACCOUNT_LOCKED_YN = "B";

    private static final String DEFAULT_USR_RECORD_STATUS = "A";
    private static final String UPDATED_USR_RECORD_STATUS = "B";

    private static final LocalDate DEFAULT_USR_DATE_PASSWORD_EXPIRATION = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_DATE_PASSWORD_EXPIRATION = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_USR_USER_TYPE = "A";
    private static final String UPDATED_USR_USER_TYPE = "B";

    private static final LocalDate DEFAULT_USR_RECORD_STATUS_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_RECORD_STATUS_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_USR_CREATE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_CREATE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_USR_USR_UID_CREATED_BY = 1;
    private static final Integer UPDATED_USR_USR_UID_CREATED_BY = 2;

    private static final Integer DEFAULT_USR_USR_UID_UPDATED_BY = 1;
    private static final Integer UPDATED_USR_USR_UID_UPDATED_BY = 2;

    private static final LocalDate DEFAULT_USR_LAST_UPDATE_DATE = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_LAST_UPDATE_DATE = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_USR_DB_LOGIN_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_DB_LOGIN_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_DB_LOGIN_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_USR_DB_LOGIN_PASSWORD = "BBBBBBBBBB";

    private static final String DEFAULT_USR_APP_LOGIN_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_APP_LOGIN_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_APP_LOGIN_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_USR_APP_LOGIN_PASSWORD = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_USR_DATE_APP_LOGIN_PASSWORD = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_DATE_APP_LOGIN_PASSWORD = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_USR_FORCE_NEW_PASSWORD_DAYS = 1;
    private static final Integer UPDATED_USR_FORCE_NEW_PASSWORD_DAYS = 2;

    private static final Integer DEFAULT_USR_GRACE_LOGINS_REMAINING = 1;
    private static final Integer UPDATED_USR_GRACE_LOGINS_REMAINING = 2;

    private static final String DEFAULT_USR_DATE_TIME_RESTRICTIONS = "AAAAAAAAAA";
    private static final String UPDATED_USR_DATE_TIME_RESTRICTIONS = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PREV_APP_LOGIN_PASSWD_1 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PREV_APP_LOGIN_PASSWD_1 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PREV_APP_LOGIN_PASSWD_2 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PREV_APP_LOGIN_PASSWD_2 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PREV_APP_LOGIN_PASSWD_3 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PREV_APP_LOGIN_PASSWD_3 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PREV_APP_LOGIN_PASSWD_4 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PREV_APP_LOGIN_PASSWD_4 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PREV_APP_LOGIN_PASSWD_5 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PREV_APP_LOGIN_PASSWD_5 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_STAFF_ACCESS_PRIVILEGE = "A";
    private static final String UPDATED_USR_STAFF_ACCESS_PRIVILEGE = "B";

    private static final String DEFAULT_USR_VIEW_RESTRICTED_EVENT_YN = "A";
    private static final String UPDATED_USR_VIEW_RESTRICTED_EVENT_YN = "B";

    private static final String DEFAULT_USR_USE_DEFAULTS_YN = "A";
    private static final String UPDATED_USR_USE_DEFAULTS_YN = "B";

    private static final String DEFAULT_USR_SOUNDEX_NAME_SEARCH_YN = "A";
    private static final String UPDATED_USR_SOUNDEX_NAME_SEARCH_YN = "B";

    private static final String DEFAULT_USR_SHOW_INACTIVE_RECORDS_YN = "A";
    private static final String UPDATED_USR_SHOW_INACTIVE_RECORDS_YN = "B";

    private static final String DEFAULT_USR_CONTROL_CENTER_YN = "A";
    private static final String UPDATED_USR_CONTROL_CENTER_YN = "B";

    private static final String DEFAULT_USR_TOOLBAR_SHOW_YN = "A";
    private static final String UPDATED_USR_TOOLBAR_SHOW_YN = "B";

    private static final String DEFAULT_USR_TOOLBAR_TEXT_YN = "A";
    private static final String UPDATED_USR_TOOLBAR_TEXT_YN = "B";

    private static final String DEFAULT_USR_TOOLBAR_POSITION = "A";
    private static final String UPDATED_USR_TOOLBAR_POSITION = "B";

    private static final String DEFAULT_USR_SAVE_SETTINGS_YN = "A";
    private static final String UPDATED_USR_SAVE_SETTINGS_YN = "B";

    private static final String DEFAULT_USR_WILDCARD_MATCH_YN = "A";
    private static final String UPDATED_USR_WILDCARD_MATCH_YN = "B";

    private static final String DEFAULT_USR_VIEW_VIP_PMI_YN = "A";
    private static final String UPDATED_USR_VIEW_VIP_PMI_YN = "B";

    private static final String DEFAULT_USR_VIEW_EMPLOYEE_PMI_YN = "A";
    private static final String UPDATED_USR_VIEW_EMPLOYEE_PMI_YN = "B";

    private static final String DEFAULT_USR_VIEW_RESTRICTED_PMI_YN = "A";
    private static final String UPDATED_USR_VIEW_RESTRICTED_PMI_YN = "B";

    private static final String DEFAULT_USR_VERIFICATION_RIGHTS_YN = "A";
    private static final String UPDATED_USR_VERIFICATION_RIGHTS_YN = "B";

    private static final String DEFAULT_USR_SHOW_VERIFICATION_YN = "A";
    private static final String UPDATED_USR_SHOW_VERIFICATION_YN = "B";

    private static final String DEFAULT_USR_WGR_CODE_DEFAULT = "AAAAAA";
    private static final String UPDATED_USR_WGR_CODE_DEFAULT = "BBBBBB";

    private static final String DEFAULT_USR_CLASSIFICATION_ACCESS = "A";
    private static final String UPDATED_USR_CLASSIFICATION_ACCESS = "B";

    private static final String DEFAULT_USR_DEPARTMENTAL_ACCESS = "A";
    private static final String UPDATED_USR_DEPARTMENTAL_ACCESS = "B";

    private static final String DEFAULT_USR_ASSOC_REVIEW_DPT_ACCESS = "A";
    private static final String UPDATED_USR_ASSOC_REVIEW_DPT_ACCESS = "B";

    private static final String DEFAULT_USR_ASSOC_REVIEW_HSV_ACCESS = "A";
    private static final String UPDATED_USR_ASSOC_REVIEW_HSV_ACCESS = "B";

    private static final String DEFAULT_USR_ASSOC_REVIEW_CMM_ACCESS = "A";
    private static final String UPDATED_USR_ASSOC_REVIEW_CMM_ACCESS = "B";

    private static final String DEFAULT_USR_INCLUDE_DPT_STAFF_YN = "A";
    private static final String UPDATED_USR_INCLUDE_DPT_STAFF_YN = "B";

    private static final String DEFAULT_USR_INCLUDE_HSV_STAFF_YN = "A";
    private static final String UPDATED_USR_INCLUDE_HSV_STAFF_YN = "B";

    private static final String DEFAULT_USR_INCLUDE_CMM_MEMBERS_YN = "A";
    private static final String UPDATED_USR_INCLUDE_CMM_MEMBERS_YN = "B";

    private static final String DEFAULT_USR_CLAIM_CATEGORY_ACCESS = "A";
    private static final String UPDATED_USR_CLAIM_CATEGORY_ACCESS = "B";

    private static final String DEFAULT_USR_REVIEW_TRACK_ACCESS = "A";
    private static final String UPDATED_USR_REVIEW_TRACK_ACCESS = "B";

    private static final String DEFAULT_USR_ISSUE_OWNER_DPT_ACCESS = "A";
    private static final String UPDATED_USR_ISSUE_OWNER_DPT_ACCESS = "B";

    private static final String DEFAULT_USR_ISSUE_OWNER_CMM_ACCESS = "A";
    private static final String UPDATED_USR_ISSUE_OWNER_CMM_ACCESS = "B";

    private static final String DEFAULT_USR_ISSUE_OWNER_HSV_ACCESS = "A";
    private static final String UPDATED_USR_ISSUE_OWNER_HSV_ACCESS = "B";

    private static final Integer DEFAULT_USR_TASK_LIST_REFRESH = 1;
    private static final Integer UPDATED_USR_TASK_LIST_REFRESH = 2;

    private static final String DEFAULT_USR_PPF_CODE = "AAAAAA";
    private static final String UPDATED_USR_PPF_CODE = "BBBBBB";

    private static final String DEFAULT_USR_LINK_SMC_TO_RLC_YN = "A";
    private static final String UPDATED_USR_LINK_SMC_TO_RLC_YN = "B";

    private static final Integer DEFAULT_USR_REMOTE_ID = 1;
    private static final Integer UPDATED_USR_REMOTE_ID = 2;

    private static final String DEFAULT_USR_EXTERNAL_FAX_ID = "AAAAAAAAAA";
    private static final String UPDATED_USR_EXTERNAL_FAX_ID = "BBBBBBBBBB";

    private static final Integer DEFAULT_USR_SESSIONS_MAX = 1;
    private static final Integer UPDATED_USR_SESSIONS_MAX = 2;

    private static final String DEFAULT_USR_FLOAT_TOOLBAR_YN = "A";
    private static final String UPDATED_USR_FLOAT_TOOLBAR_YN = "B";

    private static final Integer DEFAULT_USR_BOOKMARK_X = 1;
    private static final Integer UPDATED_USR_BOOKMARK_X = 2;

    private static final Integer DEFAULT_USR_BOOKMARK_Y = 1;
    private static final Integer UPDATED_USR_BOOKMARK_Y = 2;

    private static final Integer DEFAULT_USR_BOOKMARK_HEIGHT = 1;
    private static final Integer UPDATED_USR_BOOKMARK_HEIGHT = 2;

    private static final Integer DEFAULT_USR_BOOKMARK_WIDTH = 1;
    private static final Integer UPDATED_USR_BOOKMARK_WIDTH = 2;

    private static final Integer DEFAULT_USR_NUM_RECENT_LIST = 1;
    private static final Integer UPDATED_USR_NUM_RECENT_LIST = 2;

    private static final String DEFAULT_USR_DISPLAY_BOOKMARKS_YN = "A";
    private static final String UPDATED_USR_DISPLAY_BOOKMARKS_YN = "B";

    private static final Integer DEFAULT_USR_RECORD_VERSION = 1;
    private static final Integer UPDATED_USR_RECORD_VERSION = 2;

    private static final String DEFAULT_USR_NAME_KEY = "AAAAAAAAAA";
    private static final String UPDATED_USR_NAME_KEY = "BBBBBBBBBB";

    private static final String DEFAULT_USR_LAST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_LAST_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_FIRST_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_FIRST_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_MIDDLE_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_MIDDLE_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_FORMATTED_NAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_FORMATTED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_USR_NAME_SOUNDEX = "AAAAAAAAAA";
    private static final String UPDATED_USR_NAME_SOUNDEX = "BBBBBBBBBB";

    private static final String DEFAULT_USR_ADDRESS_LINE_1 = "AAAAAAAAAA";
    private static final String UPDATED_USR_ADDRESS_LINE_1 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_ADDRESS_LINE_2 = "AAAAAAAAAA";
    private static final String UPDATED_USR_ADDRESS_LINE_2 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_CITY = "AAAAAAAAAA";
    private static final String UPDATED_USR_CITY = "BBBBBBBBBB";

    private static final String DEFAULT_USR_STA_CODE = "AAAAAA";
    private static final String UPDATED_USR_STA_CODE = "BBBBBB";

    private static final String DEFAULT_USR_PHONE_1 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PHONE_1 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PHONE_2 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PHONE_2 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_PHONE_3 = "AAAAAAAAAA";
    private static final String UPDATED_USR_PHONE_3 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_FAX = "AAAAAAAAAA";
    private static final String UPDATED_USR_FAX = "BBBBBBBBBB";

    private static final String DEFAULT_USR_EMAIL_1 = "AAAAAAAAAA";
    private static final String UPDATED_USR_EMAIL_1 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_EMAIL_2 = "AAAAAAAAAA";
    private static final String UPDATED_USR_EMAIL_2 = "BBBBBBBBBB";

    private static final String DEFAULT_USR_POC_CODE = "AAAAAAAAAA";
    private static final String UPDATED_USR_POC_CODE = "BBBBBBBBBB";

    private static final String DEFAULT_USR_POSTAL_EXTENSION = "AAAA";
    private static final String UPDATED_USR_POSTAL_EXTENSION = "BBBB";

    private static final String DEFAULT_USR_CNT_CODE = "AAA";
    private static final String UPDATED_USR_CNT_CODE = "BBB";

    private static final Integer DEFAULT_USR_PFP_UID = 1;
    private static final Integer UPDATED_USR_PFP_UID = 2;

    private static final String DEFAULT_USR_SCHEDULE_RESTRICTIONS_YN = "A";
    private static final String UPDATED_USR_SCHEDULE_RESTRICTIONS_YN = "B";

    private static final Integer DEFAULT_USR_LOGIN_ATTEMPTS_REMAINING = 1;
    private static final Integer UPDATED_USR_LOGIN_ATTEMPTS_REMAINING = 2;

    private static final LocalDate DEFAULT_USR_LAST_PME_REFRESH_TIMESTAMP = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_USR_LAST_PME_REFRESH_TIMESTAMP = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_USR_SISENSE_USERNAME = "AAAAAAAAAA";
    private static final String UPDATED_USR_SISENSE_USERNAME = "BBBBBBBBBB";

    @Autowired
    private UsrUserRepository usrUserRepository;

    @Autowired
    private UsrUserMapper usrUserMapper;

    @Autowired
    private UsrUserService usrUserService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restUsrUserMockMvc;

    private UsrUser usrUser;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static UsrUser createEntity(EntityManager em) {
        UsrUser usrUser = new UsrUser()
            .usrUid(DEFAULT_USR_UID)
            .usrStfUid(DEFAULT_USR_STF_UID)
            .usrId(DEFAULT_USR_ID)
            .usrAccountStatus(DEFAULT_USR_ACCOUNT_STATUS)
            .usrDateAccountExpiration(DEFAULT_USR_DATE_ACCOUNT_EXPIRATION)
            .usrAccountLockedYN(DEFAULT_USR_ACCOUNT_LOCKED_YN)
            .usrRecordStatus(DEFAULT_USR_RECORD_STATUS)
            .usrDatePasswordExpiration(DEFAULT_USR_DATE_PASSWORD_EXPIRATION)
            .usrUserType(DEFAULT_USR_USER_TYPE)
            .usrRecordStatusDate(DEFAULT_USR_RECORD_STATUS_DATE)
            .usrCreateDate(DEFAULT_USR_CREATE_DATE)
            .usrUsrUidCreatedBy(DEFAULT_USR_USR_UID_CREATED_BY)
            .usrUsrUidUpdatedBy(DEFAULT_USR_USR_UID_UPDATED_BY)
            .usrLastUpdateDate(DEFAULT_USR_LAST_UPDATE_DATE)
            .usrDbLoginName(DEFAULT_USR_DB_LOGIN_NAME)
            .usrDbLoginPassword(DEFAULT_USR_DB_LOGIN_PASSWORD)
            .usrAppLoginName(DEFAULT_USR_APP_LOGIN_NAME)
            .usrAppLoginPassword(DEFAULT_USR_APP_LOGIN_PASSWORD)
            .usrDateAppLoginPassword(DEFAULT_USR_DATE_APP_LOGIN_PASSWORD)
            .usrForceNewPasswordDays(DEFAULT_USR_FORCE_NEW_PASSWORD_DAYS)
            .usrGraceLoginsRemaining(DEFAULT_USR_GRACE_LOGINS_REMAINING)
            .usrDateTimeRestrictions(DEFAULT_USR_DATE_TIME_RESTRICTIONS)
            .usrPrevAppLoginPasswd1(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_1)
            .usrPrevAppLoginPasswd2(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_2)
            .usrPrevAppLoginPasswd3(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_3)
            .usrPrevAppLoginPasswd4(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_4)
            .usrPrevAppLoginPasswd5(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_5)
            .usrStaffAccessPrivilege(DEFAULT_USR_STAFF_ACCESS_PRIVILEGE)
            .usrViewRestrictedEventYN(DEFAULT_USR_VIEW_RESTRICTED_EVENT_YN)
            .usrUseDefaultsYN(DEFAULT_USR_USE_DEFAULTS_YN)
            .usrSoundexNameSearchYN(DEFAULT_USR_SOUNDEX_NAME_SEARCH_YN)
            .usrShowInactiveRecordsYN(DEFAULT_USR_SHOW_INACTIVE_RECORDS_YN)
            .usrControlCenterYN(DEFAULT_USR_CONTROL_CENTER_YN)
            .usrToolbarShowYN(DEFAULT_USR_TOOLBAR_SHOW_YN)
            .usrToolbarTextYN(DEFAULT_USR_TOOLBAR_TEXT_YN)
            .usrToolbarPosition(DEFAULT_USR_TOOLBAR_POSITION)
            .usrSaveSettingsYN(DEFAULT_USR_SAVE_SETTINGS_YN)
            .usrWildcardMatchYN(DEFAULT_USR_WILDCARD_MATCH_YN)
            .usrViewVipPmiYN(DEFAULT_USR_VIEW_VIP_PMI_YN)
            .usrViewEmployeePmiYN(DEFAULT_USR_VIEW_EMPLOYEE_PMI_YN)
            .usrViewRestrictedPmiYN(DEFAULT_USR_VIEW_RESTRICTED_PMI_YN)
            .usrVerificationRightsYN(DEFAULT_USR_VERIFICATION_RIGHTS_YN)
            .usrShowVerificationYN(DEFAULT_USR_SHOW_VERIFICATION_YN)
            .usrWgrCodeDefault(DEFAULT_USR_WGR_CODE_DEFAULT)
            .usrClassificationAccess(DEFAULT_USR_CLASSIFICATION_ACCESS)
            .usrDepartmentalAccess(DEFAULT_USR_DEPARTMENTAL_ACCESS)
            .usrAssocReviewDptAccess(DEFAULT_USR_ASSOC_REVIEW_DPT_ACCESS)
            .usrAssocReviewHsvAccess(DEFAULT_USR_ASSOC_REVIEW_HSV_ACCESS)
            .usrAssocReviewCmmAccess(DEFAULT_USR_ASSOC_REVIEW_CMM_ACCESS)
            .usrIncludeDptStaffYN(DEFAULT_USR_INCLUDE_DPT_STAFF_YN)
            .usrIncludeHsvStaffYN(DEFAULT_USR_INCLUDE_HSV_STAFF_YN)
            .usrIncludeCmmMembersYN(DEFAULT_USR_INCLUDE_CMM_MEMBERS_YN)
            .usrClaimCategoryAccess(DEFAULT_USR_CLAIM_CATEGORY_ACCESS)
            .usrReviewTrackAccess(DEFAULT_USR_REVIEW_TRACK_ACCESS)
            .usrIssueOwnerDptAccess(DEFAULT_USR_ISSUE_OWNER_DPT_ACCESS)
            .usrIssueOwnerCmmAccess(DEFAULT_USR_ISSUE_OWNER_CMM_ACCESS)
            .usrIssueOwnerHsvAccess(DEFAULT_USR_ISSUE_OWNER_HSV_ACCESS)
            .usrTaskListRefresh(DEFAULT_USR_TASK_LIST_REFRESH)
            .usrPpfCode(DEFAULT_USR_PPF_CODE)
            .usrLinkSmcToRlcYN(DEFAULT_USR_LINK_SMC_TO_RLC_YN)
            .usrRemoteId(DEFAULT_USR_REMOTE_ID)
            .usrExternalFaxId(DEFAULT_USR_EXTERNAL_FAX_ID)
            .usrSessionsMax(DEFAULT_USR_SESSIONS_MAX)
            .usrFloatToolbarYN(DEFAULT_USR_FLOAT_TOOLBAR_YN)
            .usrBookmarkX(DEFAULT_USR_BOOKMARK_X)
            .usrBookmarkY(DEFAULT_USR_BOOKMARK_Y)
            .usrBookmarkHeight(DEFAULT_USR_BOOKMARK_HEIGHT)
            .usrBookmarkWidth(DEFAULT_USR_BOOKMARK_WIDTH)
            .usrNumRecentList(DEFAULT_USR_NUM_RECENT_LIST)
            .usrDisplayBookmarksYN(DEFAULT_USR_DISPLAY_BOOKMARKS_YN)
            .usrRecordVersion(DEFAULT_USR_RECORD_VERSION)
            .usrNameKey(DEFAULT_USR_NAME_KEY)
            .usrLastName(DEFAULT_USR_LAST_NAME)
            .usrFirstName(DEFAULT_USR_FIRST_NAME)
            .usrMiddleName(DEFAULT_USR_MIDDLE_NAME)
            .usrFormattedName(DEFAULT_USR_FORMATTED_NAME)
            .usrNameSoundex(DEFAULT_USR_NAME_SOUNDEX)
            .usrAddressLine1(DEFAULT_USR_ADDRESS_LINE_1)
            .usrAddressLine2(DEFAULT_USR_ADDRESS_LINE_2)
            .usrCity(DEFAULT_USR_CITY)
            .usrStaCode(DEFAULT_USR_STA_CODE)
            .usrPhone1(DEFAULT_USR_PHONE_1)
            .usrPhone2(DEFAULT_USR_PHONE_2)
            .usrPhone3(DEFAULT_USR_PHONE_3)
            .usrFax(DEFAULT_USR_FAX)
            .usrEmail1(DEFAULT_USR_EMAIL_1)
            .usrEmail2(DEFAULT_USR_EMAIL_2)
            .usrPocCode(DEFAULT_USR_POC_CODE)
            .usrPostalExtension(DEFAULT_USR_POSTAL_EXTENSION)
            .usrCntCode(DEFAULT_USR_CNT_CODE)
            .usrPfpUid(DEFAULT_USR_PFP_UID)
            .usrScheduleRestrictionsYN(DEFAULT_USR_SCHEDULE_RESTRICTIONS_YN)
            .usrLoginAttemptsRemaining(DEFAULT_USR_LOGIN_ATTEMPTS_REMAINING)
            .usrLastPmeRefreshTimestamp(DEFAULT_USR_LAST_PME_REFRESH_TIMESTAMP)
            .usrSisenseUsername(DEFAULT_USR_SISENSE_USERNAME);
        return usrUser;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static UsrUser createUpdatedEntity(EntityManager em) {
        UsrUser usrUser = new UsrUser()
            .usrUid(UPDATED_USR_UID)
            .usrStfUid(UPDATED_USR_STF_UID)
            .usrId(UPDATED_USR_ID)
            .usrAccountStatus(UPDATED_USR_ACCOUNT_STATUS)
            .usrDateAccountExpiration(UPDATED_USR_DATE_ACCOUNT_EXPIRATION)
            .usrAccountLockedYN(UPDATED_USR_ACCOUNT_LOCKED_YN)
            .usrRecordStatus(UPDATED_USR_RECORD_STATUS)
            .usrDatePasswordExpiration(UPDATED_USR_DATE_PASSWORD_EXPIRATION)
            .usrUserType(UPDATED_USR_USER_TYPE)
            .usrRecordStatusDate(UPDATED_USR_RECORD_STATUS_DATE)
            .usrCreateDate(UPDATED_USR_CREATE_DATE)
            .usrUsrUidCreatedBy(UPDATED_USR_USR_UID_CREATED_BY)
            .usrUsrUidUpdatedBy(UPDATED_USR_USR_UID_UPDATED_BY)
            .usrLastUpdateDate(UPDATED_USR_LAST_UPDATE_DATE)
            .usrDbLoginName(UPDATED_USR_DB_LOGIN_NAME)
            .usrDbLoginPassword(UPDATED_USR_DB_LOGIN_PASSWORD)
            .usrAppLoginName(UPDATED_USR_APP_LOGIN_NAME)
            .usrAppLoginPassword(UPDATED_USR_APP_LOGIN_PASSWORD)
            .usrDateAppLoginPassword(UPDATED_USR_DATE_APP_LOGIN_PASSWORD)
            .usrForceNewPasswordDays(UPDATED_USR_FORCE_NEW_PASSWORD_DAYS)
            .usrGraceLoginsRemaining(UPDATED_USR_GRACE_LOGINS_REMAINING)
            .usrDateTimeRestrictions(UPDATED_USR_DATE_TIME_RESTRICTIONS)
            .usrPrevAppLoginPasswd1(UPDATED_USR_PREV_APP_LOGIN_PASSWD_1)
            .usrPrevAppLoginPasswd2(UPDATED_USR_PREV_APP_LOGIN_PASSWD_2)
            .usrPrevAppLoginPasswd3(UPDATED_USR_PREV_APP_LOGIN_PASSWD_3)
            .usrPrevAppLoginPasswd4(UPDATED_USR_PREV_APP_LOGIN_PASSWD_4)
            .usrPrevAppLoginPasswd5(UPDATED_USR_PREV_APP_LOGIN_PASSWD_5)
            .usrStaffAccessPrivilege(UPDATED_USR_STAFF_ACCESS_PRIVILEGE)
            .usrViewRestrictedEventYN(UPDATED_USR_VIEW_RESTRICTED_EVENT_YN)
            .usrUseDefaultsYN(UPDATED_USR_USE_DEFAULTS_YN)
            .usrSoundexNameSearchYN(UPDATED_USR_SOUNDEX_NAME_SEARCH_YN)
            .usrShowInactiveRecordsYN(UPDATED_USR_SHOW_INACTIVE_RECORDS_YN)
            .usrControlCenterYN(UPDATED_USR_CONTROL_CENTER_YN)
            .usrToolbarShowYN(UPDATED_USR_TOOLBAR_SHOW_YN)
            .usrToolbarTextYN(UPDATED_USR_TOOLBAR_TEXT_YN)
            .usrToolbarPosition(UPDATED_USR_TOOLBAR_POSITION)
            .usrSaveSettingsYN(UPDATED_USR_SAVE_SETTINGS_YN)
            .usrWildcardMatchYN(UPDATED_USR_WILDCARD_MATCH_YN)
            .usrViewVipPmiYN(UPDATED_USR_VIEW_VIP_PMI_YN)
            .usrViewEmployeePmiYN(UPDATED_USR_VIEW_EMPLOYEE_PMI_YN)
            .usrViewRestrictedPmiYN(UPDATED_USR_VIEW_RESTRICTED_PMI_YN)
            .usrVerificationRightsYN(UPDATED_USR_VERIFICATION_RIGHTS_YN)
            .usrShowVerificationYN(UPDATED_USR_SHOW_VERIFICATION_YN)
            .usrWgrCodeDefault(UPDATED_USR_WGR_CODE_DEFAULT)
            .usrClassificationAccess(UPDATED_USR_CLASSIFICATION_ACCESS)
            .usrDepartmentalAccess(UPDATED_USR_DEPARTMENTAL_ACCESS)
            .usrAssocReviewDptAccess(UPDATED_USR_ASSOC_REVIEW_DPT_ACCESS)
            .usrAssocReviewHsvAccess(UPDATED_USR_ASSOC_REVIEW_HSV_ACCESS)
            .usrAssocReviewCmmAccess(UPDATED_USR_ASSOC_REVIEW_CMM_ACCESS)
            .usrIncludeDptStaffYN(UPDATED_USR_INCLUDE_DPT_STAFF_YN)
            .usrIncludeHsvStaffYN(UPDATED_USR_INCLUDE_HSV_STAFF_YN)
            .usrIncludeCmmMembersYN(UPDATED_USR_INCLUDE_CMM_MEMBERS_YN)
            .usrClaimCategoryAccess(UPDATED_USR_CLAIM_CATEGORY_ACCESS)
            .usrReviewTrackAccess(UPDATED_USR_REVIEW_TRACK_ACCESS)
            .usrIssueOwnerDptAccess(UPDATED_USR_ISSUE_OWNER_DPT_ACCESS)
            .usrIssueOwnerCmmAccess(UPDATED_USR_ISSUE_OWNER_CMM_ACCESS)
            .usrIssueOwnerHsvAccess(UPDATED_USR_ISSUE_OWNER_HSV_ACCESS)
            .usrTaskListRefresh(UPDATED_USR_TASK_LIST_REFRESH)
            .usrPpfCode(UPDATED_USR_PPF_CODE)
            .usrLinkSmcToRlcYN(UPDATED_USR_LINK_SMC_TO_RLC_YN)
            .usrRemoteId(UPDATED_USR_REMOTE_ID)
            .usrExternalFaxId(UPDATED_USR_EXTERNAL_FAX_ID)
            .usrSessionsMax(UPDATED_USR_SESSIONS_MAX)
            .usrFloatToolbarYN(UPDATED_USR_FLOAT_TOOLBAR_YN)
            .usrBookmarkX(UPDATED_USR_BOOKMARK_X)
            .usrBookmarkY(UPDATED_USR_BOOKMARK_Y)
            .usrBookmarkHeight(UPDATED_USR_BOOKMARK_HEIGHT)
            .usrBookmarkWidth(UPDATED_USR_BOOKMARK_WIDTH)
            .usrNumRecentList(UPDATED_USR_NUM_RECENT_LIST)
            .usrDisplayBookmarksYN(UPDATED_USR_DISPLAY_BOOKMARKS_YN)
            .usrRecordVersion(UPDATED_USR_RECORD_VERSION)
            .usrNameKey(UPDATED_USR_NAME_KEY)
            .usrLastName(UPDATED_USR_LAST_NAME)
            .usrFirstName(UPDATED_USR_FIRST_NAME)
            .usrMiddleName(UPDATED_USR_MIDDLE_NAME)
            .usrFormattedName(UPDATED_USR_FORMATTED_NAME)
            .usrNameSoundex(UPDATED_USR_NAME_SOUNDEX)
            .usrAddressLine1(UPDATED_USR_ADDRESS_LINE_1)
            .usrAddressLine2(UPDATED_USR_ADDRESS_LINE_2)
            .usrCity(UPDATED_USR_CITY)
            .usrStaCode(UPDATED_USR_STA_CODE)
            .usrPhone1(UPDATED_USR_PHONE_1)
            .usrPhone2(UPDATED_USR_PHONE_2)
            .usrPhone3(UPDATED_USR_PHONE_3)
            .usrFax(UPDATED_USR_FAX)
            .usrEmail1(UPDATED_USR_EMAIL_1)
            .usrEmail2(UPDATED_USR_EMAIL_2)
            .usrPocCode(UPDATED_USR_POC_CODE)
            .usrPostalExtension(UPDATED_USR_POSTAL_EXTENSION)
            .usrCntCode(UPDATED_USR_CNT_CODE)
            .usrPfpUid(UPDATED_USR_PFP_UID)
            .usrScheduleRestrictionsYN(UPDATED_USR_SCHEDULE_RESTRICTIONS_YN)
            .usrLoginAttemptsRemaining(UPDATED_USR_LOGIN_ATTEMPTS_REMAINING)
            .usrLastPmeRefreshTimestamp(UPDATED_USR_LAST_PME_REFRESH_TIMESTAMP)
            .usrSisenseUsername(UPDATED_USR_SISENSE_USERNAME);
        return usrUser;
    }

    @BeforeEach
    public void initTest() {
        usrUser = createEntity(em);
    }

    @Test
    @Transactional
    public void createUsrUser() throws Exception {
        int databaseSizeBeforeCreate = usrUserRepository.findAll().size();
        // Create the UsrUser
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(usrUser);
        restUsrUserMockMvc.perform(post("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isCreated());

        // Validate the UsrUser in the database
        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeCreate + 1);
        UsrUser testUsrUser = usrUserList.get(usrUserList.size() - 1);
        assertThat(testUsrUser.getUsrUid()).isEqualTo(DEFAULT_USR_UID);
        assertThat(testUsrUser.getUsrStfUid()).isEqualTo(DEFAULT_USR_STF_UID);
        assertThat(testUsrUser.getUsrId()).isEqualTo(DEFAULT_USR_ID);
        assertThat(testUsrUser.getUsrAccountStatus()).isEqualTo(DEFAULT_USR_ACCOUNT_STATUS);
        assertThat(testUsrUser.getUsrDateAccountExpiration()).isEqualTo(DEFAULT_USR_DATE_ACCOUNT_EXPIRATION);
        assertThat(testUsrUser.getUsrAccountLockedYN()).isEqualTo(DEFAULT_USR_ACCOUNT_LOCKED_YN);
        assertThat(testUsrUser.getUsrRecordStatus()).isEqualTo(DEFAULT_USR_RECORD_STATUS);
        assertThat(testUsrUser.getUsrDatePasswordExpiration()).isEqualTo(DEFAULT_USR_DATE_PASSWORD_EXPIRATION);
        assertThat(testUsrUser.getUsrUserType()).isEqualTo(DEFAULT_USR_USER_TYPE);
        assertThat(testUsrUser.getUsrRecordStatusDate()).isEqualTo(DEFAULT_USR_RECORD_STATUS_DATE);
        assertThat(testUsrUser.getUsrCreateDate()).isEqualTo(DEFAULT_USR_CREATE_DATE);
        assertThat(testUsrUser.getUsrUsrUidCreatedBy()).isEqualTo(DEFAULT_USR_USR_UID_CREATED_BY);
        assertThat(testUsrUser.getUsrUsrUidUpdatedBy()).isEqualTo(DEFAULT_USR_USR_UID_UPDATED_BY);
        assertThat(testUsrUser.getUsrLastUpdateDate()).isEqualTo(DEFAULT_USR_LAST_UPDATE_DATE);
        assertThat(testUsrUser.getUsrDbLoginName()).isEqualTo(DEFAULT_USR_DB_LOGIN_NAME);
        assertThat(testUsrUser.getUsrDbLoginPassword()).isEqualTo(DEFAULT_USR_DB_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrAppLoginName()).isEqualTo(DEFAULT_USR_APP_LOGIN_NAME);
        assertThat(testUsrUser.getUsrAppLoginPassword()).isEqualTo(DEFAULT_USR_APP_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrDateAppLoginPassword()).isEqualTo(DEFAULT_USR_DATE_APP_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrForceNewPasswordDays()).isEqualTo(DEFAULT_USR_FORCE_NEW_PASSWORD_DAYS);
        assertThat(testUsrUser.getUsrGraceLoginsRemaining()).isEqualTo(DEFAULT_USR_GRACE_LOGINS_REMAINING);
        assertThat(testUsrUser.getUsrDateTimeRestrictions()).isEqualTo(DEFAULT_USR_DATE_TIME_RESTRICTIONS);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd1()).isEqualTo(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_1);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd2()).isEqualTo(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_2);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd3()).isEqualTo(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_3);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd4()).isEqualTo(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_4);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd5()).isEqualTo(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_5);
        assertThat(testUsrUser.getUsrStaffAccessPrivilege()).isEqualTo(DEFAULT_USR_STAFF_ACCESS_PRIVILEGE);
        assertThat(testUsrUser.getUsrViewRestrictedEventYN()).isEqualTo(DEFAULT_USR_VIEW_RESTRICTED_EVENT_YN);
        assertThat(testUsrUser.getUsrUseDefaultsYN()).isEqualTo(DEFAULT_USR_USE_DEFAULTS_YN);
        assertThat(testUsrUser.getUsrSoundexNameSearchYN()).isEqualTo(DEFAULT_USR_SOUNDEX_NAME_SEARCH_YN);
        assertThat(testUsrUser.getUsrShowInactiveRecordsYN()).isEqualTo(DEFAULT_USR_SHOW_INACTIVE_RECORDS_YN);
        assertThat(testUsrUser.getUsrControlCenterYN()).isEqualTo(DEFAULT_USR_CONTROL_CENTER_YN);
        assertThat(testUsrUser.getUsrToolbarShowYN()).isEqualTo(DEFAULT_USR_TOOLBAR_SHOW_YN);
        assertThat(testUsrUser.getUsrToolbarTextYN()).isEqualTo(DEFAULT_USR_TOOLBAR_TEXT_YN);
        assertThat(testUsrUser.getUsrToolbarPosition()).isEqualTo(DEFAULT_USR_TOOLBAR_POSITION);
        assertThat(testUsrUser.getUsrSaveSettingsYN()).isEqualTo(DEFAULT_USR_SAVE_SETTINGS_YN);
        assertThat(testUsrUser.getUsrWildcardMatchYN()).isEqualTo(DEFAULT_USR_WILDCARD_MATCH_YN);
        assertThat(testUsrUser.getUsrViewVipPmiYN()).isEqualTo(DEFAULT_USR_VIEW_VIP_PMI_YN);
        assertThat(testUsrUser.getUsrViewEmployeePmiYN()).isEqualTo(DEFAULT_USR_VIEW_EMPLOYEE_PMI_YN);
        assertThat(testUsrUser.getUsrViewRestrictedPmiYN()).isEqualTo(DEFAULT_USR_VIEW_RESTRICTED_PMI_YN);
        assertThat(testUsrUser.getUsrVerificationRightsYN()).isEqualTo(DEFAULT_USR_VERIFICATION_RIGHTS_YN);
        assertThat(testUsrUser.getUsrShowVerificationYN()).isEqualTo(DEFAULT_USR_SHOW_VERIFICATION_YN);
        assertThat(testUsrUser.getUsrWgrCodeDefault()).isEqualTo(DEFAULT_USR_WGR_CODE_DEFAULT);
        assertThat(testUsrUser.getUsrClassificationAccess()).isEqualTo(DEFAULT_USR_CLASSIFICATION_ACCESS);
        assertThat(testUsrUser.getUsrDepartmentalAccess()).isEqualTo(DEFAULT_USR_DEPARTMENTAL_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewDptAccess()).isEqualTo(DEFAULT_USR_ASSOC_REVIEW_DPT_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewHsvAccess()).isEqualTo(DEFAULT_USR_ASSOC_REVIEW_HSV_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewCmmAccess()).isEqualTo(DEFAULT_USR_ASSOC_REVIEW_CMM_ACCESS);
        assertThat(testUsrUser.getUsrIncludeDptStaffYN()).isEqualTo(DEFAULT_USR_INCLUDE_DPT_STAFF_YN);
        assertThat(testUsrUser.getUsrIncludeHsvStaffYN()).isEqualTo(DEFAULT_USR_INCLUDE_HSV_STAFF_YN);
        assertThat(testUsrUser.getUsrIncludeCmmMembersYN()).isEqualTo(DEFAULT_USR_INCLUDE_CMM_MEMBERS_YN);
        assertThat(testUsrUser.getUsrClaimCategoryAccess()).isEqualTo(DEFAULT_USR_CLAIM_CATEGORY_ACCESS);
        assertThat(testUsrUser.getUsrReviewTrackAccess()).isEqualTo(DEFAULT_USR_REVIEW_TRACK_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerDptAccess()).isEqualTo(DEFAULT_USR_ISSUE_OWNER_DPT_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerCmmAccess()).isEqualTo(DEFAULT_USR_ISSUE_OWNER_CMM_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerHsvAccess()).isEqualTo(DEFAULT_USR_ISSUE_OWNER_HSV_ACCESS);
        assertThat(testUsrUser.getUsrTaskListRefresh()).isEqualTo(DEFAULT_USR_TASK_LIST_REFRESH);
        assertThat(testUsrUser.getUsrPpfCode()).isEqualTo(DEFAULT_USR_PPF_CODE);
        assertThat(testUsrUser.getUsrLinkSmcToRlcYN()).isEqualTo(DEFAULT_USR_LINK_SMC_TO_RLC_YN);
        assertThat(testUsrUser.getUsrRemoteId()).isEqualTo(DEFAULT_USR_REMOTE_ID);
        assertThat(testUsrUser.getUsrExternalFaxId()).isEqualTo(DEFAULT_USR_EXTERNAL_FAX_ID);
        assertThat(testUsrUser.getUsrSessionsMax()).isEqualTo(DEFAULT_USR_SESSIONS_MAX);
        assertThat(testUsrUser.getUsrFloatToolbarYN()).isEqualTo(DEFAULT_USR_FLOAT_TOOLBAR_YN);
        assertThat(testUsrUser.getUsrBookmarkX()).isEqualTo(DEFAULT_USR_BOOKMARK_X);
        assertThat(testUsrUser.getUsrBookmarkY()).isEqualTo(DEFAULT_USR_BOOKMARK_Y);
        assertThat(testUsrUser.getUsrBookmarkHeight()).isEqualTo(DEFAULT_USR_BOOKMARK_HEIGHT);
        assertThat(testUsrUser.getUsrBookmarkWidth()).isEqualTo(DEFAULT_USR_BOOKMARK_WIDTH);
        assertThat(testUsrUser.getUsrNumRecentList()).isEqualTo(DEFAULT_USR_NUM_RECENT_LIST);
        assertThat(testUsrUser.getUsrDisplayBookmarksYN()).isEqualTo(DEFAULT_USR_DISPLAY_BOOKMARKS_YN);
        assertThat(testUsrUser.getUsrRecordVersion()).isEqualTo(DEFAULT_USR_RECORD_VERSION);
        assertThat(testUsrUser.getUsrNameKey()).isEqualTo(DEFAULT_USR_NAME_KEY);
        assertThat(testUsrUser.getUsrLastName()).isEqualTo(DEFAULT_USR_LAST_NAME);
        assertThat(testUsrUser.getUsrFirstName()).isEqualTo(DEFAULT_USR_FIRST_NAME);
        assertThat(testUsrUser.getUsrMiddleName()).isEqualTo(DEFAULT_USR_MIDDLE_NAME);
        assertThat(testUsrUser.getUsrFormattedName()).isEqualTo(DEFAULT_USR_FORMATTED_NAME);
        assertThat(testUsrUser.getUsrNameSoundex()).isEqualTo(DEFAULT_USR_NAME_SOUNDEX);
        assertThat(testUsrUser.getUsrAddressLine1()).isEqualTo(DEFAULT_USR_ADDRESS_LINE_1);
        assertThat(testUsrUser.getUsrAddressLine2()).isEqualTo(DEFAULT_USR_ADDRESS_LINE_2);
        assertThat(testUsrUser.getUsrCity()).isEqualTo(DEFAULT_USR_CITY);
        assertThat(testUsrUser.getUsrStaCode()).isEqualTo(DEFAULT_USR_STA_CODE);
        assertThat(testUsrUser.getUsrPhone1()).isEqualTo(DEFAULT_USR_PHONE_1);
        assertThat(testUsrUser.getUsrPhone2()).isEqualTo(DEFAULT_USR_PHONE_2);
        assertThat(testUsrUser.getUsrPhone3()).isEqualTo(DEFAULT_USR_PHONE_3);
        assertThat(testUsrUser.getUsrFax()).isEqualTo(DEFAULT_USR_FAX);
        assertThat(testUsrUser.getUsrEmail1()).isEqualTo(DEFAULT_USR_EMAIL_1);
        assertThat(testUsrUser.getUsrEmail2()).isEqualTo(DEFAULT_USR_EMAIL_2);
        assertThat(testUsrUser.getUsrPocCode()).isEqualTo(DEFAULT_USR_POC_CODE);
        assertThat(testUsrUser.getUsrPostalExtension()).isEqualTo(DEFAULT_USR_POSTAL_EXTENSION);
        assertThat(testUsrUser.getUsrCntCode()).isEqualTo(DEFAULT_USR_CNT_CODE);
        assertThat(testUsrUser.getUsrPfpUid()).isEqualTo(DEFAULT_USR_PFP_UID);
        assertThat(testUsrUser.getUsrScheduleRestrictionsYN()).isEqualTo(DEFAULT_USR_SCHEDULE_RESTRICTIONS_YN);
        assertThat(testUsrUser.getUsrLoginAttemptsRemaining()).isEqualTo(DEFAULT_USR_LOGIN_ATTEMPTS_REMAINING);
        assertThat(testUsrUser.getUsrLastPmeRefreshTimestamp()).isEqualTo(DEFAULT_USR_LAST_PME_REFRESH_TIMESTAMP);
        assertThat(testUsrUser.getUsrSisenseUsername()).isEqualTo(DEFAULT_USR_SISENSE_USERNAME);
    }

    @Test
    @Transactional
    public void createUsrUserWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = usrUserRepository.findAll().size();

        // Create the UsrUser with an existing ID
        usrUser.setUsrUid(1);
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(usrUser);

        // An entity with an existing ID cannot be created, so this API call must fail
        restUsrUserMockMvc.perform(post("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isBadRequest());

        // Validate the UsrUser in the database
        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void checkUsrUidIsRequired() throws Exception {
        int databaseSizeBeforeTest = usrUserRepository.findAll().size();
        // set the field null
        usrUser.setUsrUid(null);

        // Create the UsrUser, which fails.
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(usrUser);


        restUsrUserMockMvc.perform(post("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isBadRequest());

        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkUsrRecordVersionIsRequired() throws Exception {
        int databaseSizeBeforeTest = usrUserRepository.findAll().size();
        // set the field null
        usrUser.setUsrRecordVersion(null);

        // Create the UsrUser, which fails.
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(usrUser);


        restUsrUserMockMvc.perform(post("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isBadRequest());

        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllUsrUsers() throws Exception {
        // Initialize the database
        usrUserRepository.saveAndFlush(usrUser);

        // Get all the usrUserList
        restUsrUserMockMvc.perform(get("/api/usr-users?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].usrUid").value(hasItem(DEFAULT_USR_UID)))
            .andExpect(jsonPath("$.[*].usrStfUid").value(hasItem(DEFAULT_USR_STF_UID)))
            .andExpect(jsonPath("$.[*].usrId").value(hasItem(DEFAULT_USR_ID)))
            .andExpect(jsonPath("$.[*].usrAccountStatus").value(hasItem(DEFAULT_USR_ACCOUNT_STATUS)))
            .andExpect(jsonPath("$.[*].usrDateAccountExpiration").value(hasItem(DEFAULT_USR_DATE_ACCOUNT_EXPIRATION.toString())))
            .andExpect(jsonPath("$.[*].usrAccountLockedYN").value(hasItem(DEFAULT_USR_ACCOUNT_LOCKED_YN)))
            .andExpect(jsonPath("$.[*].usrRecordStatus").value(hasItem(DEFAULT_USR_RECORD_STATUS)))
            .andExpect(jsonPath("$.[*].usrDatePasswordExpiration").value(hasItem(DEFAULT_USR_DATE_PASSWORD_EXPIRATION.toString())))
            .andExpect(jsonPath("$.[*].usrUserType").value(hasItem(DEFAULT_USR_USER_TYPE)))
            .andExpect(jsonPath("$.[*].usrRecordStatusDate").value(hasItem(DEFAULT_USR_RECORD_STATUS_DATE.toString())))
            .andExpect(jsonPath("$.[*].usrCreateDate").value(hasItem(DEFAULT_USR_CREATE_DATE.toString())))
            .andExpect(jsonPath("$.[*].usrUsrUidCreatedBy").value(hasItem(DEFAULT_USR_USR_UID_CREATED_BY)))
            .andExpect(jsonPath("$.[*].usrUsrUidUpdatedBy").value(hasItem(DEFAULT_USR_USR_UID_UPDATED_BY)))
            .andExpect(jsonPath("$.[*].usrLastUpdateDate").value(hasItem(DEFAULT_USR_LAST_UPDATE_DATE.toString())))
            .andExpect(jsonPath("$.[*].usrDbLoginName").value(hasItem(DEFAULT_USR_DB_LOGIN_NAME)))
            .andExpect(jsonPath("$.[*].usrDbLoginPassword").value(hasItem(DEFAULT_USR_DB_LOGIN_PASSWORD)))
            .andExpect(jsonPath("$.[*].usrAppLoginName").value(hasItem(DEFAULT_USR_APP_LOGIN_NAME)))
            .andExpect(jsonPath("$.[*].usrAppLoginPassword").value(hasItem(DEFAULT_USR_APP_LOGIN_PASSWORD)))
            .andExpect(jsonPath("$.[*].usrDateAppLoginPassword").value(hasItem(DEFAULT_USR_DATE_APP_LOGIN_PASSWORD.toString())))
            .andExpect(jsonPath("$.[*].usrForceNewPasswordDays").value(hasItem(DEFAULT_USR_FORCE_NEW_PASSWORD_DAYS)))
            .andExpect(jsonPath("$.[*].usrGraceLoginsRemaining").value(hasItem(DEFAULT_USR_GRACE_LOGINS_REMAINING)))
            .andExpect(jsonPath("$.[*].usrDateTimeRestrictions").value(hasItem(DEFAULT_USR_DATE_TIME_RESTRICTIONS)))
            .andExpect(jsonPath("$.[*].usrPrevAppLoginPasswd1").value(hasItem(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_1)))
            .andExpect(jsonPath("$.[*].usrPrevAppLoginPasswd2").value(hasItem(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_2)))
            .andExpect(jsonPath("$.[*].usrPrevAppLoginPasswd3").value(hasItem(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_3)))
            .andExpect(jsonPath("$.[*].usrPrevAppLoginPasswd4").value(hasItem(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_4)))
            .andExpect(jsonPath("$.[*].usrPrevAppLoginPasswd5").value(hasItem(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_5)))
            .andExpect(jsonPath("$.[*].usrStaffAccessPrivilege").value(hasItem(DEFAULT_USR_STAFF_ACCESS_PRIVILEGE)))
            .andExpect(jsonPath("$.[*].usrViewRestrictedEventYN").value(hasItem(DEFAULT_USR_VIEW_RESTRICTED_EVENT_YN)))
            .andExpect(jsonPath("$.[*].usrUseDefaultsYN").value(hasItem(DEFAULT_USR_USE_DEFAULTS_YN)))
            .andExpect(jsonPath("$.[*].usrSoundexNameSearchYN").value(hasItem(DEFAULT_USR_SOUNDEX_NAME_SEARCH_YN)))
            .andExpect(jsonPath("$.[*].usrShowInactiveRecordsYN").value(hasItem(DEFAULT_USR_SHOW_INACTIVE_RECORDS_YN)))
            .andExpect(jsonPath("$.[*].usrControlCenterYN").value(hasItem(DEFAULT_USR_CONTROL_CENTER_YN)))
            .andExpect(jsonPath("$.[*].usrToolbarShowYN").value(hasItem(DEFAULT_USR_TOOLBAR_SHOW_YN)))
            .andExpect(jsonPath("$.[*].usrToolbarTextYN").value(hasItem(DEFAULT_USR_TOOLBAR_TEXT_YN)))
            .andExpect(jsonPath("$.[*].usrToolbarPosition").value(hasItem(DEFAULT_USR_TOOLBAR_POSITION)))
            .andExpect(jsonPath("$.[*].usrSaveSettingsYN").value(hasItem(DEFAULT_USR_SAVE_SETTINGS_YN)))
            .andExpect(jsonPath("$.[*].usrWildcardMatchYN").value(hasItem(DEFAULT_USR_WILDCARD_MATCH_YN)))
            .andExpect(jsonPath("$.[*].usrViewVipPmiYN").value(hasItem(DEFAULT_USR_VIEW_VIP_PMI_YN)))
            .andExpect(jsonPath("$.[*].usrViewEmployeePmiYN").value(hasItem(DEFAULT_USR_VIEW_EMPLOYEE_PMI_YN)))
            .andExpect(jsonPath("$.[*].usrViewRestrictedPmiYN").value(hasItem(DEFAULT_USR_VIEW_RESTRICTED_PMI_YN)))
            .andExpect(jsonPath("$.[*].usrVerificationRightsYN").value(hasItem(DEFAULT_USR_VERIFICATION_RIGHTS_YN)))
            .andExpect(jsonPath("$.[*].usrShowVerificationYN").value(hasItem(DEFAULT_USR_SHOW_VERIFICATION_YN)))
            .andExpect(jsonPath("$.[*].usrWgrCodeDefault").value(hasItem(DEFAULT_USR_WGR_CODE_DEFAULT)))
            .andExpect(jsonPath("$.[*].usrClassificationAccess").value(hasItem(DEFAULT_USR_CLASSIFICATION_ACCESS)))
            .andExpect(jsonPath("$.[*].usrDepartmentalAccess").value(hasItem(DEFAULT_USR_DEPARTMENTAL_ACCESS)))
            .andExpect(jsonPath("$.[*].usrAssocReviewDptAccess").value(hasItem(DEFAULT_USR_ASSOC_REVIEW_DPT_ACCESS)))
            .andExpect(jsonPath("$.[*].usrAssocReviewHsvAccess").value(hasItem(DEFAULT_USR_ASSOC_REVIEW_HSV_ACCESS)))
            .andExpect(jsonPath("$.[*].usrAssocReviewCmmAccess").value(hasItem(DEFAULT_USR_ASSOC_REVIEW_CMM_ACCESS)))
            .andExpect(jsonPath("$.[*].usrIncludeDptStaffYN").value(hasItem(DEFAULT_USR_INCLUDE_DPT_STAFF_YN)))
            .andExpect(jsonPath("$.[*].usrIncludeHsvStaffYN").value(hasItem(DEFAULT_USR_INCLUDE_HSV_STAFF_YN)))
            .andExpect(jsonPath("$.[*].usrIncludeCmmMembersYN").value(hasItem(DEFAULT_USR_INCLUDE_CMM_MEMBERS_YN)))
            .andExpect(jsonPath("$.[*].usrClaimCategoryAccess").value(hasItem(DEFAULT_USR_CLAIM_CATEGORY_ACCESS)))
            .andExpect(jsonPath("$.[*].usrReviewTrackAccess").value(hasItem(DEFAULT_USR_REVIEW_TRACK_ACCESS)))
            .andExpect(jsonPath("$.[*].usrIssueOwnerDptAccess").value(hasItem(DEFAULT_USR_ISSUE_OWNER_DPT_ACCESS)))
            .andExpect(jsonPath("$.[*].usrIssueOwnerCmmAccess").value(hasItem(DEFAULT_USR_ISSUE_OWNER_CMM_ACCESS)))
            .andExpect(jsonPath("$.[*].usrIssueOwnerHsvAccess").value(hasItem(DEFAULT_USR_ISSUE_OWNER_HSV_ACCESS)))
            .andExpect(jsonPath("$.[*].usrTaskListRefresh").value(hasItem(DEFAULT_USR_TASK_LIST_REFRESH)))
            .andExpect(jsonPath("$.[*].usrPpfCode").value(hasItem(DEFAULT_USR_PPF_CODE)))
            .andExpect(jsonPath("$.[*].usrLinkSmcToRlcYN").value(hasItem(DEFAULT_USR_LINK_SMC_TO_RLC_YN)))
            .andExpect(jsonPath("$.[*].usrRemoteId").value(hasItem(DEFAULT_USR_REMOTE_ID)))
            .andExpect(jsonPath("$.[*].usrExternalFaxId").value(hasItem(DEFAULT_USR_EXTERNAL_FAX_ID)))
            .andExpect(jsonPath("$.[*].usrSessionsMax").value(hasItem(DEFAULT_USR_SESSIONS_MAX)))
            .andExpect(jsonPath("$.[*].usrFloatToolbarYN").value(hasItem(DEFAULT_USR_FLOAT_TOOLBAR_YN)))
            .andExpect(jsonPath("$.[*].usrBookmarkX").value(hasItem(DEFAULT_USR_BOOKMARK_X)))
            .andExpect(jsonPath("$.[*].usrBookmarkY").value(hasItem(DEFAULT_USR_BOOKMARK_Y)))
            .andExpect(jsonPath("$.[*].usrBookmarkHeight").value(hasItem(DEFAULT_USR_BOOKMARK_HEIGHT)))
            .andExpect(jsonPath("$.[*].usrBookmarkWidth").value(hasItem(DEFAULT_USR_BOOKMARK_WIDTH)))
            .andExpect(jsonPath("$.[*].usrNumRecentList").value(hasItem(DEFAULT_USR_NUM_RECENT_LIST)))
            .andExpect(jsonPath("$.[*].usrDisplayBookmarksYN").value(hasItem(DEFAULT_USR_DISPLAY_BOOKMARKS_YN)))
            .andExpect(jsonPath("$.[*].usrRecordVersion").value(hasItem(DEFAULT_USR_RECORD_VERSION)))
            .andExpect(jsonPath("$.[*].usrNameKey").value(hasItem(DEFAULT_USR_NAME_KEY)))
            .andExpect(jsonPath("$.[*].usrLastName").value(hasItem(DEFAULT_USR_LAST_NAME)))
            .andExpect(jsonPath("$.[*].usrFirstName").value(hasItem(DEFAULT_USR_FIRST_NAME)))
            .andExpect(jsonPath("$.[*].usrMiddleName").value(hasItem(DEFAULT_USR_MIDDLE_NAME)))
            .andExpect(jsonPath("$.[*].usrFormattedName").value(hasItem(DEFAULT_USR_FORMATTED_NAME)))
            .andExpect(jsonPath("$.[*].usrNameSoundex").value(hasItem(DEFAULT_USR_NAME_SOUNDEX)))
            .andExpect(jsonPath("$.[*].usrAddressLine1").value(hasItem(DEFAULT_USR_ADDRESS_LINE_1)))
            .andExpect(jsonPath("$.[*].usrAddressLine2").value(hasItem(DEFAULT_USR_ADDRESS_LINE_2)))
            .andExpect(jsonPath("$.[*].usrCity").value(hasItem(DEFAULT_USR_CITY)))
            .andExpect(jsonPath("$.[*].usrStaCode").value(hasItem(DEFAULT_USR_STA_CODE)))
            .andExpect(jsonPath("$.[*].usrPhone1").value(hasItem(DEFAULT_USR_PHONE_1)))
            .andExpect(jsonPath("$.[*].usrPhone2").value(hasItem(DEFAULT_USR_PHONE_2)))
            .andExpect(jsonPath("$.[*].usrPhone3").value(hasItem(DEFAULT_USR_PHONE_3)))
            .andExpect(jsonPath("$.[*].usrFax").value(hasItem(DEFAULT_USR_FAX)))
            .andExpect(jsonPath("$.[*].usrEmail1").value(hasItem(DEFAULT_USR_EMAIL_1)))
            .andExpect(jsonPath("$.[*].usrEmail2").value(hasItem(DEFAULT_USR_EMAIL_2)))
            .andExpect(jsonPath("$.[*].usrPocCode").value(hasItem(DEFAULT_USR_POC_CODE)))
            .andExpect(jsonPath("$.[*].usrPostalExtension").value(hasItem(DEFAULT_USR_POSTAL_EXTENSION)))
            .andExpect(jsonPath("$.[*].usrCntCode").value(hasItem(DEFAULT_USR_CNT_CODE)))
            .andExpect(jsonPath("$.[*].usrPfpUid").value(hasItem(DEFAULT_USR_PFP_UID)))
            .andExpect(jsonPath("$.[*].usrScheduleRestrictionsYN").value(hasItem(DEFAULT_USR_SCHEDULE_RESTRICTIONS_YN)))
            .andExpect(jsonPath("$.[*].usrLoginAttemptsRemaining").value(hasItem(DEFAULT_USR_LOGIN_ATTEMPTS_REMAINING)))
            .andExpect(jsonPath("$.[*].usrLastPmeRefreshTimestamp").value(hasItem(DEFAULT_USR_LAST_PME_REFRESH_TIMESTAMP.toString())))
            .andExpect(jsonPath("$.[*].usrSisenseUsername").value(hasItem(DEFAULT_USR_SISENSE_USERNAME)));
    }

    @Test
    @Transactional
    public void getUsrUser() throws Exception {
        // Initialize the database
        usrUserRepository.saveAndFlush(usrUser);

        // Get the usrUser
        restUsrUserMockMvc.perform(get("/api/usr-users/{usruid}", usrUser.getUsrUid()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.usrUid").value(DEFAULT_USR_UID))
            .andExpect(jsonPath("$.usrStfUid").value(DEFAULT_USR_STF_UID))
            .andExpect(jsonPath("$.usrId").value(DEFAULT_USR_ID))
            .andExpect(jsonPath("$.usrAccountStatus").value(DEFAULT_USR_ACCOUNT_STATUS))
            .andExpect(jsonPath("$.usrDateAccountExpiration").value(DEFAULT_USR_DATE_ACCOUNT_EXPIRATION.toString()))
            .andExpect(jsonPath("$.usrAccountLockedYN").value(DEFAULT_USR_ACCOUNT_LOCKED_YN))
            .andExpect(jsonPath("$.usrRecordStatus").value(DEFAULT_USR_RECORD_STATUS))
            .andExpect(jsonPath("$.usrDatePasswordExpiration").value(DEFAULT_USR_DATE_PASSWORD_EXPIRATION.toString()))
            .andExpect(jsonPath("$.usrUserType").value(DEFAULT_USR_USER_TYPE))
            .andExpect(jsonPath("$.usrRecordStatusDate").value(DEFAULT_USR_RECORD_STATUS_DATE.toString()))
            .andExpect(jsonPath("$.usrCreateDate").value(DEFAULT_USR_CREATE_DATE.toString()))
            .andExpect(jsonPath("$.usrUsrUidCreatedBy").value(DEFAULT_USR_USR_UID_CREATED_BY))
            .andExpect(jsonPath("$.usrUsrUidUpdatedBy").value(DEFAULT_USR_USR_UID_UPDATED_BY))
            .andExpect(jsonPath("$.usrLastUpdateDate").value(DEFAULT_USR_LAST_UPDATE_DATE.toString()))
            .andExpect(jsonPath("$.usrDbLoginName").value(DEFAULT_USR_DB_LOGIN_NAME))
            .andExpect(jsonPath("$.usrDbLoginPassword").value(DEFAULT_USR_DB_LOGIN_PASSWORD))
            .andExpect(jsonPath("$.usrAppLoginName").value(DEFAULT_USR_APP_LOGIN_NAME))
            .andExpect(jsonPath("$.usrAppLoginPassword").value(DEFAULT_USR_APP_LOGIN_PASSWORD))
            .andExpect(jsonPath("$.usrDateAppLoginPassword").value(DEFAULT_USR_DATE_APP_LOGIN_PASSWORD.toString()))
            .andExpect(jsonPath("$.usrForceNewPasswordDays").value(DEFAULT_USR_FORCE_NEW_PASSWORD_DAYS))
            .andExpect(jsonPath("$.usrGraceLoginsRemaining").value(DEFAULT_USR_GRACE_LOGINS_REMAINING))
            .andExpect(jsonPath("$.usrDateTimeRestrictions").value(DEFAULT_USR_DATE_TIME_RESTRICTIONS))
            .andExpect(jsonPath("$.usrPrevAppLoginPasswd1").value(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_1))
            .andExpect(jsonPath("$.usrPrevAppLoginPasswd2").value(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_2))
            .andExpect(jsonPath("$.usrPrevAppLoginPasswd3").value(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_3))
            .andExpect(jsonPath("$.usrPrevAppLoginPasswd4").value(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_4))
            .andExpect(jsonPath("$.usrPrevAppLoginPasswd5").value(DEFAULT_USR_PREV_APP_LOGIN_PASSWD_5))
            .andExpect(jsonPath("$.usrStaffAccessPrivilege").value(DEFAULT_USR_STAFF_ACCESS_PRIVILEGE))
            .andExpect(jsonPath("$.usrViewRestrictedEventYN").value(DEFAULT_USR_VIEW_RESTRICTED_EVENT_YN))
            .andExpect(jsonPath("$.usrUseDefaultsYN").value(DEFAULT_USR_USE_DEFAULTS_YN))
            .andExpect(jsonPath("$.usrSoundexNameSearchYN").value(DEFAULT_USR_SOUNDEX_NAME_SEARCH_YN))
            .andExpect(jsonPath("$.usrShowInactiveRecordsYN").value(DEFAULT_USR_SHOW_INACTIVE_RECORDS_YN))
            .andExpect(jsonPath("$.usrControlCenterYN").value(DEFAULT_USR_CONTROL_CENTER_YN))
            .andExpect(jsonPath("$.usrToolbarShowYN").value(DEFAULT_USR_TOOLBAR_SHOW_YN))
            .andExpect(jsonPath("$.usrToolbarTextYN").value(DEFAULT_USR_TOOLBAR_TEXT_YN))
            .andExpect(jsonPath("$.usrToolbarPosition").value(DEFAULT_USR_TOOLBAR_POSITION))
            .andExpect(jsonPath("$.usrSaveSettingsYN").value(DEFAULT_USR_SAVE_SETTINGS_YN))
            .andExpect(jsonPath("$.usrWildcardMatchYN").value(DEFAULT_USR_WILDCARD_MATCH_YN))
            .andExpect(jsonPath("$.usrViewVipPmiYN").value(DEFAULT_USR_VIEW_VIP_PMI_YN))
            .andExpect(jsonPath("$.usrViewEmployeePmiYN").value(DEFAULT_USR_VIEW_EMPLOYEE_PMI_YN))
            .andExpect(jsonPath("$.usrViewRestrictedPmiYN").value(DEFAULT_USR_VIEW_RESTRICTED_PMI_YN))
            .andExpect(jsonPath("$.usrVerificationRightsYN").value(DEFAULT_USR_VERIFICATION_RIGHTS_YN))
            .andExpect(jsonPath("$.usrShowVerificationYN").value(DEFAULT_USR_SHOW_VERIFICATION_YN))
            .andExpect(jsonPath("$.usrWgrCodeDefault").value(DEFAULT_USR_WGR_CODE_DEFAULT))
            .andExpect(jsonPath("$.usrClassificationAccess").value(DEFAULT_USR_CLASSIFICATION_ACCESS))
            .andExpect(jsonPath("$.usrDepartmentalAccess").value(DEFAULT_USR_DEPARTMENTAL_ACCESS))
            .andExpect(jsonPath("$.usrAssocReviewDptAccess").value(DEFAULT_USR_ASSOC_REVIEW_DPT_ACCESS))
            .andExpect(jsonPath("$.usrAssocReviewHsvAccess").value(DEFAULT_USR_ASSOC_REVIEW_HSV_ACCESS))
            .andExpect(jsonPath("$.usrAssocReviewCmmAccess").value(DEFAULT_USR_ASSOC_REVIEW_CMM_ACCESS))
            .andExpect(jsonPath("$.usrIncludeDptStaffYN").value(DEFAULT_USR_INCLUDE_DPT_STAFF_YN))
            .andExpect(jsonPath("$.usrIncludeHsvStaffYN").value(DEFAULT_USR_INCLUDE_HSV_STAFF_YN))
            .andExpect(jsonPath("$.usrIncludeCmmMembersYN").value(DEFAULT_USR_INCLUDE_CMM_MEMBERS_YN))
            .andExpect(jsonPath("$.usrClaimCategoryAccess").value(DEFAULT_USR_CLAIM_CATEGORY_ACCESS))
            .andExpect(jsonPath("$.usrReviewTrackAccess").value(DEFAULT_USR_REVIEW_TRACK_ACCESS))
            .andExpect(jsonPath("$.usrIssueOwnerDptAccess").value(DEFAULT_USR_ISSUE_OWNER_DPT_ACCESS))
            .andExpect(jsonPath("$.usrIssueOwnerCmmAccess").value(DEFAULT_USR_ISSUE_OWNER_CMM_ACCESS))
            .andExpect(jsonPath("$.usrIssueOwnerHsvAccess").value(DEFAULT_USR_ISSUE_OWNER_HSV_ACCESS))
            .andExpect(jsonPath("$.usrTaskListRefresh").value(DEFAULT_USR_TASK_LIST_REFRESH))
            .andExpect(jsonPath("$.usrPpfCode").value(DEFAULT_USR_PPF_CODE))
            .andExpect(jsonPath("$.usrLinkSmcToRlcYN").value(DEFAULT_USR_LINK_SMC_TO_RLC_YN))
            .andExpect(jsonPath("$.usrRemoteId").value(DEFAULT_USR_REMOTE_ID))
            .andExpect(jsonPath("$.usrExternalFaxId").value(DEFAULT_USR_EXTERNAL_FAX_ID))
            .andExpect(jsonPath("$.usrSessionsMax").value(DEFAULT_USR_SESSIONS_MAX))
            .andExpect(jsonPath("$.usrFloatToolbarYN").value(DEFAULT_USR_FLOAT_TOOLBAR_YN))
            .andExpect(jsonPath("$.usrBookmarkX").value(DEFAULT_USR_BOOKMARK_X))
            .andExpect(jsonPath("$.usrBookmarkY").value(DEFAULT_USR_BOOKMARK_Y))
            .andExpect(jsonPath("$.usrBookmarkHeight").value(DEFAULT_USR_BOOKMARK_HEIGHT))
            .andExpect(jsonPath("$.usrBookmarkWidth").value(DEFAULT_USR_BOOKMARK_WIDTH))
            .andExpect(jsonPath("$.usrNumRecentList").value(DEFAULT_USR_NUM_RECENT_LIST))
            .andExpect(jsonPath("$.usrDisplayBookmarksYN").value(DEFAULT_USR_DISPLAY_BOOKMARKS_YN))
            .andExpect(jsonPath("$.usrRecordVersion").value(DEFAULT_USR_RECORD_VERSION))
            .andExpect(jsonPath("$.usrNameKey").value(DEFAULT_USR_NAME_KEY))
            .andExpect(jsonPath("$.usrLastName").value(DEFAULT_USR_LAST_NAME))
            .andExpect(jsonPath("$.usrFirstName").value(DEFAULT_USR_FIRST_NAME))
            .andExpect(jsonPath("$.usrMiddleName").value(DEFAULT_USR_MIDDLE_NAME))
            .andExpect(jsonPath("$.usrFormattedName").value(DEFAULT_USR_FORMATTED_NAME))
            .andExpect(jsonPath("$.usrNameSoundex").value(DEFAULT_USR_NAME_SOUNDEX))
            .andExpect(jsonPath("$.usrAddressLine1").value(DEFAULT_USR_ADDRESS_LINE_1))
            .andExpect(jsonPath("$.usrAddressLine2").value(DEFAULT_USR_ADDRESS_LINE_2))
            .andExpect(jsonPath("$.usrCity").value(DEFAULT_USR_CITY))
            .andExpect(jsonPath("$.usrStaCode").value(DEFAULT_USR_STA_CODE))
            .andExpect(jsonPath("$.usrPhone1").value(DEFAULT_USR_PHONE_1))
            .andExpect(jsonPath("$.usrPhone2").value(DEFAULT_USR_PHONE_2))
            .andExpect(jsonPath("$.usrPhone3").value(DEFAULT_USR_PHONE_3))
            .andExpect(jsonPath("$.usrFax").value(DEFAULT_USR_FAX))
            .andExpect(jsonPath("$.usrEmail1").value(DEFAULT_USR_EMAIL_1))
            .andExpect(jsonPath("$.usrEmail2").value(DEFAULT_USR_EMAIL_2))
            .andExpect(jsonPath("$.usrPocCode").value(DEFAULT_USR_POC_CODE))
            .andExpect(jsonPath("$.usrPostalExtension").value(DEFAULT_USR_POSTAL_EXTENSION))
            .andExpect(jsonPath("$.usrCntCode").value(DEFAULT_USR_CNT_CODE))
            .andExpect(jsonPath("$.usrPfpUid").value(DEFAULT_USR_PFP_UID))
            .andExpect(jsonPath("$.usrScheduleRestrictionsYN").value(DEFAULT_USR_SCHEDULE_RESTRICTIONS_YN))
            .andExpect(jsonPath("$.usrLoginAttemptsRemaining").value(DEFAULT_USR_LOGIN_ATTEMPTS_REMAINING))
            .andExpect(jsonPath("$.usrLastPmeRefreshTimestamp").value(DEFAULT_USR_LAST_PME_REFRESH_TIMESTAMP.toString()))
            .andExpect(jsonPath("$.usrSisenseUsername").value(DEFAULT_USR_SISENSE_USERNAME));
    }
    @Test
    @Transactional
    public void getNonExistingUsrUser() throws Exception {
        // Get the usrUser
        restUsrUserMockMvc.perform(get("/api/usr-users/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateUsrUser() throws Exception {
        // Initialize the database
        usrUserRepository.saveAndFlush(usrUser);

        int databaseSizeBeforeUpdate = usrUserRepository.findAll().size();

        // Update the usrUser
        UsrUser updatedUsrUser = usrUserRepository.findById(usrUser.getUsrUid()).get();
        // Disconnect from session so that the updates on updatedUsrUser are not directly saved in db
        em.detach(updatedUsrUser);
        updatedUsrUser
            .usrUid(UPDATED_USR_UID)
            .usrStfUid(UPDATED_USR_STF_UID)
            .usrId(UPDATED_USR_ID)
            .usrAccountStatus(UPDATED_USR_ACCOUNT_STATUS)
            .usrDateAccountExpiration(UPDATED_USR_DATE_ACCOUNT_EXPIRATION)
            .usrAccountLockedYN(UPDATED_USR_ACCOUNT_LOCKED_YN)
            .usrRecordStatus(UPDATED_USR_RECORD_STATUS)
            .usrDatePasswordExpiration(UPDATED_USR_DATE_PASSWORD_EXPIRATION)
            .usrUserType(UPDATED_USR_USER_TYPE)
            .usrRecordStatusDate(UPDATED_USR_RECORD_STATUS_DATE)
            .usrCreateDate(UPDATED_USR_CREATE_DATE)
            .usrUsrUidCreatedBy(UPDATED_USR_USR_UID_CREATED_BY)
            .usrUsrUidUpdatedBy(UPDATED_USR_USR_UID_UPDATED_BY)
            .usrLastUpdateDate(UPDATED_USR_LAST_UPDATE_DATE)
            .usrDbLoginName(UPDATED_USR_DB_LOGIN_NAME)
            .usrDbLoginPassword(UPDATED_USR_DB_LOGIN_PASSWORD)
            .usrAppLoginName(UPDATED_USR_APP_LOGIN_NAME)
            .usrAppLoginPassword(UPDATED_USR_APP_LOGIN_PASSWORD)
            .usrDateAppLoginPassword(UPDATED_USR_DATE_APP_LOGIN_PASSWORD)
            .usrForceNewPasswordDays(UPDATED_USR_FORCE_NEW_PASSWORD_DAYS)
            .usrGraceLoginsRemaining(UPDATED_USR_GRACE_LOGINS_REMAINING)
            .usrDateTimeRestrictions(UPDATED_USR_DATE_TIME_RESTRICTIONS)
            .usrPrevAppLoginPasswd1(UPDATED_USR_PREV_APP_LOGIN_PASSWD_1)
            .usrPrevAppLoginPasswd2(UPDATED_USR_PREV_APP_LOGIN_PASSWD_2)
            .usrPrevAppLoginPasswd3(UPDATED_USR_PREV_APP_LOGIN_PASSWD_3)
            .usrPrevAppLoginPasswd4(UPDATED_USR_PREV_APP_LOGIN_PASSWD_4)
            .usrPrevAppLoginPasswd5(UPDATED_USR_PREV_APP_LOGIN_PASSWD_5)
            .usrStaffAccessPrivilege(UPDATED_USR_STAFF_ACCESS_PRIVILEGE)
            .usrViewRestrictedEventYN(UPDATED_USR_VIEW_RESTRICTED_EVENT_YN)
            .usrUseDefaultsYN(UPDATED_USR_USE_DEFAULTS_YN)
            .usrSoundexNameSearchYN(UPDATED_USR_SOUNDEX_NAME_SEARCH_YN)
            .usrShowInactiveRecordsYN(UPDATED_USR_SHOW_INACTIVE_RECORDS_YN)
            .usrControlCenterYN(UPDATED_USR_CONTROL_CENTER_YN)
            .usrToolbarShowYN(UPDATED_USR_TOOLBAR_SHOW_YN)
            .usrToolbarTextYN(UPDATED_USR_TOOLBAR_TEXT_YN)
            .usrToolbarPosition(UPDATED_USR_TOOLBAR_POSITION)
            .usrSaveSettingsYN(UPDATED_USR_SAVE_SETTINGS_YN)
            .usrWildcardMatchYN(UPDATED_USR_WILDCARD_MATCH_YN)
            .usrViewVipPmiYN(UPDATED_USR_VIEW_VIP_PMI_YN)
            .usrViewEmployeePmiYN(UPDATED_USR_VIEW_EMPLOYEE_PMI_YN)
            .usrViewRestrictedPmiYN(UPDATED_USR_VIEW_RESTRICTED_PMI_YN)
            .usrVerificationRightsYN(UPDATED_USR_VERIFICATION_RIGHTS_YN)
            .usrShowVerificationYN(UPDATED_USR_SHOW_VERIFICATION_YN)
            .usrWgrCodeDefault(UPDATED_USR_WGR_CODE_DEFAULT)
            .usrClassificationAccess(UPDATED_USR_CLASSIFICATION_ACCESS)
            .usrDepartmentalAccess(UPDATED_USR_DEPARTMENTAL_ACCESS)
            .usrAssocReviewDptAccess(UPDATED_USR_ASSOC_REVIEW_DPT_ACCESS)
            .usrAssocReviewHsvAccess(UPDATED_USR_ASSOC_REVIEW_HSV_ACCESS)
            .usrAssocReviewCmmAccess(UPDATED_USR_ASSOC_REVIEW_CMM_ACCESS)
            .usrIncludeDptStaffYN(UPDATED_USR_INCLUDE_DPT_STAFF_YN)
            .usrIncludeHsvStaffYN(UPDATED_USR_INCLUDE_HSV_STAFF_YN)
            .usrIncludeCmmMembersYN(UPDATED_USR_INCLUDE_CMM_MEMBERS_YN)
            .usrClaimCategoryAccess(UPDATED_USR_CLAIM_CATEGORY_ACCESS)
            .usrReviewTrackAccess(UPDATED_USR_REVIEW_TRACK_ACCESS)
            .usrIssueOwnerDptAccess(UPDATED_USR_ISSUE_OWNER_DPT_ACCESS)
            .usrIssueOwnerCmmAccess(UPDATED_USR_ISSUE_OWNER_CMM_ACCESS)
            .usrIssueOwnerHsvAccess(UPDATED_USR_ISSUE_OWNER_HSV_ACCESS)
            .usrTaskListRefresh(UPDATED_USR_TASK_LIST_REFRESH)
            .usrPpfCode(UPDATED_USR_PPF_CODE)
            .usrLinkSmcToRlcYN(UPDATED_USR_LINK_SMC_TO_RLC_YN)
            .usrRemoteId(UPDATED_USR_REMOTE_ID)
            .usrExternalFaxId(UPDATED_USR_EXTERNAL_FAX_ID)
            .usrSessionsMax(UPDATED_USR_SESSIONS_MAX)
            .usrFloatToolbarYN(UPDATED_USR_FLOAT_TOOLBAR_YN)
            .usrBookmarkX(UPDATED_USR_BOOKMARK_X)
            .usrBookmarkY(UPDATED_USR_BOOKMARK_Y)
            .usrBookmarkHeight(UPDATED_USR_BOOKMARK_HEIGHT)
            .usrBookmarkWidth(UPDATED_USR_BOOKMARK_WIDTH)
            .usrNumRecentList(UPDATED_USR_NUM_RECENT_LIST)
            .usrDisplayBookmarksYN(UPDATED_USR_DISPLAY_BOOKMARKS_YN)
            .usrRecordVersion(UPDATED_USR_RECORD_VERSION)
            .usrNameKey(UPDATED_USR_NAME_KEY)
            .usrLastName(UPDATED_USR_LAST_NAME)
            .usrFirstName(UPDATED_USR_FIRST_NAME)
            .usrMiddleName(UPDATED_USR_MIDDLE_NAME)
            .usrFormattedName(UPDATED_USR_FORMATTED_NAME)
            .usrNameSoundex(UPDATED_USR_NAME_SOUNDEX)
            .usrAddressLine1(UPDATED_USR_ADDRESS_LINE_1)
            .usrAddressLine2(UPDATED_USR_ADDRESS_LINE_2)
            .usrCity(UPDATED_USR_CITY)
            .usrStaCode(UPDATED_USR_STA_CODE)
            .usrPhone1(UPDATED_USR_PHONE_1)
            .usrPhone2(UPDATED_USR_PHONE_2)
            .usrPhone3(UPDATED_USR_PHONE_3)
            .usrFax(UPDATED_USR_FAX)
            .usrEmail1(UPDATED_USR_EMAIL_1)
            .usrEmail2(UPDATED_USR_EMAIL_2)
            .usrPocCode(UPDATED_USR_POC_CODE)
            .usrPostalExtension(UPDATED_USR_POSTAL_EXTENSION)
            .usrCntCode(UPDATED_USR_CNT_CODE)
            .usrPfpUid(UPDATED_USR_PFP_UID)
            .usrScheduleRestrictionsYN(UPDATED_USR_SCHEDULE_RESTRICTIONS_YN)
            .usrLoginAttemptsRemaining(UPDATED_USR_LOGIN_ATTEMPTS_REMAINING)
            .usrLastPmeRefreshTimestamp(UPDATED_USR_LAST_PME_REFRESH_TIMESTAMP)
            .usrSisenseUsername(UPDATED_USR_SISENSE_USERNAME);
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(updatedUsrUser);

        restUsrUserMockMvc.perform(put("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isOk());

        // Validate the UsrUser in the database
        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeUpdate);
        UsrUser testUsrUser = usrUserList.get(usrUserList.size() - 1);
        assertThat(testUsrUser.getUsrUid()).isEqualTo(UPDATED_USR_UID);
        assertThat(testUsrUser.getUsrStfUid()).isEqualTo(UPDATED_USR_STF_UID);
        assertThat(testUsrUser.getUsrId()).isEqualTo(UPDATED_USR_ID);
        assertThat(testUsrUser.getUsrAccountStatus()).isEqualTo(UPDATED_USR_ACCOUNT_STATUS);
        assertThat(testUsrUser.getUsrDateAccountExpiration()).isEqualTo(UPDATED_USR_DATE_ACCOUNT_EXPIRATION);
        assertThat(testUsrUser.getUsrAccountLockedYN()).isEqualTo(UPDATED_USR_ACCOUNT_LOCKED_YN);
        assertThat(testUsrUser.getUsrRecordStatus()).isEqualTo(UPDATED_USR_RECORD_STATUS);
        assertThat(testUsrUser.getUsrDatePasswordExpiration()).isEqualTo(UPDATED_USR_DATE_PASSWORD_EXPIRATION);
        assertThat(testUsrUser.getUsrUserType()).isEqualTo(UPDATED_USR_USER_TYPE);
        assertThat(testUsrUser.getUsrRecordStatusDate()).isEqualTo(UPDATED_USR_RECORD_STATUS_DATE);
        assertThat(testUsrUser.getUsrCreateDate()).isEqualTo(UPDATED_USR_CREATE_DATE);
        assertThat(testUsrUser.getUsrUsrUidCreatedBy()).isEqualTo(UPDATED_USR_USR_UID_CREATED_BY);
        assertThat(testUsrUser.getUsrUsrUidUpdatedBy()).isEqualTo(UPDATED_USR_USR_UID_UPDATED_BY);
        assertThat(testUsrUser.getUsrLastUpdateDate()).isEqualTo(UPDATED_USR_LAST_UPDATE_DATE);
        assertThat(testUsrUser.getUsrDbLoginName()).isEqualTo(UPDATED_USR_DB_LOGIN_NAME);
        assertThat(testUsrUser.getUsrDbLoginPassword()).isEqualTo(UPDATED_USR_DB_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrAppLoginName()).isEqualTo(UPDATED_USR_APP_LOGIN_NAME);
        assertThat(testUsrUser.getUsrAppLoginPassword()).isEqualTo(UPDATED_USR_APP_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrDateAppLoginPassword()).isEqualTo(UPDATED_USR_DATE_APP_LOGIN_PASSWORD);
        assertThat(testUsrUser.getUsrForceNewPasswordDays()).isEqualTo(UPDATED_USR_FORCE_NEW_PASSWORD_DAYS);
        assertThat(testUsrUser.getUsrGraceLoginsRemaining()).isEqualTo(UPDATED_USR_GRACE_LOGINS_REMAINING);
        assertThat(testUsrUser.getUsrDateTimeRestrictions()).isEqualTo(UPDATED_USR_DATE_TIME_RESTRICTIONS);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd1()).isEqualTo(UPDATED_USR_PREV_APP_LOGIN_PASSWD_1);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd2()).isEqualTo(UPDATED_USR_PREV_APP_LOGIN_PASSWD_2);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd3()).isEqualTo(UPDATED_USR_PREV_APP_LOGIN_PASSWD_3);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd4()).isEqualTo(UPDATED_USR_PREV_APP_LOGIN_PASSWD_4);
        assertThat(testUsrUser.getUsrPrevAppLoginPasswd5()).isEqualTo(UPDATED_USR_PREV_APP_LOGIN_PASSWD_5);
        assertThat(testUsrUser.getUsrStaffAccessPrivilege()).isEqualTo(UPDATED_USR_STAFF_ACCESS_PRIVILEGE);
        assertThat(testUsrUser.getUsrViewRestrictedEventYN()).isEqualTo(UPDATED_USR_VIEW_RESTRICTED_EVENT_YN);
        assertThat(testUsrUser.getUsrUseDefaultsYN()).isEqualTo(UPDATED_USR_USE_DEFAULTS_YN);
        assertThat(testUsrUser.getUsrSoundexNameSearchYN()).isEqualTo(UPDATED_USR_SOUNDEX_NAME_SEARCH_YN);
        assertThat(testUsrUser.getUsrShowInactiveRecordsYN()).isEqualTo(UPDATED_USR_SHOW_INACTIVE_RECORDS_YN);
        assertThat(testUsrUser.getUsrControlCenterYN()).isEqualTo(UPDATED_USR_CONTROL_CENTER_YN);
        assertThat(testUsrUser.getUsrToolbarShowYN()).isEqualTo(UPDATED_USR_TOOLBAR_SHOW_YN);
        assertThat(testUsrUser.getUsrToolbarTextYN()).isEqualTo(UPDATED_USR_TOOLBAR_TEXT_YN);
        assertThat(testUsrUser.getUsrToolbarPosition()).isEqualTo(UPDATED_USR_TOOLBAR_POSITION);
        assertThat(testUsrUser.getUsrSaveSettingsYN()).isEqualTo(UPDATED_USR_SAVE_SETTINGS_YN);
        assertThat(testUsrUser.getUsrWildcardMatchYN()).isEqualTo(UPDATED_USR_WILDCARD_MATCH_YN);
        assertThat(testUsrUser.getUsrViewVipPmiYN()).isEqualTo(UPDATED_USR_VIEW_VIP_PMI_YN);
        assertThat(testUsrUser.getUsrViewEmployeePmiYN()).isEqualTo(UPDATED_USR_VIEW_EMPLOYEE_PMI_YN);
        assertThat(testUsrUser.getUsrViewRestrictedPmiYN()).isEqualTo(UPDATED_USR_VIEW_RESTRICTED_PMI_YN);
        assertThat(testUsrUser.getUsrVerificationRightsYN()).isEqualTo(UPDATED_USR_VERIFICATION_RIGHTS_YN);
        assertThat(testUsrUser.getUsrShowVerificationYN()).isEqualTo(UPDATED_USR_SHOW_VERIFICATION_YN);
        assertThat(testUsrUser.getUsrWgrCodeDefault()).isEqualTo(UPDATED_USR_WGR_CODE_DEFAULT);
        assertThat(testUsrUser.getUsrClassificationAccess()).isEqualTo(UPDATED_USR_CLASSIFICATION_ACCESS);
        assertThat(testUsrUser.getUsrDepartmentalAccess()).isEqualTo(UPDATED_USR_DEPARTMENTAL_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewDptAccess()).isEqualTo(UPDATED_USR_ASSOC_REVIEW_DPT_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewHsvAccess()).isEqualTo(UPDATED_USR_ASSOC_REVIEW_HSV_ACCESS);
        assertThat(testUsrUser.getUsrAssocReviewCmmAccess()).isEqualTo(UPDATED_USR_ASSOC_REVIEW_CMM_ACCESS);
        assertThat(testUsrUser.getUsrIncludeDptStaffYN()).isEqualTo(UPDATED_USR_INCLUDE_DPT_STAFF_YN);
        assertThat(testUsrUser.getUsrIncludeHsvStaffYN()).isEqualTo(UPDATED_USR_INCLUDE_HSV_STAFF_YN);
        assertThat(testUsrUser.getUsrIncludeCmmMembersYN()).isEqualTo(UPDATED_USR_INCLUDE_CMM_MEMBERS_YN);
        assertThat(testUsrUser.getUsrClaimCategoryAccess()).isEqualTo(UPDATED_USR_CLAIM_CATEGORY_ACCESS);
        assertThat(testUsrUser.getUsrReviewTrackAccess()).isEqualTo(UPDATED_USR_REVIEW_TRACK_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerDptAccess()).isEqualTo(UPDATED_USR_ISSUE_OWNER_DPT_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerCmmAccess()).isEqualTo(UPDATED_USR_ISSUE_OWNER_CMM_ACCESS);
        assertThat(testUsrUser.getUsrIssueOwnerHsvAccess()).isEqualTo(UPDATED_USR_ISSUE_OWNER_HSV_ACCESS);
        assertThat(testUsrUser.getUsrTaskListRefresh()).isEqualTo(UPDATED_USR_TASK_LIST_REFRESH);
        assertThat(testUsrUser.getUsrPpfCode()).isEqualTo(UPDATED_USR_PPF_CODE);
        assertThat(testUsrUser.getUsrLinkSmcToRlcYN()).isEqualTo(UPDATED_USR_LINK_SMC_TO_RLC_YN);
        assertThat(testUsrUser.getUsrRemoteId()).isEqualTo(UPDATED_USR_REMOTE_ID);
        assertThat(testUsrUser.getUsrExternalFaxId()).isEqualTo(UPDATED_USR_EXTERNAL_FAX_ID);
        assertThat(testUsrUser.getUsrSessionsMax()).isEqualTo(UPDATED_USR_SESSIONS_MAX);
        assertThat(testUsrUser.getUsrFloatToolbarYN()).isEqualTo(UPDATED_USR_FLOAT_TOOLBAR_YN);
        assertThat(testUsrUser.getUsrBookmarkX()).isEqualTo(UPDATED_USR_BOOKMARK_X);
        assertThat(testUsrUser.getUsrBookmarkY()).isEqualTo(UPDATED_USR_BOOKMARK_Y);
        assertThat(testUsrUser.getUsrBookmarkHeight()).isEqualTo(UPDATED_USR_BOOKMARK_HEIGHT);
        assertThat(testUsrUser.getUsrBookmarkWidth()).isEqualTo(UPDATED_USR_BOOKMARK_WIDTH);
        assertThat(testUsrUser.getUsrNumRecentList()).isEqualTo(UPDATED_USR_NUM_RECENT_LIST);
        assertThat(testUsrUser.getUsrDisplayBookmarksYN()).isEqualTo(UPDATED_USR_DISPLAY_BOOKMARKS_YN);
        assertThat(testUsrUser.getUsrRecordVersion()).isEqualTo(UPDATED_USR_RECORD_VERSION);
        assertThat(testUsrUser.getUsrNameKey()).isEqualTo(UPDATED_USR_NAME_KEY);
        assertThat(testUsrUser.getUsrLastName()).isEqualTo(UPDATED_USR_LAST_NAME);
        assertThat(testUsrUser.getUsrFirstName()).isEqualTo(UPDATED_USR_FIRST_NAME);
        assertThat(testUsrUser.getUsrMiddleName()).isEqualTo(UPDATED_USR_MIDDLE_NAME);
        assertThat(testUsrUser.getUsrFormattedName()).isEqualTo(UPDATED_USR_FORMATTED_NAME);
        assertThat(testUsrUser.getUsrNameSoundex()).isEqualTo(UPDATED_USR_NAME_SOUNDEX);
        assertThat(testUsrUser.getUsrAddressLine1()).isEqualTo(UPDATED_USR_ADDRESS_LINE_1);
        assertThat(testUsrUser.getUsrAddressLine2()).isEqualTo(UPDATED_USR_ADDRESS_LINE_2);
        assertThat(testUsrUser.getUsrCity()).isEqualTo(UPDATED_USR_CITY);
        assertThat(testUsrUser.getUsrStaCode()).isEqualTo(UPDATED_USR_STA_CODE);
        assertThat(testUsrUser.getUsrPhone1()).isEqualTo(UPDATED_USR_PHONE_1);
        assertThat(testUsrUser.getUsrPhone2()).isEqualTo(UPDATED_USR_PHONE_2);
        assertThat(testUsrUser.getUsrPhone3()).isEqualTo(UPDATED_USR_PHONE_3);
        assertThat(testUsrUser.getUsrFax()).isEqualTo(UPDATED_USR_FAX);
        assertThat(testUsrUser.getUsrEmail1()).isEqualTo(UPDATED_USR_EMAIL_1);
        assertThat(testUsrUser.getUsrEmail2()).isEqualTo(UPDATED_USR_EMAIL_2);
        assertThat(testUsrUser.getUsrPocCode()).isEqualTo(UPDATED_USR_POC_CODE);
        assertThat(testUsrUser.getUsrPostalExtension()).isEqualTo(UPDATED_USR_POSTAL_EXTENSION);
        assertThat(testUsrUser.getUsrCntCode()).isEqualTo(UPDATED_USR_CNT_CODE);
        assertThat(testUsrUser.getUsrPfpUid()).isEqualTo(UPDATED_USR_PFP_UID);
        assertThat(testUsrUser.getUsrScheduleRestrictionsYN()).isEqualTo(UPDATED_USR_SCHEDULE_RESTRICTIONS_YN);
        assertThat(testUsrUser.getUsrLoginAttemptsRemaining()).isEqualTo(UPDATED_USR_LOGIN_ATTEMPTS_REMAINING);
        assertThat(testUsrUser.getUsrLastPmeRefreshTimestamp()).isEqualTo(UPDATED_USR_LAST_PME_REFRESH_TIMESTAMP);
        assertThat(testUsrUser.getUsrSisenseUsername()).isEqualTo(UPDATED_USR_SISENSE_USERNAME);
    }

    @Test
    @Transactional
    public void updateNonExistingUsrUser() throws Exception {
        int databaseSizeBeforeUpdate = usrUserRepository.findAll().size();

        // Create the UsrUser
        UsrUserDTO usrUserDTO = usrUserMapper.toDto(usrUser);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restUsrUserMockMvc.perform(put("/api/usr-users")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(usrUserDTO)))
            .andExpect(status().isBadRequest());

        // Validate the UsrUser in the database
        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteUsrUser() throws Exception {
        // Initialize the database
        usrUserRepository.saveAndFlush(usrUser);

        int databaseSizeBeforeDelete = usrUserRepository.findAll().size();

        // Delete the usrUser
        restUsrUserMockMvc.perform(delete("/api/usr-users/{id}", usrUser.getUsrUid())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<UsrUser> usrUserList = usrUserRepository.findAll();
        assertThat(usrUserList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
