/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "mb_task_issue")
public class MBIssueEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;
    private String DistrictName;
    private int DistrictId;
    private String MandalName;
    private String MandalCode;
    private String From;
    private String To;
    private String Location;
    private String Frompoint;
    private String ToPoint;
    private String Materialrequired;
    private String MaterialQuantityrequired;
    private String IssueType;
    private  String Reasons;
    private String Units;
    private String Status;
    private String UserName;
    private  String SpanName;
    private String SpanCode;
    private String CreatedOn;
    private int StatusId;
    private int NextApprovalId;
    private int ApprovalAction;
    private String NextApprovalName;
    private String PrevApprovalName;
    private int ApprovalTypeId;
    private String NextApprovalLevel2Name;
    private int IsRejected;
    private int UserId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String districtName) {
        DistrictName = districtName;
    }

    public int getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(int districtId) {
        DistrictId = districtId;
    }

    public String getMandalName() {
        return MandalName;
    }

    public void setMandalName(String mandalName) {
        MandalName = mandalName;
    }

    public String getMandalCode() {
        return MandalCode;
    }

    public void setMandalCode(String mandalCode) {
        MandalCode = mandalCode;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getFrompoint() {
        return Frompoint;
    }

    public void setFrompoint(String frompoint) {
        Frompoint = frompoint;
    }

    public String getToPoint() {
        return ToPoint;
    }

    public void setToPoint(String toPoint) {
        ToPoint = toPoint;
    }

    public String getMaterialrequired() {
        return Materialrequired;
    }

    public void setMaterialrequired(String materialrequired) {
        Materialrequired = materialrequired;
    }

    public String getMaterialQuantityrequired() {
        return MaterialQuantityrequired;
    }

    public void setMaterialQuantityrequired(String materialQuantityrequired) {
        MaterialQuantityrequired = materialQuantityrequired;
    }

    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String issueType) {
        IssueType = issueType;
    }

    public String getReasons() {
        return Reasons;
    }

    public void setReasons(String reasons) {
        Reasons = reasons;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String units) {
        Units = units;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSpanName() {
        return SpanName;
    }

    public void setSpanName(String spanName) {
        SpanName = spanName;
    }

    public String getSpanCode() {
        return SpanCode;
    }

    public void setSpanCode(String spanCode) {
        SpanCode = spanCode;
    }

    public String getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(String createdOn) {
        CreatedOn = createdOn;
    }

    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int statusId) {
        StatusId = statusId;
    }

    public int getNextApprovalId() {
        return NextApprovalId;
    }

    public void setNextApprovalId(int nextApprovalId) {
        NextApprovalId = nextApprovalId;
    }

    public int getApprovalAction() {
        return ApprovalAction;
    }

    public void setApprovalAction(int approvalAction) {
        ApprovalAction = approvalAction;
    }

    public String getNextApprovalName() {
        return NextApprovalName;
    }

    public void setNextApprovalName(String nextApprovalName) {
        NextApprovalName = nextApprovalName;
    }

    public String getPrevApprovalName() {
        return PrevApprovalName;
    }

    public void setPrevApprovalName(String prevApprovalName) {
        PrevApprovalName = prevApprovalName;
    }

    public int getApprovalTypeId() {
        return ApprovalTypeId;
    }

    public void setApprovalTypeId(int approvalTypeId) {
        ApprovalTypeId = approvalTypeId;
    }

    public String getNextApprovalLevel2Name() {
        return NextApprovalLevel2Name;
    }

    public void setNextApprovalLevel2Name(String nextApprovalLevel2Name) {
        NextApprovalLevel2Name = nextApprovalLevel2Name;
    }

    public int getIsRejected() {
        return IsRejected;
    }

    public void setIsRejected(int rejected) {
        IsRejected = rejected;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
