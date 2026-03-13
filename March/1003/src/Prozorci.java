public class Prozorci {
    public static void main(String[] args) {
        int M, N;
        //M= PoshtenskiKutii.input.nextInt(); N = PoshtenskiKutii.input.nextInt();
        M = 3; N = 4;
        for(int i = M; i > 0; i--){
            if(i % 2 == 1){
                for(int j = N; j > 0; j--){
                    int v = (i * 10) + j;
                    System.out.print(v + " " + v + " ");
                    if(j % 2 == 1) System.out.print(v +  " " );
                }
            }
            if(i % 2 == 0){
                for(int j = N; j > 0; j--){
                    int v = (i * 10) + j;
                    System.out.print(v + " " + v + " ");
                    if(j % 2 == 0) System.out.print(v +  " " );
                }
            }
            System.out.print("\n");
        }
    }
}
