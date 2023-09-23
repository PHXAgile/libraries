package com.phxagile.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import androidx.core.app.ActivityCompat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class apputility {
    public static double meterDistanceBetweenPoints(double lat_a, double lng_a, double lat_b, double lng_b) {
        float pk = (float) (180.f / Math.PI);

        double a1 = lat_a / pk;
        double a2 = lng_a / pk;
        double b1 = lat_b / pk;
        double b2 = lng_b / pk;

        double t1 = Math.cos(a1) * Math.cos(a2) * Math.cos(b1) * Math.cos(b2);
        double t2 = Math.cos(a1) * Math.sin(a2) * Math.cos(b1) * Math.sin(b2);
        double t3 = Math.sin(a1) * Math.sin(b1);
        double tt = Math.acos(t1 + t2 + t3);

        return 6366000 * tt;
    }

    public static String getDeviceIMEI(Activity context) {
        String deviceUniqueIdentifier = null;
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);


        if (null != tm) {
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                deviceUniqueIdentifier = tm.getImei();
            }

        }
        if (null == deviceUniqueIdentifier || 0 == deviceUniqueIdentifier.length()) {
            deviceUniqueIdentifier = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        }
        return deviceUniqueIdentifier;
    }

    public static boolean isLocationEnabled(Context context) {
        int locationMode = 0;
        String locationProviders;

        try {
            locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);

        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return locationMode != Settings.Secure.LOCATION_MODE_HIGH_ACCURACY;


    }

/*    public static final String ServiceUrl = "http://ft005api.fibertrack.in/";*/
/*public static final String ServiceUrl = "http://103.148.157.115:5555/";*/
/*public static final String ServiceUrl = "http://www.tfiber.traxion.in:5555/";*/
/*public static final String ServiceUrl = "http://www.tfiber.traxion.in:4455/";*/

