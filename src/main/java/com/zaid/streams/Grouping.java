package com.zaid.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Grouping {

  public static Map<String, List<Person>> groupByNationality7( List<Person> people){
    Map<String, List<Person>> map = new HashMap<>();   
    for(Person person:people)
    {
      String nationality = person.getNationality();
      if(!map.containsKey(nationality))          
          {
            map.put(nationality, new ArrayList<>());
          }
      map.get(nationality).add(person);
    }
    return map; 
  }
  
  public static Map<String, List<Person>> groupByNationality( List<Person> people){  
    return people.stream().collect(groupingBy(Person::getNationality));
  }
  
}
