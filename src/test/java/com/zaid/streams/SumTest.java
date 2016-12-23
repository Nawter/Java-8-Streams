package com.zaid.streams;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static com.zaid.streams.Sum.*;
import static org.junit.Assert.assertEquals;

public class SumTest {
  
  @Test
  public void transformShouldSumAllElementsOfCollection(){
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);
    assertEquals(calculate(numbers), 1+2+3+4+5);     
  }
}
