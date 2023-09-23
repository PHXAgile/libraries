/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "issueriskblob_table")
public class IssueRiskBlob {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private long Id;
    private int LocalRefId;
    private byte[] image;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getLocalRefId() {
        return LocalRefId;
    }

    public void setLocalRefId(int localRefId) {
        LocalRefId = localRefId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
