package com.hzn.cr.uam.service.dto;

import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.hzn.cr.uam.domain.UsrUser} entity.
 */
public class UsrUserDTO implements Serializable {

   // @NotNull
    private Integer usrUid;

    private Integer usrStfUid;

    @Size(max = 32)
    private String usrId;

    @Size(max = 1)
    private String usrAccountStatus;

    private LocalDate usrDateAccountExpiration;

    @Size(max = 1)
    private String usrAccountLockedYN;

    @Size(max = 1)
    private String usrRecordStatus;

    private LocalDate usrDatePasswordExpiration;

    @Size(max = 1)
    private String usrUserType;

    private LocalDate usrRecordStatusDate;

    private LocalDate usrCreateDate;

    private Integer usrUsrUidCreatedBy;

    private Integer usrUsrUidUpdatedBy;

    private LocalDate usrLastUpdateDate;

    @Size(max = 32)
    private String usrDbLoginName;

    @Size(max = 32)
    private String usrDbLoginPassword;

    @Size(max = 250)
    private String usrAppLoginName;

    @Size(max = 250)
    private String usrAppLoginPassword;

    private LocalDate usrDateAppLoginPassword;

    private Integer usrForceNewPasswordDays;

    private Integer usrGraceLoginsRemaining;

    @Size(max = 168)
    private String usrDateTimeRestrictions;

    @Size(max = 250)
    private String usrPrevAppLoginPasswd1;

    @Size(max = 250)
    private String usrPrevAppLoginPasswd2;

    @Size(max = 250)
    private String usrPrevAppLoginPasswd3;

    @Size(max = 250)
    private String usrPrevAppLoginPasswd4;

    @Size(max = 250)
    private String usrPrevAppLoginPasswd5;

    @Size(max = 1)
    private String usrStaffAccessPrivilege;

    @Size(max = 1)
    private String usrViewRestrictedEventYN;

    @Size(max = 1)
    private String usrUseDefaultsYN;

    @Size(max = 1)
    private String usrSoundexNameSearchYN;

    @Size(max = 1)
    private String usrShowInactiveRecordsYN;

    @Size(max = 1)
    private String usrControlCenterYN;

    @Size(max = 1)
    private String usrToolbarShowYN;

    @Size(max = 1)
    private String usrToolbarTextYN;

    @Size(max = 1)
    private String usrToolbarPosition;

    @Size(max = 1)
    private String usrSaveSettingsYN;

    @Size(max = 1)
    private String usrWildcardMatchYN;

    @Size(max = 1)
    private String usrViewVipPmiYN;

    @Size(max = 1)
    private String usrViewEmployeePmiYN;

    @Size(max = 1)
    private String usrViewRestrictedPmiYN;

    @Size(max = 1)
    private String usrVerificationRightsYN;

    @Size(max = 1)
    private String usrShowVerificationYN;

    @Size(max = 6)
    private String usrWgrCodeDefault;

    @Size(max = 1)
    private String usrClassificationAccess;

    @Size(max = 1)
    private String usrDepartmentalAccess;

    @Size(max = 1)
    private String usrAssocReviewDptAccess;

    @Size(max = 1)
    private String usrAssocReviewHsvAccess;

    @Size(max = 1)
    private String usrAssocReviewCmmAccess;

    @Size(max = 1)
    private String usrIncludeDptStaffYN;

    @Size(max = 1)
    private String usrIncludeHsvStaffYN;

    @Size(max = 1)
    private String usrIncludeCmmMembersYN;

    @Size(max = 1)
    private String usrClaimCategoryAccess;

    @Size(max = 1)
    private String usrReviewTrackAccess;

    @Size(max = 1)
    private String usrIssueOwnerDptAccess;

    @Size(max = 1)
    private String usrIssueOwnerCmmAccess;

    @Size(max = 1)
    private String usrIssueOwnerHsvAccess;

    private Integer usrTaskListRefresh;

    @Size(max = 6)
    private String usrPpfCode;

    @Size(max = 1)
    private String usrLinkSmcToRlcYN;

    private Integer usrRemoteId;

    @Size(max = 21)
    private String usrExternalFaxId;

