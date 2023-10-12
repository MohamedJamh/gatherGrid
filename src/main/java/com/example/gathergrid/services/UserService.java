package com.example.gathergrid.services;

import com.example.gathergrid.dao.UserDAO;
import com.example.gathergrid.domains.User;

public class UserService {
    public static void addUser(User user){
        new UserDAO().save(user);
    }
}
