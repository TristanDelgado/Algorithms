package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    /*

    Time Complexity:
    Average Case: Theta(n lg n)
    Best Case:    Omega(n lg n)
    Worst Case:   O(n lg n)

    Space Complexity:
    Not super efficient because it needs new arrays to store the left and right
    sides of the array all the way down to size 1

    Notes:
    N/A

     */

    public static void sort(int [] toBeSorted)
    {
        int [] left  = new int [toBeSorted.length / 2];
        int [] right = new int [(toBeSorted.length / 2) + (toBeSorted.length % 2)];
        if(toBeSorted.length > 1)
        {
            for(int i = 0; i < toBeSorted.length / 2; i++)
            { left[i] = toBeSorted[i]; }
            for(int i = toBeSorted.length / 2; i < toBeSorted.length; i++)
            {
                right[(i - toBeSorted.length / 2)] = toBeSorted[i];
            }
            sort(left);
            sort(right);
            merge(toBeSorted, left, right);
        }
    }

    private static void merge(int [] toBeSorted, int [] left, int [] right)
    {
        int leftIndex  = 0;
        int rightIndex = 0;
        int toBeSortedIndex = 0;
        while(leftIndex < left.length && rightIndex < right.length)
        {
            if(left[leftIndex] >= right[rightIndex])
            {
                toBeSorted[toBeSortedIndex] = right[rightIndex];
                rightIndex++;
            }
            else
            {
                toBeSorted[toBeSortedIndex] = left[leftIndex];
                leftIndex++;
            }
            toBeSortedIndex++;
        }
        while(leftIndex < left.length)
        {
            toBeSorted[toBeSortedIndex++] = left[leftIndex++];
        }
        while(rightIndex < right.length)
        {
            toBeSorted[toBeSortedIndex++] = right[rightIndex++];
        }
    }
}
