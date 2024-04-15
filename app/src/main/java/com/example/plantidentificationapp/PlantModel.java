package com.example.plantidentificationapp;

public class PlantModel {

    public static class Plant {
        private String Name;
        private String Scientific_name;
        private String  Description;
        private String Lifespan;

        private String Type;
        private int imageResourceID;



        public Plant(String Name, String Scientific_name, String Description, String Lifespan, String Type, int ImageResourceId) {
            this.Name = Name;
            this.Scientific_name = Scientific_name;
            this.Description = Description;
            this.Lifespan = Lifespan;
            this.Type = Type;
            this.imageResourceID = ImageResourceId;
        }

        public String getName() {

            return Name;
        }

        public void setName(String Name) {

            this.Name = Name;
        }

        public String getScientific_name() {

            return Scientific_name;
        }

        public void setScientific_name(String Scientific_name) {
            this.Scientific_name = Scientific_name;
        }

        public String getDescription() {

            return Description;
        }

        public void setDescription(String Description) {

            this.Description = Description;
        }
        public String getLifespan() {

            return Lifespan ;
        }

        public void setLifespan(String Lifespan) {

            this.Lifespan = Lifespan;
        }

        public String getType() {

            return Type ;
        }

        public void setType(String Type) {

            this.Type = Type;
        }

        public int getImageResourceId() {
            return imageResourceID;
        }

        public void setImageResourceId(int imageResourceId) {
            imageResourceId = imageResourceId;
        }

}
}
