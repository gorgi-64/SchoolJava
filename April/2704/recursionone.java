import java.util.Scanner;

public class recursionone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci: ");
        System.out.println(fibonacci(input.nextInt()));
        System.out.println("Power: ");
        System.out.println(power(input.nextInt(), input.nextInt()));
        System.out.println("AP: ");
        System.out.println(arithmeticProgression(input.nextInt(), input.nextInt()));
        System.out.println("GP: ");
        System.out.println(geometricProgression(input.nextInt(), input.nextInt()));
        System.out.println("series: ");
        System.out.println(seriesN(input.nextInt()));
        System.out.println("Count digits: ");
        System.out.println(digitCount(input.nextInt(), 0));
        System.out.println("Sum to N: ");
        System.out.println(sumToN(input.nextInt()));

    }
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static double power(double base, int power){
        if(power == 1) return base;
        if(power >= 1) return base * power(base, power - 1);
        else return base / power(base, power + 1);
    }
    public static int arithmeticProgression(int step, int count){
        if(count == 0) return 0;
        return step + arithmeticProgression(step, count - 1);
    }
    public static int geometricProgression(int step, int count){
        if(count == 0) return 1;
        return step * geometricProgression(step, count - 1);
    }
    public static int seriesN(int n){
        if(n == 1) return 1;
        return (3 * seriesN(n - 1)) + 1;
    }
    public static int digitCount(int n, int counter){
        if(n == 0) return counter;
        return digitCount(n / 10, counter + 1);
    }
    public static int sumToN(int n){
        if(n == 0) return 0;
        return n + sumToN(n - 1);
    }
}