    private Integer usrSessionsMax;

    @Size(max = 1)
    private String usrFloatToolbarYN;

    private Integer usrBookmarkX;

    private Integer usrBookmarkY;

    private Integer usrBookmarkHeight;

    private Integer usrBookmarkWidth;

    private Integer usrNumRecentList;

    @Size(max = 1)
    private String usrDisplayBookmarksYN;

   // @NotNull
    private Integer usrRecordVersion;

    @Size(max = 64)
    private String usrNameKey;

    @Size(max = 35)
    private String usrLastName;

    @Size(max = 25)
    private String usrFirstName;

    @Size(max = 25)
    private String usrMiddleName;

    @Size(max = 64)
    private String usrFormattedName;

    @Size(max = 10)
    private String usrNameSoundex;

    @Size(max = 55)
    private String usrAddressLine1;

    @Size(max = 55)
    private String usrAddressLine2;

    @Size(max = 30)
    private String usrCity;

    @Size(max = 6)
    private String usrStaCode;

    @Size(max = 20)
    private String usrPhone1;

    @Size(max = 20)
    private String usrPhone2;

    @Size(max = 20)
    private String usrPhone3;

    @Size(max = 20)
    private String usrFax;

    @Size(max = 60)
    private String usrEmail1;

    @Size(max = 60)
    private String usrEmail2;

    @Size(max = 15)
    private String usrPocCode;

    @Size(max = 4)
    private String usrPostalExtension;

    @Size(max = 3)
    private String usrCntCode;

    private Integer usrPfpUid;

    @Size(max = 1)
    private String usrScheduleRestrictionsYN;

    private Integer usrLoginAttemptsRemaining;

    private LocalDate usrLastPmeRefreshTimestamp;

    @Size(max = 100)
    private String usrSisenseUsername;


    public Integer getUsrUid() {
        return usrUid;
    }

    public void setUsrUid(Integer usrUid) {
        this.usrUid = usrUid;
    }

    public Integer getUsrStfUid() {
        return usrStfUid;
    }

