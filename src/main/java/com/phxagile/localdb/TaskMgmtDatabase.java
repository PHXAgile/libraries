/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.localdb;

/*import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;*/
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.phxagile.localdb.dao.DashboardDao;
import com.phxagile.localdb.dao.GPDao;
import com.phxagile.localdb.dao.IssueCreationDao;
import com.phxagile.localdb.dao.IssueRiskblobDao;
import com.phxagile.localdb.dao.LookupDao;
import com.phxagile.localdb.dao.MBIssueDao;
import com.phxagile.localdb.dao.MilestoneDao;
import com.phxagile.localdb.dao.NewSpanIdDao;
import com.phxagile.localdb.dao.RiskCreationDao;
import com.phxagile.localdb.dao.SpansDao;
import com.phxagile.localdb.dao.TaskCheckinDao;
import com.phxagile.localdb.dao.TaskDao;
import com.phxagile.localdb.dao.TaskIssueDao;
import com.phxagile.localdb.dao.TaskLatLongDao;
import com.phxagile.localdb.dao.TaskPendingApprovalDao;
import com.phxagile.localdb.dao.TaskUpdateBlobDao;
import com.phxagile.localdb.dao.TaskUpdateDao;
import com.phxagile.localdb.dao.TimelineDao;
import com.phxagile.localdb.dao.TripDao;
import com.phxagile.localdb.dao.UserIssueDao;
import com.phxagile.localdb.dao.UserProfileDao;
import com.phxagile.localdb.dao.UserRouteDao;
import com.phxagile.localdb.dao.UserTripDao;
import com.phxagile.localdb.entity.DashboardEntity;
import com.phxagile.localdb.entity.FRTUserIssuesEntity;
import com.phxagile.localdb.entity.GPEntity;
import com.phxagile.localdb.entity.IssueCreationEntity;
import com.phxagile.localdb.entity.IssueRiskBlob;
import com.phxagile.localdb.entity.LookupEntity;
import com.phxagile.localdb.entity.MBIssueEntity;
import com.phxagile.localdb.entity.MilestonesEntity;
import com.phxagile.localdb.entity.NewSpanIdEntity;
import com.phxagile.localdb.entity.RiskCreationEntity;
import com.phxagile.localdb.entity.SpansEntity;
import com.phxagile.localdb.entity.TaskCheckinModelEntity;
import com.phxagile.localdb.entity.TaskEntity;
import com.phxagile.localdb.entity.TaskIssueEntity;
import com.phxagile.localdb.entity.TaskLatLongbyUserIdEntity;
import com.phxagile.localdb.entity.TaskPendingApprovalEntity;
import com.phxagile.localdb.entity.TaskUpdateBlobsEntity;
import com.phxagile.localdb.entity.TaskUpdateEntity;
import com.phxagile.localdb.entity.TimelineEntity;
import com.phxagile.localdb.entity.TripEntity;
import com.phxagile.localdb.entity.UserIssuesEntity;
import com.phxagile.localdb.entity.UserProfileEntity;
import com.phxagile.localdb.entity.UserRoutesEntity;
import com.phxagile.localdb.entity.UserTripEntity;

@Database(entities = {TaskEntity.class, MilestonesEntity.class, TripEntity.class, UserProfileEntity.class, TaskLatLongbyUserIdEntity.class, UserRoutesEntity.class, UserTripEntity.class, UserIssuesEntity.class, FRTUserIssuesEntity.class, DashboardEntity.class, TaskUpdateEntity.class, TaskUpdateBlobsEntity.class, TimelineEntity.class, TaskCheckinModelEntity.class, TaskPendingApprovalEntity.class, TaskIssueEntity.class, MBIssueEntity.class, IssueCreationEntity.class, RiskCreationEntity.class, IssueRiskBlob.class, LookupEntity.class, SpansEntity.class, NewSpanIdEntity.class , GPEntity.class}, version = 28)
public abstract class TaskMgmtDatabase extends RoomDatabase {

    public abstract MilestoneDao milestoneDao();

    public abstract TripDao tripDao();

    public abstract UserProfileDao userprofileDao();

    public abstract UserRouteDao userRoutesDao();

    public abstract UserTripDao userTripDao();

    public abstract UserIssueDao userIssueDao();

    public abstract TaskDao taskDao();

    public abstract TaskLatLongDao taskLatLongDao();

    public abstract TimelineDao timelineDao();

    public abstract DashboardDao dashboardDao();

    public abstract TaskUpdateDao taskUpdateDao();

    public abstract TaskUpdateBlobDao taskUpdateBlobDao();

    public abstract TaskCheckinDao taskCheckinDao();

    public abstract TaskPendingApprovalDao taskPendingApprovalDao();

    public abstract TaskIssueDao taskIssueDao();

    public abstract MBIssueDao mbIssueDao();

    public abstract IssueCreationDao issueCreationDao();
    public abstract RiskCreationDao riskCreationDao();
    public abstract IssueRiskblobDao issueRiskblobDao();

    public abstract LookupDao getLookupsDao();
    public abstract SpansDao getSpansDao();
    public abstract GPDao getGPDao();
    public abstract NewSpanIdDao newSpanIdDao();
    public static TaskMgmtDatabase INSTANCE;


    public static TaskMgmtDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (TaskMgmtDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            TaskMgmtDatabase.class, "word_database21").allowMainThreadQueries()

                            .fallbackToDestructiveMigration()
                            .build();

                }
            }
        }
        return INSTANCE;
    }
}
