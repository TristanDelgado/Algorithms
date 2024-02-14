import RandomRecources.RandomNumberListGenerator;
import RandomRecources.SortedVerifier;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.SelectionSort;
import dpPractice.CoinProblem;
import dpPractice.FibonacciSolutions;

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
        int [] coins = {1, 4, 5};
        System.out.println(CoinProblem.minimum_coins_dpTab(150, coins));
    }


}