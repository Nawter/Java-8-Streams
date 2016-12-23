package com.zaid.streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCollection {

  public static List<String> transform7(List<String> collection){    
    List<String> newCollection=new ArrayList<String>();
    for(String word:collection)
    {   
      if (word.length() < 4){
        newCollection.add(word);
      }      
    }    
    return newCollection;    
  }
  
  public static List<String> transform(List<String> collection){    
    return collection
        .stream()
        .filter(word->word.length()<4)
        .collect(toList());
  }
  
  
  
  
}
