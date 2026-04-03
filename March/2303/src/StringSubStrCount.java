public class StringSubStrCount {
    @SuppressWarnings("RedundantStringOperation")
    public static void main(String[] args) {
        String a = "abc abc abc abc def abc"; //5
        int counter = 0;
        String substr = "abc";
        for(int i = 0; i < a.length(); i++){
            try{
                if(a.substring(i, i + substr.length()).equals(substr)){
                    counter++;
                }
            }catch(StringIndexOutOfBoundsException e){break;}
        }
        System.out.println(counter);
    }
}
