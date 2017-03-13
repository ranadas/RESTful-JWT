package com.rdas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by x148128 on 13/03/2017.
 */
@Configuration
@EnableJpaRepositories(basePackages="com.rdas.repository")
public class RepositoryConfig {

}