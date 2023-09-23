/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.MBIssueEntity;

import java.util.List;

@Dao
public interface MBIssueDao {
    @Insert
    long insert(MBIssueEntity taskIssue);

    @Query("SELECT * from mb_task_issue where userid = :userid order by IsRejected desc")
    LiveData<List<MBIssueEntity>> getMBIssues(int userid);

    @Query("SELECT * from mb_task_issue where Id = :issuedId")
    MBIssueEntity getMBIssueById(int issuedId);
}
