package com.codeclan.Project.ComicClan.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "publishers")
public class Publisher implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @JsonIgnoreProperties("publishers")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Comic> comics;

    @Column(name = "logo")
    private String logo;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;

    public Publisher(String name, String logo) {
        this.name = name;
        this.comics = new ArrayList<Comic>();
        this.logo = logo;

    }

    public Publisher() {
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Comic> getComics() {
        return comics;
    }

    public void setComics(ArrayList<Comic> comics) {
        this.comics = comics;
    }
    public void addComic(Comic comic){
        this.comics.add(comic);
    }
}

