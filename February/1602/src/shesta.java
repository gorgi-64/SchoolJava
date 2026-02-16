public class shesta {
    public static int largestIndex(int[] arr){
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[a]) a = i;
        }
        return a;
    }
    public static void main(String[] args) {
        int sz = purvaq.input.nextInt();
        int[] arr = new int[sz];
        for(int i = 0; i < 10; i++){
            System.out.println(arr[largestIndex(arr)]);
            arr[largestIndex(arr)] = -1;
        }
    }
}
