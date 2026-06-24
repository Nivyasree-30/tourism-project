package com.nivi.Login.service;

import com.nivi.Login.model.LoginRegistry;
import com.nivi.Login.respository.LoginRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRegistryRepo LoginRegistryRepo;
    
    public List<LoginRegistry> enrolled() {
        return LoginRegistryRepo.findAll();
    }
    

    public void enroll(String username, String password) {
        LoginRegistry loginRegistry = new LoginRegistry(username,password);
        LoginRegistryRepo.save(loginRegistry);

    }

//    public void enrolled(String username, String password) {
//    }
}
