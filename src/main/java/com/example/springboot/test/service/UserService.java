package com.example.springboot.test.service;

import com.example.springboot.test.bean.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();

    public int insertUser(User user);
}
