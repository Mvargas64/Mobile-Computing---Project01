package com.example.plantidentificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Plant2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant2);
    }

    public void onClickMainBTN(View v){
        Intent ini = new Intent(this, MainActivity.class);
        startActivity(ini);
    }
}