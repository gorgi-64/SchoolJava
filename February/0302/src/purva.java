abstract class Shapes {
    protected double x;
    public abstract double perimetyr();
    public abstract double area();
    public abstract void writeAll();
    @Override
    public String toString() {
        return String.format("%.2f%s %.2f%s %.2f", x,"; perimetyr =", perimetyr(),"; area =",area());
    }
}
class Circle extends Shapes{
    public Circle(double x){
        this.x = x;
    }
    @Override
    public double perimetyr(){
        return 2.0 * Math.PI * x;
    }
    @Override
    public double area(){
        return Math.PI * x * x;
    }
    @Override
    public void writeAll(){
        System.out.println("Circle: Radius: " + x + "; Area: "+ area() + " Perimeter: " + perimetyr());
    }
}
class Triangle extends Shapes{
    public Triangle(double x){
        this.x = x;
    }
    @Override
    public double perimetyr(){
       return 3*x;
    }
    @Override
    public double area() {
        return 0.25 * Math.sqrt(3) * x * x;
    }
    @Override
    public void writeAll(){
        System.out.println("Triangle: Side: " + x + "; Area: "+ area() + " Perimeter: " + perimetyr());
    }
}
class Rectangle extends Shapes{
    public Rectangle(double x){
        this.x = x;
    }
    @Override
    public double perimetyr(){
        return 4 * x;
    }
    @Override
    public double area(){
        return x * x;
    }
    //@Override
    public void writeAll(){
        System.out.println("Rectangle: Side: " + x + "; Area: "+ area() + " Perimeter: " + perimetyr());
    }
}
public class purva {
    public static void main(String[] args) {
        Circle one = new Circle(2.5);
        Triangle triforce = new Triangle(3);
        Rectangle second = new Rectangle(3.5);
        one.writeAll();
        triforce.writeAll();
        second.writeAll();
    }
}
