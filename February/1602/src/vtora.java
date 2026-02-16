public class vtora {
    public static void thing(){
        int n = purvaq.input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            int temp1 = purvaq.input.nextInt();
            int temp2 = purvaq.input.nextInt();
            a[i] = temp1;
            b[i] = temp2;
            if(i % 2 == 1){
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        thing();
    }
}
