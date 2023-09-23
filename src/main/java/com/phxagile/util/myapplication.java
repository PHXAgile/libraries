/*
 * @ Rights Reserved-T Fiber
 */

package com.phxagile.util;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.mapbox.android.core.location.LocationEngine;
import com.mapbox.mapboxsdk.Mapbox;


public class myapplication extends Application {
    private static myapplication mInstance;
    public static final String CHANNEL_ID = "exampleServiceChannel";
    private  RequestQueue requestQueue;
  // private  RequestQueue requestQueue;
    private LocationEngine currentLocationEngine;

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        mInstance=this;
        Mapbox.getInstance(getApplicationContext(), "pk.eyJ1IjoibXVkZGFuYSIsImEiOiJjanYxN21ycmMwZnd6NDRwOTE2MDVjeXBvIn0.vdrULrvgaWgFybar1GTouw");
        // Mapbox Access token

    }
    public static synchronized myapplication getInstance()
    {
        return mInstance;
    }
    public void addToRequestQueue(Request request, String tag)
    {
        request.setTag(tag);
        getRequestQueue().add(request);

    }
    public RequestQueue getRequestQueue()
    {
        if (requestQueue==null)
            requestQueue= Volley.newRequestQueue(getApplicationContext());

        return requestQueue;
    }
    public void cancelAllRequests(String tag)
    {
        getRequestQueue().cancelAll(tag);
    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,
                    "Example Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
    public void setCurrentLocationEngine(LocationEngine locationEngine){
        currentLocationEngine=locationEngine;
    }
    public LocationEngine getCurrentLocationEngine(){
        return currentLocationEngine;
    }

}