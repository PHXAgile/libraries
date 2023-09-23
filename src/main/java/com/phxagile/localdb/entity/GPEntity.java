/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "gp_table")
public class GPEntity {

    private int MandalId;
    private String MandalName;
    private String GPName;
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int GPId;


    public String getGPName() {
        return GPName;
    }

    public void setGPName(String GPName) {
        this.GPName = GPName;
    }

    public int getGPId() {
        return GPId;
    }

    public void setGPId(int GPId) {
        this.GPId = GPId;
    }

    public int getMandalId() {
        return MandalId;
    }

    public void setMandalId(int mandalId) {
        MandalId = mandalId;
    }

    public String getMandalName() {
        return MandalName;
    }

    public void setMandalName(String mandalName) {
        MandalName = mandalName;
    }

}
