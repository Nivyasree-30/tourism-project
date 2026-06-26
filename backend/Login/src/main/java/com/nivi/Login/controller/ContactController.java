package com.nivi.Login.controller;

import com.nivi.Login.model.Contact;
import com.nivi.Login.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "*")

public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping("/save")
    public String saveMessage(
            @RequestBody Contact contact) {

        service.save(contact);

        return "Message Sent Successfully";
    }
}