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

import com.phxagile.localdb.entity.TaskEntity;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insert(TaskEntity task);

    @Query("SELECT * from task_table where userid = :userid ")
    LiveData<List<TaskEntity>> getAllTasks(int userid);


    @Query("SELECT * from task_table where userid = :userid ")
    List<TaskEntity> getAllTasksData(int userid);

    @Query("SELECT * from task_table where id = :taskid ")
    TaskEntity getTaskById(int taskid);

    @Query("DELETE from task_table")
    void deleteAllTasks();

    @Query("SELECT distinct(SublinkName) from task_table where LinkName = :linkCode ")
    List<String> getAllSubLinksName(String linkCode);

    @Query("SELECT distinct(LinkName) from task_table where userid = :userid ")
    List<String> getAllLinksName(int userid);

    @Query("SELECT * from task_table where SublinkName = :linkCode ")
    LiveData<List<TaskEntity>> getTasksByLinkCode(String linkCode);

    @Query("SELECT * from task_table where   SublinkName = :sublinkName and LinkName=:linkName")
    LiveData<List<TaskEntity>> getTasksBySubLinkCode(String sublinkName,String linkName);

    @Query("SELECT * from task_table where  LinkName= :linkName and SublinkName = :subLinkName")
    List<TaskEntity> getTasksDataByLinkCode(String subLinkName,String linkName);
}
