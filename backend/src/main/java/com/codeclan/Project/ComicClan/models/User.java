package com.codeclan.Project.ComicClan.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "alias")
    private String alias;

    @JsonIgnore
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "comics_reviews",
            joinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "comic_id", nullable = false, updatable = false)}
    )
    private List<Comic> comics;

//    @JsonIgnore
//    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
//    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
//    @Column(name = "reviews")
//    private List<Review> reviews;


    public User(String name, String alias) {
        this.name = name;
        this.alias = alias;
        this.comics = new ArrayList<Comic>();
//        this.reviews = new ArrayList<Review>();
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

    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

//    public List<Review> getReviews() {
//        return this.reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }
}
