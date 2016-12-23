package com.zaid.streams;



import org.junit.Test;

import java.util.List;

import static com.zaid.streams.FlatCollection.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/*
 * Flatten multidimensional collection
 */
public class FlatCollectionTest {

  @Test
  public void transformShouldFlattenCollection() {
    List<List<String>> collection = asList(asList("Viktor", "Farcic"),
        asList("John", "Doe", "Third"), asList("Zaid", "Alissa", "AlMaliki"));
    List<String> expected =
        asList("Viktor", "Farcic", "John", "Doe", "Third", "Zaid", "Alissa", "AlMaliki");
    assertEquals(transform(collection),expected);
  }

}
