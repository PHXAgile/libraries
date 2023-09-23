/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb.entity;

/*import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;*/

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class UserProfileEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }


    private String Name;

    private String Email;

    private int InprogressRoutes;

    private int TotalRoutes;

    private int CompletedRoutes;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public int getInprogressRoutes ()
    {
        return InprogressRoutes;
    }

    public void setInprogressRoutes (int InprogressRoutes)
    {
        this.InprogressRoutes = InprogressRoutes;
    }

    public int getTotalRoutes ()
    {
        return TotalRoutes;
    }

    public void setTotalRoutes (int TotalRoutes)
    {
        this.TotalRoutes = TotalRoutes;
    }

    public int getCompletedRoutes ()
    {
        return CompletedRoutes;
    }

    public void setCompletedRoutes (int CompletedRoutes)
    {
        this.CompletedRoutes = CompletedRoutes;
    }

}
