import java.util.Scanner;
public class purva {
    public static int min(int[] arr, int start){
        int M = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < arr[M]) M = i;
        }
        return M;
    }
    public static int max(int[] arr, int start){
        int M = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < arr[M]) M = i;
        }
        return M;
    }
    public static int[] sortUp(int[] arr){
        int j = arr.length - 1;
        for(int i = 0; i < j; i++){
            int temp = arr[i];
            int I = min(arr, i);
            arr[i] = arr[I];
            arr[I] = temp;

        }
        return arr;
    }
    public static int[] sortDown(int[] arr){
        int j = arr.length - 1;
        for(int i = 0; i < j; i++){
            int temp = arr[i];
            int I = max(arr, i);
            arr[i] = arr[I];
            arr[I] = temp;

        }
        return arr;
    }
    public static void print(int[] arr){
        for(int that : arr) System.out.print(that + " ");
        System.out.print('\n');
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        print(arr);
        arr = sortUp(arr);
        print(arr);
        arr = sortDown(arr);
        print(arr);
        int L = arr.length - 1;
        System.out.println(arr[L] + " " + arr[L - 1] + " " + arr[L - 2]);
        int current = arr[0];
        int currentCount = 1;

        int mostCommon = arr[0];
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostCommon = current;
                }

                current = arr[i];
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            mostCommon = current;
        }
        System.out.println(mostCommon);
    }
}
