package com.hzn.cr.uam.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A UsrUser.
 */
@Entity
@Table(name = "usr_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UsrUser implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
//    @SequenceGenerator(name = "sequenceGenerator")
//    private Long id;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    @NotNull
    @Column(name = "usr_uid", nullable = false)
    private Integer usrUid;

    @Column(name = "usr_stf_uid")
    private Integer usrStfUid;

    @Size(max = 32)
    @Column(name = "usr_id", length = 32)
    private String usrId;

    @Size(max = 1)
    @Column(name = "usr_account_status", length = 1)
    private String usrAccountStatus;

    @Column(name = "usr_date_account_expiration")
    private LocalDate usrDateAccountExpiration;

    @Size(max = 1)
    @Column(name = "usr_account_locked_yn", length = 1)
    private String usrAccountLockedYN;

    @Size(max = 1)
    @Column(name = "usr_record_status", length = 1)
    private String usrRecordStatus;

    @Column(name = "usr_date_password_expiration")
    private LocalDate usrDatePasswordExpiration;

    @Size(max = 1)
    @Column(name = "usr_user_type", length = 1)
    private String usrUserType;

    @Column(name = "usr_record_status_date")
    private LocalDate usrRecordStatusDate;

    @Column(name = "usr_create_date")
    private LocalDate usrCreateDate;

    @Column(name = "usr_usr_uid_created_by")
    private Integer usrUsrUidCreatedBy;

    @Column(name = "usr_usr_uid_updated_by")
    private Integer usrUsrUidUpdatedBy;

    @Column(name = "usr_last_update_date")
    private LocalDate usrLastUpdateDate;

    @Size(max = 32)
    @Column(name = "usr_db_login_name", length = 32)
    private String usrDbLoginName;

    @Size(max = 32)
    @Column(name = "usr_db_login_password", length = 32)
    private String usrDbLoginPassword;

    @Size(max = 250)
    @Column(name = "usr_app_login_name", length = 250)
    private String usrAppLoginName;

    @Size(max = 250)
    @Column(name = "usr_app_login_password", length = 250)
    private String usrAppLoginPassword;

    @Column(name = "usr_date_app_login_password")
    private LocalDate usrDateAppLoginPassword;

    @Column(name = "usr_force_new_password_days")
    private Integer usrForceNewPasswordDays;

    @Column(name = "usr_grace_logins_remaining")
    private Integer usrGraceLoginsRemaining;

    @Size(max = 168)
    @Column(name = "usr_date_time_restrictions", length = 168)
    private String usrDateTimeRestrictions;

    @Size(max = 250)
    @Column(name = "usr_prev_app_login_passwd_1", length = 250)
    private String usrPrevAppLoginPasswd1;

    @Size(max = 250)
    @Column(name = "usr_prev_app_login_passwd_2", length = 250)
    private String usrPrevAppLoginPasswd2;

    @Size(max = 250)
    @Column(name = "usr_prev_app_login_passwd_3", length = 250)
    private String usrPrevAppLoginPasswd3;

    @Size(max = 250)
    @Column(name = "usr_prev_app_login_passwd_4", length = 250)
    private String usrPrevAppLoginPasswd4;

    @Size(max = 250)
    @Column(name = "usr_prev_app_login_passwd_5", length = 250)
    private String usrPrevAppLoginPasswd5;

    @Size(max = 1)
    @Column(name = "usr_staff_access_privilege", length = 1)
    private String usrStaffAccessPrivilege;

    @Size(max = 1)
    @Column(name = "usr_view_restricted_event_yn", length = 1)
    private String usrViewRestrictedEventYN;

    @Size(max = 1)
    @Column(name = "usr_use_defaults_yn", length = 1)
    private String usrUseDefaultsYN;

    @Size(max = 1)
    @Column(name = "usr_soundex_name_search_yn", length = 1)
    private String usrSoundexNameSearchYN;

    @Size(max = 1)
    @Column(name = "usr_show_inactive_records_yn", length = 1)
    private String usrShowInactiveRecordsYN;

    @Size(max = 1)
    @Column(name = "usr_control_center_yn", length = 1)
    private String usrControlCenterYN;

    @Size(max = 1)
    @Column(name = "usr_toolbar_show_yn", length = 1)
    private String usrToolbarShowYN;

    @Size(max = 1)
    @Column(name = "usr_toolbar_text_yn", length = 1)
    private String usrToolbarTextYN;

    @Size(max = 1)
    @Column(name = "usr_toolbar_position", length = 1)
    private String usrToolbarPosition;

    @Size(max = 1)
    @Column(name = "usr_save_settings_yn", length = 1)
    private String usrSaveSettingsYN;

    @Size(max = 1)
    @Column(name = "usr_wildcard_match_yn", length = 1)
    private String usrWildcardMatchYN;

    @Size(max = 1)
    @Column(name = "usr_view_vip_pmi_yn", length = 1)
    private String usrViewVipPmiYN;

    @Size(max = 1)
    @Column(name = "usr_view_employee_pmi_yn", length = 1)
    private String usrViewEmployeePmiYN;

    @Size(max = 1)
    @Column(name = "usr_view_restricted_pmi_yn", length = 1)
    private String usrViewRestrictedPmiYN;

    @Size(max = 1)
    @Column(name = "usr_verification_rights_yn", length = 1)
    private String usrVerificationRightsYN;

    @Size(max = 1)
    @Column(name = "usr_show_verification_yn", length = 1)
    private String usrShowVerificationYN;

    @Size(max = 6)
    @Column(name = "usr_wgr_code_default", length = 6)
    private String usrWgrCodeDefault;

    @Size(max = 1)
    @Column(name = "usr_classification_access", length = 1)
    private String usrClassificationAccess;

    @Size(max = 1)
    @Column(name = "usr_departmental_access", length = 1)
    private String usrDepartmentalAccess;

    @Size(max = 1)
    @Column(name = "usr_assoc_review_dpt_access", length = 1)
    private String usrAssocReviewDptAccess;

    @Size(max = 1)
    @Column(name = "usr_assoc_review_hsv_access", length = 1)
    private String usrAssocReviewHsvAccess;

    @Size(max = 1)
    @Column(name = "usr_assoc_review_cmm_access", length = 1)
    private String usrAssocReviewCmmAccess;

    @Size(max = 1)
    @Column(name = "usr_include_dpt_staff_yn", length = 1)
    private String usrIncludeDptStaffYN;

    @Size(max = 1)
    @Column(name = "usr_include_hsv_staff_yn", length = 1)
    private String usrIncludeHsvStaffYN;

    @Size(max = 1)
    @Column(name = "usr_include_cmm_members_yn", length = 1)
    private String usrIncludeCmmMembersYN;

    @Size(max = 1)
    @Column(name = "usr_claim_category_access", length = 1)
    private String usrClaimCategoryAccess;

    @Size(max = 1)
    @Column(name = "usr_review_track_access", length = 1)
    private String usrReviewTrackAccess;

    @Size(max = 1)
    @Column(name = "usr_issue_owner_dpt_access", length = 1)
    private String usrIssueOwnerDptAccess;

    @Size(max = 1)
    @Column(name = "usr_issue_owner_cmm_access", length = 1)
    private String usrIssueOwnerCmmAccess;

    @Size(max = 1)
    @Column(name = "usr_issue_owner_hsv_access", length = 1)
    private String usrIssueOwnerHsvAccess;

    @Column(name = "usr_task_list_refresh")
    private Integer usrTaskListRefresh;

    @Size(max = 6)
    @Column(name = "usr_ppf_code", length = 6)
    private String usrPpfCode;

    @Size(max = 1)
    @Column(name = "usr_link_smc_to_rlc_yn", length = 1)
    private String usrLinkSmcToRlcYN;

    @Column(name = "usr_remote_id")
    private Integer usrRemoteId;

    @Size(max = 21)
    @Column(name = "usr_external_fax_id", length = 21)
    private String usrExternalFaxId;

    @Column(name = "usr_sessions_max")
    private Integer usrSessionsMax;

    @Size(max = 1)
    @Column(name = "usr_float_toolbar_yn", length = 1)
    private String usrFloatToolbarYN;

    @Column(name = "usr_bookmark_x")
    private Integer usrBookmarkX;

    @Column(name = "usr_bookmark_y")
    private Integer usrBookmarkY;

    @Column(name = "usr_bookmark_height")
    private Integer usrBookmarkHeight;

    @Column(name = "usr_bookmark_width")
    private Integer usrBookmarkWidth;

    @Column(name = "usr_num_recent_list")
    private Integer usrNumRecentList;

    @Size(max = 1)
    @Column(name = "usr_display_bookmarks_yn", length = 1)
    private String usrDisplayBookmarksYN;

    @NotNull
    @Column(name = "usr_record_version", nullable = false)
    private Integer usrRecordVersion;

    @Size(max = 64)
    @Column(name = "usr_name_key", length = 64)
    private String usrNameKey;

    @Size(max = 35)
    @Column(name = "usr_last_name", length = 35)
    private String usrLastName;

    @Size(max = 25)
    @Column(name = "usr_first_name", length = 25)
    private String usrFirstName;

    @Size(max = 25)
    @Column(name = "usr_middle_name", length = 25)
    private String usrMiddleName;

    @Size(max = 64)
    @Column(name = "usr_formatted_name", length = 64)
    private String usrFormattedName;

    @Size(max = 10)
    @Column(name = "usr_name_soundex", length = 10)
    private String usrNameSoundex;

    @Size(max = 55)
    @Column(name = "usr_address_line_1", length = 55)
    private String usrAddressLine1;

    @Size(max = 55)
    @Column(name = "usr_address_line_2", length = 55)
    private String usrAddressLine2;

    @Size(max = 30)
    @Column(name = "usr_city", length = 30)
    private String usrCity;

    @Size(max = 6)
    @Column(name = "usr_sta_code", length = 6)
    private String usrStaCode;

    @Size(max = 20)
    @Column(name = "usr_phone_1", length = 20)
    private String usrPhone1;

    @Size(max = 20)
    @Column(name = "usr_phone_2", length = 20)
    private String usrPhone2;

    @Size(max = 20)
    @Column(name = "usr_phone_3", length = 20)
    private String usrPhone3;

    @Size(max = 20)
    @Column(name = "usr_fax", length = 20)
    private String usrFax;

    @Size(max = 60)
    @Column(name = "usr_email_1", length = 60)
    private String usrEmail1;

    @Size(max = 60)
    @Column(name = "usr_email_2", length = 60)
    private String usrEmail2;

    @Size(max = 15)
    @Column(name = "usr_poc_code", length = 15)
    private String usrPocCode;

    @Size(max = 4)
    @Column(name = "usr_postal_extension", length = 4)
    private String usrPostalExtension;

    @Size(max = 3)
    @Column(name = "usr_cnt_code", length = 3)
    private String usrCntCode;

    @Column(name = "usr_pfp_uid")
    private Integer usrPfpUid;

    @Size(max = 1)
    @Column(name = "usr_schedule_restrictions_yn", length = 1)
    private String usrScheduleRestrictionsYN;

    @Column(name = "usr_login_attempts_remaining")
    private Integer usrLoginAttemptsRemaining;

    @Column(name = "usr_last_pme_refresh_timestamp")
    private LocalDate usrLastPmeRefreshTimestamp;

    @Size(max = 100)
    @Column(name = "usr_sisense_username", length = 100)
    private String usrSisenseUsername;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Integer getUsrUid() {
        return usrUid;
    }

    public UsrUser usrUid(Integer usrUid) {
        this.usrUid = usrUid;
        return this;
    }

    public void setUsrUid(Integer usrUid) {
        this.usrUid = usrUid;
    }

    public Integer getUsrStfUid() {
        return usrStfUid;
    }

    public UsrUser usrStfUid(Integer usrStfUid) {
        this.usrStfUid = usrStfUid;
        return this;
    }

    public void setUsrStfUid(Integer usrStfUid) {
        this.usrStfUid = usrStfUid;
    }

    public String getUsrId() {
        return usrId;
    }

    public UsrUser usrId(String usrId) {
        this.usrId = usrId;
        return this;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrAccountStatus() {
        return usrAccountStatus;
    }

    public UsrUser usrAccountStatus(String usrAccountStatus) {
        this.usrAccountStatus = usrAccountStatus;
        return this;
    }

    public void setUsrAccountStatus(String usrAccountStatus) {
        this.usrAccountStatus = usrAccountStatus;
    }

    public LocalDate getUsrDateAccountExpiration() {
        return usrDateAccountExpiration;
    }

    public UsrUser usrDateAccountExpiration(LocalDate usrDateAccountExpiration) {
        this.usrDateAccountExpiration = usrDateAccountExpiration;
        return this;
    }

    public void setUsrDateAccountExpiration(LocalDate usrDateAccountExpiration) {
        this.usrDateAccountExpiration = usrDateAccountExpiration;
    }

    public String getUsrAccountLockedYN() {
        return usrAccountLockedYN;
    }

    public UsrUser usrAccountLockedYN(String usrAccountLockedYN) {
        this.usrAccountLockedYN = usrAccountLockedYN;
        return this;
    }

    public void setUsrAccountLockedYN(String usrAccountLockedYN) {
        this.usrAccountLockedYN = usrAccountLockedYN;
    }

    public String getUsrRecordStatus() {
        return usrRecordStatus;
    }

    public UsrUser usrRecordStatus(String usrRecordStatus) {
        this.usrRecordStatus = usrRecordStatus;
        return this;
    }

    public void setUsrRecordStatus(String usrRecordStatus) {
        this.usrRecordStatus = usrRecordStatus;
    }

    public LocalDate getUsrDatePasswordExpiration() {
        return usrDatePasswordExpiration;
    }

    public UsrUser usrDatePasswordExpiration(LocalDate usrDatePasswordExpiration) {
        this.usrDatePasswordExpiration = usrDatePasswordExpiration;
        return this;
    }

    public void setUsrDatePasswordExpiration(LocalDate usrDatePasswordExpiration) {
        this.usrDatePasswordExpiration = usrDatePasswordExpiration;
    }

    public String getUsrUserType() {
        return usrUserType;
    }

    public UsrUser usrUserType(String usrUserType) {
        this.usrUserType = usrUserType;
        return this;
    }

    public void setUsrUserType(String usrUserType) {
        this.usrUserType = usrUserType;
    }

    public LocalDate getUsrRecordStatusDate() {
        return usrRecordStatusDate;
    }

    public UsrUser usrRecordStatusDate(LocalDate usrRecordStatusDate) {
        this.usrRecordStatusDate = usrRecordStatusDate;
        return this;
    }

    public void setUsrRecordStatusDate(LocalDate usrRecordStatusDate) {
        this.usrRecordStatusDate = usrRecordStatusDate;
    }

    public LocalDate getUsrCreateDate() {
        return usrCreateDate;
    }

    public UsrUser usrCreateDate(LocalDate usrCreateDate) {
        this.usrCreateDate = usrCreateDate;
        return this;
    }

    public void setUsrCreateDate(LocalDate usrCreateDate) {
        this.usrCreateDate = usrCreateDate;
    }

    public Integer getUsrUsrUidCreatedBy() {
        return usrUsrUidCreatedBy;
    }

    public UsrUser usrUsrUidCreatedBy(Integer usrUsrUidCreatedBy) {
        this.usrUsrUidCreatedBy = usrUsrUidCreatedBy;
        return this;
    }

    public void setUsrUsrUidCreatedBy(Integer usrUsrUidCreatedBy) {
        this.usrUsrUidCreatedBy = usrUsrUidCreatedBy;
    }

    public Integer getUsrUsrUidUpdatedBy() {
        return usrUsrUidUpdatedBy;
    }

    public UsrUser usrUsrUidUpdatedBy(Integer usrUsrUidUpdatedBy) {
        this.usrUsrUidUpdatedBy = usrUsrUidUpdatedBy;
        return this;
    }

    public void setUsrUsrUidUpdatedBy(Integer usrUsrUidUpdatedBy) {
        this.usrUsrUidUpdatedBy = usrUsrUidUpdatedBy;
    }

    public LocalDate getUsrLastUpdateDate() {
        return usrLastUpdateDate;
    }

    public UsrUser usrLastUpdateDate(LocalDate usrLastUpdateDate) {
        this.usrLastUpdateDate = usrLastUpdateDate;
        return this;
    }

    public void setUsrLastUpdateDate(LocalDate usrLastUpdateDate) {
        this.usrLastUpdateDate = usrLastUpdateDate;
    }

    public String getUsrDbLoginName() {
        return usrDbLoginName;
    }

    public UsrUser usrDbLoginName(String usrDbLoginName) {
        this.usrDbLoginName = usrDbLoginName;
        return this;
    }

    public void setUsrDbLoginName(String usrDbLoginName) {
        this.usrDbLoginName = usrDbLoginName;
    }

    public String getUsrDbLoginPassword() {
        return usrDbLoginPassword;
    }

    public UsrUser usrDbLoginPassword(String usrDbLoginPassword) {
        this.usrDbLoginPassword = usrDbLoginPassword;
        return this;
    }

    public void setUsrDbLoginPassword(String usrDbLoginPassword) {
        this.usrDbLoginPassword = usrDbLoginPassword;
    }

    public String getUsrAppLoginName() {
        return usrAppLoginName;
    }

    public UsrUser usrAppLoginName(String usrAppLoginName) {
        this.usrAppLoginName = usrAppLoginName;
        return this;
    }

    public void setUsrAppLoginName(String usrAppLoginName) {
        this.usrAppLoginName = usrAppLoginName;
    }

    public String getUsrAppLoginPassword() {
        return usrAppLoginPassword;
    }

    public UsrUser usrAppLoginPassword(String usrAppLoginPassword) {
        this.usrAppLoginPassword = usrAppLoginPassword;
        return this;
    }

    public void setUsrAppLoginPassword(String usrAppLoginPassword) {
        this.usrAppLoginPassword = usrAppLoginPassword;
    }

    public LocalDate getUsrDateAppLoginPassword() {
        return usrDateAppLoginPassword;
    }

    public UsrUser usrDateAppLoginPassword(LocalDate usrDateAppLoginPassword) {
        this.usrDateAppLoginPassword = usrDateAppLoginPassword;
        return this;
    }

    public void setUsrDateAppLoginPassword(LocalDate usrDateAppLoginPassword) {
        this.usrDateAppLoginPassword = usrDateAppLoginPassword;
    }

    public Integer getUsrForceNewPasswordDays() {
        return usrForceNewPasswordDays;
    }

    public UsrUser usrForceNewPasswordDays(Integer usrForceNewPasswordDays) {
        this.usrForceNewPasswordDays = usrForceNewPasswordDays;
        return this;
    }

    public void setUsrForceNewPasswordDays(Integer usrForceNewPasswordDays) {
        this.usrForceNewPasswordDays = usrForceNewPasswordDays;
    }

    public Integer getUsrGraceLoginsRemaining() {
        return usrGraceLoginsRemaining;
    }

    public UsrUser usrGraceLoginsRemaining(Integer usrGraceLoginsRemaining) {
        this.usrGraceLoginsRemaining = usrGraceLoginsRemaining;
        return this;
    }

    public void setUsrGraceLoginsRemaining(Integer usrGraceLoginsRemaining) {
        this.usrGraceLoginsRemaining = usrGraceLoginsRemaining;
    }

    public String getUsrDateTimeRestrictions() {
        return usrDateTimeRestrictions;
    }

    public UsrUser usrDateTimeRestrictions(String usrDateTimeRestrictions) {
        this.usrDateTimeRestrictions = usrDateTimeRestrictions;
        return this;
    }

    public void setUsrDateTimeRestrictions(String usrDateTimeRestrictions) {
        this.usrDateTimeRestrictions = usrDateTimeRestrictions;
    }

    public String getUsrPrevAppLoginPasswd1() {
        return usrPrevAppLoginPasswd1;
    }

    public UsrUser usrPrevAppLoginPasswd1(String usrPrevAppLoginPasswd1) {
        this.usrPrevAppLoginPasswd1 = usrPrevAppLoginPasswd1;
        return this;
    }

    public void setUsrPrevAppLoginPasswd1(String usrPrevAppLoginPasswd1) {
        this.usrPrevAppLoginPasswd1 = usrPrevAppLoginPasswd1;
    }

    public String getUsrPrevAppLoginPasswd2() {
        return usrPrevAppLoginPasswd2;
    }

    public UsrUser usrPrevAppLoginPasswd2(String usrPrevAppLoginPasswd2) {
        this.usrPrevAppLoginPasswd2 = usrPrevAppLoginPasswd2;
        return this;
    }

    public void setUsrPrevAppLoginPasswd2(String usrPrevAppLoginPasswd2) {
        this.usrPrevAppLoginPasswd2 = usrPrevAppLoginPasswd2;
    }

    public String getUsrPrevAppLoginPasswd3() {
        return usrPrevAppLoginPasswd3;
    }

    public UsrUser usrPrevAppLoginPasswd3(String usrPrevAppLoginPasswd3) {
        this.usrPrevAppLoginPasswd3 = usrPrevAppLoginPasswd3;
        return this;
    }

    public void setUsrPrevAppLoginPasswd3(String usrPrevAppLoginPasswd3) {
        this.usrPrevAppLoginPasswd3 = usrPrevAppLoginPasswd3;
    }

    public String getUsrPrevAppLoginPasswd4() {
        return usrPrevAppLoginPasswd4;
    }

    public UsrUser usrPrevAppLoginPasswd4(String usrPrevAppLoginPasswd4) {
        this.usrPrevAppLoginPasswd4 = usrPrevAppLoginPasswd4;
        return this;
    }

    public void setUsrPrevAppLoginPasswd4(String usrPrevAppLoginPasswd4) {
        this.usrPrevAppLoginPasswd4 = usrPrevAppLoginPasswd4;
    }

    public String getUsrPrevAppLoginPasswd5() {
        return usrPrevAppLoginPasswd5;
    }

    public UsrUser usrPrevAppLoginPasswd5(String usrPrevAppLoginPasswd5) {
        this.usrPrevAppLoginPasswd5 = usrPrevAppLoginPasswd5;
        return this;
    }

    public void setUsrPrevAppLoginPasswd5(String usrPrevAppLoginPasswd5) {
        this.usrPrevAppLoginPasswd5 = usrPrevAppLoginPasswd5;
    }

    public String getUsrStaffAccessPrivilege() {
        return usrStaffAccessPrivilege;
    }

    public UsrUser usrStaffAccessPrivilege(String usrStaffAccessPrivilege) {
        this.usrStaffAccessPrivilege = usrStaffAccessPrivilege;
        return this;
    }

    public void setUsrStaffAccessPrivilege(String usrStaffAccessPrivilege) {
        this.usrStaffAccessPrivilege = usrStaffAccessPrivilege;
    }

    public String getUsrViewRestrictedEventYN() {
        return usrViewRestrictedEventYN;
    }

    public UsrUser usrViewRestrictedEventYN(String usrViewRestrictedEventYN) {
        this.usrViewRestrictedEventYN = usrViewRestrictedEventYN;
        return this;
    }

    public void setUsrViewRestrictedEventYN(String usrViewRestrictedEventYN) {
        this.usrViewRestrictedEventYN = usrViewRestrictedEventYN;
    }

    public String getUsrUseDefaultsYN() {
        return usrUseDefaultsYN;
    }

    public UsrUser usrUseDefaultsYN(String usrUseDefaultsYN) {
        this.usrUseDefaultsYN = usrUseDefaultsYN;
        return this;
    }

    public void setUsrUseDefaultsYN(String usrUseDefaultsYN) {
        this.usrUseDefaultsYN = usrUseDefaultsYN;
    }

    public String getUsrSoundexNameSearchYN() {
        return usrSoundexNameSearchYN;
    }

    public UsrUser usrSoundexNameSearchYN(String usrSoundexNameSearchYN) {
        this.usrSoundexNameSearchYN = usrSoundexNameSearchYN;
        return this;
    }

    public void setUsrSoundexNameSearchYN(String usrSoundexNameSearchYN) {
        this.usrSoundexNameSearchYN = usrSoundexNameSearchYN;
    }

    public String getUsrShowInactiveRecordsYN() {
        return usrShowInactiveRecordsYN;
    }

    public UsrUser usrShowInactiveRecordsYN(String usrShowInactiveRecordsYN) {
        this.usrShowInactiveRecordsYN = usrShowInactiveRecordsYN;
        return this;
    }

    public void setUsrShowInactiveRecordsYN(String usrShowInactiveRecordsYN) {
        this.usrShowInactiveRecordsYN = usrShowInactiveRecordsYN;
    }

    public String getUsrControlCenterYN() {
        return usrControlCenterYN;
    }

    public UsrUser usrControlCenterYN(String usrControlCenterYN) {
        this.usrControlCenterYN = usrControlCenterYN;
        return this;
    }

    public void setUsrControlCenterYN(String usrControlCenterYN) {
        this.usrControlCenterYN = usrControlCenterYN;
    }

    public String getUsrToolbarShowYN() {
        return usrToolbarShowYN;
    }

    public UsrUser usrToolbarShowYN(String usrToolbarShowYN) {
        this.usrToolbarShowYN = usrToolbarShowYN;
        return this;
    }

    public void setUsrToolbarShowYN(String usrToolbarShowYN) {
        this.usrToolbarShowYN = usrToolbarShowYN;
    }

    public String getUsrToolbarTextYN() {
        return usrToolbarTextYN;
    }

    public UsrUser usrToolbarTextYN(String usrToolbarTextYN) {
        this.usrToolbarTextYN = usrToolbarTextYN;
        return this;
    }

    public void setUsrToolbarTextYN(String usrToolbarTextYN) {
        this.usrToolbarTextYN = usrToolbarTextYN;
    }

    public String getUsrToolbarPosition() {
        return usrToolbarPosition;
    }

    public UsrUser usrToolbarPosition(String usrToolbarPosition) {
        this.usrToolbarPosition = usrToolbarPosition;
        return this;
    }

    public void setUsrToolbarPosition(String usrToolbarPosition) {
        this.usrToolbarPosition = usrToolbarPosition;
    }

    public String getUsrSaveSettingsYN() {
        return usrSaveSettingsYN;
    }

    public UsrUser usrSaveSettingsYN(String usrSaveSettingsYN) {
        this.usrSaveSettingsYN = usrSaveSettingsYN;
        return this;
    }

    public void setUsrSaveSettingsYN(String usrSaveSettingsYN) {
        this.usrSaveSettingsYN = usrSaveSettingsYN;
    }

    public String getUsrWildcardMatchYN() {
        return usrWildcardMatchYN;
    }

    public UsrUser usrWildcardMatchYN(String usrWildcardMatchYN) {
        this.usrWildcardMatchYN = usrWildcardMatchYN;
        return this;
    }

    public void setUsrWildcardMatchYN(String usrWildcardMatchYN) {
        this.usrWildcardMatchYN = usrWildcardMatchYN;
    }

    public String getUsrViewVipPmiYN() {
        return usrViewVipPmiYN;
    }

    public UsrUser usrViewVipPmiYN(String usrViewVipPmiYN) {
        this.usrViewVipPmiYN = usrViewVipPmiYN;
        return this;
    }

    public void setUsrViewVipPmiYN(String usrViewVipPmiYN) {
        this.usrViewVipPmiYN = usrViewVipPmiYN;
    }

    public String getUsrViewEmployeePmiYN() {
        return usrViewEmployeePmiYN;
    }

    public UsrUser usrViewEmployeePmiYN(String usrViewEmployeePmiYN) {
        this.usrViewEmployeePmiYN = usrViewEmployeePmiYN;
        return this;
    }

    public void setUsrViewEmployeePmiYN(String usrViewEmployeePmiYN) {
        this.usrViewEmployeePmiYN = usrViewEmployeePmiYN;
    }

    public String getUsrViewRestrictedPmiYN() {
        return usrViewRestrictedPmiYN;
    }

    public UsrUser usrViewRestrictedPmiYN(String usrViewRestrictedPmiYN) {
        this.usrViewRestrictedPmiYN = usrViewRestrictedPmiYN;
        return this;
    }

    public void setUsrViewRestrictedPmiYN(String usrViewRestrictedPmiYN) {
        this.usrViewRestrictedPmiYN = usrViewRestrictedPmiYN;
    }

    public String getUsrVerificationRightsYN() {
        return usrVerificationRightsYN;
    }

    public UsrUser usrVerificationRightsYN(String usrVerificationRightsYN) {
        this.usrVerificationRightsYN = usrVerificationRightsYN;
        return this;
    }

    public void setUsrVerificationRightsYN(String usrVerificationRightsYN) {
        this.usrVerificationRightsYN = usrVerificationRightsYN;
    }

    public String getUsrShowVerificationYN() {
        return usrShowVerificationYN;
    }

    public UsrUser usrShowVerificationYN(String usrShowVerificationYN) {
        this.usrShowVerificationYN = usrShowVerificationYN;
        return this;
    }

    public void setUsrShowVerificationYN(String usrShowVerificationYN) {
        this.usrShowVerificationYN = usrShowVerificationYN;
    }

    public String getUsrWgrCodeDefault() {
        return usrWgrCodeDefault;
    }

    public UsrUser usrWgrCodeDefault(String usrWgrCodeDefault) {
        this.usrWgrCodeDefault = usrWgrCodeDefault;
        return this;
    }

    public void setUsrWgrCodeDefault(String usrWgrCodeDefault) {
        this.usrWgrCodeDefault = usrWgrCodeDefault;
    }

    public String getUsrClassificationAccess() {
        return usrClassificationAccess;
    }

    public UsrUser usrClassificationAccess(String usrClassificationAccess) {
        this.usrClassificationAccess = usrClassificationAccess;
        return this;
    }

    public void setUsrClassificationAccess(String usrClassificationAccess) {
        this.usrClassificationAccess = usrClassificationAccess;
    }

    public String getUsrDepartmentalAccess() {
        return usrDepartmentalAccess;
    }

    public UsrUser usrDepartmentalAccess(String usrDepartmentalAccess) {
        this.usrDepartmentalAccess = usrDepartmentalAccess;
        return this;
    }

    public void setUsrDepartmentalAccess(String usrDepartmentalAccess) {
        this.usrDepartmentalAccess = usrDepartmentalAccess;
    }

    public String getUsrAssocReviewDptAccess() {
        return usrAssocReviewDptAccess;
    }

    public UsrUser usrAssocReviewDptAccess(String usrAssocReviewDptAccess) {
        this.usrAssocReviewDptAccess = usrAssocReviewDptAccess;
        return this;
    }

    public void setUsrAssocReviewDptAccess(String usrAssocReviewDptAccess) {
        this.usrAssocReviewDptAccess = usrAssocReviewDptAccess;
    }

    public String getUsrAssocReviewHsvAccess() {
        return usrAssocReviewHsvAccess;
    }

    public UsrUser usrAssocReviewHsvAccess(String usrAssocReviewHsvAccess) {
        this.usrAssocReviewHsvAccess = usrAssocReviewHsvAccess;
        return this;
    }

    public void setUsrAssocReviewHsvAccess(String usrAssocReviewHsvAccess) {
        this.usrAssocReviewHsvAccess = usrAssocReviewHsvAccess;
    }

    public String getUsrAssocReviewCmmAccess() {
        return usrAssocReviewCmmAccess;
    }

    public UsrUser usrAssocReviewCmmAccess(String usrAssocReviewCmmAccess) {
        this.usrAssocReviewCmmAccess = usrAssocReviewCmmAccess;
        return this;
    }

    public void setUsrAssocReviewCmmAccess(String usrAssocReviewCmmAccess) {
        this.usrAssocReviewCmmAccess = usrAssocReviewCmmAccess;
    }

    public String getUsrIncludeDptStaffYN() {
        return usrIncludeDptStaffYN;
    }

    public UsrUser usrIncludeDptStaffYN(String usrIncludeDptStaffYN) {
        this.usrIncludeDptStaffYN = usrIncludeDptStaffYN;
        return this;
    }

    public void setUsrIncludeDptStaffYN(String usrIncludeDptStaffYN) {
        this.usrIncludeDptStaffYN = usrIncludeDptStaffYN;
    }

    public String getUsrIncludeHsvStaffYN() {
        return usrIncludeHsvStaffYN;
    }

    public UsrUser usrIncludeHsvStaffYN(String usrIncludeHsvStaffYN) {
        this.usrIncludeHsvStaffYN = usrIncludeHsvStaffYN;
        return this;
    }

    public void setUsrIncludeHsvStaffYN(String usrIncludeHsvStaffYN) {
        this.usrIncludeHsvStaffYN = usrIncludeHsvStaffYN;
    }

    public String getUsrIncludeCmmMembersYN() {
        return usrIncludeCmmMembersYN;
    }

    public UsrUser usrIncludeCmmMembersYN(String usrIncludeCmmMembersYN) {
        this.usrIncludeCmmMembersYN = usrIncludeCmmMembersYN;
        return this;
    }

    public void setUsrIncludeCmmMembersYN(String usrIncludeCmmMembersYN) {
        this.usrIncludeCmmMembersYN = usrIncludeCmmMembersYN;
    }

    public String getUsrClaimCategoryAccess() {
        return usrClaimCategoryAccess;
    }

    public UsrUser usrClaimCategoryAccess(String usrClaimCategoryAccess) {
        this.usrClaimCategoryAccess = usrClaimCategoryAccess;
        return this;
    }

    public void setUsrClaimCategoryAccess(String usrClaimCategoryAccess) {
        this.usrClaimCategoryAccess = usrClaimCategoryAccess;
    }

    public String getUsrReviewTrackAccess() {
        return usrReviewTrackAccess;
    }

    public UsrUser usrReviewTrackAccess(String usrReviewTrackAccess) {
        this.usrReviewTrackAccess = usrReviewTrackAccess;
        return this;
    }

    public void setUsrReviewTrackAccess(String usrReviewTrackAccess) {
        this.usrReviewTrackAccess = usrReviewTrackAccess;
    }

    public String getUsrIssueOwnerDptAccess() {
        return usrIssueOwnerDptAccess;
    }

    public UsrUser usrIssueOwnerDptAccess(String usrIssueOwnerDptAccess) {
        this.usrIssueOwnerDptAccess = usrIssueOwnerDptAccess;
        return this;
    }

    public void setUsrIssueOwnerDptAccess(String usrIssueOwnerDptAccess) {
        this.usrIssueOwnerDptAccess = usrIssueOwnerDptAccess;
    }

    public String getUsrIssueOwnerCmmAccess() {
        return usrIssueOwnerCmmAccess;
    }

    public UsrUser usrIssueOwnerCmmAccess(String usrIssueOwnerCmmAccess) {
        this.usrIssueOwnerCmmAccess = usrIssueOwnerCmmAccess;
        return this;
    }

    public void setUsrIssueOwnerCmmAccess(String usrIssueOwnerCmmAccess) {
        this.usrIssueOwnerCmmAccess = usrIssueOwnerCmmAccess;
    }

    public String getUsrIssueOwnerHsvAccess() {
        return usrIssueOwnerHsvAccess;
    }

    public UsrUser usrIssueOwnerHsvAccess(String usrIssueOwnerHsvAccess) {
        this.usrIssueOwnerHsvAccess = usrIssueOwnerHsvAccess;
        return this;
    }

    public void setUsrIssueOwnerHsvAccess(String usrIssueOwnerHsvAccess) {
        this.usrIssueOwnerHsvAccess = usrIssueOwnerHsvAccess;
    }

    public Integer getUsrTaskListRefresh() {
        return usrTaskListRefresh;
    }

    public UsrUser usrTaskListRefresh(Integer usrTaskListRefresh) {
        this.usrTaskListRefresh = usrTaskListRefresh;
        return this;
    }

    public void setUsrTaskListRefresh(Integer usrTaskListRefresh) {
        this.usrTaskListRefresh = usrTaskListRefresh;
    }

    public String getUsrPpfCode() {
        return usrPpfCode;
    }

    public UsrUser usrPpfCode(String usrPpfCode) {
        this.usrPpfCode = usrPpfCode;
        return this;
    }

    public void setUsrPpfCode(String usrPpfCode) {
        this.usrPpfCode = usrPpfCode;
    }

    public String getUsrLinkSmcToRlcYN() {
        return usrLinkSmcToRlcYN;
    }

    public UsrUser usrLinkSmcToRlcYN(String usrLinkSmcToRlcYN) {
        this.usrLinkSmcToRlcYN = usrLinkSmcToRlcYN;
        return this;
    }

    public void setUsrLinkSmcToRlcYN(String usrLinkSmcToRlcYN) {
        this.usrLinkSmcToRlcYN = usrLinkSmcToRlcYN;
    }

    public Integer getUsrRemoteId() {
        return usrRemoteId;
    }

    public UsrUser usrRemoteId(Integer usrRemoteId) {
        this.usrRemoteId = usrRemoteId;
        return this;
    }

    public void setUsrRemoteId(Integer usrRemoteId) {
        this.usrRemoteId = usrRemoteId;
    }

    public String getUsrExternalFaxId() {
        return usrExternalFaxId;
    }

    public UsrUser usrExternalFaxId(String usrExternalFaxId) {
        this.usrExternalFaxId = usrExternalFaxId;
        return this;
    }

    public void setUsrExternalFaxId(String usrExternalFaxId) {
        this.usrExternalFaxId = usrExternalFaxId;
    }

    public Integer getUsrSessionsMax() {
        return usrSessionsMax;
    }

    public UsrUser usrSessionsMax(Integer usrSessionsMax) {
        this.usrSessionsMax = usrSessionsMax;
        return this;
    }

    public void setUsrSessionsMax(Integer usrSessionsMax) {
        this.usrSessionsMax = usrSessionsMax;
    }

    public String getUsrFloatToolbarYN() {
        return usrFloatToolbarYN;
    }

    public UsrUser usrFloatToolbarYN(String usrFloatToolbarYN) {
        this.usrFloatToolbarYN = usrFloatToolbarYN;
        return this;
    }

    public void setUsrFloatToolbarYN(String usrFloatToolbarYN) {
        this.usrFloatToolbarYN = usrFloatToolbarYN;
    }

    public Integer getUsrBookmarkX() {
        return usrBookmarkX;
    }

    public UsrUser usrBookmarkX(Integer usrBookmarkX) {
        this.usrBookmarkX = usrBookmarkX;
        return this;
    }

    public void setUsrBookmarkX(Integer usrBookmarkX) {
        this.usrBookmarkX = usrBookmarkX;
    }

    public Integer getUsrBookmarkY() {
        return usrBookmarkY;
    }

    public UsrUser usrBookmarkY(Integer usrBookmarkY) {
        this.usrBookmarkY = usrBookmarkY;
        return this;
    }

    public void setUsrBookmarkY(Integer usrBookmarkY) {
        this.usrBookmarkY = usrBookmarkY;
    }

    public Integer getUsrBookmarkHeight() {
        return usrBookmarkHeight;
    }

    public UsrUser usrBookmarkHeight(Integer usrBookmarkHeight) {
        this.usrBookmarkHeight = usrBookmarkHeight;
        return this;
    }

    public void setUsrBookmarkHeight(Integer usrBookmarkHeight) {
        this.usrBookmarkHeight = usrBookmarkHeight;
    }

    public Integer getUsrBookmarkWidth() {
        return usrBookmarkWidth;
    }

    public UsrUser usrBookmarkWidth(Integer usrBookmarkWidth) {
        this.usrBookmarkWidth = usrBookmarkWidth;
        return this;
    }

    public void setUsrBookmarkWidth(Integer usrBookmarkWidth) {
        this.usrBookmarkWidth = usrBookmarkWidth;
    }

    public Integer getUsrNumRecentList() {
        return usrNumRecentList;
    }

    public UsrUser usrNumRecentList(Integer usrNumRecentList) {
        this.usrNumRecentList = usrNumRecentList;
        return this;
    }

    public void setUsrNumRecentList(Integer usrNumRecentList) {
        this.usrNumRecentList = usrNumRecentList;
    }

    public String getUsrDisplayBookmarksYN() {
        return usrDisplayBookmarksYN;
    }

    public UsrUser usrDisplayBookmarksYN(String usrDisplayBookmarksYN) {
        this.usrDisplayBookmarksYN = usrDisplayBookmarksYN;
        return this;
    }

    public void setUsrDisplayBookmarksYN(String usrDisplayBookmarksYN) {
        this.usrDisplayBookmarksYN = usrDisplayBookmarksYN;
    }

    public Integer getUsrRecordVersion() {
        return usrRecordVersion;
    }

    public UsrUser usrRecordVersion(Integer usrRecordVersion) {
        this.usrRecordVersion = usrRecordVersion;
        return this;
    }

    public void setUsrRecordVersion(Integer usrRecordVersion) {
        this.usrRecordVersion = usrRecordVersion;
    }

    public String getUsrNameKey() {
        return usrNameKey;
    }

    public UsrUser usrNameKey(String usrNameKey) {
        this.usrNameKey = usrNameKey;
        return this;
    }

    public void setUsrNameKey(String usrNameKey) {
        this.usrNameKey = usrNameKey;
    }

    public String getUsrLastName() {
        return usrLastName;
    }

    public UsrUser usrLastName(String usrLastName) {
        this.usrLastName = usrLastName;
        return this;
    }

    public void setUsrLastName(String usrLastName) {
        this.usrLastName = usrLastName;
    }

    public String getUsrFirstName() {
        return usrFirstName;
    }

    public UsrUser usrFirstName(String usrFirstName) {
        this.usrFirstName = usrFirstName;
        return this;
    }

    public void setUsrFirstName(String usrFirstName) {
        this.usrFirstName = usrFirstName;
    }

    public String getUsrMiddleName() {
        return usrMiddleName;
    }

    public UsrUser usrMiddleName(String usrMiddleName) {
        this.usrMiddleName = usrMiddleName;
        return this;
    }

    public void setUsrMiddleName(String usrMiddleName) {
        this.usrMiddleName = usrMiddleName;
    }

    public String getUsrFormattedName() {
        return usrFormattedName;
    }

    public UsrUser usrFormattedName(String usrFormattedName) {
        this.usrFormattedName = usrFormattedName;
        return this;
    }

    public void setUsrFormattedName(String usrFormattedName) {
        this.usrFormattedName = usrFormattedName;
    }

    public String getUsrNameSoundex() {
        return usrNameSoundex;
    }

    public UsrUser usrNameSoundex(String usrNameSoundex) {
        this.usrNameSoundex = usrNameSoundex;
        return this;
    }

    public void setUsrNameSoundex(String usrNameSoundex) {
        this.usrNameSoundex = usrNameSoundex;
    }

    public String getUsrAddressLine1() {
        return usrAddressLine1;
    }

    public UsrUser usrAddressLine1(String usrAddressLine1) {
        this.usrAddressLine1 = usrAddressLine1;
        return this;
    }

    public void setUsrAddressLine1(String usrAddressLine1) {
        this.usrAddressLine1 = usrAddressLine1;
    }

    public String getUsrAddressLine2() {
        return usrAddressLine2;
    }

    public UsrUser usrAddressLine2(String usrAddressLine2) {
        this.usrAddressLine2 = usrAddressLine2;
        return this;
    }

    public void setUsrAddressLine2(String usrAddressLine2) {
        this.usrAddressLine2 = usrAddressLine2;
    }

    public String getUsrCity() {
        return usrCity;
    }

    public UsrUser usrCity(String usrCity) {
        this.usrCity = usrCity;
        return this;
    }

    public void setUsrCity(String usrCity) {
        this.usrCity = usrCity;
    }

    public String getUsrStaCode() {
        return usrStaCode;
    }

    public UsrUser usrStaCode(String usrStaCode) {
        this.usrStaCode = usrStaCode;
        return this;
    }

    public void setUsrStaCode(String usrStaCode) {
        this.usrStaCode = usrStaCode;
    }

    public String getUsrPhone1() {
        return usrPhone1;
    }

    public UsrUser usrPhone1(String usrPhone1) {
        this.usrPhone1 = usrPhone1;
        return this;
    }

    public void setUsrPhone1(String usrPhone1) {
        this.usrPhone1 = usrPhone1;
    }

    public String getUsrPhone2() {
        return usrPhone2;
    }

    public UsrUser usrPhone2(String usrPhone2) {
        this.usrPhone2 = usrPhone2;
        return this;
    }

    public void setUsrPhone2(String usrPhone2) {
        this.usrPhone2 = usrPhone2;
    }

    public String getUsrPhone3() {
        return usrPhone3;
    }

    public UsrUser usrPhone3(String usrPhone3) {
        this.usrPhone3 = usrPhone3;
        return this;
    }

    public void setUsrPhone3(String usrPhone3) {
        this.usrPhone3 = usrPhone3;
    }

    public String getUsrFax() {
        return usrFax;
    }

    public UsrUser usrFax(String usrFax) {
        this.usrFax = usrFax;
        return this;
    }

    public void setUsrFax(String usrFax) {
        this.usrFax = usrFax;
    }

    public String getUsrEmail1() {
        return usrEmail1;
    }

    public UsrUser usrEmail1(String usrEmail1) {
        this.usrEmail1 = usrEmail1;
        return this;
    }

    public void setUsrEmail1(String usrEmail1) {
        this.usrEmail1 = usrEmail1;
    }

    public String getUsrEmail2() {
        return usrEmail2;
    }

    public UsrUser usrEmail2(String usrEmail2) {
        this.usrEmail2 = usrEmail2;
        return this;
    }

    public void setUsrEmail2(String usrEmail2) {
        this.usrEmail2 = usrEmail2;
    }

    public String getUsrPocCode() {
        return usrPocCode;
    }

    public UsrUser usrPocCode(String usrPocCode) {
        this.usrPocCode = usrPocCode;
        return this;
    }

    public void setUsrPocCode(String usrPocCode) {
        this.usrPocCode = usrPocCode;
    }

    public String getUsrPostalExtension() {
        return usrPostalExtension;
    }

    public UsrUser usrPostalExtension(String usrPostalExtension) {
        this.usrPostalExtension = usrPostalExtension;
        return this;
    }

    public void setUsrPostalExtension(String usrPostalExtension) {
        this.usrPostalExtension = usrPostalExtension;
    }

    public String getUsrCntCode() {
        return usrCntCode;
    }

    public UsrUser usrCntCode(String usrCntCode) {
        this.usrCntCode = usrCntCode;
        return this;
    }

    public void setUsrCntCode(String usrCntCode) {
        this.usrCntCode = usrCntCode;
    }

    public Integer getUsrPfpUid() {
        return usrPfpUid;
    }

    public UsrUser usrPfpUid(Integer usrPfpUid) {
        this.usrPfpUid = usrPfpUid;
        return this;
    }

    public void setUsrPfpUid(Integer usrPfpUid) {
        this.usrPfpUid = usrPfpUid;
    }

    public String getUsrScheduleRestrictionsYN() {
        return usrScheduleRestrictionsYN;
    }

    public UsrUser usrScheduleRestrictionsYN(String usrScheduleRestrictionsYN) {
        this.usrScheduleRestrictionsYN = usrScheduleRestrictionsYN;
        return this;
    }

    public void setUsrScheduleRestrictionsYN(String usrScheduleRestrictionsYN) {
        this.usrScheduleRestrictionsYN = usrScheduleRestrictionsYN;
    }

    public Integer getUsrLoginAttemptsRemaining() {
        return usrLoginAttemptsRemaining;
    }

    public UsrUser usrLoginAttemptsRemaining(Integer usrLoginAttemptsRemaining) {
        this.usrLoginAttemptsRemaining = usrLoginAttemptsRemaining;
        return this;
    }

    public void setUsrLoginAttemptsRemaining(Integer usrLoginAttemptsRemaining) {
        this.usrLoginAttemptsRemaining = usrLoginAttemptsRemaining;
    }

    public LocalDate getUsrLastPmeRefreshTimestamp() {
        return usrLastPmeRefreshTimestamp;
    }

    public UsrUser usrLastPmeRefreshTimestamp(LocalDate usrLastPmeRefreshTimestamp) {
        this.usrLastPmeRefreshTimestamp = usrLastPmeRefreshTimestamp;
        return this;
    }

    public void setUsrLastPmeRefreshTimestamp(LocalDate usrLastPmeRefreshTimestamp) {
        this.usrLastPmeRefreshTimestamp = usrLastPmeRefreshTimestamp;
    }

    public String getUsrSisenseUsername() {
        return usrSisenseUsername;
    }

    public UsrUser usrSisenseUsername(String usrSisenseUsername) {
        this.usrSisenseUsername = usrSisenseUsername;
        return this;
    }

    public void setUsrSisenseUsername(String usrSisenseUsername) {
        this.usrSisenseUsername = usrSisenseUsername;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsrUser)) {
            return false;
        }
        return usrUid != null && usrUid.equals(((UsrUser) o).usrUid);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UsrUser{" +
            ", usrUid=" + getUsrUid() +
            ", usrStfUid=" + getUsrStfUid() +
            ", usrId='" + getUsrId() + "'" +
            ", usrAccountStatus='" + getUsrAccountStatus() + "'" +
            ", usrDateAccountExpiration='" + getUsrDateAccountExpiration() + "'" +
            ", usrAccountLockedYN='" + getUsrAccountLockedYN() + "'" +
            ", usrRecordStatus='" + getUsrRecordStatus() + "'" +
            ", usrDatePasswordExpiration='" + getUsrDatePasswordExpiration() + "'" +
            ", usrUserType='" + getUsrUserType() + "'" +
            ", usrRecordStatusDate='" + getUsrRecordStatusDate() + "'" +
            ", usrCreateDate='" + getUsrCreateDate() + "'" +
            ", usrUsrUidCreatedBy=" + getUsrUsrUidCreatedBy() +
            ", usrUsrUidUpdatedBy=" + getUsrUsrUidUpdatedBy() +
            ", usrLastUpdateDate='" + getUsrLastUpdateDate() + "'" +
            ", usrDbLoginName='" + getUsrDbLoginName() + "'" +
            ", usrDbLoginPassword='" + getUsrDbLoginPassword() + "'" +
            ", usrAppLoginName='" + getUsrAppLoginName() + "'" +
            ", usrAppLoginPassword='" + getUsrAppLoginPassword() + "'" +
            ", usrDateAppLoginPassword='" + getUsrDateAppLoginPassword() + "'" +
            ", usrForceNewPasswordDays=" + getUsrForceNewPasswordDays() +
            ", usrGraceLoginsRemaining=" + getUsrGraceLoginsRemaining() +
            ", usrDateTimeRestrictions='" + getUsrDateTimeRestrictions() + "'" +
            ", usrPrevAppLoginPasswd1='" + getUsrPrevAppLoginPasswd1() + "'" +
            ", usrPrevAppLoginPasswd2='" + getUsrPrevAppLoginPasswd2() + "'" +
            ", usrPrevAppLoginPasswd3='" + getUsrPrevAppLoginPasswd3() + "'" +
            ", usrPrevAppLoginPasswd4='" + getUsrPrevAppLoginPasswd4() + "'" +
            ", usrPrevAppLoginPasswd5='" + getUsrPrevAppLoginPasswd5() + "'" +
            ", usrStaffAccessPrivilege='" + getUsrStaffAccessPrivilege() + "'" +
            ", usrViewRestrictedEventYN='" + getUsrViewRestrictedEventYN() + "'" +
            ", usrUseDefaultsYN='" + getUsrUseDefaultsYN() + "'" +
            ", usrSoundexNameSearchYN='" + getUsrSoundexNameSearchYN() + "'" +
            ", usrShowInactiveRecordsYN='" + getUsrShowInactiveRecordsYN() + "'" +
            ", usrControlCenterYN='" + getUsrControlCenterYN() + "'" +
            ", usrToolbarShowYN='" + getUsrToolbarShowYN() + "'" +
            ", usrToolbarTextYN='" + getUsrToolbarTextYN() + "'" +
            ", usrToolbarPosition='" + getUsrToolbarPosition() + "'" +
            ", usrSaveSettingsYN='" + getUsrSaveSettingsYN() + "'" +
            ", usrWildcardMatchYN='" + getUsrWildcardMatchYN() + "'" +
            ", usrViewVipPmiYN='" + getUsrViewVipPmiYN() + "'" +
            ", usrViewEmployeePmiYN='" + getUsrViewEmployeePmiYN() + "'" +
            ", usrViewRestrictedPmiYN='" + getUsrViewRestrictedPmiYN() + "'" +
            ", usrVerificationRightsYN='" + getUsrVerificationRightsYN() + "'" +
            ", usrShowVerificationYN='" + getUsrShowVerificationYN() + "'" +
            ", usrWgrCodeDefault='" + getUsrWgrCodeDefault() + "'" +
            ", usrClassificationAccess='" + getUsrClassificationAccess() + "'" +
            ", usrDepartmentalAccess='" + getUsrDepartmentalAccess() + "'" +
            ", usrAssocReviewDptAccess='" + getUsrAssocReviewDptAccess() + "'" +
            ", usrAssocReviewHsvAccess='" + getUsrAssocReviewHsvAccess() + "'" +
            ", usrAssocReviewCmmAccess='" + getUsrAssocReviewCmmAccess() + "'" +
            ", usrIncludeDptStaffYN='" + getUsrIncludeDptStaffYN() + "'" +
            ", usrIncludeHsvStaffYN='" + getUsrIncludeHsvStaffYN() + "'" +
            ", usrIncludeCmmMembersYN='" + getUsrIncludeCmmMembersYN() + "'" +
            ", usrClaimCategoryAccess='" + getUsrClaimCategoryAccess() + "'" +
            ", usrReviewTrackAccess='" + getUsrReviewTrackAccess() + "'" +
            ", usrIssueOwnerDptAccess='" + getUsrIssueOwnerDptAccess() + "'" +
            ", usrIssueOwnerCmmAccess='" + getUsrIssueOwnerCmmAccess() + "'" +
            ", usrIssueOwnerHsvAccess='" + getUsrIssueOwnerHsvAccess() + "'" +
            ", usrTaskListRefresh=" + getUsrTaskListRefresh() +
            ", usrPpfCode='" + getUsrPpfCode() + "'" +
            ", usrLinkSmcToRlcYN='" + getUsrLinkSmcToRlcYN() + "'" +
            ", usrRemoteId=" + getUsrRemoteId() +
            ", usrExternalFaxId='" + getUsrExternalFaxId() + "'" +
            ", usrSessionsMax=" + getUsrSessionsMax() +
            ", usrFloatToolbarYN='" + getUsrFloatToolbarYN() + "'" +
            ", usrBookmarkX=" + getUsrBookmarkX() +
            ", usrBookmarkY=" + getUsrBookmarkY() +
            ", usrBookmarkHeight=" + getUsrBookmarkHeight() +
            ", usrBookmarkWidth=" + getUsrBookmarkWidth() +
            ", usrNumRecentList=" + getUsrNumRecentList() +
            ", usrDisplayBookmarksYN='" + getUsrDisplayBookmarksYN() + "'" +
            ", usrRecordVersion=" + getUsrRecordVersion() +
            ", usrNameKey='" + getUsrNameKey() + "'" +
            ", usrLastName='" + getUsrLastName() + "'" +
            ", usrFirstName='" + getUsrFirstName() + "'" +
            ", usrMiddleName='" + getUsrMiddleName() + "'" +
            ", usrFormattedName='" + getUsrFormattedName() + "'" +
            ", usrNameSoundex='" + getUsrNameSoundex() + "'" +
            ", usrAddressLine1='" + getUsrAddressLine1() + "'" +
            ", usrAddressLine2='" + getUsrAddressLine2() + "'" +
            ", usrCity='" + getUsrCity() + "'" +
            ", usrStaCode='" + getUsrStaCode() + "'" +
            ", usrPhone1='" + getUsrPhone1() + "'" +
            ", usrPhone2='" + getUsrPhone2() + "'" +
            ", usrPhone3='" + getUsrPhone3() + "'" +
            ", usrFax='" + getUsrFax() + "'" +
            ", usrEmail1='" + getUsrEmail1() + "'" +
            ", usrEmail2='" + getUsrEmail2() + "'" +
            ", usrPocCode='" + getUsrPocCode() + "'" +
            ", usrPostalExtension='" + getUsrPostalExtension() + "'" +
            ", usrCntCode='" + getUsrCntCode() + "'" +
            ", usrPfpUid=" + getUsrPfpUid() +
            ", usrScheduleRestrictionsYN='" + getUsrScheduleRestrictionsYN() + "'" +
            ", usrLoginAttemptsRemaining=" + getUsrLoginAttemptsRemaining() +
            ", usrLastPmeRefreshTimestamp='" + getUsrLastPmeRefreshTimestamp() + "'" +
            ", usrSisenseUsername='" + getUsrSisenseUsername() + "'" +
            "}";
    }
}
