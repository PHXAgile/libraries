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

@Entity(tableName = "milestone_table")
public class MilestonesEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private int routeid;
    private double lat;
    private double lng;
    private double morder;
    private int statusId;
    private int twoWayStatusId;

    private String updatedDate;
    private String twoWayUpdatedDate;


    public int getRouteid() {
        return routeid;
    }
    public void setRouteid(int routeid) {
        this.routeid = routeid;
    }



    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }


    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getMorder() {
        return morder;
    }

    public void setMorder(double morder) {
        this.morder = morder;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int isvistedonce) {
        this.statusId = isvistedonce;
    }

    public int getTwoWayStatusId() {
        return twoWayStatusId;
    }

    public void setTwoWayStatusId(int isvistedtwice) {
        this.twoWayStatusId = isvistedtwice;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String visitonedatetime) {
        this.updatedDate = visitonedatetime;
    }

    public String getTwoWayUpdatedDate() {
        return twoWayUpdatedDate;
    }

    public void setTwoWayUpdatedDate(String visittwodatetime) {
        this.twoWayUpdatedDate = visittwodatetime;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }
}
