import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CandidateCompare implements Comparator<Candidate03>{
    @Override
    public int compare(Candidate03 one, Candidate03 two){
        if(one.test != two.test) return ((one.test > two.test) ? -1 : 1);
        if(one.intern != two.intern) return ((one.intern > two.intern) ? -1 : 1);
        return 0;
    }
}
public class Candidate03{
        String name;
        int test;
        int intern;
        public Candidate03(String name, int test, int intern){
            this.name = name;
            this.test = test;
            this.intern = intern;
        }
    public static void main(String[] args) {
        Main.mmain();
    }
}

class Main{
    static Scanner input = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    public static void mmain(){

        Candidate03[] candidates = new Candidate03[input.nextInt()];
        for(int i = 0; i < candidates.length; i++){
            candidates[i] = new Candidate03(str.nextLine(), input.nextInt(), input.nextInt());
        }
        Arrays.sort(candidates, new CandidateCompare());
        for(Candidate03 that : candidates){
            System.out.println(that.name);
        }
    }

}

