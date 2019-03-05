package com.example.dao.impl;

import com.example.dao.UserDAO;
import com.example.domain.User;

public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User u) {
        System.out.println("User:" + u.toString());
    }

    @Override
    public void delete() {
        System.out.println("delete User");

    }
}
