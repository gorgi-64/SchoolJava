public class StringCompareWithSymbols {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        String a = "Az i ti";
        String b = "Ti i az";
        System.out.print(a);
        if(a.compareTo(b) > 0) System.out.print(" > ");
        else if(a.compareTo(b) < 0) System.out.print(" < ");
        else System.out.print(" = ");
        System.out.println(b);
    }
}
