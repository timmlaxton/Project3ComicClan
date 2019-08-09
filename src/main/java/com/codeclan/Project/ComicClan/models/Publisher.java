//package com.codeclan.Project.ComicClan.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.hibernate.annotations.Cascade;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//
//public class Publisher {
//
//    @Column(name = "name")
//    private String name;
//
//    @JsonIgnoreProperties("comics")
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
//    private ArrayList<Comic> comics;
//
//    @Column(name = "logo")
//    private String logo;
//
//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
//    private Long Id;
//
//    public Publisher(String name) {
//        this.name = name;
//        this.comics = new ArrayList<Comic>();
//        this.logo = logo;
//
//    }
//
//    public Publisher() {
//    }
//
//    public String getLogo() {
//        return logo;
//    }
//
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//
//    public Long getId() {
//        return Id;
//    }
//
//    public void setId(Long id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public ArrayList<Comic> getComics() {
//        return comics;
//    }
//
//    public void setComics(ArrayList<Comic> comics) {
//        this.comics = comics;
//    }
//    public void addComic(Comic comic){
//        this.comics.add(comic);
//    }
//}

