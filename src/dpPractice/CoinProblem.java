package dpPractice;

public class CoinProblem {
    /*
    Based on the coin problem
    Ex:
    Given coins with values {1, 4, 5} give the minimum coins needed
    to get the value 13
     */

    //Recursive approach
    public static int minimum_coins_rec(int targetSum, int [] coinValues)
    {
        int numCoinsNeeded = -1;
        if(targetSum == 0)
        {
            numCoinsNeeded = 0;
        }
        else
        {
            for(int coinVal : coinValues)
            {
                System.out.println("NumCoinsNeeded Value: " + numCoinsNeeded);
                int subProblem = targetSum - coinVal;
                if(subProblem < 0)
                    continue;
                numCoinsNeeded = min_ignore_none(numCoinsNeeded, minimum_coins_rec(subProblem, coinValues) + 1);
            }
        }
        return numCoinsNeeded;
    }

    private static int min_ignore_none(int a, int b)
    {
        if(a == -1)
            return b;
        if(b == -1)
            return a;
        return Integer.min(a, b);
    }
}
