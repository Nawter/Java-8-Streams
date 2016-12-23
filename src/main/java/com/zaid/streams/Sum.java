package com.zaid.streams;

import java.util.List;

public class Sum {

  public static int calculate7(List<Integer> numbers){
    int sum=0;
    for(int number:numbers){
      sum=sum+number;
    }
    return sum;
  }
  
  public static int calculate(List<Integer> numbers){
    return numbers
        .stream()
        .reduce(0,(total,number)->total+number);
  }
}
