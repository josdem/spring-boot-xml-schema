package com.jos.dem.springboot.xml.schema.service;

import com.jos.dem.entities.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  public Person create(){
    Person person =  new Person();
    return person;
  }

}
