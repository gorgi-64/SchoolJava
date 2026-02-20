import java.util.Scanner;
class Candidate{
    private String name;
    private int age;
    private int number;
    public Candidate(String name, int age, int number){
        this.name = name;
        this.age = age;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getNumber(){
        return number;
    }
}
public class Candidates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int N = input.nextInt();
        Candidate[] arr = new Candidate[N];
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++){
            numbers[i] = i;
            arr[i] = new Candidate(str.nextLine(), input.nextInt(), input.nextInt());
        }
        for(int i = 0; i < N - 1; i++){
            for(int j = 0; j < N; j++){
                if(arr[i].getAge() > arr[j].getAge()){
                    Candidate temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int that : numbers){
            Candidate thatOne = arr[that];
            System.out.println(thatOne.getName() + " " + thatOne.getAge() + " " + thatOne.getNumber());
        }
    }
}
