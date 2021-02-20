package com.example.springboot.manage.controller;


import com.example.springboot.manage.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @GetMapping(value = {"/","login"})
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String toIndex(User user, HttpSession session, Model model){
        if(StringUtils.isEmpty(user.getUserName())|StringUtils.isEmpty(user.getPassword())){
            model.addAttribute("msg","请输入用户名和密码");
            return "login";
        }
        if("admin".equals(user.getUserName())&&"admin".equals(user.getPassword())){
            session.setAttribute("user",user);
            return "redirect:/index";
        }else {
            model.addAttribute("msg","用户名密码错误");
            return "login";
        }
    }

    @GetMapping("index")
    public String index(HttpSession session,Model model){
        Object user = session.getAttribute("user");
        if(user!=null){
            return "index";
        }else {
            model.addAttribute("msg","请重新登录");
            return "login";
        }
    }




}
