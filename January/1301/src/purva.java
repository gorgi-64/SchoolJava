import java.util.Scanner;

public class purva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int n = input.nextInt();
        String[] A = new String[n];
        for(int i = 0; i < n; i++){
            A[i] = str.nextLine();
        }
        n = input.nextInt();
        String[] B = new String[n];
        for(int i = 0; i < n; i++){
            B[i] = str.nextLine();
        }
        if(A.length != B.length) System.out.println("Not identical. Difference at: " + (Math.min(A.length, B.length) - 1));
        else{
            for(int i = 0; i < n; i++){
                if(!A[i].equals(B[i])){
                    System.out.println("Not identical. Difference at: " + i);
                    System.exit(0);
                }
            }
        }
        System.out.println("Identical");
    }
}
