import java.util.Scanner;
public class PurvaIPosledna {
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }
    public static int[] reverse(int[] arr){
        int[] second = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            second[arr.length - 1] = arr[i];
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sz = input.nextInt();
        int[] a = new int[sz];
        for(int i = 0; i < sz; i++) a[i] = input.nextInt();
        print(a);
        a = sort(a);
        int sum = a[0] + a[1] + a[2] + a[3] + a[4];
        print(a);
        int min = a[0];
        for(int i = 0; i < sz; i++){
            if(a[i] % 2 == 0 && a[i] < min) min = a[i];
        }
        int max = a[0];
        for(int i = 0; i < sz; i++){
            if(a[i] % 2 == 0 && a[i] > max) max = a[i];
        }
        a = reverse(a);
        int prod = a[0] * a[1] * a[2] * a[3] * a[4];
        print(a);



    }
}
