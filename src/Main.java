import RandomRecources.RandomNumberListGenerator;
import RandomRecources.SortedVerifier;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.SelectionSort;

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

        int [] numArray = RandomNumberListGenerator.generateArray(1, 10, 150);
        int [] increasingArray;
        int [] decreasingArray;
        increasingArray = numArray.clone();
        decreasingArray = numArray.clone();

        MergeSort.sort(increasingArray);
        System.out.println(SortedVerifier.sortedCorrectly(true, increasingArray));

        System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.toString(increasingArray));
        //System.out.println(Arrays.toString(decreasingArray));
    }
}