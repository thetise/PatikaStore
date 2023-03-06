package ArrayHomeworks;
import java.util.Arrays;
public class ArraysHarmonicAverage {
    public static void main(String[] args) {

        double[] arr = {1,4,8,15,22};
        double sum = 0;
        System.out.println(Arrays.toString(arr));

        int n;
        n = arr.length;

        for(int i = 0; i < arr.length; i++){
            sum = sum + (1 / arr[i]);
        }
        double HarmonicAverage;
        HarmonicAverage = n / sum;

        System.out.println("Harmonik Ortalama: "+ sum);
    }
}