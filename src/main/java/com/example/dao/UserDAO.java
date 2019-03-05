package com.example.dao;

import com.example.domain.User;

public interface UserDAO {
    void save(User u);

    void delete();
}
