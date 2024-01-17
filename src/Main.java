import RandomRecources.RandomNumberListGenerator;
import SortingAlgorithms.BubbleSort;

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

        int [] numArray = RandomNumberListGenerator.generateArray(1, 10, 10);
        int [] increasingArray;
        int [] decreasingArray;
        increasingArray = numArray.clone();
        decreasingArray = numArray.clone();

        BubbleSort.sortIncreasing(increasingArray);
        BubbleSort.sortDecreasing(decreasingArray);

        System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.toString(increasingArray));
        System.out.println(Arrays.toString(decreasingArray));
    }
}