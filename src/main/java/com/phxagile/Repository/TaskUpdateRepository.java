package com.phxagile.Repository;

//import android.arch.lifecycle.LiveData;

import static com.mapbox.mapboxsdk.Mapbox.getApplicationContext;

import android.os.AsyncTask;
import android.widget.Toast;

import androidx.lifecycle.LiveData;

import com.phxagile.localdb.*;
import com.phxagile.localdb.dao.TaskUpdateBlobDao;
import com.phxagile.localdb.dao.TaskUpdateDao;
import com.phxagile.localdb.entity.TaskUpdateBlobsEntity;
import com.phxagile.localdb.entity.TaskUpdateEntity;
import com.phxagile.util.myapplication;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class TaskUpdateRepository extends BaseRepository {

    private static TaskUpdateDao taskUpdateDao;
    private static TaskUpdateBlobDao taskUpdateBlobDao;
    //region Instance
    private static TaskUpdateRepository _taskUpdateRepository;

    public static TaskUpdateRepository getInstance() {
        if (_taskUpdateRepository == null) {
            _taskUpdateRepository = new TaskUpdateRepository();
            TaskMgmtDatabase db = TaskMgmtDatabase.getDatabase(myapplication.getInstance());
            taskUpdateDao = db.taskUpdateDao();
            taskUpdateBlobDao=db.taskUpdateBlobDao();
        }
        return _taskUpdateRepository;
    }

    //endregion
    public List<TaskUpdateEntity> getPendingTasks() {
        List<TaskUpdateEntity> taskEntityLiveData;
        taskEntityLiveData = taskUpdateDao.getPendingTasks();
        return taskEntityLiveData;
    }

    public List<TaskUpdateBlobsEntity> getPendingTasksBlobs() {
        List<TaskUpdateBlobsEntity> taskEntityLiveData;
        taskEntityLiveData = taskUpdateBlobDao.getPendingTaskBlobs();
        return taskEntityLiveData;
    }
    public List<TaskUpdateBlobsEntity> getPendingTasksBlobsByTaskAssignId(long taskassignid) {
        List<TaskUpdateBlobsEntity> taskEntityLiveData;
        taskEntityLiveData = taskUpdateBlobDao.getPendingTaskBlobsByTaskAssignId(taskassignid);
        return taskEntityLiveData;
    }

    public LiveData<List<TaskUpdateEntity>> getPendingTasksForCount() {
        LiveData<List<TaskUpdateEntity>> taskEntityLiveData;
        taskEntityLiveData = taskUpdateDao.getPendingTasksForCount();
        return taskEntityLiveData;
    }

    public int getPendingTakssCount() {
        return taskUpdateDao.getPendingTasksCount();
    }

    public Integer insertTaskUpdate(TaskUpdateEntity taskUpdateEntity) {
        try {
            return   new insertAsyncTask(taskUpdateDao).execute(taskUpdateEntity).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Integer insertTaskBlobUpdate(TaskUpdateBlobsEntity taskUpdateBlobEntity) {
        try {
            return   new insertAsyncTaskBlob(taskUpdateBlobDao).execute(taskUpdateBlobEntity).get();
        } catch (ExecutionException e) {
            return 0;
           /* e.printStackTrace();*/
        } catch (InterruptedException e) {
            return 0;
            /*e.printStackTrace();*/
        }
    }

    public void deleteTaskUpdate(long id) {
         taskUpdateDao.deletePendingTask(id);
    }
    public void deleteTaskUpdateBlob(int id) {
        taskUpdateBlobDao.deletePendingTaskBlobs(id);
    }

    private static class insertAsyncTask extends AsyncTask<TaskUpdateEntity, Void, Integer> {

        private TaskUpdateDao mAsyncTaskDao;

        insertAsyncTask(TaskUpdateDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Integer doInBackground(final TaskUpdateEntity... params) {
            try {
                Integer res= (int) (long)   mAsyncTaskDao.insert(params[0]);
                return res;
                //Toast.makeText(getApplicationContext(),"Task Update Added Successfully!",Toast.LENGTH_LONG);
            } catch (Exception e) {
              //  Toast.makeText(getApplicationContext(),"Error While Updating Task,Kindly Add It Again.",Toast.LENGTH_LONG);
                int i = 0;

            }

            return 0;
        }
    }

    private static class insertAsyncTaskBlob extends AsyncTask<TaskUpdateBlobsEntity, Void, Integer> {

        private TaskUpdateBlobDao mAsyncTaskDao;

        insertAsyncTaskBlob(TaskUpdateBlobDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Integer doInBackground(final TaskUpdateBlobsEntity... params) {
            try {
                mAsyncTaskDao.insert(params[0]);
                return 1;
                //Toast.makeText(getApplicationContext(),"Task Update Added Successfully!",Toast.LENGTH_LONG);
            } catch (Exception e) {
                 Toast.makeText(getApplicationContext(),"Error in adding image.",Toast.LENGTH_LONG);
                return 0;
            }


        }
    }
}
