package com.ayush.auth.service;

import com.ayush.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
