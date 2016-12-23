package com.zaid.streams;

import java.util.Comparator;
import java.util.List;


public class OldPerson {
  
  public static Person getOldestPerson7(List<Person> collection){
    Person oldestPerson = new Person("name", 0);
     for(Person person:collection){
       if (person.getAge() > oldestPerson.getAge())
       {
         oldestPerson=person;
       }
     }
     return oldestPerson;
  }
  
  public static Person getOldestPerson(List<Person> collection){
    return collection
              .stream()
              .max(Comparator.comparing(Person::getAge))
              .get();
              
              
  }
  

}
