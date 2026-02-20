import java.util.Scanner;

class slujitel{
    String ID;
    double salary;
    public slujitel(String str, double Int){
        ID = str;
        salary = Int;
    }
    public String getID(){
        return ID;
    }
    public double getSal(){
        return salary;
    }
}
public class purva {
    public static int arrayAboveAverage(slujitel[] data, int n){
        double average = arrayAverage(data, n);
        int counter = 0;
        for(int i = 0; i < n; i++){
            if(data[i].getSal() > average) counter++;
        }
        return counter;
    }
    public static double arrayAverage(slujitel[] data, int n){
        double average = 0;
        for(int i = 0; i < n; i++){
            average += data[i].getSal();
        }
        average /= (double) n;
        return average;
    }
    public static String arrayMin(slujitel[] data, int n, boolean ID){
        double min = data[0].getSal();
        String mins = data[0].getID();
        for(int i = 1; i < n; i++){
            if(min > data[0].getSal()){
                min = data[i].getSal();
                mins = data[i].getID();
            }
        }
        if(ID) return mins;
        return Double.toString(min);
    }

    public static String arrayMax(slujitel[] data, int n, boolean ID) {
        double min = data[0].getSal();
        String mins = data[0].getID();
        for(int i = 1; i < n; i++){
            if(min < data[i].getSal()){
                min = data[i].getSal();
                mins = data[i].getID();
            }
        }
        if(ID) return mins;
        return Double.toString(min);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int N = input.nextInt();
        slujitel[] workers = new slujitel[N];

        for(int i = 0; i < N; i++){
            String kod = str.nextLine();
            double temp = input.nextDouble();
            workers[i] = new slujitel(kod, temp);
        }

        System.out.println("Average salary: " + arrayAverage(workers, N));
        System.out.println("Minimum salary: " + arrayMin(workers, N, false));
        System.out.println("Maximum salary: " + arrayMax(workers, N, false));
        System.out.println("Worker with min. sal.: " + arrayMin(workers, N, true));
        System.out.println("Worker with max. sal.:" + arrayMax(workers, N, true));
        System.out.println("Percentage: " + (((double)arrayAboveAverage(workers, N)/N) * 100) + "%");
    }
}
