package com.zaid.streams;


import java.util.IntSummaryStatistics;
import java.util.List;


public class PeopleStas {
  
  public static Stats getStats7(List<Person> people)
  {
    int sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int age =0;
    for(Person person:people)
    {
      age = person.getAge();
      sum += age;
      min = Math.min(min, age);
      max = Math.max(max, age);
    }
    return new Stats(people.size(), sum, min, max);
  }
  
  public static IntSummaryStatistics getStats(List<Person> people)
  {
    return people
        .stream()
        .mapToInt(Person::getAge)
        .summaryStatistics();    
  }

}
