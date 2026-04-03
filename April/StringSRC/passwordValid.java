import java.util.Scanner;
public class passwordValid {
    public static boolean valid(char that){
        if(that >= 'a' && that <= 'z') return true;
        if(that >= 'A' && that <= 'Z') return true;
        if(that >= '0' && that <= '9') return true;
        if(that == '@' || that == '$' || that == '#' || that == '*') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String that = input.nextLine();
        boolean small = (false), big = false, number = false, symbol = false;
        for(int i = 0; i < that.length(); i++){
            if(!valid(that.charAt(i)) || that.length() < 16){
                System.out.println("Not valid");
                System.exit(0);
            }
            if(that.charAt(i) >= 'a' && that.charAt(i) <= 'z') small = true;
            if(that.charAt(i) >= 'A' && that.charAt(i) <= 'Z') big = true;
            if(that.charAt(i) >= '0' && that.charAt(i) <= '9') number = true;
            if(that.charAt(i) == '@' || that.charAt(i) == '$' || that.charAt(i) == '#' || that.charAt(i) == '*') symbol =  true;
        }
        if(small && big && number && symbol){
            System.out.println("Valid");
        }
        else System.out.println("Not valid");
    }
}
