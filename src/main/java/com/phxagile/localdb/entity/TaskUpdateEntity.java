/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;
/*
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;*/

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "taskupdate_table")
public class TaskUpdateEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private long Id;
    private int TaskAssignId;
    private int UserId;
    private String Progress;
    private String Date;
    private String Comment;
    private boolean isactive;
    private double Lat;
    private double Lang;
    private boolean isUpdatedInServer;
    private String TaskUpdatedDate;
    private String AttributesValues;
    private String imageuri;
    private String TaskMobileId;
    private String ChainFrom;
    private  String ChainTo;

    public int getTaskAssignId() {
        return TaskAssignId;
    }

    public void setTaskAssignId(int taskAssignId) {
        TaskAssignId = taskAssignId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
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

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
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

    public boolean isUpdatedInServer() {
        return isUpdatedInServer;
    }

    public void setUpdatedInServer(boolean updatedInServer) {
        isUpdatedInServer = updatedInServer;
    }

    public String getTaskUpdatedDate() {
        return TaskUpdatedDate;
    }

    public void setTaskUpdatedDate(String taskUpdatedDate) {
        TaskUpdatedDate = taskUpdatedDate;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAttributesValues() {
        return AttributesValues;
    }

    public void setAttributesValues(String attributesValues) {
        AttributesValues = attributesValues;
    }

    public String getImageuri() {
        return imageuri;
    }

    public void setImageuri(String imageuri) {
        this.imageuri = imageuri;
    }

    public String getTaskMobileId() {
        return TaskMobileId;
    }

    public void setTaskMobileId(String taskMobileId) {
        TaskMobileId = taskMobileId;
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
}
