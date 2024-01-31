package SortingAlgorithms;

public class SelectionSort {
    /*

    Time Complexity:
    Average case: Theta(n^2)
    Best case:    Omega(n^2)
    Worst case:   O(n^2)

    Space Complexity:

    Notes:
    sorts from smallest to largest

     */
    public static void sort(int [] nums)
    {
        int min;
        int temp;
        int minIndex;
        for(int i = 0; i < nums.length - 1; i++)
        {
            min = nums[i];
            minIndex = i;
            for(int j = i + 1; j < nums.length; j++)
            {
                if(min > nums[j])
                {
                    min = nums[j];
                    minIndex = j;
                }
            }
            if(min != nums[i])
            {
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
