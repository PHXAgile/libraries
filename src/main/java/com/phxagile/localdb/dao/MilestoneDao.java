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
import com.phxagile.localdb.entity.MilestonesEntity;

import java.util.List;

@Dao
public interface MilestoneDao {

    @Insert
    void insert(MilestonesEntity word);

    @Query("UPDATE milestone_table SET statusId=:isvisited WHERE id = :id")
    void updateFirstVisits(int id, int isvisited);

    @Query("UPDATE milestone_table SET twoWayStatusId=:isvisited WHERE id = :id")
    void updateSecondVisits(int id, int isvisited);



    @Query("SELECT * from milestone_table where routeid = :routeid  ORDER BY morder ASC")
    List<MilestonesEntity> getMilestones(int routeid);



    @Query("delete from milestone_table where routeid = :routeid ")
    void deleteMilestones(int routeid);

    @Query("SELECT * from milestone_table where routeid = :routeid and statusId=:statusid and twoWayStatusId=:statusid  ORDER BY morder ASC")
    List<MilestonesEntity> getVisitedMilestones(int routeid, int statusid);

    @Query("SELECT id from milestone_table where routeid = :routeid and statusId=:statusid or twoWayStatusId=:statusid  ORDER BY morder ASC")
    List<Integer> getVisitedMilestoneIds(int routeid, int statusid);

    @Query("SELECT * from milestone_table where id = :milestoneid  ORDER BY morder ASC")
    MilestonesEntity getMilestoneById(int milestoneid);


    @Query("SELECT id from milestone_table where routeid = :routeid and statusId=:statusid   ORDER BY morder ASC")
    List<Integer> getOnewayVisitedMilestones(int routeid, int statusid);

    @Query("SELECT id from milestone_table where routeid = :routeid  and twoWayStatusId=:statusid  ORDER BY morder ASC")
    List<Integer> getTwowayVisitedMilestones(int routeid, int statusid);

}

