/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "task_table")
public class TaskEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;

    private String TaskName;
    private String StartPoint;
    private String StartDate;
    private String EndPoint;
    private String EndDate;
    private String Target;
    private int UserId;
    private String SubLinkCode;
    private String SublinkName;
    private String LinkCode;
    private String LinkName;
    private String Config;
    private String Folder;
    private int Completed;
    private int TotalQuantity;
    private int CompletedQuantity;

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getStartPoint() {
        return StartPoint;
    }

    public void setStartPoint(String startPoint) {
        StartPoint = startPoint;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndPoint() {
        return EndPoint;
    }

    public void setEndPoint(String endPoint) {
        EndPoint = endPoint;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getTarget() {
        return Target;
    }

    public void setTarget(String target) {
        Target = target;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getSubLinkCode() {
        return SubLinkCode;
    }

    public void setSubLinkCode(String subLinkCode) {
        SubLinkCode = subLinkCode;
    }

    public String getSublinkName() {
        return SublinkName;
    }

    public void setSublinkName(String sublinkName) {
        SublinkName = sublinkName;
    }

    public String getLinkCode() {
        return LinkCode;
    }

    public void setLinkCode(String linkCode) {
        LinkCode = linkCode;
    }

    public String getLinkName() {
        return LinkName;
    }

    public void setLinkName(String linkName) {
        LinkName = linkName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getConfig() {
        return Config;
    }

    public void setConfig(String config) {
        Config = config;
    }

    public String getFolder() {
        return Folder;
    }

    public void setFolder(String folder) {
        Folder = folder;
    }

    public int getCompleted() {
        return Completed;
    }

    public void setCompleted(int completed) {
        Completed = completed;
    }

    public int getTotalQuantity() {
        return TotalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        TotalQuantity = totalQuantity;
    }

    public int getCompletedQuantity() {
        return CompletedQuantity;
    }

    public void setCompletedQuantity(int completedQuantity) {
        CompletedQuantity = completedQuantity;
    }
}
