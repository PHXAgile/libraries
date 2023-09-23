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
import com.phxagile.localdb.entity.FRTUserIssuesEntity;
import com.phxagile.localdb.entity.UserIssuesEntity;
import com.phxagile.localdb.entity.UserRoutesEntity;

import java.util.List;

@Dao
public interface UserIssueDao {
    @Insert
    void insert(UserIssuesEntity dashboardEntity);

    @Insert
    void insertFRTIssues(FRTUserIssuesEntity frtUserIssuesEntity);

    @Query("Delete from fo_issues")
    void deleteFOIssues();

    @Query("Delete from frt_issues")
    void deleteFrtIssues();

    @Query("SELECT * from fo_issues where  UserId= :userid")
    LiveData<List<UserIssuesEntity>> getFOIssues(int userid);

    @Query("SELECT * from fo_issues where  UserId= :userid order by CreatedDate desc")
    LiveData<List<UserIssuesEntity>> getSortedFOIssues(int userid);

    @Query("SELECT * from frt_issues where  UserId= :userid")
    LiveData<List<FRTUserIssuesEntity>> getFRTIssues(int userid);

    @Query("SELECT * from frt_issues where  UserId= :userid order by CreatedDate desc")
    LiveData<List<FRTUserIssuesEntity>> getSortedFRTIssues(int userid);


    @Query("SELECT * from fo_issues where id = :routeid")
    LiveData<UserRoutesEntity> getRoute(int routeid);
}
