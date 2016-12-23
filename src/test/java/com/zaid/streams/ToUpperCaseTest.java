package com.zaid.streams;


import static com.zaid.streams.ToUpperCase.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
Convert elements of a collection to upper case.
 */
public class ToUpperCaseTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        List<String> expected = Arrays.asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertEquals(transform(collection),expected);
    }

   

   

}