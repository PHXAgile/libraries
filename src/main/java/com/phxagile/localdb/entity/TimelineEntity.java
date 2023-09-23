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

@Entity(tableName = "tasktimeline_table")
public class TimelineEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;
    private int TaskId;
    private String Progress;
    private String Date;
    private String Comment;
    private String Name;
    private String Path;
    private boolean IsRejected;
    private double Lat;
    private double Lang;
    private String AttributesValues;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setTaskId(int taskId) {
        TaskId = taskId;
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

    public void setName(String username) {
        Name = username;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
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

    public String getAttributesValues() {
        return AttributesValues;
    }

    public void setAttributesValues(String attributesValues) {
        AttributesValues = attributesValues;
    }

    public boolean getIsRejected() {
        return IsRejected;
    }

    public void setIsRejected(boolean isRejected) {
        IsRejected = isRejected;
    }
}
