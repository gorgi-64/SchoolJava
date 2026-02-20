import java.util.Scanner;
public class vtora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int[] pirate = new int[B];
        int even = 0;
        boolean increasing = true;
        for(int i = 0; i < B; i++){
            pirate[i] = input.nextInt();
            if(pirate[i] % 2 == 0) even++;
            if(i != 0 && pirate[i - 1] > pirate[i]) increasing = false;
        }
        System.out.println("Брой на четни: " + even);
        System.out.println("Увеличаващо: " + ((increasing) ? "Да" : "Не"));
        for(int i = 0; i < B; i++){
            System.out.print(pirate[i]);
            if(i == B - 1) continue;
            System.out.print(", ");
        }
    }
}
