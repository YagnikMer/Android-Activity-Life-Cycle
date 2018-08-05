package com.worldmer.activitylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    String TAG = "ActivityLifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"ACT B onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ACT B onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ACT B onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ACT B onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ACT B onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"ACT B onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ACT B onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG,"ACT B onBackPressed()");
    }

    public void onClick(View view) {
        Log.d(TAG,"ACT B onClick()");
        startActivity(new Intent(this,MainActivity.class));
    }
}
