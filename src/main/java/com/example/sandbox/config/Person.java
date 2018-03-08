package com.example.sandbox.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
public class Person {

  private String name;
  private ObjectId _id;
  private int age;

}
