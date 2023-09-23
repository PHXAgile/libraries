package com.phxagile.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class AppSharedPreferences {
    public static String shareduserkey = "user_info";
    public static final String userId = "key_userid";
    public static final String roleid = "key_roleid";
    public static final String ApkVesion = "key_apkversion";
    public static final String username = "key_username";
    public static final String pwd = "key_pwd";
    public static final String orgcode = "key_orgcode";
    public static final String isLoggedinUser = "key_userloggedin";
    public static final String IsCheckedin = "key_checkedin";
    public static final String Taskid = "key_taskid";
    public static final String SelectedPendingApprovalTaskId = "key_pendingapprovaltaskid";
    public static final String SelectedMBIssueId = "key_mbissueid";
    public static final String SelectedRiskId = "key_mbriskid";

    public static final String TaskChainageValue = "key_taskchainage";

    public static final String TempTaskChainageValue = "key_temptaskchainage";

    public static final String TaskRunningStatus = "key_taskrunning";
    public static final String TaskRunningCheckinId = "key_taskcheckinid";


    public static final String TempImageURL = "key_tempimageurl";
    public static final String LoginLogTempId = "key_loginlogtempid";

    public static final String locationrecord = "key_locationrecord";
    public static final String location2record = "key_locationrecord";

    public static final String latSelectedByUser = "key_lat_selected_by_user";
    public static final String longSelectedByUser = "key_long_selected_by_user";


    public static  void setLatSelectedByUserRecord(String _locationrecord,Context context){
        SharedPreferences prefs = context.getSharedPreferences(latSelectedByUser, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(latSelectedByUser, _locationrecord);

        editor.commit();
    }
    public static  void setLongSelectedByUserRecord(String _locationrecord,Context context){
        SharedPreferences prefs = context.getSharedPreferences(longSelectedByUser, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(longSelectedByUser, _locationrecord);

        editor.commit();
    }
    public static String getLatSelectedByUserRecord(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(latSelectedByUser, activity.MODE_PRIVATE);
        return prefs.getString(latSelectedByUser, "");
    }

    public static String getLongSelectedByUserRecord(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(longSelectedByUser, activity.MODE_PRIVATE);
        return prefs.getString(longSelectedByUser, "");
    }

    public static  void setLocationrecord(String _locationrecord,Context context){
        SharedPreferences prefs = context.getSharedPreferences(locationrecord, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(locationrecord, _locationrecord);

        editor.commit();
    }
    public static String getLocationRecord(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(locationrecord, activity.MODE_PRIVATE);
        return prefs.getString(locationrecord, "");
    }
    public static  void setLocation2record(String _locationrecord,Context context){
        SharedPreferences prefs = context.getSharedPreferences(location2record, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(location2record, _locationrecord);

        editor.commit();
    }
    public static String getLocation2Record(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(location2record, activity.MODE_PRIVATE);
        return prefs.getString(location2record, "");
    }

    public static void setUserCredentials(String _uname, String _pwd, String _orgcode, Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(username, _uname);
        editor.putString(pwd, _pwd);
        editor.putString(orgcode, _orgcode);
        editor.putString(orgcode, _orgcode);
        editor.putBoolean(isLoggedinUser, true);
        editor.commit();
    }

    public static void clearUserCredentials(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(username, "");
        editor.putString(pwd, "");
        editor.putString(orgcode, "");
        editor.putBoolean(isLoggedinUser, false);

        editor.commit();
    }

    //region UserId
    public static void setUserid(Context activity, int userid) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(userId, userid);
        editor.commit();
    }

    public static int getUserid(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        return prefs.getInt(userId, 0);
    }

    //endregion
    //region RoleId
    public static void setRoleid(Context activity, int userid) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(roleid, userid);
        editor.commit();
    }

    public static int getRoleid(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        return prefs.getInt(roleid, 0);
    }

    public static void setApkVersion(Context activity, Float ApkVersion) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(ApkVesion, ApkVersion);
        editor.commit();
    }

    public static float getApkVersion(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        return prefs.getFloat(ApkVesion, 0);
    }
    public static String getUsername(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getString(username, "");
    }

    public static String getPwd(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getString(pwd, "");
    }

    //endregion
    public static void setCheckedInStatus(Context context, boolean status) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(IsCheckedin, status);
        editor.commit();
    }

    public static boolean getCheckedInStatus(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getBoolean(IsCheckedin, false);
    }

    public static void setTaskId(Context context, int taskid) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(Taskid, taskid);
        editor.commit();
    }

    public static int getTaskId(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getInt(Taskid, 0);
    }

    public static void setSelectedPendingApprovalTaskId(Context context, int taskid) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(SelectedPendingApprovalTaskId, taskid);
        editor.commit();
    }

    public static int getSelectedPendingApprovalTaskId(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getInt(SelectedPendingApprovalTaskId, 0);
    }
    public static void setSelectedMBId(Context context, int taskid) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(SelectedMBIssueId, taskid);
        editor.commit();
    }
    public static void setSelectedRiskId(Context context, long taskid) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(SelectedRiskId, taskid);
        editor.commit();
    }
    public static long getSelectedRiskId(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getLong(SelectedRiskId, 0);
    }

    public static int getSelectedMBId(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getInt(SelectedMBIssueId, 0);
    }
   /* public static void setTaskRunningStatus(Context context,boolean taskStatus){
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(TaskRunningStatus, taskStatus);
        editor.commit();
    }
    public static boolean getTaskRunningsStatus(Context context){
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getBoolean(TaskRunningStatus, false);
    }*/


    public static void setRunningTaskCheckinId(Context context, int checkinid) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(TaskRunningCheckinId, checkinid);
        editor.commit();
    }

    public static int getRunningTaskCheckinId(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, context.MODE_PRIVATE);
        return prefs.getInt(TaskRunningCheckinId, 0);
    }


    public static void setTaskChainageValue(Context context, Set<String> taskChainageValue) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putStringSet(TaskChainageValue, taskChainageValue);
        editor.commit();
    }

    public static Set<String> getTaskChainageValue(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, Context.MODE_PRIVATE);
        return prefs.getStringSet(TaskChainageValue, null);
    }

    public static void setTempTaskChainageValue(Context context, Set<String> tempTaskChainageValue) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putStringSet(TempTaskChainageValue, tempTaskChainageValue);
        editor.commit();
    }

    public static Set<String> getTempTaskChainageValue(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(shareduserkey, Context.MODE_PRIVATE);
        return prefs.getStringSet(TempTaskChainageValue, null);
    }



    public static void setTempImageURL(Context activity, String tempImageURL) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(TempImageURL, tempImageURL);
        editor.commit();
    }

    public static String getTempImageURL(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        return prefs.getString(TempImageURL, "");
    }

    public static void setLoginLogTempId(Context activity, int tempid) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(LoginLogTempId, tempid);
        editor.commit();
    }

    public static int getLoginLogTempId(Context activity) {
        SharedPreferences prefs = activity.getSharedPreferences(shareduserkey, activity.MODE_PRIVATE);
        return prefs.getInt(LoginLogTempId, 0);
    }

}
