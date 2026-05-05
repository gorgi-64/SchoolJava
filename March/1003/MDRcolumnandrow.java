public class MDRcolumnandrow {
    public static void main(String[] args) {
        int M = MDRfirst.input.nextInt(), N = MDRfirst.input.nextInt();
        int[][] matrix = MDRfirst.fillMatrix(M, N);
        int K = -1;
        for(int i = 0; i < Math.min(M, N); i++){
            int sumRow = ArraysPractice.sum(matrix[i]);
            int sumCol = ArraysPractice.sum(MDRfirst.column(matrix, i));
            if(sumCol == sumRow){
                System.out.println(i);
                K = i;
            }
        }
        if(K == -1) System.out.println("No such K");
    }
}
