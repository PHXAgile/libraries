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
import com.phxagile.localdb.entity.TripEntity;

import java.util.List;

@Dao
public interface TripDao {
    @Insert
    void insert(TripEntity word);

    @Query("SELECT * from trip_table where id = :tripid ")
    LiveData<TripEntity> getTripDetailById(int tripid);

    @Query("SELECT * from trip_table  ORDER BY id desc")
    LiveData<List<TripEntity>> getAllTrips();

    @Query("UPDATE trip_table SET isTripRunning=:istriprunning WHERE id = :id")
    void updateTripRunningStatus(int id, boolean istriprunning);

    @Query("SELECT * from trip_table where routeId = :routeid")
    LiveData<List<TripEntity>> getTripsByRouteId(int routeid);

    @Query("SELECT * from trip_table where isTripRunning = :status")
    LiveData<List<TripEntity>> getCurrentRuningRoute(boolean status);
}
