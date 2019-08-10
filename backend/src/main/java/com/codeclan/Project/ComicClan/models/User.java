package com.codeclan.Project.ComicClan.models;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String name;


    private String alias;


    private List<Comic> comics;


    private List<Review> reviews;


    public User(String name, String alias) {
        this.name = name;
        this.alias = alias;
        this.comics = new ArrayList<Comic>();
        this.reviews = new ArrayList<Review>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Comic> getComics() {
        return this.comics;
    }

    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
