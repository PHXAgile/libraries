/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;
/*
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;*/
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.UserRoutesEntity;

import java.util.List;

@Dao
public interface UserRouteDao {
    @Insert
    void insert(UserRoutesEntity dashboardEntity);

    @Query("Delete from user_routes")
    void deleteRoutesByUserId();

    @Query("SELECT * from user_routes where  UserId= :userid")
    LiveData<List<UserRoutesEntity>> getUserRoutes(int userid);

    @Query("SELECT * from user_routes where id = :routeid")
    LiveData<UserRoutesEntity> getRoute(int routeid);

}
