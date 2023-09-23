/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

/*import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;*/
import androidx.room.Dao;
import androidx.room.Insert;

import com.phxagile.localdb.entity.TaskCheckinModelEntity;

@Dao
public interface TaskCheckinDao {
    @Insert
    void insert(TaskCheckinModelEntity task);

   /* @Query("SELECT * from dashboard_table where userid = :userid ")
    LiveData<DashboardEntity> getDashboardData(int userid);

    @Query("DELETE from dashboard_table")
    void delete();*/
}
