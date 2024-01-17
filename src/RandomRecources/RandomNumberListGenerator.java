package RandomRecources;
import java.util.Random;

//Purpose is to take an input how the range of numbers,
//type of output desired(array, file, string, etc.), and how many numbers
//out output that input
public class RandomNumberListGenerator {
    static public int[] generateArray(int rangeMin, int rangeMax, int length) {
        Random randomNum = new Random();
        int [] array = new int[length];
        for(int i = 0; i < length; i++)
        {
            array[i] = randomNum.nextInt(rangeMin, rangeMax);
        }
        return array;
    }
    static public double[] generateArray(double rangeMin, double rangeMax, int length)
    {
        Random randomNum = new Random();
        double [] array = new double[length];
        for(int i = 0; i < length; i++)
        {
            array[i] = randomNum.nextDouble(rangeMin, rangeMax);
        }
        return array;
    }

}
