package com.rdas.config;

import com.rdas.model.Person;
import com.rdas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by rdas on 13/03/2017.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends GlobalAuthenticationConfigurerAdapter { //extends WebSecurityConfigurerAdapter {
    @Autowired
    private PersonRepository personRepository;

//    @Bean
//    UserDetailsService userDetailsService() {
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                Person account = personRepository.findByName(username);
//                if (account != null) {
//                    return new User(account.getName(), account.getPassword(), true, true, true, true, AuthorityUtils.createAuthorityList("USER"));
//                } else {
//                    throw new UsernameNotFoundException("could not find the user '" + username + "'");
//                }
//            }
//        };
//    }
}
