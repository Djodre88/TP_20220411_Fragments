package com.example.tp_20220411_fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Fragment1.Communication{

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

    @Override
    public void send(String name) {
        TextView textView = findViewById(R.id.textViewActivity);
        textView.setText(name);
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (fragment2 != null)
            fragment2.received(name);

    }
}