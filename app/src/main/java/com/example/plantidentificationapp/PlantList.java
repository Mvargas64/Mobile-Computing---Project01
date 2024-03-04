package com.example.plantidentificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlantList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list);
    }

    public void onClickMainBTN(View v){
        Intent ini = new Intent(PlantList.this, MainActivity.class);
        startActivity(ini);
    }
}