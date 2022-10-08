package com.example.myapplication.model;

public class FoodEntity {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    int id;
    String name;
    int image;

    public FoodEntity(int id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public FoodEntity() {
    }
}
