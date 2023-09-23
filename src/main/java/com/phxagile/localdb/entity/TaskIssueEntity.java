/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task_issue_table")
public class TaskIssueEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private long ID;
    private String IssueType;
    private String Reason;
    private String QuantityRequired;
    private String Quantity;
    private String UOM;
    private int UOMId;
    private int ReasonId;
    private String Comment;
    private String CreatedOn;
    private int StatusId;
    private float NextApprovalId;
    private float ApprovalAction;
    private String NextApprovalName;
    private String PrevApprovalName;
    private float ApprovalTypeId;
    private String NextApprovalLevel2Name;
    private String Status;
    private int IssueTypeId;
    private int UserId;
    private float NextApproval;
    private float NextApprovalLevel;
    private float PrevApprovalId;
    private Boolean IsRejected;
   // private Boolean IsFinalApproval;
    private String UserName;

    public long getID() {
        return ID;
    }

    public void setID(long id) {
        ID = id;
    }

    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String issueType) {
        IssueType = issueType;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getQuantityRequired() {
        return QuantityRequired;
    }

    public void setQuantityRequired(String quantityRequired) {
        QuantityRequired = quantityRequired;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public int getUOMId() {
        return UOMId;
    }

    public void setUOMId(int UOMId) {
        this.UOMId = UOMId;
    }

    public int getReasonId() {
        return ReasonId;
    }

    public void setReasonId(int reasonId) {
        ReasonId = reasonId;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
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

    public float getNextApprovalId() {
        return NextApprovalId;
    }

    public void setNextApprovalId(float nextApprovalId) {
        NextApprovalId = nextApprovalId;
    }

    public float getApprovalAction() {
        return ApprovalAction;
    }

    public void setApprovalAction(float approvalAction) {
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

    public float getApprovalTypeId() {
        return ApprovalTypeId;
    }

    public void setApprovalTypeId(float approvalTypeId) {
        ApprovalTypeId = approvalTypeId;
    }

    public String getNextApprovalLevel2Name() {
        return NextApprovalLevel2Name;
    }

    public void setNextApprovalLevel2Name(String nextApprovalLevel2Name) {
        NextApprovalLevel2Name = nextApprovalLevel2Name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getIssueTypeId() {
        return IssueTypeId;
    }

    public void setIssueTypeId(int issueTypeId) {
        IssueTypeId = issueTypeId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public float getNextApproval() {
        return NextApproval;
    }

    public void setNextApproval(float nextApproval) {
        NextApproval = nextApproval;
    }

    public float getNextApprovalLevel() {
        return NextApprovalLevel;
    }

    public void setNextApprovalLevel(float nextApprovalLevel) {
        NextApprovalLevel = nextApprovalLevel;
    }

    public float getPrevApprovalId() {
        return PrevApprovalId;
    }

    public void setPrevApprovalId(float prevApprovalId) {
        PrevApprovalId = prevApprovalId;
    }

   /* public Boolean isFinalApproval() {
        return IsFinalApproval;
    }

    public void setFinalApproval(Boolean finalApproval) {
        IsFinalApproval = finalApproval;
    }*/

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Boolean getIsRejected() {
        return IsRejected;
    }

    public void setIsRejected(Boolean isRejected) {
        IsRejected = isRejected;
    }
}
