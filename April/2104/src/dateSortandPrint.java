import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Date{
    int year;
    int month;
    int day;
    public String str;
    public Date(String str){
        this.str = str;
        year = Integer.parseInt(str.substring(0, 4));
        month = Integer.parseInt(str.substring(5, 7));
        day = Integer.parseInt(str.substring(9, 10));
    }
    @Override
    public String toString(){
        return year + "/" + month + "/" + day;
    }
    static Comparator<Date> compareDate = new Comparator<Date>() {
        @Override
        public int compare(Date o, Date t1) {
            if(o.year == t1.year){
                if(o.month == t1.month){
                    return o.day - t1.day;
                }
                else return o.month - t1.month;
            }
            else return o.year - t1.year;
        }
    };

}
public class dateSortandPrint {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        Date[] arr = new Date[N];
        for(int i = 0; i < N; i++){
            arr[i] = new Date(new Scanner(System.in).nextLine());
        }
        for(Date string : arr){
            System.out.println(string);
        }
        StringBuilder str = new StringBuilder();
        System.gc();
        for(Date string : arr){
            str.append(string.toString()).append(" ");
        }
        System.out.println(str);
        Arrays.sort(arr, Date.compareDate);
        for(Date date : arr) {
            System.out.print(date.toString() + ", ");
        }
    }
}
