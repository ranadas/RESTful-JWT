package com.rdas.service;

import com.rdas.model.Person;
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

    @PostConstruct
    public void init() {
        persons = new ArrayList<>();
        persons.add(new Person("Hello", "World"));
        persons.add(new Person("Foo", "Bar"));
    }

    public List<Person> getAllPersons() {
        return persons;
    }
}
