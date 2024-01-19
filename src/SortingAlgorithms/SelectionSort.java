package SortingAlgorithms;

public class SelectionSort {

    //input: integer nums array
    //sorts from smallest to largest
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
