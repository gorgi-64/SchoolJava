public class tasks {
    public static void main(String[] args) {
        System.out.println((red5(5) + red5(10))/ 2.0);

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(rek(5, i) + " ");
            }
            System.out.print('\n');
            System.out.println(ack(12, 13));
        }catch(StackOverflowError e){ System.out.println("...");}

        System.out.println(combinations(5, 4));
        System.out.println(sqrtSeries(5, 0));
        System.out.println(sqrtSeriesIterative(5));

    }
    public static int red5(int n){
        if(n == 1) return 5;
        if(n % 5 == 0) return 2 * red5(n - 1);
        return red5(n - 1) - 1;
    }
    public static int rek(int a1, int n){
        if(n == 1) return a1;
        if(n % 2 == 0) return -4 + rek(a1, n - 1);
        else return 3 * rek(a1, n - 1);
    }
    public static int ack(int m, int n){
        if(m == 0) return n + 1;
        if(n == 0) return ack(m - 1, 1);
        return ack(m - 1, ack(m, n - 1));
    }
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static int combinations(int n, int m){
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
    public static double sqrtSeries(int n, int k){
        if(k == n) return 1;
        return Math.sqrt(n - k + sqrtSeries(n, k + 1));
    }
    public static double sqrtSeriesIterative(int n){
        double result = 0;
        for(int i = 0; i <= n; i++){
            result = i + Math.sqrt(result);
        }
        return result;
    }
}