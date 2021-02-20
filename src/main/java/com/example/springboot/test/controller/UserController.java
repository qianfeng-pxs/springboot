package com.example.springboot.test.controller;


import com.example.springboot.test.bean.User;
import com.example.springboot.test.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
public class UserController {

    @Autowired
    UserServiceImp userService;

    @GetMapping("/allUser")
    public List<User> getAllUser(){

        return userService.getAllUser();
    }


    @RequestMapping("/addUser")
    public int addUser(User user){
        return userService.insertUser(user);
    }


}
