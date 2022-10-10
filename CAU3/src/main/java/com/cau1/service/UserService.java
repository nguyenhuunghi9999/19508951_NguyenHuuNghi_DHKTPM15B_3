package com.cau1.service;


import com.cau1.auth.UserPrincipal;
import com.cau1.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}

