package com.zaid.streams;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Kids {
  
  public static List<String> getKidNames7(List<Person> people){
    List<String> kids=new ArrayList<String>();
    for(Person person:people)
    {
      if (person.getAge() < 18)
      {
        kids.add(person.getName());
      }      
    }
    return kids;
  }
  
  public static List<String> getKidNames(List<Person> people){
    return people
            .stream()
            .filter(kids -> kids.getAge() < 18)
            .map(kids -> kids.getName())
            .collect(toList());
  }
  
}
