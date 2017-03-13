package com.rdas.repository;

import com.rdas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rdas on 13/03/2017.
 */
public interface PersonRepository extends JpaRepository <Person, Long> {
    Person findByName(String name);
}
