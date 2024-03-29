package com.example.plantidentificationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlantList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list);

        // Retrieve the list type identifier
        String listType = getIntent().getStringExtra("listType");

        // Set up your RecyclerView based on the listType
        RecyclerView recycleView = findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        List<PlantModel.Plant> plantList = new ArrayList<>();

        // Populate plantList based on the listType
        switch (listType) {
            case "Plant1":
                plantList.add(new PlantModel.Plant("Plant 1 Name", "Scientific Name 1", "Description 1", "Lifespan 1", "Type 1"));
                break;
            case "Plant2":
                plantList.add(new PlantModel.Plant("Plant 2 Name", "Scientific Name 2", "Description 2", "Lifespan 2", "Type 2"));
                break;
            case "Plant3":
                plantList.add(new PlantModel.Plant("Plant 3 Name", "Scientific Name 3", "Description 3", "Lifespan 3", "Type 3"));
                break;
            case "Plant4":
                plantList.add(new PlantModel.Plant("Plant 4 Name", "Scientific Name 4", "Description 4", "Lifespan 4", "Type 4"));
                break;
            default:
                // Handle default case
                break;
        }

        PlantAdapter adapter = new PlantAdapter(plantList);
        recycleView.setAdapter(adapter);
    }

    public void onClickMainBTN(View v) {
        Intent ini = new Intent(PlantList.this, MainActivity.class);
        startActivity(ini);
    }

    class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.PlantViewHolder> {

        List<PlantModel.Plant> plantList;

        public PlantAdapter(List<PlantModel.Plant> plantList) {
            this.plantList = plantList;
        }

        @NonNull
        @Override
        public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_plant1, parent, false);
            return new PlantViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
            final PlantModel.Plant plant = plantList.get(position); // Declare music as final here
            holder.nameTextView.setText(plant.getName());
            //holder.artistTextView.setText(plant.get());

            holder.playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PlantList.this, MainActivity.class);
                    // Pass the song name as an extra
                    intent.putExtra("songName", plant.getName());
                    startActivity(intent);
                }
            });
        }


        @Override
        public int getItemCount() {
            return plantList.size();
        }

        class PlantViewHolder extends RecyclerView.ViewHolder {

            TextView nameTextView;
            Button playButton;

            public PlantViewHolder(@NonNull View itemView) {
                super(itemView);
                nameTextView = itemView.findViewById(R.id.nameTV);
                //artistTextView = itemView.findViewById(R.id.artistTV);
                playButton = itemView.findViewById(R.id.playBTN);
            }
        }
    }
}