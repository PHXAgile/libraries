/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.phxagile.localdb.entity.NewSpanIdEntity;

import java.util.List;

@Dao
public interface NewSpanIdDao {
    @Insert
    void insert(NewSpanIdEntity task);

    @Query("SELECT * from newspanid_table where MandalId = :mandalId ")
    List<NewSpanIdEntity> getNewSpanIdData(int mandalId);

    @Query("DELETE from spans_table")
    void delete();
}
