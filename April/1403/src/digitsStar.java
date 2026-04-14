import java.util.Scanner;

public class digitsStar {
    public static boolean isNumber(char that){
        return that >= '0' && that <= '9';
    }
    public static void main(String[] args) {
        String that = new Scanner(System.in).nextLine();
        for(int i = 0; i < that.length(); i++){
            System.out.print(isNumber(that.charAt(i)) ? '*' : that.charAt(i));
        }
    }
}
