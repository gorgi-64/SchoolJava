import java.util.Scanner;

public class usernames {
    public static boolean isValid(char that){
        if(that >= 'a' && that <= 'z') return true;
        if(that >= '0' && that <= '9') return true;
        if(that == '_' || that == '-') return true;
        return false;
    }
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        if(input.length() >= 3 && input.length() <= 15){
            boolean valid = true;
            for(int i = 0; i < input.length(); i++){
                if(!isValid(input.charAt(i))){
                    valid = false;
                    break;
                }
            }
            if(!valid) System.out.println("Not Valid");
            else System.out.println("Valid");
        }
        else System.out.println("Not  valid");
    }
}
