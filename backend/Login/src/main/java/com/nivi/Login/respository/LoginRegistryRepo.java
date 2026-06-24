package com.nivi.Login.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nivi.Login.model.LoginRegistry;

public interface LoginRegistryRepo extends JpaRepository<LoginRegistry, Integer> {

}
