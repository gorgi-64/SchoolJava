import java.util.Scanner;
class Circle implements GeometryAction{
    private double centerX;
    private double centerY;
    private double radius;
    public Circle(){
        centerX = 0.0;
        centerY = 0.0;
        radius = 1;
    }
    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void move(double dx, double dy){
        centerX += dx;
        centerY += dy;
    }
    public void resize(double coefficient){
        radius *= coefficient;
    }
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public void printPosition(){
        System.out.println(centerX + "; " + centerY);
    }
}
class Rectangle implements GeometryAction{
    private double cornerX;
    private double cornerY;
    private double lengthX;
    private double lengthY;
    public Rectangle(){
        cornerX = 0.0;
        cornerY = 1.0;
        lengthX = 1.0;
        lengthY = 1.0;
    }
    public Rectangle(double cornerX, double cornerY, double lengthX, double lengthY) {
        this.cornerX = cornerX;
        this.cornerY = cornerY;
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }
    public void move(double dx, double dy){
        cornerX += dx;
        lengthX += dx;
        cornerY += dy;
        lengthY += dy;
    }
    public void resize(double coefficient){
        cornerX *= coefficient;
        lengthX *= coefficient;
        cornerY *= coefficient;
        lengthY *= coefficient;

    }
    public double calcArea(){
        return lengthX * lengthY;
    }
    public void printPosition(){
        System.out.println(cornerX + "; " + cornerY);
    }

}
public class purva {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        String figure;
        //figure = input.nextLine();
        figure = "circle";
        Circle temp = new Circle(1, 2, 3);
        System.out.println("Area: " + temp.calcArea());
        System.out.print("Position: ");
        temp.printPosition();
        temp.resize(2);
        temp.move(1, 1);
        System.out.println("Area: " + temp.calcArea());
        System.out.print("Position: ");
        temp.printPosition();

    }
}
