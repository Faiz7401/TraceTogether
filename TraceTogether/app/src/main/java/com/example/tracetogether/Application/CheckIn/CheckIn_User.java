package com.example.tracetogether.Application.CheckIn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tracetogether.R;

public class CheckIn_User extends AppCompatActivity {

    private Button checkIn;
    private ConstraintLayout history;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkin_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        checkIn = findViewById(R.id.checkIn_Button);
        history = findViewById(R.id.History);

        checkIn.setOnClickListener(new View.OnClickListener() {

            //CheckIn Button
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_User.this, CheckIn_SelectDependent.class) );
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CheckIn_User.this, CheckIn_History.class));
            }
        });
    }
}
    /*public  void opneSelect_depent() {
        Intent intent = new Intent(this, CheckIn_SelectDependent.class);
        startActivities(new Intent[]{intent});
    }*/

