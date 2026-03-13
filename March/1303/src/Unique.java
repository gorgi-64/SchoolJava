import java.util.HashSet; //da, gospojo, specialno nauchih sets za tova, no az veche go znam ot cpp
import java.util.Arrays;
public class Unique {
    //public static boolean find(int[][] matrix, int elementToFind)
    public static void main(String[] args) {
        int M = PoshtenskiKutii.input.nextInt(), N = PoshtenskiKutii.input.nextInt();
        int[][] matrix = MDRfirst.fillMatrix(M, N);
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                unique.add(matrix[i][j]);
            }
        }
        int[] uniqueArr = new int[unique.size()];
        int counter = 0;
        for(Integer that : unique){
            uniqueArr[counter++] = that;
        }
        Arrays.sort(uniqueArr);
        for(int that : uniqueArr){
            System.out.println(that);
        }
    }
}
