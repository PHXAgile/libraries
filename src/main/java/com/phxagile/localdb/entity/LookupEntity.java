/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "lookups_table")
public class LookupEntity {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int Id;
    private int LookupCode;
    private String Name;

    public LookupEntity() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLookupCode() {
        return LookupCode;
    }

    public void setLookupCode(int lookupCode) {
        LookupCode = lookupCode;
    }
}
