import java.util.Arrays;
import java.util.Scanner;
public class MDRfirst {
    public static int matrixSorP(int[][] matrix, int mode){
        //0: sum 1: product
        int initial = mode;
        for(int[] that1 : matrix){
            for(int that2 : that1){
                if(mode == 0) initial += that2;
                else initial *= that2;
            }
        }
        return initial;
    }
    public static int[] column(int[][] matrix, int col) {
        int[] subArr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            subArr[i] = matrix[i][col];
        }
        return subArr;
    }
    static Scanner input = new Scanner(System.in);
    public static int[][] fillMatrix(int M, int N){
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            int[] temp = new int[N];
            for(int j = 0; j < N; j++) temp[j] = input.nextInt();
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int M = input.nextInt(), N = input.nextInt();
        int[][] arr = fillMatrix(M, N);
        for(int[] that : arr){
            for(int i = 0; i < N; i++){
                System.out.print(that[i] + ((i == N - 1) ? "" : " "));
            }
            System.out.print("\n");
        }
        int sum = matrixSorP(arr, 0), product = matrixSorP(arr, 1), negative = 0, positive = 0, minimum = 100;
        for(int[] that1 : arr){
            for(int that2 : that1){
                negative += ((that2 < 0) ? 1 : 0);
                positive += ((that2 > 0) ? 1 : 0);
                minimum = Math.min(minimum, that2);
            }
        }
        System.out.println(sum + " " + product);
        System.out.println(positive + " " + negative);
        System.out.println("Minimum : " + minimum);
        int[] rowSums = new int[M];
        int[] maxIndex = {0, 1};
        for(int i = 0; i < M; i++){
            int maxIThisRow = ArraysPractice.maxIndex(arr[i]);
            if(arr[i][maxIThisRow] > arr[maxIndex[0]][maxIndex[1]]) maxIndex = new int[]{i, maxIThisRow};
            rowSums[i] = ArraysPractice.sum(arr[i]);
        }
        int diagonalSum = 0;
        for(int i = 0; i < Math.min(M, N); i++){
            System.out.print(arr[i][i] + " ");
            diagonalSum += arr[i][i];
        }
        System.out.println(Arrays.toString(rowSums) + " " + diagonalSum);
    }
}
