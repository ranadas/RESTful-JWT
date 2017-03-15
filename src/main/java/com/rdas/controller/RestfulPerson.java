package com.rdas.controller;

import com.rdas.model.Person;
import com.rdas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by rdas on 13/03/2017.
 */
@RestController
public class RestfulPerson {

    @Autowired
    private PersonService personService;

    private List<Person> persons;

    @PostConstruct
    public void init() {
        persons = personService.getAllPersons();
    }

    @RequestMapping(path = "/persons", method = RequestMethod.GET)
    public List<Person> getPersons() {
        return persons;
    }

    @RequestMapping(path = "/persons/{name}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("name") String name) {
        return persons.stream()
                .filter(person -> name.equalsIgnoreCase(person.getName()))
                .findAny().orElse(null);
    }

    @RequestMapping(path = "/persons/add", method = RequestMethod.POST)
    public Person add(@RequestBody Person person) {
        return personService.saveAsNew(person);
    }
}
