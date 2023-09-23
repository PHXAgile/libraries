/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.phxagile.localdb.entity.LookupEntity;

import java.util.List;

@Dao
public interface LookupDao {
    @Insert
    void insert(LookupEntity lookupEntity);

    @Query("SELECT * from lookups_table where LookupCode = :lookupid AND  Name != 'NA'")
    List<LookupEntity> getLookupByid(int lookupid);

    @Query("DELETE from lookups_table")
    void delete();
}
