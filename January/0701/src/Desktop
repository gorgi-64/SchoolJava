public class purva {
    public static void arrayPrint(double[] data, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i == n - 1) continue;
            System.out.print(", ");
        }
    }
        public static double arrayAverage(double[] data, int n){
            double average = 0;
            for(int i = 0; i < n; i++){
                average += data[i];
            }
            average /= (double) n;
            return average;
        }
        public static double arrayMin(double[] data, int n){
            double min = data[0];
            for(int i = 1; i < n; i++){
                min = Math.min(min, data[i]);
            }
            return min;
        }

        public static double[] arrayReverse(double[] data, int n){
            double[] reverse = new double[n];
            for(int i = 0; i < n; i++){
                reverse[i] = data[n - i - 1];
            }
            return reverse;
        }
        public static boolean arrayIncreasing(double[] data, int n){
            boolean increasing = true;
            for(int i = 0; i < n; i++){
                if(i > 0 && data[i] < data[i - 1]){
                    increasing = false;
                    break;
                }
            }
            return increasing;
        }
        public static int arrayMiddle(double[] data, int n){
        double compare = ((n % 2 == 0) ? data[(n / 2) - 1] : data[n / 2]);
        int smaller = 0;
        for(int i = 0; i < n; i++){
            if(i == n/2) continue;
            if(data[i] < compare) smaller++;

        }
        return smaller;
    }
    public static double[] arrayEven(double[] data, int n){
        int counter = 0;
        for(int i = 0; i < n; i += 2) counter++;
        double[] even = new double[counter];
        for(int i = 0; i < counter; i++){
            even[i] = data[i * 2];
        }
        return even;
    }

    public static double[] subarray(double[] arr, int n, int elements){
        int size = 0;
        int start = 0;
        if(elements < 0){
            size = Math.abs(elements);
            start = n - Math.abs(elements);
        }
        else{
            size = elements;
            start = 0;
        }
        double[] subarr = new double[size];
        for(int i = start; i < size; i++){
            subarr[start - i] = arr[i];
        }
        return subarr;
    }

    public static double arrayMax(double[] data, int n){
        double max = data[0];
        for(int i = 1; i < n; i++){
            max = Math.max(max, data[i]);
        }
        return max;


    public static void main(String[] args){
        double[] arr = {1, 2, 3, 4, 5, 6, 7};
        arrayPrint(arr, 7);
        System.out.println("\n" + arrayAverage(arr, 7));
        System.out.println(arrayMin(arr, 7));
        arrayPrint(arrayReverse(arr, 7), 5);
        System.out.println("\n" + ((arrayIncreasing(arr, 7)) ? "increasing" : "not increasing"));
        System.out.println(arrayMiddle(arr, 7));
        arrayPrint(arrayEven(arr, 7), (7 / 2 + 1));

    }
}
