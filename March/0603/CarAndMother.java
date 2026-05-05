import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

interface Sortable {
    Comparator<? extends Sortable> getComparator();
    void printName();
    Sortable create();
    static Scanner input = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
}
class Car implements Sortable{
    String model;
    int year;
    int maxSpeed;
    public static Comparator<Car> comparatorCar = new Comparator<Car>() {
        @Override
        public int compare(Car car, Car t1) {
            if(car.maxSpeed != t1.maxSpeed) return ((car.maxSpeed > t1.maxSpeed) ? 1 : -1);
            if(car.year != t1.year) return ((car.year < t1.year) ? 1 : -1);
            return car.model.compareTo(t1.model);
        }
    };
    @Override
    @SuppressWarnings("all")
    public Sortable create() {
        return new Car(Sortable.str.nextLine(), Sortable.input.nextInt(), Sortable.input.nextInt());
    }

    public Car(String model, int year, int maxSpeed){
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;

    }
    public Comparator<Car> getComparator(){
        return comparatorCar;
    }
    public void printName(){
        System.out.println(model);
    }
}
class Mother implements Sortable{
    String name;
    int age;
    int kids;
    public Mother(String name, int age, int kids){
        this.name = name;
        this.age = age;
        this.kids = kids;
    }
    public static Comparator<Mother> comparatorMother = new Comparator<Mother>() {
        @Override
        public int compare(Mother one, Mother two) {
            if(one.age > two.age) return 1;
            if(one.age < two.age) return -1;
            if(one.kids > two.kids) return 1;
            if(two.kids > one.kids) return -1;
            return one.name.compareTo(two.name);
        }
    };
    @Override
    @SuppressWarnings("all")
    public Sortable create() {
        return new Mother(Sortable.str.nextLine(), Sortable.input.nextInt(), Sortable.input.nextInt());
    }
    public Comparator<Mother> getComparator(){
        return comparatorMother;
    }
    public void printName(){
        System.out.println(name);
    }
}
class Main17{
    public static <T extends Sortable> void does(T[] arr, Comparator<T> comparator){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (T) arr[i].create();
        }
        Arrays.sort(arr, comparator);
        for(T that : arr) that.printName();
    }
}
class Travel implements Sortable {
    int StartHour;
    double time;
    int price;
    String whereTo;

    public Travel(int StartHour, double time, int price, String whereTo, int choice) {
        this.StartHour = StartHour;
        this.time = time;
        this.price = price;
        this.whereTo = whereTo;
        if (choice == 1) comparator = byStart;
        if (choice == 2) comparator = byTime;
        if (choice == 3) comparator = byPrice;
    }

    public static Comparator<Travel> comparator;
    public static Comparator<Travel> byStart = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if (travel.StartHour != t1.StartHour) return ((travel.StartHour > t1.StartHour) ? 1 : -1);
            return 0;
        }
    };
    public static Comparator<Travel> byTime = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if (travel.time != t1.time) return ((travel.time > t1.time) ? 1 : -1);
            return 0;
        }
    };
    public static Comparator<Travel> byPrice = new Comparator<Travel>() {
        @Override
        public int compare(Travel travel, Travel t1) {
            if (travel.price != t1.price) return ((travel.price > t1.price) ? 1 : -1);
            return 0;
        }
    };

    @Override
    public Comparator<Travel> getComparator() {
        return comparator;
    }

    @Override
    public void printName() {
        System.out.println(whereTo);
    }

    @Override
    public Sortable create() {
        return new Travel(Sortable.input.nextInt(), Sortable.input.nextDouble(), Sortable.input.nextInt(), Sortable.str.nextLine(), Sortable.input.nextInt());
    }
}
class Candidate03 implements Sortable {
    String name;
    int test;
    int intern;
    public static Comparator<Candidate03> comparator = new Comparator<Candidate03>() {
        @Override
        public int compare(Candidate03 one, Candidate03 two) {
            if (one.test != two.test) return ((one.test > two.test) ? -1 : 1);
            if (one.intern != two.intern) return ((one.intern > two.intern) ? -1 : 1);
            return 0;
        }
    };

    @Override
    public Comparator<Candidate03> getComparator() {
        return Candidate03.comparator;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public Sortable create() {
        return new Candidate03(Sortable.str.nextLine(), Sortable.input.nextInt(), Sortable.input.nextInt());
    }

    public Candidate03(String name, int test, int intern) {
        this.name = name;
        this.test = test;
        this.intern = intern;
    }
}
public class CarAndMother {
    public static void main(String[] args) {
        int choiceTask = Sortable.input.nextInt();
        if(choiceTask == 1){
            Travel[] arr = new Travel[Sortable.input.nextInt()];
            Main17.does(arr, Travel.comparator);
        }
        else if(choiceTask == 2){
            Candidate03[] arr = new Candidate03[Sortable.input.nextInt()];
            Main17.does(arr, Candidate03.comparator);
        }
        else if(choiceTask == 3){
            Car[] arr = new Car[Sortable.input.nextInt()];
            Main17.does(arr, Car.comparatorCar);
        }
        else if(choiceTask == 4){
            Mother[] arr = new Mother[Sortable.input.nextInt()];
            Main17.does(arr, Mother.comparatorMother);
        }
    }
}