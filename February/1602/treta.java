public class treta {
    public static void main(String[] args) {
        int n = purvaq.input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = purvaq.input.nextInt();
        int r = purvaq.input.nextInt();
        boolean a = false;
        for(int i = (r % n); true; i++){
            if((i == (r % n))){
                if(a) break;
                a = false;
            }
            System.out.print(arr[i] + " ");

        }
    }
}
