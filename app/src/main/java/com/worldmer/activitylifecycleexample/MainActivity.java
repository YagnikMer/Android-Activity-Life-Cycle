package com.worldmer.activitylifecycleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String TAG = "ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "ACT A onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ACT A onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ACT A onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ACT A onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ACT A onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ACT A onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ACT A onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "ACT A onBackPressed()");
    }

    public void onClick(View view) {
        Log.d(TAG, "ACT A onClick()");
        startActivity(new Intent(this, SecondActivity.class));
    }
}
