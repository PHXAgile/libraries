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

@Entity(tableName = "user_trips")
public class UserTripEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int Id;

    private int RouteId;
    private int UserId;
    private String StartLat;
    private String StartLang;
    private String StartDate;
    private String EndDate;
    private String EndLat;
    private String EndLang;
    private long Distance;
    private String Duration;
    private boolean isTripRunning;




    @NonNull
    public int getId() {
        return Id;
    }
    public void setId(@NonNull int id) {
        Id = id;
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

    public String getStartLat() {
        return StartLat;
    }

    public void setStartLat(String startLat) {
        StartLat = startLat;
    }

    public String getStartLang() {
        return StartLang;
    }

    public void setStartLang(String startLang) {
        StartLang = startLang;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getEndLat() {
        return EndLat;
    }

    public void setEndLat(String endLat) {
        EndLat = endLat;
    }

    public String getEndLang() {
        return EndLang;
    }

    public void setEndLang(String endLang) {
        EndLang = endLang;
    }

    public long getDistance() {
        return Distance;
    }

    public void setDistance(long distance) {
        Distance = distance;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public boolean isTripRunning() {
        return isTripRunning;
    }

    public void setTripRunning(boolean tripRunning) {
        isTripRunning = tripRunning;
    }
}
