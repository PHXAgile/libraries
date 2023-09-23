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
import com.phxagile.localdb.entity.DashboardEntity;

@Dao
public interface DashboardDao {
    @Insert
    void insert(DashboardEntity task);

    @Query("SELECT * from dashboard_table where userid = :userid ")
    LiveData<DashboardEntity> getDashboardData(int userid);

        @Query("DELETE from dashboard_table")
        void delete();
}
