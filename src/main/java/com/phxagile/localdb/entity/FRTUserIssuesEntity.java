/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

/*import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;*/

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "frt_issues")
public class FRTUserIssuesEntity{
    @PrimaryKey
    @NonNull
    private int  Id;
    private int UserId;
    private String Name;

    private String Status;

    private String LinkName;

    private String Phone;

    private String EndDate;

    private String StartDate;

    private int StatusId;

    private String RouteName;

    private String RouteCode;

    private double Lat;

    private double Lang;

    private String Comment;

    private String ReferenceNumber;
    private String CreatedDate;

    private String IssueType;
    private String FaultLocation;


    private String LinkCode;

    private String TotalTime;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public String getLinkName ()
    {
        return LinkName;
    }

    public void setLinkName (String LinkName)
    {
        this.LinkName = LinkName;
    }

    public String getPhone ()
    {
        return Phone;
    }

    public void setPhone (String Phone)
    {
        this.Phone = Phone;
    }

    public String getEndDate ()
    {
        return EndDate;
    }

    public void setEndDate (String EndDate)
    {
        this.EndDate = EndDate;
    }

    public String getStartDate ()
    {
        return StartDate;
    }

    public void setStartDate (String StartDate)
    {
        this.StartDate = StartDate;
    }

    public int getStatusId ()
    {
        return StatusId;
    }

    public void setStatusId (int StatusId)
    {
        this.StatusId = StatusId;
    }

    public String getRouteName ()
    {
        return RouteName;
    }

    public void setRouteName (String RouteName)
    {
        this.RouteName = RouteName;
    }

    public String getRouteCode ()
    {
        return RouteCode;
    }

    public void setRouteCode (String RouteCode)
    {
        this.RouteCode = RouteCode;
    }

    public int getId ()
    {
        return Id;
    }

    public void setId (int Id)
    {
        this.Id = Id;
    }

    public String getLinkCode ()
    {
        return LinkCode;
    }

    public void setLinkCode (String LinkCode)
    {
        this.LinkCode = LinkCode;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLang() {
        return Lang;
    }

    public void setLang(double lang) {
        Lang = lang;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(String totalTime) {
        TotalTime = totalTime;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }
    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }
    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String issueType) {
        IssueType = issueType;
    }

    public String getFaultLocation() {
        return FaultLocation;
    }

    public void setFaultLocation(String faultLocation) {
        FaultLocation = faultLocation;
    }

   /* public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String issueType) {
        IssueType = issueType;
    }

    public String getFaultLocation() {
        return FaultLocation;
    }

    public void setFaultLocation(String faultLocation) {
        FaultLocation = faultLocation;
    }*/
}
