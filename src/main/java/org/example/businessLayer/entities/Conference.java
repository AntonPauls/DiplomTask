package org.example.businessLayer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.TimeZone;

@Entity
public class Conference {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String title_conf;
    private TimeZone time_zone;

    private ArrayList<User> list_users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle_conf() {
        return title_conf;
    }

    public void setTitle_conf(String title_conf) {
        this.title_conf = title_conf;
    }

    public TimeZone getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(TimeZone time_zone) {
        this.time_zone = time_zone;
    }

    public ArrayList<User> getList_users() {
        return list_users;
    }

    public void setList_users(ArrayList<User> list_users) {
        this.list_users = list_users;
    }
}
