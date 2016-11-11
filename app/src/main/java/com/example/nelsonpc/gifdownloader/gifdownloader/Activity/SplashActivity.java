package com.example.nelsonpc.gifdownloader.gifdownloader.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.nelsonpc.gifdownloader.gifdownloader.Listeners.HttpResponseListener;
import com.example.nelsonpc.gifdownloader.R;

/**
 * Created by Nelson PC on 11/9/2016.
 */

public class SplashActivity extends AppCompatActivity implements HttpResponseListener {

    private static final String TAG = SplashActivity.class.getSimpleName();
    private boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startGIFDownloaderDelayed(1500);
    }
}