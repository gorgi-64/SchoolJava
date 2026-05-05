@SuppressWarnings("all")
public class MatrixesNew {
    public static int[][] read(int[][] matrix, int m, int n){
        return MDRfirst.fillMatrix(m, n);
    }
    public static void print(int[][] matrix){
        for(int[] that1 : matrix) for(int that2 : that1) System.out.println(that2);
    }
    public static void main(String[] args) {
        matrixMultiplication.main(new String[]{""});
    }
}
