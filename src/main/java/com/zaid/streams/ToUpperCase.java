package com.zaid.streams;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ToUpperCase {

  public static List<String> transform7(List<String> collection){
    List<String> newCollection=new ArrayList<String>();
    for(String arg:collection)
    {
      newCollection.add(arg.toUpperCase());
    }
    return newCollection;    
  }
  
  public static List<String> transform(List<String> collection){
    return collection
        .stream()
        .map(name->name.toUpperCase())
        .collect(toList());
        
  }
  
}
