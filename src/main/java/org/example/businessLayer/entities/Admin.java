package org.example.businessLayer.entities;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    User create_user(){
        return new User();
    }

    void delete_user(){}

    void change_role_by_user(User user){

    }
}
