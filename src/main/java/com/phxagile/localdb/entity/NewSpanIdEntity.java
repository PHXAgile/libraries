/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "newspanid_table")
public class NewSpanIdEntity {

    private int MandalId;
    private String MandalName;
    private String SpanTextId;

    @PrimaryKey(autoGenerate = false)
    @NonNull
    private int SpanId;

    public int getMandalId() {
        return MandalId;
    }

    public void setMandalId(int mandalId) {
        MandalId = mandalId;
    }

    public String getMandalName() {
        return MandalName;
    }

    public void setMandalName(String mandalName) {
        MandalName = mandalName;
    }

    public String getSpanTextId() {
        return SpanTextId;
    }

    public void setSpanTextId(String spanTextId) {
        SpanTextId = spanTextId;
    }

    public int getSpanId() {
        return SpanId;
    }

    public void setSpanId(int spanId) {
        SpanId = spanId;
    }
}
