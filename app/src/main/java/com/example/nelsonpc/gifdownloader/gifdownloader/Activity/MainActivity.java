package com.example.nelsonpc.gifdownloader.gifdownloader.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.example.nelsonpc.gifdownloader.R;

import layout.FragmentMainViewTrending;

/**
 * Created by Nelson PC on 11/9/2016.
 */
public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String CURRENT_DOWNLOAD_FRAG= "currentViewFrag";
    public static final String MAIN_VIEW_TRENDING_FRAG = "mainViewTrendingFrag";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragmentMainViewTrending();
    }

    public void addFragmentMainViewTrending() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.container, new FragmentMainViewTrending(), MAIN_VIEW_TRENDING_FRAG);
        transaction.commit();
    }

}
