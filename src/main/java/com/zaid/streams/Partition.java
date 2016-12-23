package com.zaid.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Partition {

  public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people)
  {
      Map<Boolean, List<Person>> partitions = new HashMap<>();
      partitions.put(true, new ArrayList<>());
      partitions.put(false, new ArrayList<>());    
      for(Person person:people)
      {
        partitions.get(person.getAge() >= 18).add(person);
      }
      return partitions;    
  }
  
  public static Map<Boolean, List<Person>> partitionAdults(List<Person> people)
  {
    return people
        .stream()
        .collect(partitioningBy(person->person.getAge() >= 18));
  }
}
