import java.util.Scanner;

public class paralekla {
    public static boolean validChar(char letter) {
        return letter >= 'a' && letter <= 'd';
    }
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(input);
        Integer number;
        try{
            System.out.println(input.charAt(input.length() - 2));
            number = Integer.parseInt(input.substring(0, input.length() - 2));
            System.out.println(number);
            if(number >= 1 && number <= 9){
                if(validChar(input.charAt(1))) System.out.println("Valid");
                else System.out.println("Not valid");
            }
            else if(number <= 12){
                if(validChar(input.charAt(2))) System.out.println("Valid");
                else System.out.println("Not valid");
            }
            else System.out.println("Not valid");
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
            /*System.out.println("Not valid");
            System.exit(0);*/
        }
    }
}
