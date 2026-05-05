import java.util.ArrayList;
import java.util.Scanner;

public class kodiraneStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<Integer>();
        String code = input.nextLine();
        int temp = 0;
        boolean negative = false;
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '0' && temp == 0) digits.add(0);
            else if(code.charAt(i) == '-'){
                negative = true;
            }
            else if((code.charAt(i) >= '0' && code.charAt(i) <= '9')){
                temp = (temp * 10) + (int) (code.charAt(i) - '0');
            }
            else{
                digits.add(temp * ((negative ? -1 : 1)));
                negative = false;
                temp = 0;
            }
        }
        System.out.println(digits);
    }
}