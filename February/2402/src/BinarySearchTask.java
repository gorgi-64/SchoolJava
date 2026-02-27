import java.util.Scanner;
import java.util.Arrays;
public class BinarySearchTask {
    static Scanner input = new Scanner(System.in);

    public static int[] mergeArr(int[] one, int[] two) {
        int[] three = new int[one.length + two.length];
        int counter = 0;
        for (int i = 0; i < one.length; i++) {
            three[counter] = one[i];
            counter++;
        }
        for (int i = 0; i < two.length; i++) {
            three[counter] = two[i];
            counter++;
        }
        return three;
    }

    public static int[] readArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int find) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = (start + end) / 2;
            if (arr[m] == find) return m;
            if (arr[m] < find) end = m - 1;
            if (arr[m] > find) start = m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] one = readArray(input.nextInt()), two = readArray(input.nextInt());
        int[] three = mergeArr(one, two);
        int find = input.nextInt();
        //System.out.println("Hello");
        int found = binarySearch(three, find);
        System.out.println((found != -1) ? (found + " ") : "Not found");
    }
}
