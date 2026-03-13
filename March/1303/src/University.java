public class University {
    public static void main(String[] args) {
        int N = PoshtenskiKutii.input.nextInt();
        int[][] rooms = new int[N][15];
        for(int[] that : rooms){
            for(int that2 : that) that2 = 0;
        }
        int A, B;
        while(true){
            A = PoshtenskiKutii.input.nextInt();
            B = PoshtenskiKutii.input.nextInt();
            try{
                rooms[A][B]++;
            }catch(IndexOutOfBoundsException e){ break; }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 15; j++){
                if(rooms[i][j] == 0) continue;
                System.out.println("Room " + i + " " + j + ": " + rooms[i][j]);
            }
        }
    }
}
