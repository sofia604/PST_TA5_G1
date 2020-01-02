package com.example.amst1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
    }

    public void Ironman(View v){
        Intent intent = new Intent(Presentacion.this, IronMan.class);
        startActivity(intent);

    }

    public void Doctor(View v){
        Intent intent = new Intent(Presentacion.this, DoctorStrange.class);
        startActivity(intent);

    }

    public void Spider(View v){
        Intent intent = new Intent(Presentacion.this, Spiderman.class);
        startActivity(intent);

    }

    public void Than(View v){
        Intent intent = new Intent(Presentacion.this, Thanos.class);
        startActivity(intent);

    }

    public void Captain(View v){
        Intent intent = new Intent(Presentacion.this, CapitanAmerica.class);
        startActivity(intent);

    }

    public void Nick(View v){
        Intent intent = new Intent(Presentacion.this, Fury.class);
        startActivity(intent);

    }
}