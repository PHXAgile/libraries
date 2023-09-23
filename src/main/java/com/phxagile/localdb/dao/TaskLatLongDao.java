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
import androidx.room.Query;

import com.phxagile.localdb.entity.TaskLatLongbyUserIdEntity;

import java.util.List;

@Dao
public interface TaskLatLongDao {
    @Insert
    void insert(TaskLatLongbyUserIdEntity task);

    @Query("SELECT * from task_lat_long_by_user_id_table ")
    List<TaskLatLongbyUserIdEntity> getAllLatLongbyUserId();

    @Query("DELETE FROM task_lat_long_by_user_id_table ")
    void deleteLatLongDataByTaskId();
}

