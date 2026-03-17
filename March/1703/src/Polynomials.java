import java.util.Scanner;

class Polynomial{
    private int degree;
    private double[] coefficients;
    public Polynomial(){
        degree = Polynomials.input.nextInt();
        coefficients = new double[degree];
        for(int i = 0; i < degree; i++){
            coefficients[i] = Polynomials.input.nextDouble();
        }
    }
    public Polynomial(double[] coefficients){
        this.coefficients = coefficients;
        this.degree = coefficients.length;
    }
    public int getDegree(){ return degree; }
    public double[] getCoefficients(){ return coefficients; }

    @SuppressWarnings("all")
    public <T extends Polynomial> double[] sumation(T two){
        double[] newPoly = new double[Math.max(this.getDegree(), two.getDegree())];
        for(int i = 0; i < Math.min(this.getDegree(), two.getDegree()); i++){
            newPoly[i] = this.getCoefficients()[i] + two.getCoefficients()[i];
        }
        for(int i = Math.min(this.getDegree(), two.getDegree()) + 1; i < Math.max(this.getDegree(), two.getDegree()); i++){
            try {
                newPoly[i] = this.getCoefficients()[i];
            }catch(IndexOutOfBoundsException e){
                newPoly[i] = two.getCoefficients()[i];
            }
        }
        return newPoly;
    }
    @SuppressWarnings("all")
    public static Polynomial derivative(Polynomial one){
        double[] derivativeQ = new double[one.getDegree() - 1];
        for(int i = 1; i < one.getDegree(); i++){
            derivativeQ[i - 1] = (one.getCoefficients()[i] * i);
        }
        return new Polynomial(derivativeQ);
    }
}
public class Polynomials {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Polynomial one = new Polynomial();
        Polynomial two = new Polynomial();
        Polynomial three = new Polynomial(one.sumation(two));
        System.out.println("degree: " + three.getDegree());
        for(double that : three.getCoefficients()) System.out.println(that);
    }
}
