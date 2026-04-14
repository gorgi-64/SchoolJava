import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Scanner;

public class BannedWords {
    public static ArrayList<String> splitRecursive(ArrayList<String> arr, String str, char delimiter){
        if(str.indexOf(delimiter) == -1){
            arr.add(str);
            return arr;
        }
        arr.add(str.substring(0, str.indexOf(delimiter)));
        return splitRecursive(arr, str.substring(str.indexOf(delimiter) + 1, str.length()), delimiter);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> og = splitRecursive(new ArrayList<>(), input.nextLine(), ' ');
        ArrayList<String> banned = splitRecursive(new ArrayList<>(), input.nextLine(), ',');
        System.out.println(og);
        for(String element : og){
            if(banned.contains(element)){
                for(int i = 0; i < element.length(); i++) System.out.print("*");
                System.out.print(' ');
            }
            else System.out.print(element + ' ');
        }
        //System.out.println(banned);
    }
}
