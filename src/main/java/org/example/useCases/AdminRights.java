package org.example.useCases;

import org.example.entities.Admin;
import org.example.entities.User;

public class AdminRights extends Admin {

    void createUserWithRoles(){}
    User create_user(){
        return new User();
    }

    void delete_user(){}

    void change_role_by_user(User user){
    }
}
