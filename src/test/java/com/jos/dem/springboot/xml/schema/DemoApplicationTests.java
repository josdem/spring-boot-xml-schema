package com.jos.dem.springboot.xml.schema;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jos.dem.entities.Person;
import com.jos.dem.springboot.xml.schema.service.PersonService;

@SpringBootTest
class DemoApplicationTests {

  @Autowired
  private PersonService personService;

  @Test
  @DisplayName("Should create person")
  void shouldCreatePerson() {
    Person person = personService.create();

    assertAll("person",
        () -> assertEquals("Jose", person.getFirstName(), "should get first name"),
        () -> assertEquals("Morales", person.getLastName(), "should get last name"),
        () -> assertEquals("30 Frank Lloyd, Ann Arbor MI 48105", person.getAddress(), "should get address")
        );
  }

}
