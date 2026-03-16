import java.util.Arrays;
import java.util.Comparator;

public class estestveniSuma {
    public static int findSumDigits(int a){
        int sum = 0;
        while(a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
    @SuppressWarnings("all")
    public static Comparator<Integer> bySum = new Comparator<>() {
        @Override
        public int compare(Integer integer, Integer t1) {
            if(findSumDigits(integer) == findSumDigits(t1))
                return Integer.compare(integer, t1);
            return Integer.compare(findSumDigits(integer), findSumDigits(t1));
        }
    };
    public static void main(String[] args) {
        Integer[] arr = new Integer[matrixMultiplication.input.nextInt()];
        Arrays.sort(arr, bySum);
        for(int that : arr) System.out.println(that);
    }
}
