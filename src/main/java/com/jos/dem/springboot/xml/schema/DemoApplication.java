package com.jos.dem.springboot.xml.schema;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.jos.dem.springboot.xml.schema.service.PersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  CommandLineRunner start(PersonService personService){
    return args -> {
      log.info("Person: {}", ToStringBuilder.reflectionToString(personService.create()));
    };
  }

}
