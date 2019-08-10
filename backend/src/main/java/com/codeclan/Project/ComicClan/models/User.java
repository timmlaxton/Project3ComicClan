package com.codeclan.Project.ComicClan.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "alias")
    private String alias;

    @Column(name = "comics")
    private ArrayList<Comic> comics;

    @JsonIgnoreProperties("users")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Review> reviews;


    public User(String name, String alias) {
        this.name = name;
        this.alias = alias;
        this.comics = new ArrayList<Comic>();
        this.reviews = new ArrayList<Review>();
    }

    public User(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public void setComics(ArrayList<Comic> comics) {
        this.comics = comics;
    }

    public void addComic(Comic comic){
        this.comics.add(comic);
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReviews(Review review){
        this.reviews.add(review);
    }
}
