package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class CheckIn_SelectDependent extends AppCompatActivity {

    private Button countinue;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_dependent);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        countinue = findViewById(R.id.countinueButton);

        countinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_SelectDependent.this, Qr_Scanner.class));
            }
        });
    }
}
