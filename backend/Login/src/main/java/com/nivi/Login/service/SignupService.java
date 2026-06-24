package com.nivi.Login.service;

import com.nivi.Login.model.User;
import com.nivi.Login.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    private UserRepository repository;

    public String save(User user){

        if(repository.findByEmail(user.getEmail()) != null){
            return "Email already exists";
        }

        repository.save(user);

        return "Registration Successful";
    }
}