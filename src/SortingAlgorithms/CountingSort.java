package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {
    /*
    Notes:

    Time Complexity always: Theta(n + k)
    Big Oh(n + k)
    Omega(n + k)

    Space Complexity: N/A
     */


    public static int[] sort(int [] numArray, int min, int max)
    {
        int[] count = new int[max + 1];
        Arrays.fill(count, 0);
        for(int num : numArray)
        {
            count[num]++;
        }
        for(int i = min + 1; i <= max; i++)
        {
            count[i] += count[i - 1];
        }
        int[] sortedNums = new int [numArray.length];
        for(int num : numArray)
        {
            count[num]--;
            sortedNums[count[num]] = num;
        }
        return sortedNums;
    }
}
