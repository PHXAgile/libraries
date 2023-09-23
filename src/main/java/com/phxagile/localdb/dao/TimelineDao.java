/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

/*import android.arch.persistence.room.*;*/
import androidx.room.*;

import com.phxagile.localdb.entity.TimelineEntity;

import java.util.List;

@Dao
public interface TimelineDao {
    @Insert(onConflict = OnConflictStrategy.FAIL)
    void insert(TimelineEntity word);

    @Query("SELECT * from tasktimeline_table where TaskId=:taskid order by Id desc")
    List<TimelineEntity> getTimeline(int taskid);

    @Query("SELECT * from tasktimeline_table where Id=:timelineid order by Id desc")
    TimelineEntity getTimelineById(int timelineid);

    @Update(onConflict = OnConflictStrategy.FAIL)
    void update(TimelineEntity entity);

}
