public class StringReplaceWithUpper {
    public static void main(String[] args) {
        String that = "my name is me";
        String nov = "";
        for(int i = 0; i < that.length(); i++){
            nov += (char) (that.charAt(i) + ((that.charAt(i) >= 'a' && that.charAt(i) <= 'z') ? 'A' - 'a' : 0));
        }
        that = nov;
    }
}
