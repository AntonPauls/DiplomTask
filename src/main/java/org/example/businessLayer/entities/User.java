package org.example.businessLayer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.*;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    protected long id;
    protected String name_user;
    protected String sure_name;
    protected String email;
    protected RoleUser role_user;
    protected String password;
    protected ArrayList<Publication> list_publications;
    protected ArrayList<Conference> list_conferences;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getSure_name() {
        return sure_name;
    }

    public void setSure_name(String sure_name) {
        this.sure_name = sure_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleUser getRole_user() {
        return role_user;
    }

    public void setRole_user(RoleUser role_user) {
        this.role_user = role_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Publication> getList_publications() {
        return list_publications;
    }

    public void setList_publications(ArrayList<Publication> list_publications) {
        this.list_publications = list_publications;
    }

    public ArrayList<Conference> getList_conferences() {
        return list_conferences;
    }

    public void setList_conferences(ArrayList<Conference> list_conferences) {
        this.list_conferences = list_conferences;
    }
}
