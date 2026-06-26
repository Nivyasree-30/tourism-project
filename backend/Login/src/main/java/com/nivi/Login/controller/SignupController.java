package com.nivi.Login.controller;

import com.nivi.Login.model.User;
import com.nivi.Login.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
@CrossOrigin(origins = "*")

public class SignupController {

    @Autowired
    private SignupService service;

    @PostMapping("/save")
      public String saveUser(@RequestBody User user) {

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());

        service.save(user);

        return "Success";
    }
}