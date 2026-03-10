public class MDRPloshtadka {
    public static int[][] subMatrix(int[][] matrix, int startRow, int startCol, int endRow, int endCol) {
        int[][] subM = new int[endRow - startRow + 1][endCol - startCol + 1];
        for (int i = startRow; i <= endRow; i++) {
            subM[i - startRow] = OddEven.subArray(matrix[i], startCol, endCol);
        }
        return subM;
    }

    public static void main(String[] args) {
        int M = MDRfirst.input.nextInt(), N = MDRfirst.input.nextInt(), K = MDRfirst.input.nextInt();
        int[][] matrix = MDRfirst.fillMatrix(M, N);
        for (int i = 0; i < M - K; i++) {
            for (int j = 0; j < N - K; j++) {
                int[][] subM = subMatrix(matrix, i, i + K, j, j + K);
                if(MDRequal.matrixEqual(subM)) System.out.println(i + j);
            }
        }
    }
}
