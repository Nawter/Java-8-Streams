package com.zaid.streams;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static com.zaid.streams.PeopleStas.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PeopleStasTest {
 
  Person sara = new Person("Sara", 4);
      Person viktor = new Person("Viktor", 40);
      Person eva = new Person("Eva", 42);
      List<Person> collection = Arrays.asList(sara, eva, viktor);

      @Test
      public void getStatsShouldReturnAverageAge() {
          assertThat(getStats(collection).getAverage())
                  .isEqualTo((double)(4 + 40 + 42) / 3);
      }

      @Test
      public void getStatsShouldReturnSumOfAges() {
          assertThat(getStats(collection).getSum())
                  .isEqualTo(4 + 40 + 42);
      }
      
      @Test
      public void getStatsShouldReturnMinOfAges() {
          assertThat(getStats(collection).getMin())
                  .isEqualTo(4);
      }
      
      @Test
      public void getStatsShouldReturnMaxOfAges() {
          assertThat(getStats(collection).getMax())
                  .isEqualTo(42);
      }
      
      @Test
      public void getStatsShouldReturnNumberOfPeople() {
          assertThat(getStats(collection).getCount())
                  .isEqualTo(3);
      }
    
  }

