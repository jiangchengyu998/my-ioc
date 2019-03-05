package com.example.service;

import com.example.dao.UserDAO;
import com.example.domain.User;

public class UserService {
    private UserDAO userDAO;

    public void addUser(User u) {
        this.userDAO.save(u);
    }

    /**
     * @return the userDAO
     */
    public UserDAO getUserDAO() {
        return userDAO;
    }

    /**
     * @param userDAO the userDAO to set
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
