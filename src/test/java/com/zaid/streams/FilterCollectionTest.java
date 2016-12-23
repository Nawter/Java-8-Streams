package com.zaid.streams;

import org.junit.Test;

import java.util.List;

import static com.zaid.streams.FilterCollection.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionTest {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertEquals(transform(collection),expected);
    }

}
