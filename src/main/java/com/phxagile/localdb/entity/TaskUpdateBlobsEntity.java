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

@Entity(tableName = "taskupdateblob_table")
public class TaskUpdateBlobsEntity {


    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int Id;
    private long TaskAssignId;
    private byte[] image;
    private String TaskUpdatedDate;
    private int Type;
    private String ImgTag;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }



    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getTaskUpdatedDate() {
        return TaskUpdatedDate;
    }

    public void setTaskUpdatedDate(String taskUpdatedDate) {
        TaskUpdatedDate = taskUpdatedDate;
    }

    public long getTaskAssignId() {
        return TaskAssignId;
    }

    public void setTaskAssignId(long taskAssignId) {
        TaskAssignId = taskAssignId;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getImgTag() {
        return ImgTag;
    }

    public void setImgTag(String imgTag) {
        ImgTag = imgTag;
    }
}
