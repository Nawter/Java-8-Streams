package com.zaid.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.zaid.streams.Partition.*;

/*
Partition adults and kids
 */
public class PartitionTest {
    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);
        assertThat(result.get(true)).hasSameElementsAs(Arrays.asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(Arrays.asList(sara));
    }
}

