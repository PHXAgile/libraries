/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "riskcreation_table")
public class RiskCreationEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private long ID;
    private int IssueType;
    private int Reason;
    private String QuantityRequired;
    private String Quantity;
    private int UOM;
    private int UOMId;
    private int ReasonId;
    private String Comment;
    private String CreatedOn;
    private int StatusId;
    private double FromLat;
    private double  FromLong;
    private double  ToLat;
    private  double ToLong;
    private String ChainageFrom;
    private String ChainageTo;
    private int IssueTypeId;
    private int UserId;
    private String UserName;
    private String FromGP;
    private String ToGP;
    private int SpanId;
    private String SpanIdText;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getIssueType() {
        return IssueType;
    }

    public void setIssueType(int issueType) {
        IssueType = issueType;
    }

    public int getReason() {
        return Reason;
    }

    public void setReason(int reason) {
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

    public int getUOM() {
        return UOM;
    }

    public void setUOM(int UOM) {
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

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getIssueTypeId() {
        return IssueTypeId;
    }

    public void setIssueTypeId(int issueTypeId) {
        IssueTypeId = issueTypeId;
    }

    public String getFromGP() {
        return FromGP;
    }

    public void setFromGP(String fromGP) {
        FromGP = fromGP;
    }

    public String getToGP() {
        return ToGP;
    }

    public void setToGP(String toGP) {
        ToGP = toGP;
    }

    public int getSpanId() {
        return SpanId;
    }

    public void setSpanId(int spanId) {
        SpanId = spanId;
    }

    public double getFromLat() {
        return FromLat;
    }

    public void setFromLat(double fromLat) {
        FromLat = fromLat;
    }

    public double getFromLong() {
        return FromLong;
    }

    public void setFromLong(double fromLong) {
        FromLong = fromLong;
    }

    public double getToLat() {
        return ToLat;
    }

    public void setToLat(double toLat) {
        ToLat = toLat;
    }

    public double getToLong() {
        return ToLong;
    }

    public void setToLong(double toLong) {
        ToLong = toLong;
    }

    public String getChainageFrom() {
        return ChainageFrom;
    }

    public void setChainageFrom(String chainageFrom) {
        ChainageFrom = chainageFrom;
    }

    public String getChainageTo() {
        return ChainageTo;
    }

    public void setChainageTo(String chainageTo) {
        ChainageTo = chainageTo;
    }

    public String getSpanIdText() {
        return SpanIdText;
    }

    public void setSpanIdText(String spanIdText) {
        SpanIdText = spanIdText;
    }
}
