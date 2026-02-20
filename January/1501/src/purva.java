import java.util.Scanner;
class triangle{
    private int a;
    private int b;
    private int c;
    public triangle(){
        a = 10;
        b = 10;
        c = 10;
    }
    public triangle(int d, int e, int f){
        a = d;
        b = e;
        c = f;
    }
    public void setSides(int d, int e, int f){
        a = d;
        b = e;
        c = f;
    }
    public triangle(triangle copy){
        a = copy.getA();
        b = copy.getB();
        c = copy.getC();
    }
    public int getA(){ return a;}
    public int getB(){ return b;}
    public int getC(){ return c;}
    public void printSides(){
        System.out.println(a + ", " + b + ", " + c);
    }
    public int getPerimeter(){
        return a + b + c;
    }
}
public class purva {
    public static void task(triangle first){
        first.printSides();
        System.out.println(first.getPerimeter());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        triangle first = new triangle();
        task(first);
        triangle second = new triangle(input.nextInt(), input.nextInt(), input.nextInt());
        task(second);
        triangle third = new triangle(second);
        third.printSides();
        third = new triangle(10, 20, 25);
        task(third);

    }
}
