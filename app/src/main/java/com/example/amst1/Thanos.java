package com.example.amst1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class Thanos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanos);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.user_name);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#EBA951")));
    }


}