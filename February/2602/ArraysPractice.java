import java.util.Scanner;
public class ArraysPractice {
    public static Scanner input = new Scanner(System.in);
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ((i == arr.length - 1) ? "" : ", "));
        }
    }
    public static int[] input(){
        int[] arr = new int[input.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i : arr) sum += i;
        return sum;
    }
    public int product(int[] arr){
        int product = 1;
        for(int i : arr) product *= i;
        return product;
    }
    public double average(int[] arr) {
        if(arr.length == 0){
            System.err.println("Error");
            System.exit(1);
        }
        return (double) product(arr) / arr.length;
    }
    public int minIndex(int[] arr){
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            index = ((arr[i] < arr[index]) ? i : index);
        }
        return index;
    }
    public static int maxIndex(int[] arr){
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            index = ((arr[i] > arr[index]) ? i : index);
        }
        return index;
    }
    public int min(int[] arr){ return arr[minIndex(arr)];}
    public int max(int[] arr){ return arr[maxIndex(arr)];}
    public int find(int[] arr, int search){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search) return i;
        }
        return -1;
    }
    public static int[] InsertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    public static int[] ShakerSort(int[] arr){
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while(swapped){
            swapped = false;
            for(int i = start; i < end; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;

            swapped = false;
            end--;
            for(int i = end - 1; i >= start; i--){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
        return arr;
    }
    public static void main(String[] args) {


    }
}

