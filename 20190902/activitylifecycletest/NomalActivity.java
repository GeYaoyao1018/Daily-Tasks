package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NomalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nomal_layout);
    }
}
