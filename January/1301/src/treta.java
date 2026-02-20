import java.util.Scanner;
public class treta {
    public static boolean simple(int a){
        if(a == 1) return false;
        if(a == 2) return true;
        for(int i = a - 1; i >= 2; i--){
            if(a % i == 0) return true;
        }
        return false;
    }
    public static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            System.out.print((i != n - 1) ? ", " : "\n");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        int s = 0, c = 0;
        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
            if(simple(arr[i])) s++;
            else if(arr[i] != 1) c++;
        }
        int Cc = 0, Sc = 0;
        int[] C = new int[c];
        int[] S = new int[s];
        for(int i = 0; i < N; i++){
            if(simple(arr[i])){
                S[Sc] = arr[i];
                Sc++;
            }
            else if(arr[i] != 1){
                C[Cc] = arr[i];
                Cc++;
            }
        }
        printArray(C, C.length);
        printArray(S, S.length);
    }
}
