/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.IssueCreationEntity;

import java.util.List;

@Dao
public interface IssueCreationDao {

    @Insert
    long insertIssue(IssueCreationEntity issueCreationEntity);

    @Query("SELECT * from issuecreation_table where userid = :userid ")
    List<IssueCreationEntity> getPendingIssuesByUserId(int userid);

    @Query("SELECT * from issuecreation_table where userid = :userid ")
    LiveData<List<IssueCreationEntity>> getPendingIssuesCountByUserId(int userid);

    @Query("DELETE from issuecreation_table where id=:issueid")
    void deletePendingUpdateById(long issueid);

    @Query("DELETE from issuecreation_table")
    void deleteAllPendingUpdates();
}
