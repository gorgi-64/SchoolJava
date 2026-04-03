public class countNumbersSmallAndBig {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String string = "abcd1234ABCD";

        int numbers = 0, small = 0, large = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9') numbers++;
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z') small++;
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') large++;
        }
    }
}