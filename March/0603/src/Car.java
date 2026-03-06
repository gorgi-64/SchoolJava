import java.sql.Time;
import java.util.Arrays;
import java.util.Comparator;
public class Car{
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
    public Car(String model, int year, int maxSpeed){
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;

    }
}
class Mother{
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
}
