@SuppressWarnings("unused")
public class recursion4 {
    public static void main(String[] args) {

    }
    public static char digitsArr(int digit){
        if(digit <= 9) return (char)(digit + '0');
        else return (char)(digit + 'A');
    }
    public static String toBase(int number, int baseTo){
        if(number < baseTo) return Integer.toString(baseTo);
        return digitsArr(number % baseTo) + toBase(number / baseTo, baseTo);
    }
    public static double sequenceOne(int x, int n){
        if(n == 0) return 1.0;
        return Math.pow(x, n) + sequenceOne(x, n - 1);
    }
    public static double sequenceTwo(int x, int n){
        if(n == 0) return 1.0;
        return 1 / Math.pow(x, n) + sequenceTwo(x, n);
    }
}
