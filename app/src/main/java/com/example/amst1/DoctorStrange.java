package com.example.amst1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class DoctorStrange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_strange);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.iconbar);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(R.string.user_name);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#202058")));

    }
}
