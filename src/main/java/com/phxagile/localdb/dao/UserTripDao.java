/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

/*import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;*/
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.UserTripEntity;

import java.util.List;

@Dao
public interface UserTripDao {

    @Insert
    void insert(UserTripEntity dashboardEntity);

    @Query("SELECT * from user_trips where  RouteId= :routeid")
    LiveData<List<UserTripEntity>> getUserTrips(int routeid);

    @Query("Update user_trips set EndDate=:EndDate,EndLat=:EndLat,EndLang=:EndLng,Distance=:Distance,Duration =:Duration,isTripRunning=:istriprunning   where  id= :id")
    void updateCurrentTrip(String EndDate, String EndLat, String EndLng, long Distance, String Duration, boolean istriprunning, int id);

    @Query("SELECT * from user_trips where isTripRunning = :status")
    List<UserTripEntity> getCurrentRuningRoute(boolean status);
}
