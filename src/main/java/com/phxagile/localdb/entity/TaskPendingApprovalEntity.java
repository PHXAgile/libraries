/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
/*import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;*/

import java.util.ArrayList;

@Entity(tableName = "task_pendingapproval_table")
public class TaskPendingApprovalEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;
    private String TaskName;
    private String LinkCode;
    private String LinkName;
    private String SubLinkCode;
    private String SublinkName;
    private int TaskAssignId;

    private String Progress;
    private String Date;
    private String Comment;
    private String Name;
    private String config;
    private String Lat;
    private String Lang;
    private String Path;
    private String ChainFrom;
    private String ChainTo;
    private int StatusId;
    private int NextApprovalId;
    private int ApprovalAction;
    private String Reason;

    private String NextApprovalName;
    private String PrevApprovalName;
    private int userId;
    public String getReason() {
        return Reason;
    }

    public void setReason(String _txtRejectionReason) {
        Reason = _txtRejectionReason;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
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

    public int getTaskAssignId() {
        return TaskAssignId;
    }

    public void setTaskAssignId(int taskAssignId) {
        TaskAssignId = taskAssignId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLang() {
        return Lang;
    }

    public void setLang(String lang) {
        Lang = lang;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getChainFrom() {
        return ChainFrom;
    }

    public void setChainFrom(String chainFrom) {
        ChainFrom = chainFrom;
    }

    public String getChainTo() {
        return ChainTo;
    }

    public void setChainTo(String chainTo) {
        ChainTo = chainTo;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
