package com.nivi.Login.service;

import com.nivi.Login.model.Contact;
import com.nivi.Login.respository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepo repo;

    public void save(Contact contact) {
        repo.save(contact);
    }
}
