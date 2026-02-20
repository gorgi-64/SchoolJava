import java.util.Scanner;

public class vtora {
    public static int F(int x){
        return (int)(Math.pow(x, 2) + (5 * x) - 1);
    }
    public static boolean arrayIncreasing(int[] data, int n){
        boolean increasing = true;
        for(int i = 0; i < n; i++){
            if(i > 0 && data[i] < data[i - 1]){
                increasing = false;
                break;
            }
        }
        return increasing;
    }
    public static void arrayPrint(int[] data, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i == n - 1) continue;
            System.out.print(", ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int[] y = new int[B - A + 1]; //y = F(x)
        for(int x = A; x < (B + 1); x++){
            y[x - A] = F(x);
        }
        arrayPrint(y, (B - A + 1));
        System.out.println("\n" + marrayIncreasing(y, (B - A + 1)));
    }
}
