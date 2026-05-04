public class twentyeight {
    public static void main(String[] args) {
        System.out.println(nod(12, 3));
        System.out.println(sumDigit(1234));
        printWithoutMasiv(" 1 2 3 4 5 6 7 8 9"); System.out.print('\n');
        System.out.println(redica(5));
    }
    public static int nod(int a, int b){
        if(a == b) return a;
        if(a > b) return nod(a - b, b);
        else return nod(a, b - a);

    }
    public static int sumDigit(int a){
        if(a == 0) return 0;
        return (a % 10) + sumDigit(a / 10);
    }
    public static void printWithoutMasiv(String toPrint){
        if(toPrint.isEmpty()) return;
        System.out.print(toPrint.charAt(toPrint.length() - 1) + " ");
        printWithoutMasiv(toPrint.substring(0, toPrint.length() - 2));
    }
    public static int redica(int n){
        if(n == 1) return 6;
        return (redica(n - 1) * 2) - 3;
    }
}
