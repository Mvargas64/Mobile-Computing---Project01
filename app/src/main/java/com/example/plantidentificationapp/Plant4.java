package com.example.plantidentificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plant4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant4);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this::onClickMainBTN);

    }

    public void onClickMainBTN(View v){
        Intent ini = new Intent(Plant4.this, MainActivity.class);
        startActivity(ini);
    }
}