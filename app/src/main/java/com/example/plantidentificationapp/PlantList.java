package com.example.plantidentificationapp;

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

    private RecyclerView recyclerView;
    private PlantAdapter plantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_list);

        // Retrieve the list type identifier
        String listType = getIntent().getStringExtra("listType");

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<PlantModel.Plant> plantList = new ArrayList<>();

        // Populate plantList based on the listType
        switch (listType) {
            case "Plant1":
                plantList.add(new PlantModel.Plant("Plant 1 Name", "Scientific Name 1", "Description 1", "Lifespan 1", "Type 1"));
                plantList.add(new PlantModel.Plant("Plant 2 Name", "Scientific Name 2", "Description 2", "Lifespan 2", "Type 2"));
                plantList.add(new PlantModel.Plant("Plant 3 Name", "Scientific Name 3", "Description 3", "Lifespan 3", "Type 3"));
                plantList.add(new PlantModel.Plant("Plant 4 Name", "Scientific Name 4", "Description 4", "Lifespan 4", "Type 4"));

                break;
            case "Plant2":
                plantList.add(new PlantModel.Plant("Plant 1 Name", "Scientific Name 1", "Description 1", "Lifespan 1", "Type 1"));
                plantList.add(new PlantModel.Plant("Plant 2 Name", "Scientific Name 2", "Description 2", "Lifespan 2", "Type 2"));
                plantList.add(new PlantModel.Plant("Plant 3 Name", "Scientific Name 3", "Description 3", "Lifespan 3", "Type 3"));
                plantList.add(new PlantModel.Plant("Plant 4 Name", "Scientific Name 4", "Description 4", "Lifespan 4", "Type 4"));
                break;
            case "Weeds":
                plantList.add(new PlantModel.Plant("Posion Ivy", "Toxicodendron radicans", "Also known as climbing posion ivy, it is known for it climbing abilities. It is toxic and touching may cause dermatitis.", "Perennial", "Vine"));
                plantList.add(new PlantModel.Plant("Pokeweed", "Phytolacca americana", "It has berries that look like a cluster of black grapes. These are very poisonous and should not be eaten. It is considered a pest species by farmers but also grown as an ornamental plant.", "Perennial", "Herb"));
                plantList.add(new PlantModel.Plant("Horseweed", "Erigeron canadensis", "Horseweed is from North America and is an annual plant with a hairy stem, waxy inflorescence, and numerous pointed leaves.", "Annual, Biennial", "Herb"));
                plantList.add(new PlantModel.Plant("Common Dandelion", "Taraxacum officinale", "Found in temperate regions around the world. The most noticeable feature is its fruits, the furry spheres that are easily carried by the wind. They are also not poisonous and are edible and very nutritious", "Lifespan 4", "Type 4"));
                break;
            case "Plant4":
                plantList.add(new PlantModel.Plant("Plant 1 Name", "Scientific Name 1", "Description 1", "Lifespan 1", "Type 1"));
                plantList.add(new PlantModel.Plant("Plant 2 Name", "Scientific Name 2", "Description 2", "Lifespan 2", "Type 2"));
                plantList.add(new PlantModel.Plant("Plant 3 Name", "Scientific Name 3", "Description 3", "Lifespan 3", "Type 3"));
                plantList.add(new PlantModel.Plant("Plant 4 Name", "Scientific Name 4", "Description 4", "Lifespan 4", "Type 4"));
                break;
            default:
                // Handle default case
                break;
        }

        // Initialize and set up adapter
        plantAdapter = new PlantAdapter(plantList);
        recyclerView.setAdapter(plantAdapter);
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

        @Override
        public PlantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_plant1, parent, false);
            return new PlantViewHolder(view);
        }

        @Override
        public void onBindViewHolder(PlantViewHolder holder, int position) {
            final PlantModel.Plant plant = plantList.get(position);
            holder.nameTextView.setText(plant.getName());

            // Set onClickListener for the "play" button
            holder.playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent integer = new Intent(PlantList.this, PlantDetailsActivity.class);
                    startActivity(integer);
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

            public PlantViewHolder(View itemView) {
                super(itemView);
                nameTextView = itemView.findViewById(R.id.nameTV);
                playButton = itemView.findViewById(R.id.playBTN);
            }
        }
    }
    }
