package com.example.ufoodapp;

import android.media.Image;

public class Resuaurant {

    private int image;
    private String name;
    private String location;

    public Resuaurant(String name, String location, int image) {
        this.image = image;
        this.name = name;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}