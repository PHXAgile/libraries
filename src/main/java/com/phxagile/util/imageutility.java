package com.phxagile.util;

import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.*;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
/*import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;*/
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.phxagile.packages.BuildConfig;
import com.phxagile.packages.R;
import com.phxagile.util.AppSharedPreferences;
import com.phxagile.util.myapplication;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.app.Activity.RESULT_OK;
import static com.mapbox.mapboxsdk.Mapbox.getApplicationContext;


public class imageutility {
    public static boolean FROM_GALLERY = true;

    public static void showPictureDialog(Context context, Fragment fragment) {
        AlertDialog.Builder pictureDialog = new AlertDialog.Builder(context);
        pictureDialog.setTitle("Select Action");
        String[] pictureDialogItems = {
                /*"Select photo from gallery",*/
                "Capture photo from camera"};
        pictureDialog.setItems(pictureDialogItems,
                (dialog, which) -> {
                    switch (which) {
                     /*   case 0:
                            FROM_GALLERY = true;
                            openGallery(fragment);
                            break;*/
                        case 0:
                            FROM_GALLERY = false;
                            takePhotoFromCamera(fragment);
                            break;
                    }
                });
        pictureDialog.show();
    }

    public static void openGallery(Fragment fragment) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setAction(Intent.ACTION_GET_CONTENT);
        fragment.startActivityForResult(Intent.createChooser(intent, "Select Image From Gallery"), 1);
    }

    public static void takePhotoFromCamera(Fragment fragment) {
        try {
            String appId = "com.geovista.tatapower";
            File photoFile = createImageFile();
            if (photoFile != null) {
                AppSharedPreferences.setTempImageURL(fragment.getActivity(),photoFile.toString());
                Uri uri = FileProvider.getUriForFile(fragment.getContext(), appId + ".provider", photoFile);
                /*  Intent intent = new Intent(android.provider.MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));*/
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
                /*intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);*/

                fragment.startActivityForResult(intent, 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


       /* Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
        fragment.startActivityForResult(intent, CAMERA);*/
    }

    private static File createImageFile() throws IOException {

        /*long timeStamp = System.currentTimeMillis();*/
        long timeStamp = 1122;
        String imageFileName = "NAME_" + timeStamp;
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);

        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        return image;
    }

    public static String saveImage(Bitmap myBitmap, Context context, ImageView imgView, ArrayList<Uri> imgList , int selectedImageIndex) {

        ContextWrapper cw = new ContextWrapper(myapplication.getInstance());
        // path to /data/data/yourapp/app_data/imageDir
        File directory = cw.getDir("imageDir", Context.MODE_PRIVATE);
        // Create imageDir
        Long tsLong = System.currentTimeMillis() / 1000;
        File mypath = new File(directory, tsLong+".jpg");
        Uri uri = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(mypath);
            // Use the compress method on the BitMap object to write image to the OutputStream
            myBitmap.compress(Bitmap.CompressFormat.JPEG, 15, fos);
            uri = Uri.fromFile(new File(mypath.toString()));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {


                fos.close();
                Bitmap FixBitmap = MediaStore.Images.Media.getBitmap((context).getContentResolver(), uri);
                if(imgList.size() > selectedImageIndex){
                    imgList.remove(selectedImageIndex);
                }
                imgList.add(selectedImageIndex , uri);
                imgView.setImageBitmap(FixBitmap);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return directory.getAbsolutePath();

    }

    public static void issueImageActivityResult(int RC, int RQC, Intent I, Fragment context, ArrayList<Uri> selectedImagesList, List<String> imagesEncodedList, Uri selectedImageUri, Bitmap FixBitmap, ImageView ShowSelectedImage , int selectedImageIndex) {

        if (RQC == context.getActivity().RESULT_CANCELED) {
            return;
        }


        if (RC == 1 && RQC == RESULT_OK && I != null && I != null) {

            imagesEncodedList = new ArrayList<>();
//            if (imageutility.FROM_GALLERY) {
//                if (I.getData() != null) {
//                    Uri uri = I.getData();
//
//                    try {
//                        selectedImageUri = uri;
//                        FixBitmap = MediaStore.Images.Media.getBitmap(context.getActivity().getContentResolver(), uri);
//                        // imageBitmapList.add(FixBitmap);
//                        ShowSelectedImage.setImageBitmap(FixBitmap);
//                        if(selectedImagesList.size() > selectedImageIndex){
//                            selectedImagesList.remove(selectedImageIndex);
//                        }
//                        selectedImagesList.add(selectedImageIndex ,selectedImageUri);
//
//                    } catch (Exception e) {
//
//                        e.printStackTrace();
//                    }
//                } else {
//                    if (I.getClipData() != null) {
//                        ClipData mClipData = I.getClipData();
//                        ArrayList<Uri> mArrayUri = new ArrayList<Uri>();
//                        for (int i = 0; i < mClipData.getItemCount(); i++) {
//
//                            ClipData.Item item = mClipData.getItemAt(i);
//                            Uri uri = item.getUri();
//                            mArrayUri.add(uri);
//                            if(selectedImagesList.size() > selectedImageIndex){
//                                selectedImagesList.remove(selectedImageIndex);
//                            }
//                            selectedImagesList.add(selectedImageIndex ,uri);
//                        }
//                        try {
//                            FixBitmap = MediaStore.Images.Media.getBitmap(context.getActivity().getContentResolver(), mArrayUri.get(0));
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//
//                        ShowSelectedImage.setImageBitmap(FixBitmap);
//                        Log.v("LOG_TAG", "Selected Images" + mArrayUri.size());
//                    }
//
//
//                }
//            } else {
//                if(I.hasExtra("data")){
//                    Bitmap thumbnail = (Bitmap) I.getExtras().get("data");
//                    imageutility.saveImage(thumbnail, context.getActivity(), ShowSelectedImage, selectedImagesList , selectedImageIndex);
//                }else {
//                    return;
//                }
//
//            }


            File imgFile = new  File(AppSharedPreferences.getTempImageURL(context.getActivity()));
            if(imgFile.exists()){

                String filePath = imgFile.getAbsolutePath();
                ExifInterface exif = null;
                try {
                    exif = new ExifInterface(filePath);
                    // Specify the decimal degree values for latitude and longitude
                    double latitude = apputility.currentLattitude;
                    double longitude = apputility.currentLongitude;

// Calculate the degrees, minutes, and seconds values for latitude
                    int latitudeDegrees = (int) latitude;
                    double latitudeMinutes = (latitude - latitudeDegrees) * 60;
                    double latitudeSeconds = (latitudeMinutes - (int) latitudeMinutes) * 60 * 10000;

// Calculate the degrees, minutes, and seconds values for longitude
                    int longitudeDegrees = (int) longitude;
                    double longitudeMinutes = (longitude - longitudeDegrees) * 60;
                    double longitudeSeconds = (longitudeMinutes - (int) longitudeMinutes) * 60 * 10000;

// Format the latitude and longitude values as strings in the Exif format
                    String latitudeString = latitudeDegrees + "/1," + (int) latitudeMinutes + "/1," + (int) latitudeSeconds + "/10000";
                    String longitudeString = longitudeDegrees + "/1," + (int) longitudeMinutes + "/1," + (int) longitudeSeconds + "/10000";

// Print the latitude and longitude strings to the console
                    System.out.println("Latitude: " + latitudeString);
                    System.out.println("Longitude: " + longitudeString);


                    // Set the latitude and longitude values in the Exif data
                    exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE, latitudeString);
                    exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, "N");
                    exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, longitudeString);
                    exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, "W");

                    String latitude1 = exif.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
                    String longitude1 = exif.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);

                    exif.saveAttributes();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                //Drawable d = new BitmapDrawable(getResources(), myBitmap);
                   /* ImageView myImage = (ImageView) findViewById(R.id.imageviewTest);
                    myImage.setImageBitmap(myBitmap);*/
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                myBitmap.compress(Bitmap.CompressFormat.JPEG, 20, stream);
                Bitmap decoded = BitmapFactory.decodeStream(new ByteArrayInputStream(stream.toByteArray()));
                Bitmap timestampedimage=timestampItAndSave(decoded,context.getContext());
                imageutility.saveImage(timestampedimage, context.getActivity(), ShowSelectedImage, selectedImagesList , selectedImageIndex);

                imgFile.delete();

            }

        }
        if (RC == 1 && RQC == -1  && I == null) {

            imagesEncodedList = new ArrayList<>();
            if (imageutility.FROM_GALLERY) {
                if (I.getData() != null) {
                    Uri uri = I.getData();

                    try {
                        selectedImageUri = uri;
                        FixBitmap = MediaStore.Images.Media.getBitmap(context.getActivity().getContentResolver(), uri);
                        // imageBitmapList.add(FixBitmap);
                        ShowSelectedImage.setImageBitmap(FixBitmap);
                        if(selectedImagesList.size() > selectedImageIndex){
                            selectedImagesList.remove(selectedImageIndex);
                        }
                        selectedImagesList.add(selectedImageIndex , selectedImageUri);

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                } else {
                    if (I.getClipData() != null) {
                        ClipData mClipData = I.getClipData();
                        ArrayList<Uri> mArrayUri = new ArrayList<Uri>();
                        for (int i = 0; i < mClipData.getItemCount(); i++) {

                            ClipData.Item item = mClipData.getItemAt(i);
                            Uri uri = item.getUri();
                            mArrayUri.add(uri);
                            if(selectedImagesList.size() > selectedImageIndex){
                                selectedImagesList.remove(selectedImageIndex);
                            }
                            selectedImagesList.add(selectedImageIndex , uri);
                        }
                        try {
                            FixBitmap = MediaStore.Images.Media.getBitmap(context.getActivity().getContentResolver(), mArrayUri.get(0));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        ShowSelectedImage.setImageBitmap(FixBitmap);
                        Log.v("LOG_TAG", "Selected Images" + mArrayUri.size());
                    }


                }
            } else {
                long timeStamp = 1122;
                String imageFileName = "/NAME_" + timeStamp+".jpg";
                File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);

                File imgFile = new  File(AppSharedPreferences.getTempImageURL(context.getActivity()));
                if(imgFile.exists()){

                    String filePath = imgFile.getAbsolutePath();
                    ExifInterface exif = null;
                    try {
                        exif = new ExifInterface(filePath);
                        // Specify the decimal degree values for latitude and longitude
                        double latitude = apputility.currentLattitude;
                        double longitude = apputility.currentLongitude;

// Calculate the degrees, minutes, and seconds values for latitude
                        int latitudeDegrees = (int) latitude;
                        double latitudeMinutes = (latitude - latitudeDegrees) * 60;
                        double latitudeSeconds = (latitudeMinutes - (int) latitudeMinutes) * 60 * 10000;

// Calculate the degrees, minutes, and seconds values for longitude
                        int longitudeDegrees = (int) longitude;
                        double longitudeMinutes = (longitude - longitudeDegrees) * 60;
                        double longitudeSeconds = (longitudeMinutes - (int) longitudeMinutes) * 60 * 10000;

// Format the latitude and longitude values as strings in the Exif format
                        String latitudeString = latitudeDegrees + "/1," + (int) latitudeMinutes + "/1," + (int) latitudeSeconds + "/10000";
                        String longitudeString = longitudeDegrees + "/1," + (int) longitudeMinutes + "/1," + (int) longitudeSeconds + "/10000";

// Print the latitude and longitude strings to the console
                        System.out.println("Latitude: " + latitudeString);
                        System.out.println("Longitude: " + longitudeString);


                        // Set the latitude and longitude values in the Exif data
                        exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE, latitudeString);
                        exif.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, "N");
                        exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, longitudeString);
                        exif.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, "W");

                        String latitude1 = exif.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
                        String longitude1 = exif.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);

                        exif.saveAttributes();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
                    //Drawable d = new BitmapDrawable(getResources(), myBitmap);
                   /* ImageView myImage = (ImageView) findViewById(R.id.imageviewTest);
                    myImage.setImageBitmap(myBitmap);*/
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    myBitmap.compress(Bitmap.CompressFormat.JPEG, 20, stream);
                    Bitmap decoded = BitmapFactory.decodeStream(new ByteArrayInputStream(stream.toByteArray()));
                    Bitmap timestampedimage=timestampItAndSave(decoded,context.getContext());
                    imageutility.saveImage(timestampedimage, context.getActivity(), ShowSelectedImage, selectedImagesList , selectedImageIndex);

                    imgFile.delete();

                }



            }
        }
    }

    public static byte[] getImageByte(Uri uri) {
        InputStream iStream = null;
        try {
            iStream = getApplicationContext().getContentResolver().openInputStream(uri);
            byte[] inputData = getBytes(iStream);
            return inputData;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteBuffer = new ByteArrayOutputStream();
        int bufferSize = 1024;
        byte[] buffer = new byte[bufferSize];

        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            byteBuffer.write(buffer, 0, len);
        }
        return byteBuffer.toByteArray();
    }


    private static Bitmap timestampItAndSave(Bitmap toEdit,Context context){
        Bitmap dest = Bitmap.createBitmap(toEdit.getWidth(), toEdit.getHeight(), Bitmap.Config.ARGB_8888);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateTime = sdf.format(Calendar.getInstance().getTime()); // reading local time in the system
        LocationManager lm = (LocationManager) context.getApplicationContext().getSystemService(context.LOCATION_SERVICE);
        String latlon=apputility.currentLattitude + " , " + apputility.currentLongitude;
        dateTime= dateTime+" :  "+latlon;
        Canvas cs = new Canvas(dest);
        Paint tPaint = new Paint();
        tPaint.setTextSize(100);
        tPaint.setColor(Color.BLUE);
        tPaint.setStyle(Paint.Style.FILL);
        float height = tPaint.measureText("yY");
        cs.drawBitmap(toEdit,0,0,null);

        cs.drawText(dateTime, 20f, height+15f, tPaint);
//        cs.drawText(latlon, 20f, 2*(height)+15f, tPaint);
        try {
            dest.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(context.getExternalCacheDir(),"timestamped")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return dest;
    }

}
