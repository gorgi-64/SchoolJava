import java.util.ArrayList;
import java.util.Scanner;

public class NamePrintOnLines {
    public static int findNameRecursive(String that, char delimiter, int counter){
        if(that.indexOf(delimiter) == -1) return counter;
        return findNameRecursive(that.substring(that.indexOf(delimiter) + 1), delimiter, counter + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        String that = input.nextLine();
        //System.out.println(findNameRecursive());
    }
}
