package SortingAlgorithms;

public class BubbleSort {

    //Only with Integers arrays
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
    //Only with integer arrays
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
