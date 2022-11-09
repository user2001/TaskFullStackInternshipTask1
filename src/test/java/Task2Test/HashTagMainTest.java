package Task2Test;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.*;

import static Task2.HashTagMain.toFind5MostPopularWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class HashTagMainTest {
    @Test
    public void toFind5MostPopularWordsTest() {
        List<String> actual1 = new ArrayList<>();
        Collections.addAll(actual1, "#Iva live #norm life It's #norm",
                "#Iva knows #many #books #Many", "#Iva #Books are #really #great",
                "#Many words #great and #books", "#great", "#great", "#great", "#Iva", "#want to know",
                "#Books", "#norm", "#life", "#norm", "#life", "#norm", "#life", "#norm", "#life");
        Map<String, Long> expected1 = new HashMap<>();
        expected1.put("#great", 5L);
        expected1.put("#life", 4L);
        expected1.put("#books", 4L);
        expected1.put("#iva", 4L);
        expected1.put("#norm", 5L);
        assertEquals(expected1, toFind5MostPopularWords(actual1));
    }
}
