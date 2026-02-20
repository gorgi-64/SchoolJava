import java.util.Scanner;
class Point{
    String name;
    int x;
    int y;
    public Point(){
        name = "Unnamed";
        x = 0;
        y = 0;
    }
    public Point(String a, int b, int c){
        name = a;
        x = b;
        y = c;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String toString(){
        return name + "(" + x + "," + y + ")";
    }
    public boolean coincideWith(Point P){
        return x == P.getX() && y == P.getY();
    }
}
class Cut{
    Point begin;
    Point end;
    public Cut(Point a, Point b){
        begin = a;
        end = b;
    }
    public double length(){
        double a = Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(), 2);
        a = Math.sqrt(a);
        return a;
    }
    public String toString(){
        double distance = this.length();
        String str = begin.getName() + end.getName() + " = " + distance;
        return str;

    }
}
public class purva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Point a = new Point(str.nextLine(), input.nextInt(), input.nextInt());
        Point b = new Point(str.nextLine(), input.nextInt(), input.nextInt());

        System.out.println(a.toString() + " does " + ((a.coincideWith(b)) ? "" : "not ") + "coincide with " + b.toString());

        Cut c = new Cut(a, b);
        System.out.println(c.toString());

    }
}
