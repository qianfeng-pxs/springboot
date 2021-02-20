package com.example.springboot.test.dao;

import com.example.springboot.test.bean.User;

import java.util.List;

public interface UserMapper {

    public  List<User> getAllUser();

    public int insertUser(User user);
}
