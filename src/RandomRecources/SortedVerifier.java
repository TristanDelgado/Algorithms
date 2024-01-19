package RandomRecources;

public class SortedVerifier {

    //param: increasing - if increasing put true, if decreasing put false
    public static boolean sortedCorrectly(boolean increasing, int [] nums)
    {
        boolean sorted = true;
        if(increasing)
        {
            for(int i = 1; i < nums.length; i++)
            {
                if(nums[i - 1] > nums[i])
                {
                    sorted = false;
                    break;
                }
            }
        }
        else
        {
            for(int i = 1; i < nums.length; i++)
            {
                if(nums[i - 1] < nums[i])
                {
                    sorted = false;
                    break;
                }
            }
        }
        return sorted;
    }
}
