import java.util.HashSet;
public class reverseUnique {
    public static int[] reverse(int[] pirate){
        int[] copy = new int[pirate.length];
        for(int i = 0; i < copy.length; i++){
            copy[i] = pirate[copy.length - i - 1];
        }
        return copy;
    }
    public static int[] replace(int[] pirate, int x, int y){
        for(int i = 0; i < pirate.length; i++){
            pirate[i] = ((pirate[i] == x) ? y : pirate[i]);
        }
        return pirate;
    }
    public static int[] distinct(int[] pirate){
        HashSet<Integer> unique = new HashSet<>();
        for(int that : pirate){
            unique.add(that);
        }
        int counter = 0;
        int[] arr = new int[unique.size()];
        for(int that : unique) arr[counter++] = that;
        return arr;
    }
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int a = matrixMultiplication.input.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = matrixMultiplication.input.nextInt();
        }
        arr = reverse(arr);
        int x = matrixMultiplication.input.nextInt();
        int y = matrixMultiplication.input.nextInt();
        arr = replace(arr, x, y);
        arr = distinct(arr);
        for(int that : arr) System.out.println(that);
    }
}
