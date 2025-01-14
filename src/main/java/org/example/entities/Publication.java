package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String title;
    private int year_publication;
    private String type_publication;
    private String author_publication;
    private String data_source;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_publication() {
        return year_publication;
    }

    public void setYear_publication(int year_publication) {
        this.year_publication = year_publication;
    }

    public String getType_publication() {
        return type_publication;
    }

    public void setType_publication(String type_publication) {
        this.type_publication = type_publication;
    }

    public String getAuthor_publication() {
        return author_publication;
    }

    public void setAuthor_publication(String author_publication) {
        this.author_publication = author_publication;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source;
    }
}
