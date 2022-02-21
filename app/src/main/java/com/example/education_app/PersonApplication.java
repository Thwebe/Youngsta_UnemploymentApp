package com.example.education_app;

import android.app.Application;

import com.backendless.Backendless;

import java.util.List;

public class PersonApplication extends Application {
    public static final String APPLICATION_ID = "06D4707E-124B-D741-FFCA-023B21132F00";
    public static final String API_KEY = "B489ED03-80CE-4E03-8AEE-EBDF1F0E5A70";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }



}
