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

import com.phxagile.localdb.entity.TaskUpdateEntity;

import java.util.List;

@Dao
public interface TaskUpdateDao {
    @Insert
    long insert(TaskUpdateEntity task);

    @Query("SELECT * from taskupdate_table")
    List<TaskUpdateEntity> getPendingTasks();

    @Query("SELECT * from taskupdate_table")
    LiveData<List<TaskUpdateEntity>> getPendingTasksForCount();

    @Query("SELECT Count(*) from taskupdate_table where isUpdatedInServer = 0 ")
    int getPendingTasksCount();

    @Query("delete  from taskupdate_table where Id = :id ")
    void deletePendingTask(long id);
}
