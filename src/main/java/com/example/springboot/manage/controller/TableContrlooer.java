package com.example.springboot.manage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("table")
public class TableContrlooer {


    @GetMapping("basicTable")
    public  String basicTable(){
        return "tables/basic_table";
    }


    @GetMapping("dynamicTable")
    public  String dynamicTable(){
        return "tables/dynamic_table";
    }


    @GetMapping("responsiveTable")
    public  String responsiveTable(){
        return "tables/responsive_table";
    }


    @GetMapping("editableTable")
    public  String editableTable(){
        return "tables/editable_table";
    }
}
