package com.example.tp_20220411_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Fragment1", "L'activité est en pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Fragment1", "L'activité est stoppée");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Fragment1", "L'activité est détruite");

    }
}