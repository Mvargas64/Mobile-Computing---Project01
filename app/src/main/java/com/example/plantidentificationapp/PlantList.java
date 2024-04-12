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
            case "Toxic Plants":
                plantList.add(new PlantModel.Plant("Is Heart of jesus Poisonou", "Caladium Bicolor", "The Heart of Jesus plant, despite its seemingly pure name, is actually poisonous. Similar to other Caladiums, its sap can cause intense irritation when ingested or touched. Contact with the sap leads to a painful and itchy rash. Ingestion of the plant induces symptoms akin to the rash but internally, affecting the mouth, digestive system, causing nausea, vomiting, diarrhea, and swelling. It's crucial to keep this plant out of reach of children.", "This plant typically has a lifespan of a few months to a few years, depending on its growing conditions and care. However, its toxicity remains consistent throughout its lifespan.", "Perennial Ornamental Plant"));
                plantList.add(new PlantModel.Plant("Is Evergreen azalea Poisonous", "Rhododendron Indicum", "Evergreen azaleas, belonging to the Rhododendron genus, contain Grayanotoxin in all parts, which can induce various adverse effects. Skin contact may lead to rashes, while inhaling pollen can irritate mucous membranes. Ingestion can result in nausea, vomiting, arrhythmia, low blood pressure, and hallucinations. Even honey made from Rhododendron pollen can be harmful due to the potency of Grayanotoxin it contains.", "lifespan can vary depending on factors such as species, growing conditions, and care, but they generally live for several years to decades.", "Perennial Shrubs"));
                plantList.add(new PlantModel.Plant("Is Heavenly bamboo Poisonous", "Nandina Domestica", "The berries of heavenly bamboo are highly toxic due to their hydrogen cyanide content. Ingesting these berries, especially in large amounts, can lead to cyanide poisoning, potentially resulting in death within a short timeframe. Common symptoms of consuming heavenly bamboo berries include vomiting, diarrhea, abdominal pain, nausea, and occasionally seizures. Children are particularly at risk due to the appealing appearance of the bright red berries.", "Its lifespan can vary, but it typically ranges from 10 to 20 years, depending on growing conditions and care.", "Perennial Shrub"));
                plantList.add(new PlantModel.Plant("Is English ivy Poisonous", "Hedera helix", "English ivy possesses moderate toxicity, whether ingested or upon physical contact, with all parts of the plant containing toxic substances. Contact with the sap from the leaves or stem can lead to skin inflammation, redness, itching, and blistering. Ingesting the berries induces a burning sensation in the throat, while consuming the leaves can result in symptoms such as delirium, hallucinations, fever, convulsions, rashes, vomiting, diarrhea, stomach pain, and excessive salivation. Additionally, English ivy contains allergens that may affect sensitive individuals. Poisoning from this plant is most likely to occur accidentally, given its common cultivation and invasive nature in North America.", "Its lifespan can vary depending on growing conditions and care, but it typically lives for several years to decades.", "Perennial Vine"));
                break;
            case "Trees":
                plantList.add(new PlantModel.Plant("Tree of heaven", "Amherstia nobilis", "Tree of heaven is a rare flowering tree found almost exclusively in Myanmar. It is known for its impressive red flowers that hang on long stalks. Each flower has five petals, two of which are tiny, two mid-sized, and one long petal that can reach 8 cm in length. The scientific name Amherstia nobilis honors English botanist Sarah Amherst.", "Perennial", "Tree"));
                plantList.add(new PlantModel.Plant("Orchid trees", "Bauhinia", "Orchid trees are a collection of trees, shrubs, and vines that are beloved worldwide for their beautiful and fragrant flowers. These blooms come in vibrant shades of red, yellow, purple, orange, and pink. Though many are planted as ornamentals, some species have a more practical use and are harvested for timber.", "40-150 Years", "Tree"));
                plantList.add(new PlantModel.Plant("Dragon trees 'Sunray'", "Dracaena marginata 'Sunray'", "Dragon trees 'Sunray' is a dwarf Dragon tree growing to a maximum height of 2 m in contrast to its parent which grows up to 6 m. This hybrid is known as the 'Sunray' because of its two-colored leaves with green edges and a sunny yellow center. This color scheme is brighter than the plain leaves of the parent plant and makes Sunray a popular choice of houseplant.", "Perennial", "Tree"));
                plantList.add(new PlantModel.Plant("American mountain-ash", "Sorbus americana", "American mountain-ash trees (Sorbus americana) grow native in eastern Canada and New England. They grow clusters of tiny berries that remain on the tree through winter, making american mountain-ash an important food source for wildlife. Moose and deer like to eat its foliage and bark, and various birds are fond of its sour fruits. Its small size and attractive appearance make it a good ornamental tree.", "Perennial", "Tree"));
                break;
            case "Weeds":
                plantList.add(new PlantModel.Plant("Posion Ivy", "Toxicodendron radicans", "Also known as climbing posion ivy, it is known for it climbing abilities. It is toxic and touching may cause dermatitis.", "Perennial", "Vine"));
                plantList.add(new PlantModel.Plant("Pokeweed", "Phytolacca americana", "It has berries that look like a cluster of black grapes. These are very poisonous and should not be eaten. It is considered a pest species by farmers but also grown as an ornamental plant.", "Perennial", "Herb"));
                plantList.add(new PlantModel.Plant("Horseweed", "Erigeron canadensis", "Horseweed is from North America and is an annual plant with a hairy stem, waxy inflorescence, and numerous pointed leaves.", "Annual, Biennial", "Herb"));
                plantList.add(new PlantModel.Plant("Common Dandelion", "Taraxacum officinale", "Found in temperate regions around the world. The most noticeable feature is its fruits, the furry spheres that are easily carried by the wind. They are also not poisonous and are edible and very nutritious", "Perennial", "Herb"));
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
