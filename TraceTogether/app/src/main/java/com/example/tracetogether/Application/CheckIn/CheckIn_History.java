package com.example.tracetogether.Application.CheckIn;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class CheckIn_History extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkin_history);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}