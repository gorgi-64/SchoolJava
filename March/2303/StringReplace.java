@SuppressWarnings("StringConcatenationInLoop")
public class StringReplace {
    public static String replace(String obj, String og, String replace){
        String nov = "";
        for(int i = 0; i < obj.length(); i += og.length()){
            try{
                String substring = obj.substring(i, i + og.length() + 1);
                if(substring.equals(og)) nov += replace;
                else nov += substring;
            }
            catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        return nov;
    }
    public static String removeLetter(String obj, char toRemove){
        String nov = "";
        for(int i = 0; i < obj.length(); i++){
            if(obj.charAt(i) == toRemove) continue;
            nov += obj.charAt(i);
        }
        return nov;
    }
    public static String toLower(String that){
        String nov = "";
        for(int i = 0; i < that.length(); i++){
            char a = (char) (that.charAt(i) + ((that.charAt(i) >= 'A' && that.charAt(i) <= 'Z') ? 'a' - 'A' : 0));
            nov += a;
        }
        return nov;
    }

    public static void main(String[] args) {
        String a = "abcdefgHIJKLMNOPhhh";
        a = replace(a, "abc", "def");
        a = removeLetter(a, 'h');
        a = toLower(a);
        System.out.println(a);
    }
}
