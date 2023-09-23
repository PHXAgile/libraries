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

@Entity(tableName = "trip_table")
public class TripEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;

    private int routeId;
    private int tripline;
    private double lat;
    private double lng;
    private boolean isTripRunning;
    private String distance;
    private String duration;
    private String filePath;
    private String createddate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getTripline() {
        return tripline;
    }

    public void setTripline(int tripline) {
        this.tripline = tripline;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public boolean isTripRunning() {
        return isTripRunning;
    }

    public void setTripRunning(boolean tripRunning) {
        isTripRunning = tripRunning;
    }
}
