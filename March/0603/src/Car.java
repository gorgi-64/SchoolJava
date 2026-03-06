import java.util.Arrays;
import java.util.Comparator;
interface Sortable {
    Comparator<? extends Sortable> getComparator();
    void printName();
    Sortable create();
}
public class Car implements Sortable{
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
        return new Car(Main.str.nextLine(), Main.input.nextInt(), Main.input.nextInt());
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

    public static void main(String[] args) {
        int choiceTask = Main.input.nextInt();
        if(choiceTask == 1){
            Car[] arr = new Car[Main.input.nextInt()];
            Main17.does(arr, Car.comparatorCar);
        }
        else{
            Mother[] arr = new Mother[Main.input.nextInt()];
            Main17.does(arr, Mother.comparatorMother);
        }
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
        return new Mother(Main.str.nextLine(), Main.input.nextInt(), Main.input.nextInt());
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
