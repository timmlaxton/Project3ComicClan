package com.codeclan.Project.ComicClan.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "date")
    private Date date;

    @Column(name="review")
    private String review;

    @Column(name = "rating")
    private double rating;

    @JsonIgnoreProperties("reviews")
    @ManyToOne
    @JoinColumn(name = "comic_id", nullable = false)
    private Comic comic;

    @JsonIgnoreProperties("reviews")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Review(Date date, String review, double rating, Comic comic, User user) {
        this.date = date;
        this.review = review;
        this.rating = rating;
        this.comic = comic;
        comic.addReviews(this);
        this.user = user;
        user.addReviews(this);
        comic.getAverageRating();
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
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
