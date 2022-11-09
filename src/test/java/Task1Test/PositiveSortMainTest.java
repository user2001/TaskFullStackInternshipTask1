package Task1Test;

import org.junit.jupiter.api.Test;

import static Task1.PositiveSortMain.positiveDescSorter;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class PositiveSortMainTest {

    @Test
    public void positiveDescSorterTest() {
        int[] expected=new int[]{7, 5, 4, 0};
        int[] actual=positiveDescSorter(new int[]{4, -1, 0, 5, 7, -5});
        assertArrayEquals(expected,actual);
    }
}
