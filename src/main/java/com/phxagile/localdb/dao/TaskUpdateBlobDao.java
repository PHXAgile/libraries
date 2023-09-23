/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

/*import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;*/
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.TaskUpdateBlobsEntity;

import java.util.List;

@Dao
public interface TaskUpdateBlobDao {
    @Insert
    void insert(TaskUpdateBlobsEntity taskBlob);

    @Query("SELECT * from taskupdateblob_table")
    List<TaskUpdateBlobsEntity> getPendingTaskBlobs();

    @Query("SELECT * from taskupdateblob_table where TaskAssignId=:taskassignid")
    List<TaskUpdateBlobsEntity> getPendingTaskBlobsByTaskAssignId(long taskassignid);


    @Query("delete  from taskupdateblob_table where TaskAssignId = :id ")
    void deletePendingTaskBlobs(int id);
}
