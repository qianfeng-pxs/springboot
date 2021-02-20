package com.example.springboot.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

   private Integer id;
   private String name;
   private String password;
   private String sex;
   private String email;
   private String role;

}
