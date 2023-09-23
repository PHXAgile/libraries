/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import com.phxagile.localdb.entity.SpansEntity;

@Dao
public interface SpansDao {
    @Insert
    void insert(SpansEntity task);

    @Query("SELECT * from spans_table")
    List<SpansEntity> getSpansData();

    @Query("DELETE from spans_table")
    void delete();
}
