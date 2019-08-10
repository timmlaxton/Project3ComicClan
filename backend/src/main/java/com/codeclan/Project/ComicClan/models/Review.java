package com.codeclan.Project.ComicClan.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "date")
    private Date date;

    @Column(name = "rating")
    private int rating;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "comic_id", nullable = false)
    private Comic comic;

    @JsonIgnoreProperties("reviews")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Review(Date date, int rating, Comic comic, User user) {
        this.date = date;
        this.rating = rating;
        this.comic = comic;
        comic.addReviews(this);
        this.user = user;
        user.addReviews(this);
    }

    public Review(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
