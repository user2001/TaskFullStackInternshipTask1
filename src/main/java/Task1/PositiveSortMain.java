package Task1;

import java.util.Arrays;
import java.util.Collections;

public class PositiveSortMain {
    public static void main(String[] args) {

        int[] arr = new int[]{4, -1, 0, 7, -5};
        positiveDescSorter(arr);
    }

    /**
     * method takes array of ints and return sorted array of ints in descending order
     * and plus it should contain only positive numbers(>=0)
     * @param startArray
     * @return arrDesc
     */
    public static int[] positiveDescSorter(int[] startArray) {
        int[] arrDesc = Arrays.stream(startArray)
                .filter(a -> a >= 0).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arrDesc));
        return arrDesc;
    }
}