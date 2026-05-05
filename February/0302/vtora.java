import java.util.Scanner;
abstract class Animal {
    protected int age;
    protected String name;
    protected String gender;
    abstract void makeSound();
    public void eat() {
        System.out.println("Аз мога да ям.");
    }
    abstract void printAll();
}
class Dog extends Animal {
    public Dog(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    // предоставя се имплементация на абстрактния метод
    public void makeSound() { System.out.println("Бау-бау");
    }
    public void printAll(){
        System.out.println("Name: " + name + "Age: " + age + "Gender: " + gender);
    }
    public void eat(){
        System.out.println("Az sum " + name + "i moga da qm");
    }
}
class Cat extends Animal {
    public Cat(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    // предоставя се имплементация на абстрактния метод
    public void makeSound() { System.out.println("Мяу-мяу ");
    }
    @Override
    public void printAll(){
        System.out.println("Name: " + name + "Age: " + age + "Gender: " + gender);
    }
    @Override
    public void eat(){
        System.out.println("Az sum " + name + "i moga da qm");
    }
}
class Rabbit extends Animal{
    public Rabbit(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    @Override
    public void makeSound(){System.out.println("Ne izdavam zvuci"); }
    @Override
    public void printAll(){
        System.out.println("Name: " + name + "Age: " + age + "Gender: " + gender);
    }
    @Override
    public void eat(){
        System.out.println("Az sum " + name + "i moga da qm");
    }
}
public class vtora {
    public static void main(String[] args) {
        Dog d1 = new Dog(5, "Sharo", "Muj");
        d1.makeSound();
        d1.eat();
        Cat c1 = new Cat(5, "Pisana", "Jena");
        c1.makeSound();
        Rabbit r1 = new Rabbit(2, "Gabi", "Jena");
        r1.makeSound();
        r1.eat();
    }
}