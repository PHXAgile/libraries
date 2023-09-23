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
import com.phxagile.localdb.entity.UserProfileEntity;

import java.util.List;

@Dao
public interface UserProfileDao {
    @Insert
    void insert(UserProfileEntity dashboardEntity);

    @Query("Delete from user_table where id = :userid")
    void delete(int userid);

    @Query("SELECT * from user_table where id = :userid")
    LiveData<List<UserProfileEntity>> getMilestones(int userid);

    @Query("SELECT * from user_table where id = :id")
    LiveData<UserProfileEntity> getUserProfile(int id);

}
