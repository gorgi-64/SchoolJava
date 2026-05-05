import java.util.ArrayList;

public class StringBuilderDelimeterandPalindrome {
    public static boolean isPalindrome(String string){
        for(int i = 0; i < string.length() / 2; i++){
            if(string.charAt(i) != string.charAt(string.length() - 1 - i)) return false;
        }
        return false;
    }
    public static boolean isLetter(char a){
        return (a >='A' && a <= 'Z') || (a >= 'a' && a <= 'z');
    }
    public static boolean hasSymbol(String a){
        for(int i = 0; i < a.length(); i++){
            if(!isLetter(a.charAt(i))) return false;
        }
        return true;
    }
    public static ArrayList<String> delimitLetters(String string, ArrayList<String> str) {
        if(hasSymbol(string)){
            str.add(string);
            return str;
        }
        for(int i = 0; i < string.length(); i++){
            if(!isLetter(string.charAt(i))){
                str.add(string.substring(0, i));
                return delimitLetters(string.substring(i + 1), str);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(delimitLetters("Hello/world1one2two:three", new ArrayList<>()));
    }
}
