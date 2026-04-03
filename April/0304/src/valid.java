import java.util.Scanner;

public class valid {
    public static boolean isDate(String that){
        for(int i = 0; i < that.length(); i++){
            if(i == 2 || i == 5){
                if(that.charAt(i) != '/') return false;
            }
            else if(i == 0 || i == 1){
                if(that.charAt(i) >= '0' && that.charAt(i) <= '9') continue;
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String that = input.nextLine();
        if(isDate(that)) System.out.println("date");
        else try {
            Double num = Double.parseDouble(that);
            if(num == Math.floor(num)){
                System.out.println("integer");
            }
            else System.out.println("double");
        } catch (NumberFormatException e) {
            System.out.println("string");
            System.exit(0);
        }
    }
}
