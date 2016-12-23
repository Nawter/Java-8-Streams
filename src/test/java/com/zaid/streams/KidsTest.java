package com.zaid.streams;

import java.util.Arrays;
import java.util.List;
import static com.zaid.streams.Kids.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class KidsTest {

  @Test
  public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
      Person sara = new Person("Sara", 4);
      Person viktor = new Person("Viktor", 40);
      Person eva = new Person("Eva", 42);
      Person anna = new Person("Anna", 5);
      List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
      assertThat(getKidNames(collection))
              .contains("Sara", "Anna")
              .doesNotContain("Viktor", "Eva");
  }

}
