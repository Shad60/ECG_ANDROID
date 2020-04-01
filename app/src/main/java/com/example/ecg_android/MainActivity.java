package com.example.ecg_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainActivity() {

        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "on start" + getLocalClassName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "on stop" + getLocalClassName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "on destroy" + getLocalClassName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on pause" + getLocalClassName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "on resume" + getLocalClassName());

        //((TextView) findViewById(R.id.textView)).setText(this.message);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "on restart" + getLocalClassName());
    }
}
