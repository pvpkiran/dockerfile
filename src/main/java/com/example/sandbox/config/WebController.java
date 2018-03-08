package com.example.sandbox.config;

import com.google.common.collect.Lists;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

  private final PersonRepository personRepository;

  public WebController(final PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @GetMapping("/hello")
  public String sayHello() {
    return "hello";
  }

  @GetMapping("/initialize")
  public List<Person> initialize() {

    Person person1 = new Person();
    person1.setName("phani");person1.setAge(10);

    Person person2 = new Person();
    person2.setName("kiran");person1.setAge(20);

    return personRepository.insert(Lists.newArrayList(person1, person2));
  }


  @GetMapping("/findal")
  public List<Person> findall() {
    return personRepository.findAll();
  }
}
