/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.phxagile.localdb.entity.IssueRiskBlob;

@Dao
public interface IssueRiskblobDao {

    @Insert
    long insertImage(IssueRiskBlob issueRiskBlob);

    @Query("SELECT * from issueriskblob_table where LocalRefId = :refId ")
    IssueRiskBlob getlocalImageByRef(long refId);

    @Query("delete from issueriskblob_table where LocalRefId = :localtaskid ")
    void deleteImage(long localtaskid);

    @Query("delete from issueriskblob_table")
    void deleteAllImages();
}
