/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.GPEntity;

import java.util.List;

@Dao
public interface GPDao {
    @Insert
    void insert(GPEntity task);

    @Query("SELECT * from gp_table where MandalId = :mandalId ")
    List<GPEntity> getGPData(int mandalId);

    @Query("DELETE from gp_table")
    void delete();
}
