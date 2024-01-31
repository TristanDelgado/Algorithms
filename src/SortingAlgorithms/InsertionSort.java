package SortingAlgorithms;

public class InsertionSort {
    /*

    Time Complexity:
    Average Case: Theta(n^2)
    Best Case: Omega(n)
    Worst Case: O(n^2)

    Space Complexity:
    N/A

    Notes:
    Not sure if most efficient, but it works
    Sorts from smallest to largest

     */
    public static void sort(int [] nums)
    {
        int indexOfCorrectPlace;
        int tempNum;
        for(int i = 1; i < nums.length; i++)
        {
            indexOfCorrectPlace = -1;
            for(int j = i - 1; j >= 0; j--)
            {
                if(nums[j] < nums[i])
                {
                    indexOfCorrectPlace = j + 1;
                    j = -1;
                }
            }
            if(indexOfCorrectPlace == -1)
            {indexOfCorrectPlace = 0;}
            if(indexOfCorrectPlace != i)
            {
                tempNum = nums[i];
                for(int k = i; k > indexOfCorrectPlace; k--)
                {
                    nums[k] = nums[k - 1];
                }
                nums[indexOfCorrectPlace] = tempNum;
            }
        }
    }
}
