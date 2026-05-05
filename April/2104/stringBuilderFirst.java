import java.util.Scanner;

public class stringBuilderFirst {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void reverse(){
        StringBuilder that = new StringBuilder(input.nextLine());
        System.out.print(that.reverse());
    }
    public static String takeOut(){
        StringBuilder that = new StringBuilder(input.nextLine());
        StringBuilder nov = new StringBuilder();
        nov.append(that.charAt(0));
        for(int i = 1; i < that.length(); i++){
            if(that.charAt(i) == nov.charAt(nov.length() - 1)) continue;
            nov.append(that.charAt(i));
        }
        return nov.toString();
    }
    public static int findCommon(StringBuilder str){
        StringBuilder other = new StringBuilder(input.nextLine());
        int count = 0;
        for(int i = 0; i < other.length(); i++){
            if(str.indexOf(Character.toString(other.charAt(i))) == -1) continue;
            count++;
            str.deleteCharAt(str.indexOf(Character.toString(other.charAt(i))));
            other.deleteCharAt(i);
        }
        return count;
    }

}
