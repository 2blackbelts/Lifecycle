package com.tafe.mcintosh.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "App created!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "App is paused!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "App has stopped!");
    }
}
