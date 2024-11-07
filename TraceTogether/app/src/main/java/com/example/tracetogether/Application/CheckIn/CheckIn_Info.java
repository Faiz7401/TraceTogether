package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class CheckIn_Info extends AppCompatActivity {

    private Button returnB;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkin_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        returnB = findViewById(R.id.countinueButton);

        returnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_Info.this, CheckIn_User.class));
            }
        });
    }


}
