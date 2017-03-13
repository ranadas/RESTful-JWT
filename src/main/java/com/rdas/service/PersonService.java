package com.rdas.service;

import com.rdas.model.Person;
import com.rdas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdas on 13/03/2017.
 */
@Service
public class PersonService {

    private List<Person> persons;

    @Autowired
    private PersonRepository  personRepository;

    @PostConstruct
    public void init() {
        persons = new ArrayList<>();
        persons.add(new Person(1L, "Hello", "World"));
        persons.add(new Person(2L, "Foo", "Bar"));
        System.out.println(personRepository);
    }

    public List<Person> getAllPersons() {
        return persons;
    }
}
