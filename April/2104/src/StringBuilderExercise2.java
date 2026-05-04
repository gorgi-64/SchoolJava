import java.util.ArrayList;
import java.util.Scanner;

public class StringBuilderExercise2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = BannedWords.splitRecursive(new ArrayList<String>(), new Scanner(System.in).nextLine(), ' ');
        System.out.println(arrayList);
        StringBuilder nov = new StringBuilder();
        for(String that : arrayList){
            nov.append(' ');
            nov.append(that);
        }
    }
}
