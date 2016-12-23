package com.zaid.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.zaid.streams.Grouping.*;

public class GroupingTest { 

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(Arrays.asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(Arrays.asList(viktor));
    }
}
