package com.example.digitalshowcase.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity // entity va lega aceasta clasa catre baza de date
public class Project implements Serializable { // extinde Serializable pt a ajuta procesul de transfer catre API in format JSON
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String description;
    private String thumbnail;
    private String website;

    public Project() {}

    public Project (String title, String description, String thumbnail, String website){
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.website = website;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public void setThumbnail(String thumbnail){
        this.thumbnail = thumbnail;
    }

    public String getWebsite(){
        return website;
    }

    public void setWebsite(String website){
        this.website = website;
    }


}
