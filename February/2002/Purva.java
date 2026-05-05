import java.util.Scanner;
public class Purva {
    public static int arrMin(int[] arr){
        int minI = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[minI]) minI = i;
        }
        return minI;
    }
    public static int arrMax(int[] arr){
        int maxI = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[maxI]) maxI = i;
        }
        return maxI;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N * 2];
        int[] start = new int[N];
        int[] end = new int[N];
        for(int i = 0; i < N; i++){
            start[i] = input.nextInt();
            end[i] = input.nextInt();
        }
        int X = input.nextInt();
        boolean not = false;
        for(int i = 0; i < N; i++){
            if(!(X >= start[i] && X <= end[i])){
                not = true;
                break;
            }
        }
        System.out.println((!not) ? "Yes" : "No");
        if(start[arrMax(arr)] <= end[arrMin(arr)]) System.out.println(start[arrMax(arr)]);
        else System.out.println("No");
    }
}

