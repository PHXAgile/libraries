/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.RiskCreationEntity;

import java.util.List;
@Dao
public interface RiskCreationDao {
    @Insert
    long insertRisk(RiskCreationEntity task);

    @Query("SELECT * from riskcreation_table where userid = :userid ")
    List<RiskCreationEntity> getPendingRisksByUserId(int userid);

    @Query("SELECT * from riskcreation_table where userid = :userid ")
    LiveData<List<RiskCreationEntity>> getPendingRisksCountByUserId(int userid);

    @Query("DELETE from riskcreation_table where id=:issueid")
    void deletePendingRiskById(long issueid);


    @Query("DELETE from riskcreation_table")
    void deleteAllPendingUpdates();
}
