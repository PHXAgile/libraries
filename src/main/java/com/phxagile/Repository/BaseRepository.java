package com.phxagile.Repository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseRepository {
    private Retrofit _retroFit;

    public Retrofit getHttpClient() {
        if (_retroFit == null) {
            _retroFit = new Retrofit.Builder()

//                    .baseUrl("https://tpw.traxion.in/")

                    .baseUrl("https://tpw.traxion.in")
//                    .baseUrl("http://gvthrms.in:8036/")
//                    .baseUrl("https://www.tfiberapp.traxion.in/")
//                    .baseUrl("http://www.tfiber.traxion.in:4455/")
                    //.baseUrl("http://gvthrms.in:7082/")

                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return _retroFit;
    }

    public Retrofit getImageHttpClient() {

        return new Retrofit.Builder()


//                .baseUrl("https://tpw.traxion.in/")
                    .baseUrl("https://tpw.traxion.in")
//                .baseUrl("http://gvthrms.in:8036/")
//                .baseUrl("http://www.tfiber.traxion.in:8089/")
                //.baseUrl("http://gvthrms.in:7081/")

                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
}
