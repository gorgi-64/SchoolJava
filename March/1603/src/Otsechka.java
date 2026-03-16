import java.util.Comparator;

class point{
    public int x;
    public int y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @SuppressWarnings("all")
    public static Comparator<point> byX = new Comparator<point>() {
        @Override
        public int compare(point one, point two) {
            if(one.x > two.x) return 1;
            if(one.x != two.x) return -1;
            return Integer.compare(one.y, two.y);
        }
    };

}
@SuppressWarnings("all")
public class Otsechka {
    private point one;
    private point two;
    private double length;

    public Otsechka(int x1, int x2, int y1, int y2){
        this.one = new point(x1, y1);
        this.two = new point(x2, y2);
        length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public point getOne(){ return one; }
    public point getTwo(){ return two; }
    public double getLength(){ return length; }
    public static Comparator<Otsechka> byUslovie = new Comparator<Otsechka>() {
        @Override
        public int compare(Otsechka otsechka, Otsechka t1) {
            if(point.byX.compare(otsechka.one, t1.one) == 0){
                if(point.byX.compare(otsechka.two, t1.two) == 0){
                    return Double.compare(otsechka.length, t1.length);
                }
                else return point.byX.compare(otsechka.two, t1.two);
            }
            else return point.byX.compare(otsechka.one, t1.one);
        }
    };


    public static void main(String[] args) {

    }
}
