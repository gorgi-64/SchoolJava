import java.util.Scanner;
public class matrixMultiplication {
    public static int[][] sum(int[][] m1, int[][] m2){
        int[][] m3 = new int[m1.length][m2.length];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m2.length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m3;
    }
    public static int matrixProdLine(int x, int[] arr){
        int sum = 0;
        for(int that : arr){
            sum += (that * x);
        }
        return sum;
    }
    public static int[][] prod(int[][] m1, int[][] m2){
        int[][] m3 = new int[m1.length][m1.length];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1.length; j++){
                m3[i][j] = matrixProdLine(m1[i][j], MDRfirst.column(m2, i));
            }
        }
        return m3;
    }
    static Scanner input = new Scanner(System.in);
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int n = input.nextInt();
        int[][] m1 = MDRfirst.fillMatrix(n, n);
        int[][] m2 = MDRfirst.fillMatrix(n, n);
        int[][] sum = sum(m1, m2);
        int[][] prod = prod(m1, m2);

    }
}
