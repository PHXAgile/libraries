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

import java.util.Date;
@Entity(tableName = "taskcheckin_table")
public class TaskCheckinModelEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int Id;
    private int TaskId;
    private int RouteId;
    private int UserId;
    private String CheckinDate;
    private String CheckOutDate;
    private String FolderPath;

    private String Date;

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

    public int getRouteId() {
        return RouteId;
    }

    public void setRouteId(int routeId) {
        RouteId = routeId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getCheckinDate() {
        return CheckinDate;
    }

    public void setCheckinDate(String checkinDate) {
        CheckinDate = checkinDate;
    }

    public String getCheckOutDate() {
        return CheckOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        CheckOutDate = checkOutDate;
    }

    public String getFolderPath() {
        return FolderPath;
    }

    public void setFolderPath(String folderPath) {
        FolderPath = folderPath;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
