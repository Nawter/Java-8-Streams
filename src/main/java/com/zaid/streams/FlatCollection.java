package com.zaid.streams;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class FlatCollection {

  public static List<String> transform7(List<List<String>> collection){
    List<String> newCollection= new ArrayList<String>();
    for(List<String> list:collection ){
      for(String word:list){
        newCollection.add(word);
      }
    }
    return newCollection;
  }
  
  public static List<String> transform(List<List<String>> collection){
    return collection
           .stream()
           .flatMap(value->value.stream())
           .collect(toList());
  
  }  
}
