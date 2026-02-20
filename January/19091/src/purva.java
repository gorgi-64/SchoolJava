import java.util.Scanner;
class Clock{
    private int hours;
    private int minutes;
    private int seconds;
    public Clock(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public Clock(int a, int b, int c){
        hours = a;
        minutes = b;
        seconds = c;
    }
    public void setH(int H){
        hours = H;
    }
    public void setM(int M){
        minutes = M;
    }
    public void setS(int S){
        seconds = S;
    }
    public int getH(){
        return hours;
    }
    public int getM(){
        return minutes;
    }
    public int getS(){
        return seconds;
    }
    public String toString(){
        String s = "";
        s = s + ((hours < 10) ? "0" : "") + hours + ".";
        s = s + ((minutes < 10) ? "0" : "") + minutes + ".";
        s = s + ((seconds < 10) ? "0" : "") + seconds + ".";
        return s;
    }
    public int compareTo(Clock example){
        if( (hours == example.hours) && (minutes == example.minutes) && (seconds == example.seconds)) return 0;
        if(hours > example.hours) return 1;
        else if(hours == example.hours){
            if(minutes > example.minutes) return 1;
            else if(minutes < example.minutes) return -1;
            else{
                 if(seconds > example.seconds) return 1;
                 else return -1;
            }
         }
        else return -1;
        //return 0;
        }

}
public class purva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock first =new Clock(input.nextInt(), input.nextInt(), input.nextInt());
        Clock second = new Clock(input.nextInt(), input.nextInt(), input.nextInt());
        if(first.compareTo(second) == 0) System.out.println("Same");
        else{
            System.out.print("Earlier: ");
            if(first.compareTo(second) == -1) System.out.println(first.toString());
            else System.out.println((second.toString()));
        }
    }
}
