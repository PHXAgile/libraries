/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

//import Models.IssueFilterTag;
/*import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;*/

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "fo_issues")
public class UserIssuesEntity {
    @PrimaryKey
    @NonNull
    private int Id;
    private int UserId;
    private double Lat;
    private double Lang;

    private String Phone;

    private String Offset;

    private String Splicingandtesting;

    private String RouteCode;

    private int RouteId;

    private String Depth;

    private int CriticalityId;

    private String IssueType;

    private String CablepreparationEnd;

    private String CablepreparationStart;

    private String TrenchingEnd;

    private String AgencyName;

    private String StartDate;
    private String EndDate;

    private int StatusId;

    private String FRTPhone;

    private String ContactNumber;

    private String Folder;

    private String FaultLocation;

    private String Comment;

    private String RouteName;


    private String TotalTime;

    private String Name;

    private String Status;

    private String LinkName;

    private String SplicingandtestingEnd;


    private String FRTName;

    private String ReferenceNumber;

    private String TrenchingStart;

    private String CreatedDate;

    private String CriticalityName;


    private String SplicingandtestingStart;

    private String IssuesLog;

    private String LinkCode;


    public double getLang() {
        return Lang;
    }

    public void setLang(double Lang) {
        this.Lang = Lang;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getOffset() {
        return Offset;
    }

    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    public String getSplicingandtesting() {
        return Splicingandtesting;
    }

    public void setSplicingandtesting(String Splicingandtesting) {
        this.Splicingandtesting = Splicingandtesting;
    }

    public String getRouteCode() {
        return RouteCode;
    }

    public void setRouteCode(String RouteCode) {
        this.RouteCode = RouteCode;
    }

    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int RouteId) {
        this.RouteId = RouteId;
    }

    public String getDepth() {
        return Depth;
    }

    public void setDepth(String Depth) {
        this.Depth = Depth;
    }

    public int getCriticalityId() {
        return CriticalityId;
    }

    public void setCriticalityId(int CriticalityId) {
        this.CriticalityId = CriticalityId;
    }

    public String getIssueType() {
        return IssueType;
    }

    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    public String getCablepreparationEnd() {
        return CablepreparationEnd;
    }

    public void setCablepreparationEnd(String CablepreparationEnd) {
        this.CablepreparationEnd = CablepreparationEnd;
    }

    public String getCablepreparationStart() {
        return CablepreparationStart;
    }

    public void setCablepreparationStart(String CablepreparationStart) {
        this.CablepreparationStart = CablepreparationStart;
    }

    public String getTrenchingEnd() {
        return TrenchingEnd;
    }

    public void setTrenchingEnd(String TrenchingEnd) {
        this.TrenchingEnd = TrenchingEnd;
    }

    public String getAgencyName() {
        return AgencyName;
    }

    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int StatusId) {
        this.StatusId = StatusId;
    }

    public String getFRTPhone() {
        return FRTPhone;
    }

    public void setFRTPhone(String FRTPhone) {
        this.FRTPhone = FRTPhone;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getFolder() {
        return Folder;
    }

    public void setFolder(String Folder) {
        this.Folder = Folder;
    }

    public String getFaultLocation() {
        return FaultLocation;
    }

    public void setFaultLocation(String FaultLocation) {
        this.FaultLocation = FaultLocation;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getRouteName() {
        return RouteName;
    }

    public void setRouteName(String RouteName) {
        this.RouteName = RouteName;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double Lat) {
        this.Lat = Lat;
    }

    public String getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(String TotalTime) {
        this.TotalTime = TotalTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getLinkName() {
        return LinkName;
    }

    public void setLinkName(String LinkName) {
        this.LinkName = LinkName;
    }

    public String getSplicingandtestingEnd() {
        return SplicingandtestingEnd;
    }

    public void setSplicingandtestingEnd(String SplicingandtestingEnd) {
        this.SplicingandtestingEnd = SplicingandtestingEnd;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getFRTName() {
        return FRTName;
    }

    public void setFRTName(String FRTName) {
        this.FRTName = FRTName;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String ReferenceNumber) {
        this.ReferenceNumber = ReferenceNumber;
    }

    public String getTrenchingStart() {
        return TrenchingStart;
    }

    public void setTrenchingStart(String TrenchingStart) {
        this.TrenchingStart = TrenchingStart;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getCriticalityName() {
        return CriticalityName;
    }

    public void setCriticalityName(String CriticalityName) {
        this.CriticalityName = CriticalityName;
    }

    @NonNull
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSplicingandtestingStart() {
        return SplicingandtestingStart;
    }

    public void setSplicingandtestingStart(String SplicingandtestingStart) {
        this.SplicingandtestingStart = SplicingandtestingStart;
    }

    public String getIssuesLog() {
        return IssuesLog;
    }

    public void setIssuesLog(String IssuesLog) {
        this.IssuesLog = IssuesLog;
    }

    public String getLinkCode() {
        return LinkCode;
    }

    public void setLinkCode(String LinkCode) {
        this.LinkCode = LinkCode;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

   /* public List<IssueFilterTag> getTags() {
        List<IssueFilterTag> lst = new ArrayList<IssueFilterTag>();
        lst.add(new IssueFilterTag(getIssueType(), 0));
        lst.add(new IssueFilterTag(getFaultLocation(), 0));
        return lst;
    }*/


    public boolean hasTag(String string) {
        if (getIssueType().equals(string)) {
            return true;
        }
        if (getFaultLocation().equals(string)) {
            return true;
        }
        return false;
    }
}
