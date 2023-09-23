package com.phxagile.util;

import android.content.Context;
import android.text.TextUtils;

import com.phxagile.util.AppSharedPreferences;

import java.io.*;

public class InternalLocationStorage {
    private Context context;
    private static String filename;
    private static BufferedWriter bw;
    private static File tripFile;
    boolean returnResult = false;
    private static FileWriter fw;
    private static OutputStreamWriter outputStreamWriter = null;
    private static String delimeter=",";

    public InternalLocationStorage(Context _context) {
        context = _context;

    }

    public static void writeToFile(Context _context, String data) throws IOException {
        int tripid = AppSharedPreferences.getRunningTaskCheckinId(_context);

        if (tripid != 0) {
            filename = tripid + ".json";
            tripFile = new File(_context.getFilesDir() + "/" + filename);
            if (!tripFile.exists()) {
                delimeter="";
                outputStreamWriter = new OutputStreamWriter(_context.openFileOutput(filename, Context.MODE_PRIVATE));
                outputStreamWriter.write("[");
                outputStreamWriter.close();
            }
            try {
                if (data != null && !TextUtils.isEmpty(data)) {

                    outputStreamWriter = new OutputStreamWriter(_context.openFileOutput(filename, Context.MODE_APPEND));
                    outputStreamWriter.write(delimeter);
                    outputStreamWriter.write(data);
                    outputStreamWriter.close();
                    delimeter=",";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void flushStorage(Context _context) {
        int tripid = AppSharedPreferences.getRunningTaskCheckinId(_context);
        if (tripid != 0) {
            filename = tripid + ".json";
            try {
                outputStreamWriter = new OutputStreamWriter(_context.openFileOutput(filename, Context.MODE_APPEND));
                outputStreamWriter.write("]");
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
