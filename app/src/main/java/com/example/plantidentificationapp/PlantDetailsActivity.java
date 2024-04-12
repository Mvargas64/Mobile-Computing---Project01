package com.example.plantidentificationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlantDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_details);

        // Retrieve plant details from the intent
        Intent intent = getIntent();
        if (intent != null) {
            String plantName = intent.getStringExtra("plantName");
            String plantDescription = intent.getStringExtra("plDescription");
            String plantLifespan = intent.getStringExtra("plantLifespan");
            String plantType = intent.getStringExtra("plantType");

            // Set the text views to display the plant details
            TextView nameTextView = findViewById(R.id.nameTV);
            TextView descriptionTextView = findViewById(R.id.descriptionTV);
            TextView lifespanTextView = findViewById(R.id.lifespanTV);
            TextView typeTextView = findViewById(R.id.typeTV);

            nameTextView.setText(plantName);
            descriptionTextView.setText(plantDescription);
            lifespanTextView.setText(plantLifespan);
            typeTextView.setText(plantType);
        }
    }
}