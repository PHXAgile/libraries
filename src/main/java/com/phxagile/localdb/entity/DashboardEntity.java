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
@Entity(tableName = "dashboard_table")
public class DashboardEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;
private int UserId;
    private int Total;
    private int AssignedTask;
    private int CompletedTask;
    private int InprogressTask;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getAssignedTask() {
        return AssignedTask;
    }

    public void setAssignedTask(int assignedTask) {
        AssignedTask = assignedTask;
    }

    public int getCompletedTask() {
        return CompletedTask;
    }

    public void setCompletedTask(int completedTask) {
        CompletedTask = completedTask;
    }

    public int getInprogressTask() {
        return InprogressTask;
    }

    public void setInprogressTask(int inprogressTask) {
        InprogressTask = inprogressTask;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
