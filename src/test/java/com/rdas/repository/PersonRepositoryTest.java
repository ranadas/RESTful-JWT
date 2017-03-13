package com.rdas.repository;

import com.rdas.ApplicationMain;
import com.rdas.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by x148128 on 13/03/2017.
 * http://source.lishman.com/project/689#card/3328/file/19226
 */
@ContextConfiguration(classes={ApplicationMain.class})
@ActiveProfiles("test")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testThatAKnownUserCanBeSearched(){
        Person personByName = personRepository.findByName("Zack Murphy");
        assertThat(personByName, is(notNullValue()));
        System.out.println(personByName.toString());
    }
}