public class EstestvenoChislo {
    public static boolean correct(String that){
        if(!(that.charAt(0) >= '1' && that.charAt(0) <= '9')) return false;
        for(int i = 1; i < that.length(); i++){
            if(!(that.charAt(i) >= '0' && that.charAt(i) <= '9')) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String niz = "1234567";
        System.out.println(correct(niz));
    }
}
