public class MDRSquare {
    public static int findMatrixSumRecursive(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        if(matrix.length == 1) return matrix[0][0];
        if(matrix.length == 2) return MDRfirst.matrixSorP(matrix, 0);
        return MDRfirst.matrixSorP(matrix, 0) -
                findMatrixSumRecursive(MDRPloshtadka.subMatrix(matrix,
                        1, 1,
                        matrix.length - 2, matrix[0].length - 1));
    }

    public static void main(String[]  args) {
        int M = MDRfirst.input.nextInt();
        int[][] matrix = MDRfirst.fillMatrix(M, M);
        System.out.println(findMatrixSumRecursive(matrix));
    }
}
