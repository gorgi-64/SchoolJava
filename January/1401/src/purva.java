import java.util.Scanner;
class Barrel{
    private int radius;
    private int height;
    private double area;
    public Barrel(int a, int b){
        radius = a;
        height = b;
        area = a *  a * b * Math.PI;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double getArea(){
        return area;
    }
}


public class purva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int r1 = input.nextInt();
        int d2 = input.nextInt();
        int r2 = input.nextInt();
        Barrel one = new Barrel(d1, r1);
        Barrel two = new Barrel(d2, r2);
        if(one.getArea() > two.getArea()){
            System.out.println("radius: " + one.getRadius());
            System.out.println("height: " + one.getHeight());
            System.out.println("area: " + one.getArea());
        }
        else{
            System.out.println("radius: " + two.getRadius());
            System.out.println("height: " + two.getHeight());
            System.out.println("area: " + two.getArea());
        }


    }
}