import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        int openCounter = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '(') openCounter++;
            if(string.charAt(i) == ')') openCounter--;
            if(openCounter < 0){
                System.out.println("Ne");
                System.exit(0);
            }
        }
        if(openCounter == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
