package com.rdas.repository;

import com.rdas.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rdas on 13/03/2017.
 */
public interface UserRepository extends JpaRepository <User, Long> {
    User findByUsername(String username);
}