//    public static final String ServiceUrl = "https://www.tfiberapp.traxion.in/";
//    public static final String ServiceUrl = "http://gvthrms.in:8036/";
public static final String ServiceUrl = "https://tpw.traxion.in";
   // public static final String ServiceUrl = " http://gvthrms.in:7082/";

    /*public static final String ServiceUrl = "http://apift002.fibertrack.in/";*/

    //"http://cpcomics-001-site6.itempurl.com/";


    public static final String DashboardUrl = "User/MobileDashboard?UserId=";
    public static final String UserRoutesUrl = "User/GetUserRoutes?UserId=";

    public static final String UserStarTripUrl = "/Routes/StartTrip";
    public static final String UserEndTripUrl = "/Routes/EndTrip";


    public static final String TripCreateIssue = "Routes/CreateIssue";
    public static final String TripCreateIssueLog = "Routes/CreateIssueLog";

    public static final String PushMilestones = "/Routes/UpdateMileStones";
    public static final String PushIdleTime = "/Routes/InsertIdeal";
    public static final String PushDeviationDistance = "/Routes/InsertDeviation";


    public static final String FOUserIsssuesUrl = "/Routes/GetIssuesByFOUserId?UserId=";
    public static final String FRTUserIsssuesUrl = "/Routes/GetIssuesByFRTUserId?UserId=";

    public static final String IssueCreationUrl = "Routes/CreateIssue";
    public static final String IssueResponseUrl = "Routes/CreateIssueLog";


    public static final String NotificationsDeviceRegistrationURL = "http://pushnotification.fibertrack.in/Notification/RegisterDevice";
    public static final String NotificationsUserDeviceRegistrationURL = "http://pushnotification.fibertrack.in//Notification/RegisterUserDevice";
    public static final String NotificationsUserDeviceRemoveURL = "http://pushnotification.fibertrack.in//Notification/RemoveUserDevice";


    public static int CurrentFragment;


    public static final String ConsumerDetails = "/Task/GetConsumerDataByConsumerNumber?ConsumerNumber=";
    public static final String TaskList = "/Task/GetUserTask?UserId=";
    public static final String UpdateTask = "/Task/TaskProgressInsert";
    public static final String UpdateRejectedTask = "/Task/TaskApprovalUpdate";
    public static final String DashboardData = "/Task/TaskDashBoard?UserId=";
    public static final String TimelineList = "/Routes/GetTimeline?Id=";
    public static final String Checkin = "/Task/CheckIn";
    public static final String CheckOut = "/Task/CheckOut";
    public static final String ResetPassword = "/User/ResetPassword";
    public static final String PendingApprovals = "/Task/GetFoPendingApprovals?UserId=";

    public static final String IssuesList = "/Task/GetIssuesAndRisksByUserId?UserId=";

    public static final String LookupsData = "/Task/GetLookupById?Id=";
    public static final String  SpansData = "/Task/GetUserSpans?UserId=";

    public static final String NewSpanIdData ="/Task/SpanDropdownValues?UserId=";
    public static final String GPDropDownData = "/Task/GPDropdownValues?UserId=";

    public static final String CreateIssue = "/Task/CreateTaskIssue";
    public static final String UpdateIssue = "/Task/UpdateTaskIssue";
    public static final String MBIssues = "/Task/GetTaskIssuesByUserId?UserId=";

    public static final String CreateRisk = "/Task/CreateIssuesAndRisks";
    public static final String UpdateRisk = "/Task/UpdateIssuesAndRisks";

    public static final String SurroundingLatLng = "Task/LastLatLngs?UserId=";

    public static final String LastLatLngsByUserId ="task/LastLatLngsByUserId?UserId=";

    public static final String DMSUrl="http://ft005dms.fibertrack.in/api/FileUploadMobile/Upload";
  /*public static final String DMSUrl="http://www.tfiber.traxion.in:8089/api/FileUploadMobile/Upload/";*/


    public static final String ApkVersion="/User/GetAPKVersion";

    public static void setTaskChainageValue(Context context, int taskId, Integer chainageValue) {
        Set<String> chainageSet = AppSharedPreferences.getTaskChainageValue(context);
        if (chainageSet == null) {
            chainageSet = new HashSet<>();
        }

        // Store existing data as a Map for easy lookup and modification
        Map<Integer, Integer> chainageMap = new HashMap<>();
        for (String s : chainageSet) {
            String[] chainageKeyValue = s.split("-");
            chainageMap.put(Integer.parseInt(chainageKeyValue[0]), Integer.parseInt(chainageKeyValue[1]));
        }

        // Add or update the taskId-chainageValue pair
        chainageMap.put(taskId, chainageValue);

        // Convert the Map back to a Set of String pairs
        chainageSet.clear();
        for (Map.Entry<Integer, Integer> entry : chainageMap.entrySet()) {
            chainageSet.add(entry.getKey() + "-" + entry.getValue());
        }

        AppSharedPreferences.setTaskChainageValue(context, chainageSet);
    }

    public static void setTempTaskChainageValue(Context context, int taskId, Integer chainageValue) {
        // There's no need to remove the taskId from the actual set because when we apply
        // the temp values, the value for this taskId in the actual set will be overwritten.
        Set<String> tempChainageSet = AppSharedPreferences.getTempTaskChainageValue(context);
        if (tempChainageSet == null) {
            tempChainageSet = new HashSet<>();
        }
        tempChainageSet.add(taskId + "-" + chainageValue);
        AppSharedPreferences.setTempTaskChainageValue(context, tempChainageSet);
    }

    public static String getTaskChainageValue(Context context, int taskid) {
        Set<String> Chainageset = AppSharedPreferences.getTaskChainageValue(context);
        if (Chainageset != null) {
            for (String s : Chainageset) {

                String[] chainageKeyValue = s.split("-");
                if (Integer.parseInt(chainageKeyValue[0]) == taskid) {
                    return Integer.parseInt(chainageKeyValue[1]) + "";
                }

            }
        }
        return "0";

    }

    public static void applyTempTaskChainageValue(Context context) {
        Set<String> tempChainageSet = AppSharedPreferences.getTempTaskChainageValue(context);
        if (tempChainageSet != null) {
            for (String s : tempChainageSet) {
                String[] chainageKeyValue = s.split("-");
                setTaskChainageValue(context, Integer.parseInt(chainageKeyValue[0]), Integer.parseInt(chainageKeyValue[1]));
            }
            tempChainageSet.clear();
            AppSharedPreferences.setTempTaskChainageValue(context, tempChainageSet);
        }
    }


    public static double currentLattitude = 0;
    public static double currentLongitude = 0;

    public static double selectedLattitude = 0.0;
    public static double selectedLongitude = 0.0;

}
