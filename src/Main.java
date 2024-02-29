import RandomRecources.RandomNumberListGenerator;
import RandomRecources.SortedVerifier;
import SortingAlgorithms.*;
import java.util.Arrays;

/* todo
- learn java documentation techniques
- sorted list checker
- Insertion sort
- Selection sort
- Merge sort
- linked list class
- figure out queue and stack implementations
 */


public class Main {
    public static void main(String[] args) {
        int [] nums = RandomNumberListGenerator.generateArray(0, 100, 200);
        nums = CountingSort.sort(nums, 0, 100);
        System.out.println(SortedVerifier.sortedCorrectly(true, nums));
        System.out.println(Arrays.toString(nums));
    }
}