package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    /*

    Time Complexity:
    Average: Theta(n lg n)
    Best:    Omega(n lg n)
    Worst:   O(n^2)

    Space Complexity:
    Sorts in place

    Notes:

     */
    public static void sort(int [] nums)
    {
        recursiveSort(nums, 0, nums.length - 1);
    }
    private static void recursiveSort(int [] nums, int minIndex , int maxIndex) //maxIndex on a 0-base index
    {
        if((maxIndex - minIndex) > 1)
        {
            int pivotIndex = partition(nums, minIndex, maxIndex);
            recursiveSort(nums, minIndex, pivotIndex - 1); //left side
            recursiveSort(nums, pivotIndex + 1, maxIndex); //right side
        }
    }
    public static int partition(int [] nums, int minIndex, int maxIndex) //maxIndex on a 0-base index
    {
            int pivotValue = nums[maxIndex];
            int edgeSmallerSide = (minIndex - 1);
            int temp;
            for(int i = minIndex; i < maxIndex; i++)
            {
                if(nums[i] <= pivotValue)
                {
                    edgeSmallerSide++;
                    temp = nums[i];
                    nums[i] = nums[edgeSmallerSide];
                    nums[edgeSmallerSide] = temp;
                }
            }
            nums[maxIndex] = nums[edgeSmallerSide + 1];
            nums[edgeSmallerSide + 1] = pivotValue;
            return edgeSmallerSide + 1;
    }
}
