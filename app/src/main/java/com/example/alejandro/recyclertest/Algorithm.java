package com.example.alejandro.recyclertest;

/**
 * Created by Alejandro on 01/02/2017.
 */

public class Algorithm {
    private int image;
    private String title;
    private String description;

    public Algorithm(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
