package SortingAlgorithms;

public class BubbleSort {
    /*

    Time Complexity:
    Best Case: Omega(n)
    Worst Case: O(n^2)

    Space Complexity:
    N/A

    Notes:
    N/A

     */
    static public void sortIncreasing(int [] nums)
    {
        boolean sorted = false;
        int tempNum;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0; i < nums.length - 1; i++)
            {
                if(nums[i] > nums[i + 1])
                {
                    tempNum = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tempNum;
                    sorted = false;
                }
            }
        }
    }
    static public void sortDecreasing(int [] nums)
    {
        boolean sorted = false;
        int tempNum;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0; i < nums.length - 1; i++)
            {
                if(nums[i] < nums[i + 1])
                {
                    tempNum = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tempNum;
                    sorted = false;
                }
            }
        }
    }
}
