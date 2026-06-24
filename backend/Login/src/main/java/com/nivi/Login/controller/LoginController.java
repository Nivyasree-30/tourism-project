package com.nivi.Login.controller;

import com.nivi.Login.model.LoginRegistry;
import com.nivi.Login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500")

public class LoginController {
    @Autowired
    LoginService loginservice;
    @GetMapping("Login")

    public List<LoginRegistry>enrolled(){
        return loginservice.enrolled();


    }
    @PostMapping("/Login/register")
    public String enroll(@RequestBody LoginRegistry loginRegistry) {

        loginservice.enroll(
                loginRegistry.getUsername(),
                loginRegistry.getPassword()
        );

        return "Login Successfully";
    }

    }


