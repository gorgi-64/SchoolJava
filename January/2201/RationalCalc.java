import java.util.Scanner;
class Rational{

    private int numerator;
    private int denominator;

    public Rational(){
        numerator = 0;
        denominator = 0;
    }
    public Rational(int numerator, int denominator){
        for(int i = Math.min(numerator, denominator); i >= 2; i--){
            if(numerator % i == 0 && denominator % i == 0){
                numerator /= i;
                denominator /= i;
            }

        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

}
public class RationalCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational one = new Rational(input.nextInt(), input.nextInt());
        if(one.getDenominator() == 1) System.out.println(one.getNumerator() + " is an integer");
        else if(one.getNumerator() > one.getDenominator()) System.out.println(one.toString() + " is improper");
        else System.out.println(one.toString() + " is proper");
    }



}
