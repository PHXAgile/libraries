/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "issuecreation_table")
public class IssueCreationEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private long Id;
    private int DistrictId;
    private int MandalId;
    private int SpanID;
    private int Issues;
    private int Reasons;
    private String Location;
    private String ToLatlong;
    private String Frompoint;
    private String ToPoint;
    private String Materialrequired;
    private String MaterialQuantityrequired;
    private int UoM;
    private int UserId;
    private int StatusId;
    private String AddSpanDetails;
    private int SpanIDText;
    private int To;
    private int From;

    public int getSpanIDText() {
        return SpanIDText;
    }

    public void setSpanIDText(int spanIDText) {
        SpanIDText = spanIDText;
    }

    public int getTo() {
        return To;
    }

    public void setTo(int to) {
        To = to;
    }

    public int getFrom() {
        return From;
    }

    public void setFrom(int from) {
        From = from;
    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(int districtId) {
        DistrictId = districtId;
    }

    public int getMandalId() {
        return MandalId;
    }

    public void setMandalId(int mandalId) {
        MandalId = mandalId;
    }

    public int getSpanID() {
        return SpanID;
    }

    public void setSpanID(int spanID) {
        SpanID = spanID;
    }

    public int getIssues() {
        return Issues;
    }

    public void setIssues(int issues) {
        Issues = issues;
    }

    public int getReasons() {
        return Reasons;
    }

    public void setReasons(int reasons) {
        Reasons = reasons;
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

    public int getUoM() {
        return UoM;
    }

    public void setUoM(int uoM) {
        UoM = uoM;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int statusId) {
        StatusId = statusId;
    }

    public String getToLatlong() {
        return ToLatlong;
    }

    public void setToLatlong(String toLatlong) {
        ToLatlong = toLatlong;
    }

    public String getAddSpanDetails() {
        return AddSpanDetails;
    }

    public void setAddSpanDetails(String addSpanDetails) {
        AddSpanDetails = addSpanDetails;
    }
}
