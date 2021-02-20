package com.example.springboot.test.service;


import com.example.springboot.test.bean.User;
import com.example.springboot.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {




    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser(){
       return userMapper.getAllUser();
    }

    @Override
    public int insertUser(User user){
        return userMapper.insertUser(user);
    }


}
