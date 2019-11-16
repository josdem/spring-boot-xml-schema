package com.jos.dem.springboot.xml.schema.service;

import com.jos.dem.entities.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  public Person create(){
    Person person =  new Person();
    person.setFirstName("Jose");
    person.setLastName("Morales");
    person.setAddress("30 Frank Lloyd, Ann Arbor MI 48105");
    return person;
  }

}
