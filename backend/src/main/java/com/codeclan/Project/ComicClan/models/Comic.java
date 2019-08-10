package com.codeclan.Project.ComicClan.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "comics")
public class Comic implements Serializable {

    @Column(name = "writer")
    private String writer;

    @Column(name = "artist")
    private String artist;

    @Column(name ="colourer")
    private String colourer;

    @Column(name = "letter")
    private String letterer;

    @Column(name = "genre")
    private String genre;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonIgnoreProperties("comics")
    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    @JsonIgnoreProperties("comics")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "comic_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "persona_id", nullable = false, updatable = false)}
    )
    private List<Persona> personas;

    @JsonIgnoreProperties("comics")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @OneToMany(mappedBy = "comic", fetch = FetchType.LAZY)
    private List<Review> reviews;

    @Column(name = "ratings")
    private Double rating;


    public Comic(String writer, String artist, String colourer, String letterer, Publisher publisher, String genre) {
        this.writer = writer;
        this.artist = artist;
        this.colourer = colourer;
        this.letterer = letterer;
        this.publisher = publisher;
        this.genre = genre;
        this.personas = new ArrayList<Persona>();
        this.reviews = new ArrayList<Review>();
        this.rating = rating;
    }

    public Comic() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getColourer() {
        return colourer;
    }

    public void setColourer(String colourer) {
        this.colourer = colourer;
    }

    public String getLetterer() {
        return letterer;
    }

    public void setLetterer(String letterer) {
        this.letterer = letterer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void addReviews(Review review){
        this.reviews.add(review);
    }

    public int getReviewsAmount() {
        return this.reviews.size();
    }
}



