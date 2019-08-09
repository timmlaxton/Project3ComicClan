//package com.codeclan.Project.ComicClan.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.hibernate.annotations.Cascade;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.ArrayList;
//
//@Entity
//@Table(name="personas")
//public class Persona implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long Id;
//
//    @Column(name="name")
//    private String name;
//
//    @Column(name="alias")
//    private String alias;
//
//    @Column(name="super_Power")
//    private String superPower;
//
//    @Column(name="first_Appearance")
//    private String firstAppearance;
//    @JsonIgnoreProperties("personas")
//    @ManyToMany
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            joinColumns = {@JoinColumn(name = "persona_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "comic_id", nullable = false, updatable = false)}
//    )
//    private ArrayList<Comic> comics;
//
//    public Persona(String name, String alias, String superPower, String firstAppearance) {
//        this.name = name;
//        this.alias = alias;
//        this.superPower = superPower;
//        this.firstAppearance = firstAppearance;
////        this.comics = new ArrayList<Comic>();
//    }
//
//    public Persona(){
//
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
//    public String getAlias() {
//        return alias;
//    }
//
//    public void setAlias(String alias) {
//        this.alias = alias;
//    }
//
//    public String getSuperPower() {
//        return superPower;
//    }
//
//    public void setSuperPower(String superPower) {
//        this.superPower = superPower;
//    }
//
//    public String getFirstAppearance() {
//        return firstAppearance;
//    }
//
//    public void setFirstAppearance(String firstAppearance) {
//        this.firstAppearance = firstAppearance;
//    }
//
//    public void addComic(Comic comic){
//        this.comics.add(comic);
//    }
//
//
//}


