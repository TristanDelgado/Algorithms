package dpPractice;

import java.util.HashMap;

public class CoinProblem {
    /*
    Based on the coin problem
    Ex:
    Given coins with values {1, 4, 5} give the minimum coins needed
    to get the value 13


    Time Complexity for dp algorithm: O(M*K)
    where M is target sum and k is number of coins
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
                int subProblem = targetSum - coinVal;
                if(subProblem < 0)
                    continue;
                numCoinsNeeded = min_ignore_none(numCoinsNeeded, (minimum_coins_rec(subProblem, coinValues) + 1));
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

    //Coin problem using dp (memoization)
    public static int minimum_coins_dp(int targetSum, int [] coinValues)
    {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return minimum_coins_dp(targetSum, coinValues, memo);
    }

    private static int minimum_coins_dp(int targetSum, int [] coinValues, HashMap<Integer, Integer> memo)
    {
        if(memo.containsKey(targetSum))
        {
            return memo.get(targetSum);
        }

        int numCoinsNeeded = -1;
        if(targetSum == 0)
        {
            numCoinsNeeded = 0;
        }
        else
        {
            for(int coinVal : coinValues)
            {
                int subProblem = targetSum - coinVal;
                if(subProblem < 0)
                    continue;
                numCoinsNeeded = min_ignore_none(numCoinsNeeded, (minimum_coins_dp(subProblem, coinValues, memo) + 1));
            }
        }
        memo.put(targetSum, numCoinsNeeded);
        return numCoinsNeeded;
    }

    //Coin problem using dp (tabulation)
    public static int minimum_coins_dpTab(int targetSum, int [] coinValues)
    {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        memo.put(0, 0);
        int subProblem;
        for(int i = 1; i <= targetSum; i++)
        {
            for(int coin : coinValues)
            {
                subProblem = i - coin;
                if(subProblem < 0)
                    continue;
                memo.put(i, min_ignore_null(i, subProblem, memo));
            }
        }
        return memo.get(targetSum);
    }
    private static int min_ignore_null(int i, int subProblem, HashMap<Integer, Integer> memo)
    {
       if(!memo.containsKey(i))
       {
           return (memo.get(subProblem) + 1);
       }
       if(!memo.containsKey(subProblem))
       {
           return (memo.get(i));
       }
       return Math.min(memo.get(i), (memo.get(subProblem) + 1));
    }
}
