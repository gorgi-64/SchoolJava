public class chetvurta {
    public static void main(String[] args) {
        int sz = purvaq.input.nextInt();
        int[] arr = new int[sz];
        for(int i = 0; i < sz; i++) arr[i] = purvaq.input.nextInt();
        int longestE = arr[0];
        int lengthL = 1;
        int longestC = arr[0];
        int lengthC = 1;
        for(int i = 1; i < sz; i++){
            if(arr[i] == longestC) lengthC++;
            else{
                if(lengthC >= lengthL){
                    lengthL = lengthC;
                    longestE = longestC;
                    longestC = arr[i];
                    lengthC = 1;
                }
            }

        }
        System.out.println(lengthL + ", " + longestE);
    }
}
