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

import com.phxagile.localdb.entity.TaskPendingApprovalEntity;

import java.util.List;

@Dao
public interface TaskPendingApprovalDao {
    @Insert
    void insert(TaskPendingApprovalEntity task);

    @Query("SELECT * from task_pendingapproval_table where userId = :userid ")
    List<TaskPendingApprovalEntity> getAllPendingApprovalTasksData(int userid);

    @Query("SELECT * from task_pendingapproval_table where userId = :userid ")
    LiveData<List<TaskPendingApprovalEntity>> getAllLivePendingApprovalTaskById(int userid);
    @Query("SELECT * from task_pendingapproval_table where Id = :taskId ")
    TaskPendingApprovalEntity getAllPendingApprovalTaskById(int taskId);

    @Query("DELETE from task_pendingapproval_table")
    void deleteAllPendingApprovalTasks();



}
