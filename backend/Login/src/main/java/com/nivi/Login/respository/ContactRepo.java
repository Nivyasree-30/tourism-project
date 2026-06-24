package com.nivi.Login.respository;

import com.nivi.Login.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo
        extends JpaRepository<Contact,Integer> {
}