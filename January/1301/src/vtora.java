import java.util.Scanner;
public class vtora {
    public static int[] press(int[] ArrA, int n){
        int[] ArrB = new int[n - 1];
        for(int i = 0; i < n - 1; i++){
            ArrB[i] = ArrA[i] + ArrA[i + 1];
        }
        return ArrB;
    }
    public static void main(String[] args) {
        int[] ArrA = {2, -3, 12, 8};
        int[] ArrB = press(ArrA, ArrA.length);
        for(int i = 0; i < ArrB.length; i++) System.out.println(ArrB[i]);
    }
}
