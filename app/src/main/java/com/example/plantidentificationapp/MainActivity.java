package com.example.plantidentificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.Plant2BTN);
        button1.setOnClickListener(this::onClickPlant2BTN);

        Button button2 = findViewById(R.id.Plant1BTN);
        button2.setOnClickListener(this::onClickButton1);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this::onClickPlant3BTN);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this::onClickPlant4BTN);
    }

    public void onClickButton1(View v){
        Intent intent = new Intent(MainActivity.this, PlantList.class);
        intent.putExtra("listType", "Plant1"); // Pass the identifier
        intent.putExtra("Pepper/Capsicum Annuum", "Chili Pepper");
        startActivity(intent);
    }

    public void onClickPlant2BTN(View v){
        Intent intent = new Intent(MainActivity.this, PlantList.class);
        intent.putExtra("listType", "Plant2"); // Pass the identifier
        intent.putExtra("Pepper/Capsicum Annum", "Jalepeno");
        startActivity(intent);
    }

    public void onClickPlant3BTN(View v){
        Intent intent = new Intent(MainActivity.this, PlantList.class);
        intent.putExtra("listType", "Plant3"); // Pass the identifier
        startActivity(intent);
    }

    public void onClickPlant4BTN(View v){
        Intent intent = new Intent(MainActivity.this, PlantList.class);
        intent.putExtra("listType", "Plant4"); // Pass the identifier
        startActivity(intent);
    }
}
