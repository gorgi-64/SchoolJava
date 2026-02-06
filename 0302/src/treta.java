import java.util.Scanner;
abstract class equation{
    protected int stepen;
    protected double[] coeficcients;
    public void enter(double[] coeficcients){
        for(int i = 0; i < coeficcients.length; i++){
            this.coeficcients = coeficcients;
        }
    }
    abstract public void solve();

}
class linear extends equation{
    //x + (b - c)/a = 0
    public linear(double a, double b, double c){
        stepen = 1;
        enter(new double[]{(b - c) / a});
    }
    @Override
    public void solve(){
        System.out.println("Solution: " + coeficcients[0]);
    }
}
class quadratic extends equation{
    //axx + bx + c = 0;
    public quadratic(double a, double b, double c){
        stepen = 2;
        enter(new double[]{a, b, c});
    }
    public double findD(){
        return (coeficcients[1] * coeficcients[1]) - (4.0 * coeficcients[0] * coeficcients[2]);
    }
    public double findX(boolean Smaller){
        double D = findD();
        if(D < 0){
            System.out.println("No real solutions");
            return -1;
        }
        if(D == 0){
            return (coeficcients[1] * -1) / (2 * coeficcients[0]);
        }
        else {
            D = Math.sqrt(D);
            double x1 = (-1 * D) + coeficcients[1];
            x1 /= (2 * coeficcients[0]);
            double x2 = (-1 * D) - coeficcients[1];
            x2 /= (2 * coeficcients[0]);
            if(Smaller) return Math.min(x1, x2);
            else return Math.max(x1, x2);

        }
    }
    @Override
    public void solve() {
        if(findD() < 0) findX(true);
        else{
            if(findD() == 0) System.out.println("Solution: " + findX(false));
            else{
                System.out.println("Solutions: " + findX(false) + ", " +  findX(true));
            }
        }
    }
}
class biquadratic extends quadratic{
    public biquadratic(double a, double b, double c){
        super(a, b, c);
        super.stepen = 4;
    }
    @Override
    public void solve(){
        int numberSolutions;
        numberSolutions = 0;
        if(findD() < 0 || (findD() == 0 && findX(false) < 0)){
            System.out.println("No real solutions");
            return;
        }
        else if(findD() == 0) System.out.println("Solutions: " + Math.sqrt(findX(true)) + ", -" + Math.sqrt(findX(true)));
        else {
            System.out.print("Solutions: ");
            if (findX(false) >= 0) {
                System.out.print(Math.sqrt(findX(false)) + ", -" + Math.sqrt(findX(false)));
                System.out.print(" ");
             }
            if(findX(true) >= 0) System.out.println(Math.sqrt(findX(true)) + ", -" + Math.sqrt(findX(true)));
        }
    }


}
public class treta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linear one = new linear(input.nextDouble(), input.nextDouble(), 0);
        quadratic two = new quadratic(input.nextDouble(), input.nextDouble(), input.nextDouble());
        biquadratic three = new biquadratic(input.nextDouble(), input.nextDouble(), input.nextDouble());
        one.solve();
        two.solve();
        three.solve();
    }
}
