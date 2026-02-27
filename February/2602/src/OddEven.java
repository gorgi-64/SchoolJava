public class OddEven {
    public static int[] subArray(int[] arr, int start, int end){
        int[] newa = new int[end - start];
        int counter = 0;
        for(int i = start; i < end; i++){
            newa[counter] = arr[i];
            counter++;
        }
        return newa;
    }
    public static int[] sort(int[] arr){
        int[] copy = arr.clone();
        return ArraysPractice.InsertSort(copy);
    }
    public static int[] reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    public static int[] arrangeOddEven(int[] arr){
        int evenn = 0;
        for (int j : arr) evenn += ((j % 2 == 0) ? 1 : 0);
        int oddn = arr.length - 1;
        int[] even = new int[evenn];
        int[] odd = new int[oddn];
        arr = BinarySearchTask.mergeArr(even, odd);
        arr = BinarySearchTask.mergeArr(sort(subArray(arr, 0, evenn)), reverse(sort(subArray(arr, evenn + 1, arr.length))));
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = ArraysPractice.input();
        ArraysPractice.print(arr);
        arr = arrangeOddEven(arr);
        ArraysPractice.print(arr);
    }
}
