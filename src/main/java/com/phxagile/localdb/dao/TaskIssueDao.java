/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.phxagile.localdb.entity.TaskIssueEntity;

import java.util.List;

@Dao
public interface TaskIssueDao {
    @Insert
    long insert(TaskIssueEntity taskIssue);

    @Query("SELECT * from task_issue_table where userid = :userid order by ID desc")
    LiveData<List<TaskIssueEntity>> getAllIssuesAndRisks(int userid);


}
