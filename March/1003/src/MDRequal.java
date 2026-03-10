public class MDRequal {
    public static boolean matrixEqual(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 1; j < ints.length; j++) {
                if (ints[j] != matrix[0][0]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int M = MDRfirst.input.nextInt(), N = MDRfirst.input.nextInt();
        int[][] arr = MDRfirst.fillMatrix(M, N);
        for(int i = 0; i < M; i++){
            if(matrixEqual(new int[][]{arr[i]})) System.out.println(i + " " + arr[i][0]);
        }
    }
}
