package com.zaid.streams;

import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static com.zaid.streams.OldPerson.*;



import org.junit.Test;



public class OldPersonTest {
  
  @Test
  public void getOldestPersonShouldReturnOldestPerson(){
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    assertEquals(getOldestPerson7(collection).getAge(),eva.getAge());
  }

}