    public void setUsrStfUid(Integer usrStfUid) {
        this.usrStfUid = usrStfUid;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrAccountStatus() {
        return usrAccountStatus;
    }

    public void setUsrAccountStatus(String usrAccountStatus) {
        this.usrAccountStatus = usrAccountStatus;
    }

    public LocalDate getUsrDateAccountExpiration() {
        return usrDateAccountExpiration;
    }

    public void setUsrDateAccountExpiration(LocalDate usrDateAccountExpiration) {
        this.usrDateAccountExpiration = usrDateAccountExpiration;
    }

    public String getUsrAccountLockedYN() {
        return usrAccountLockedYN;
    }

    public void setUsrAccountLockedYN(String usrAccountLockedYN) {
        this.usrAccountLockedYN = usrAccountLockedYN;
    }

    public String getUsrRecordStatus() {
        return usrRecordStatus;
    }

    public void setUsrRecordStatus(String usrRecordStatus) {
        this.usrRecordStatus = usrRecordStatus;
    }

    public LocalDate getUsrDatePasswordExpiration() {
        return usrDatePasswordExpiration;
    }

    public void setUsrDatePasswordExpiration(LocalDate usrDatePasswordExpiration) {
        this.usrDatePasswordExpiration = usrDatePasswordExpiration;
    }

    public String getUsrUserType() {
        return usrUserType;
    }

    public void setUsrUserType(String usrUserType) {
        this.usrUserType = usrUserType;
    }

    public LocalDate getUsrRecordStatusDate() {
        return usrRecordStatusDate;
    }

    public void setUsrRecordStatusDate(LocalDate usrRecordStatusDate) {
        this.usrRecordStatusDate = usrRecordStatusDate;
    }

    public LocalDate getUsrCreateDate() {
        return usrCreateDate;
    }

    public void setUsrCreateDate(LocalDate usrCreateDate) {
        this.usrCreateDate = usrCreateDate;
    }

    public Integer getUsrUsrUidCreatedBy() {
        return usrUsrUidCreatedBy;
    }

    public void setUsrUsrUidCreatedBy(Integer usrUsrUidCreatedBy) {
        this.usrUsrUidCreatedBy = usrUsrUidCreatedBy;
    }

    public Integer getUsrUsrUidUpdatedBy() {
        return usrUsrUidUpdatedBy;
    }

    public void setUsrUsrUidUpdatedBy(Integer usrUsrUidUpdatedBy) {
        this.usrUsrUidUpdatedBy = usrUsrUidUpdatedBy;
    }

    public LocalDate getUsrLastUpdateDate() {
        return usrLastUpdateDate;
    }

    public void setUsrLastUpdateDate(LocalDate usrLastUpdateDate) {
        this.usrLastUpdateDate = usrLastUpdateDate;
    }

    public String getUsrDbLoginName() {
        return usrDbLoginName;
    }

    public void setUsrDbLoginName(String usrDbLoginName) {
        this.usrDbLoginName = usrDbLoginName;
    }

    public String getUsrDbLoginPassword() {
        return usrDbLoginPassword;
    }

    public void setUsrDbLoginPassword(String usrDbLoginPassword) {
        this.usrDbLoginPassword = usrDbLoginPassword;
    }

    public String getUsrAppLoginName() {
        return usrAppLoginName;
    }

    public void setUsrAppLoginName(String usrAppLoginName) {
        this.usrAppLoginName = usrAppLoginName;
    }

    public String getUsrAppLoginPassword() {
        return usrAppLoginPassword;
    }

    public void setUsrAppLoginPassword(String usrAppLoginPassword) {
        this.usrAppLoginPassword = usrAppLoginPassword;
    }

    public LocalDate getUsrDateAppLoginPassword() {
        return usrDateAppLoginPassword;
    }

    public void setUsrDateAppLoginPassword(LocalDate usrDateAppLoginPassword) {
        this.usrDateAppLoginPassword = usrDateAppLoginPassword;
    }

    public Integer getUsrForceNewPasswordDays() {
        return usrForceNewPasswordDays;
    }

    public void setUsrForceNewPasswordDays(Integer usrForceNewPasswordDays) {
        this.usrForceNewPasswordDays = usrForceNewPasswordDays;
    }

    public Integer getUsrGraceLoginsRemaining() {
        return usrGraceLoginsRemaining;
    }

    public void setUsrGraceLoginsRemaining(Integer usrGraceLoginsRemaining) {
        this.usrGraceLoginsRemaining = usrGraceLoginsRemaining;
    }

    public String getUsrDateTimeRestrictions() {
        return usrDateTimeRestrictions;
    }

    public void setUsrDateTimeRestrictions(String usrDateTimeRestrictions) {
        this.usrDateTimeRestrictions = usrDateTimeRestrictions;
    }

    public String getUsrPrevAppLoginPasswd1() {
        return usrPrevAppLoginPasswd1;
    }

    public void setUsrPrevAppLoginPasswd1(String usrPrevAppLoginPasswd1) {
        this.usrPrevAppLoginPasswd1 = usrPrevAppLoginPasswd1;
    }

    public String getUsrPrevAppLoginPasswd2() {
        return usrPrevAppLoginPasswd2;
    }

    public void setUsrPrevAppLoginPasswd2(String usrPrevAppLoginPasswd2) {
        this.usrPrevAppLoginPasswd2 = usrPrevAppLoginPasswd2;
    }

    public String getUsrPrevAppLoginPasswd3() {
        return usrPrevAppLoginPasswd3;
    }

    public void setUsrPrevAppLoginPasswd3(String usrPrevAppLoginPasswd3) {
        this.usrPrevAppLoginPasswd3 = usrPrevAppLoginPasswd3;
    }

    public String getUsrPrevAppLoginPasswd4() {
        return usrPrevAppLoginPasswd4;
    }

    public void setUsrPrevAppLoginPasswd4(String usrPrevAppLoginPasswd4) {
        this.usrPrevAppLoginPasswd4 = usrPrevAppLoginPasswd4;
    }

    public String getUsrPrevAppLoginPasswd5() {
        return usrPrevAppLoginPasswd5;
    }

    public void setUsrPrevAppLoginPasswd5(String usrPrevAppLoginPasswd5) {
        this.usrPrevAppLoginPasswd5 = usrPrevAppLoginPasswd5;
    }

    public String getUsrStaffAccessPrivilege() {
        return usrStaffAccessPrivilege;
    }

    public void setUsrStaffAccessPrivilege(String usrStaffAccessPrivilege) {
        this.usrStaffAccessPrivilege = usrStaffAccessPrivilege;
    }

    public String getUsrViewRestrictedEventYN() {
        return usrViewRestrictedEventYN;
    }

    public void setUsrViewRestrictedEventYN(String usrViewRestrictedEventYN) {
        this.usrViewRestrictedEventYN = usrViewRestrictedEventYN;
    }

    public String getUsrUseDefaultsYN() {
        return usrUseDefaultsYN;
    }

    public void setUsrUseDefaultsYN(String usrUseDefaultsYN) {
        this.usrUseDefaultsYN = usrUseDefaultsYN;
    }

    public String getUsrSoundexNameSearchYN() {
        return usrSoundexNameSearchYN;
    }

    public void setUsrSoundexNameSearchYN(String usrSoundexNameSearchYN) {
        this.usrSoundexNameSearchYN = usrSoundexNameSearchYN;
    }

    public String getUsrShowInactiveRecordsYN() {
        return usrShowInactiveRecordsYN;
    }

    public void setUsrShowInactiveRecordsYN(String usrShowInactiveRecordsYN) {
        this.usrShowInactiveRecordsYN = usrShowInactiveRecordsYN;
    }

    public String getUsrControlCenterYN() {
        return usrControlCenterYN;
    }

    public void setUsrControlCenterYN(String usrControlCenterYN) {
        this.usrControlCenterYN = usrControlCenterYN;
    }

    public String getUsrToolbarShowYN() {
        return usrToolbarShowYN;
    }

    public void setUsrToolbarShowYN(String usrToolbarShowYN) {
        this.usrToolbarShowYN = usrToolbarShowYN;
    }

    public String getUsrToolbarTextYN() {
        return usrToolbarTextYN;
    }

    public void setUsrToolbarTextYN(String usrToolbarTextYN) {
        this.usrToolbarTextYN = usrToolbarTextYN;
    }

    public String getUsrToolbarPosition() {
        return usrToolbarPosition;
    }

    public void setUsrToolbarPosition(String usrToolbarPosition) {
        this.usrToolbarPosition = usrToolbarPosition;
    }

    public String getUsrSaveSettingsYN() {
        return usrSaveSettingsYN;
    }

    public void setUsrSaveSettingsYN(String usrSaveSettingsYN) {
        this.usrSaveSettingsYN = usrSaveSettingsYN;
    }

    public String getUsrWildcardMatchYN() {
        return usrWildcardMatchYN;
    }

    public void setUsrWildcardMatchYN(String usrWildcardMatchYN) {
        this.usrWildcardMatchYN = usrWildcardMatchYN;
    }

    public String getUsrViewVipPmiYN() {
        return usrViewVipPmiYN;
    }

    public void setUsrViewVipPmiYN(String usrViewVipPmiYN) {
        this.usrViewVipPmiYN = usrViewVipPmiYN;
    }

    public String getUsrViewEmployeePmiYN() {
        return usrViewEmployeePmiYN;
    }

    public void setUsrViewEmployeePmiYN(String usrViewEmployeePmiYN) {
        this.usrViewEmployeePmiYN = usrViewEmployeePmiYN;
    }

    public String getUsrViewRestrictedPmiYN() {
        return usrViewRestrictedPmiYN;
    }

    public void setUsrViewRestrictedPmiYN(String usrViewRestrictedPmiYN) {
        this.usrViewRestrictedPmiYN = usrViewRestrictedPmiYN;
    }

    public String getUsrVerificationRightsYN() {
        return usrVerificationRightsYN;
    }

    public void setUsrVerificationRightsYN(String usrVerificationRightsYN) {
        this.usrVerificationRightsYN = usrVerificationRightsYN;
    }

    public String getUsrShowVerificationYN() {
        return usrShowVerificationYN;
    }

    public void setUsrShowVerificationYN(String usrShowVerificationYN) {
        this.usrShowVerificationYN = usrShowVerificationYN;
    }

    public String getUsrWgrCodeDefault() {
        return usrWgrCodeDefault;
    }

    public void setUsrWgrCodeDefault(String usrWgrCodeDefault) {
        this.usrWgrCodeDefault = usrWgrCodeDefault;
    }

    public String getUsrClassificationAccess() {
        return usrClassificationAccess;
    }

    public void setUsrClassificationAccess(String usrClassificationAccess) {
        this.usrClassificationAccess = usrClassificationAccess;
    }

    public String getUsrDepartmentalAccess() {
        return usrDepartmentalAccess;
    }

    public void setUsrDepartmentalAccess(String usrDepartmentalAccess) {
        this.usrDepartmentalAccess = usrDepartmentalAccess;
    }

    public String getUsrAssocReviewDptAccess() {
        return usrAssocReviewDptAccess;
    }

    public void setUsrAssocReviewDptAccess(String usrAssocReviewDptAccess) {
        this.usrAssocReviewDptAccess = usrAssocReviewDptAccess;
    }

    public String getUsrAssocReviewHsvAccess() {
        return usrAssocReviewHsvAccess;
    }

    public void setUsrAssocReviewHsvAccess(String usrAssocReviewHsvAccess) {
        this.usrAssocReviewHsvAccess = usrAssocReviewHsvAccess;
    }

    public String getUsrAssocReviewCmmAccess() {
        return usrAssocReviewCmmAccess;
    }

    public void setUsrAssocReviewCmmAccess(String usrAssocReviewCmmAccess) {
        this.usrAssocReviewCmmAccess = usrAssocReviewCmmAccess;
    }

    public String getUsrIncludeDptStaffYN() {
        return usrIncludeDptStaffYN;
    }

    public void setUsrIncludeDptStaffYN(String usrIncludeDptStaffYN) {
        this.usrIncludeDptStaffYN = usrIncludeDptStaffYN;
    }

    public String getUsrIncludeHsvStaffYN() {
        return usrIncludeHsvStaffYN;
    }

    public void setUsrIncludeHsvStaffYN(String usrIncludeHsvStaffYN) {
        this.usrIncludeHsvStaffYN = usrIncludeHsvStaffYN;
    }

    public String getUsrIncludeCmmMembersYN() {
        return usrIncludeCmmMembersYN;
    }

    public void setUsrIncludeCmmMembersYN(String usrIncludeCmmMembersYN) {
        this.usrIncludeCmmMembersYN = usrIncludeCmmMembersYN;
    }

    public String getUsrClaimCategoryAccess() {
        return usrClaimCategoryAccess;
    }

    public void setUsrClaimCategoryAccess(String usrClaimCategoryAccess) {
        this.usrClaimCategoryAccess = usrClaimCategoryAccess;
    }

    public String getUsrReviewTrackAccess() {
        return usrReviewTrackAccess;
    }

    public void setUsrReviewTrackAccess(String usrReviewTrackAccess) {
        this.usrReviewTrackAccess = usrReviewTrackAccess;
    }

    public String getUsrIssueOwnerDptAccess() {
        return usrIssueOwnerDptAccess;
    }

    public void setUsrIssueOwnerDptAccess(String usrIssueOwnerDptAccess) {
        this.usrIssueOwnerDptAccess = usrIssueOwnerDptAccess;
    }

    public String getUsrIssueOwnerCmmAccess() {
        return usrIssueOwnerCmmAccess;
    }

    public void setUsrIssueOwnerCmmAccess(String usrIssueOwnerCmmAccess) {
        this.usrIssueOwnerCmmAccess = usrIssueOwnerCmmAccess;
    }

    public String getUsrIssueOwnerHsvAccess() {
        return usrIssueOwnerHsvAccess;
    }

    public void setUsrIssueOwnerHsvAccess(String usrIssueOwnerHsvAccess) {
        this.usrIssueOwnerHsvAccess = usrIssueOwnerHsvAccess;
    }

    public Integer getUsrTaskListRefresh() {
        return usrTaskListRefresh;
    }

    public void setUsrTaskListRefresh(Integer usrTaskListRefresh) {
        this.usrTaskListRefresh = usrTaskListRefresh;
    }

    public String getUsrPpfCode() {
        return usrPpfCode;
    }

    public void setUsrPpfCode(String usrPpfCode) {
        this.usrPpfCode = usrPpfCode;
    }

    public String getUsrLinkSmcToRlcYN() {
        return usrLinkSmcToRlcYN;
    }

    public void setUsrLinkSmcToRlcYN(String usrLinkSmcToRlcYN) {
        this.usrLinkSmcToRlcYN = usrLinkSmcToRlcYN;
    }

    public Integer getUsrRemoteId() {
        return usrRemoteId;
    }

    public void setUsrRemoteId(Integer usrRemoteId) {
        this.usrRemoteId = usrRemoteId;
    }

    public String getUsrExternalFaxId() {
        return usrExternalFaxId;
    }

    public void setUsrExternalFaxId(String usrExternalFaxId) {
        this.usrExternalFaxId = usrExternalFaxId;
    }

    public Integer getUsrSessionsMax() {
        return usrSessionsMax;
    }

    public void setUsrSessionsMax(Integer usrSessionsMax) {
        this.usrSessionsMax = usrSessionsMax;
    }

    public String getUsrFloatToolbarYN() {
        return usrFloatToolbarYN;
    }

    public void setUsrFloatToolbarYN(String usrFloatToolbarYN) {
        this.usrFloatToolbarYN = usrFloatToolbarYN;
    }

    public Integer getUsrBookmarkX() {
        return usrBookmarkX;
    }

    public void setUsrBookmarkX(Integer usrBookmarkX) {
        this.usrBookmarkX = usrBookmarkX;
    }

    public Integer getUsrBookmarkY() {
        return usrBookmarkY;
    }

    public void setUsrBookmarkY(Integer usrBookmarkY) {
        this.usrBookmarkY = usrBookmarkY;
    }

    public Integer getUsrBookmarkHeight() {
        return usrBookmarkHeight;
    }

    public void setUsrBookmarkHeight(Integer usrBookmarkHeight) {
        this.usrBookmarkHeight = usrBookmarkHeight;
    }

    public Integer getUsrBookmarkWidth() {
        return usrBookmarkWidth;
    }

    public void setUsrBookmarkWidth(Integer usrBookmarkWidth) {
        this.usrBookmarkWidth = usrBookmarkWidth;
    }

    public Integer getUsrNumRecentList() {
        return usrNumRecentList;
    }

    public void setUsrNumRecentList(Integer usrNumRecentList) {
        this.usrNumRecentList = usrNumRecentList;
    }

    public String getUsrDisplayBookmarksYN() {
        return usrDisplayBookmarksYN;
    }

    public void setUsrDisplayBookmarksYN(String usrDisplayBookmarksYN) {
        this.usrDisplayBookmarksYN = usrDisplayBookmarksYN;
    }

    public Integer getUsrRecordVersion() {
        return usrRecordVersion;
    }

    public void setUsrRecordVersion(Integer usrRecordVersion) {
        this.usrRecordVersion = usrRecordVersion;
    }

    public String getUsrNameKey() {
        return usrNameKey;
    }

    public void setUsrNameKey(String usrNameKey) {
        this.usrNameKey = usrNameKey;
    }

    public String getUsrLastName() {
        return usrLastName;
    }

    public void setUsrLastName(String usrLastName) {
        this.usrLastName = usrLastName;
    }

    public String getUsrFirstName() {
        return usrFirstName;
    }

    public void setUsrFirstName(String usrFirstName) {
        this.usrFirstName = usrFirstName;
    }

    public String getUsrMiddleName() {
        return usrMiddleName;
    }

    public void setUsrMiddleName(String usrMiddleName) {
        this.usrMiddleName = usrMiddleName;
    }

    public String getUsrFormattedName() {
        return usrFormattedName;
    }

    public void setUsrFormattedName(String usrFormattedName) {
        this.usrFormattedName = usrFormattedName;
    }

    public String getUsrNameSoundex() {
        return usrNameSoundex;
    }

    public void setUsrNameSoundex(String usrNameSoundex) {
        this.usrNameSoundex = usrNameSoundex;
    }

    public String getUsrAddressLine1() {
        return usrAddressLine1;
    }

    public void setUsrAddressLine1(String usrAddressLine1) {
        this.usrAddressLine1 = usrAddressLine1;
    }

    public String getUsrAddressLine2() {
        return usrAddressLine2;
    }

    public void setUsrAddressLine2(String usrAddressLine2) {
        this.usrAddressLine2 = usrAddressLine2;
    }

    public String getUsrCity() {
        return usrCity;
    }

    public void setUsrCity(String usrCity) {
        this.usrCity = usrCity;
    }

    public String getUsrStaCode() {
        return usrStaCode;
    }

    public void setUsrStaCode(String usrStaCode) {
        this.usrStaCode = usrStaCode;
    }

    public String getUsrPhone1() {
        return usrPhone1;
    }

    public void setUsrPhone1(String usrPhone1) {
        this.usrPhone1 = usrPhone1;
    }

    public String getUsrPhone2() {
        return usrPhone2;
    }

    public void setUsrPhone2(String usrPhone2) {
        this.usrPhone2 = usrPhone2;
    }

    public String getUsrPhone3() {
        return usrPhone3;
    }

    public void setUsrPhone3(String usrPhone3) {
        this.usrPhone3 = usrPhone3;
    }

    public String getUsrFax() {
        return usrFax;
    }

    public void setUsrFax(String usrFax) {
        this.usrFax = usrFax;
    }

    public String getUsrEmail1() {
        return usrEmail1;
    }

    public void setUsrEmail1(String usrEmail1) {
        this.usrEmail1 = usrEmail1;
    }

    public String getUsrEmail2() {
        return usrEmail2;
    }

    public void setUsrEmail2(String usrEmail2) {
        this.usrEmail2 = usrEmail2;
    }

    public String getUsrPocCode() {
        return usrPocCode;
    }

    public void setUsrPocCode(String usrPocCode) {
        this.usrPocCode = usrPocCode;
    }

    public String getUsrPostalExtension() {
        return usrPostalExtension;
    }

    public void setUsrPostalExtension(String usrPostalExtension) {
        this.usrPostalExtension = usrPostalExtension;
    }

    public String getUsrCntCode() {
        return usrCntCode;
    }

    public void setUsrCntCode(String usrCntCode) {
        this.usrCntCode = usrCntCode;
    }

    public Integer getUsrPfpUid() {
        return usrPfpUid;
    }

    public void setUsrPfpUid(Integer usrPfpUid) {
        this.usrPfpUid = usrPfpUid;
    }

    public String getUsrScheduleRestrictionsYN() {
        return usrScheduleRestrictionsYN;
    }

    public void setUsrScheduleRestrictionsYN(String usrScheduleRestrictionsYN) {
        this.usrScheduleRestrictionsYN = usrScheduleRestrictionsYN;
    }

    public Integer getUsrLoginAttemptsRemaining() {
        return usrLoginAttemptsRemaining;
    }

    public void setUsrLoginAttemptsRemaining(Integer usrLoginAttemptsRemaining) {
        this.usrLoginAttemptsRemaining = usrLoginAttemptsRemaining;
    }

    public LocalDate getUsrLastPmeRefreshTimestamp() {
        return usrLastPmeRefreshTimestamp;
    }

    public void setUsrLastPmeRefreshTimestamp(LocalDate usrLastPmeRefreshTimestamp) {
        this.usrLastPmeRefreshTimestamp = usrLastPmeRefreshTimestamp;
    }

    public String getUsrSisenseUsername() {
        return usrSisenseUsername;
    }

    public void setUsrSisenseUsername(String usrSisenseUsername) {
        this.usrSisenseUsername = usrSisenseUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsrUserDTO)) {
            return false;
        }

        return usrUid != null && usrUid.equals(((UsrUserDTO) o).usrUid);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UsrUserDTO{" +
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
