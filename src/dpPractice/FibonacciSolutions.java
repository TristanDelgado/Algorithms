package dpPractice;

import java.util.HashMap;

public class FibonacciSolutions {
    /*
    There are two ways of finding a fibonacci sequence
    1. With recursive calls
    2. With DP
     */

    public static int fibRec(int n)
    {
        if(n <= 2)
            return 1;
        return (fibRec(n - 1) + fibRec(n - 2));
    }

    //fibdp using recursion
    public static int fibdpRec(int n)
    {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return fibdpRecActual(memo, n);
    }
    private static int fibdpRecActual(HashMap<Integer, Integer> memo, int n)
    {
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }
        if(n <= 2)
        {
            memo.put(n, 1);
        }
        else
            memo.put(n, (fibdpRecActual(memo, n - 1) + fibdpRecActual(memo, n - 2)));
        return memo.get(n);
    }



    //fibdb without recursion
    public static int fibdpNoRec(int n)
    {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

        for(int i = 1; i <= n; i++)
        {
            if(i <= 2)
                memo.put(i, 1);
            else
            {
                memo.put(i, (memo.get(i - 1) + memo.get(i - 2)));
            }
        }
        return memo.get(n);
    }
}
