package com.thiagodev.delivery.repository;

import com.thiagodev.delivery.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}
