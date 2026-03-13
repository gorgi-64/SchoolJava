import java.util.Scanner;
public class PoshtenskiKutii {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int X = input.nextInt();
        int[][] boxes = new int[4][8];
        int counter = 1;
        for(int i = 4 - 1; i >= 0; i--){
            for(int j =  0; j < 8; j++){
                boxes[i][j] = counter + X;
                counter++;
            }
        }
        for(int[] that : boxes) {
            for(int that2 : that) System.out.print(that2 + " ");
            System.out.print("\n");
        }
    }
}
