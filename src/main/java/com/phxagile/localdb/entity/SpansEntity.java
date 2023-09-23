/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
@Entity(tableName = "spans_table")
public class SpansEntity {

    private String SubLinkCode;



    private String SublinkName;

    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int SublinkId;

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

    public int getSublinkId() {
        return SublinkId;
    }

    public void setSublinkId(int sublinkId) {
        SublinkId = sublinkId;
    }
}
