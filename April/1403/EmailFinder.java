import java.util.Scanner;

public class EmailFinder {
    public static boolean isEmail(String that){
        if(that.indexOf('@') == -1) return false;
        int i = that.substring(that.indexOf('@') + 1).indexOf('.');
        if(i == -1) return false;
        return (!that.substring(i).isEmpty()) &&
                (that.substring(i).length() <= 3);
    }
    public static void main(String[] args) {
        String one = new Scanner(System.in).nextLine();
        String two = new Scanner(System.in).nextLine();
        if(isEmail(one)){
            System.out.println(two.contains(one));
        }
        if(isEmail(two)){
            System.out.println(one.contains(two));
        }
    }
}
