import java.util.Arrays;
import java.util.Comparator;

public class Travel {
    int StartHour;
    double time;
    int price;
    String whereTo;
    public Travel(int StartHour, double time, int price, String whereTo){
        this.StartHour = StartHour;
        this.time = time;
        this.price = price;
        this.whereTo = whereTo;
    }
    public static Comparator<Travel> byStart = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if(travel.StartHour != t1.StartHour) return ((travel.StartHour > t1.StartHour) ? 1 : -1);
            return 0;
        }
    };
    public static Comparator<Travel> byTime = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if(travel.time != t1.time) return ((travel.time > t1.time) ? 1 : -1);
            return 0;
        }
    };
    public static Comparator<Travel> byPrice = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if(travel.price != t1.price) return ((travel.price > t1.price) ? 1 : -1);
            return 0;
        }
    };
    public static void main(String[] args) {
        Travel[] options = new Travel[Main.input.nextInt()];
        for(int i = 0; i < options.length; i++){
            options[i] = new Travel(Main.input.nextInt(), Main.input.nextDouble(), Main.input.nextInt(), Main.str.nextLine());
        }
        int choice = Main.input.nextInt(); //1: by start, 2: by time, 3: by price
        if(choice == 1) Arrays.sort(options, byStart);
        if(choice == 2) Arrays.sort(options, byTime);
        if(choice == 3) Arrays.sort(options, byPrice);
        for(Travel that : options){
            System.out.println(that.whereTo);
        }
    }
}
