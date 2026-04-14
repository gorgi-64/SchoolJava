import java.util.Scanner;

class Ship{
    private int length;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private char type;
    private int hp;
    private int totalCooldown;
    private int cooldown;

    //C B R  D
    public Ship(int x1, int y1, char type, boolean horizontal){
        this.x1 = x1;
        this.y1 = y1;
        x2 = horizontal ? x1 + length : x1;
        y2 = horizontal ? y1 : y1 + length;
        switch(type){
            case 'C':
                hp = 7;
                totalCooldown = 4;
                length = 5;
                break;
            case 'B':
                hp = 6;
                totalCooldown = 2;
                length = 4;
                break;
            case 'R':
                hp = 6;
                totalCooldown = 4;
                length = 3;
                break;
            case 'D':
                hp = 5;
                totalCooldown = 1;
                length = 2;
        }
        this.type = type;

        cooldown = 0;
    }
    public boolean isPlayable(){
        if(hp == 0) type = '-';
        return (hp != 0);
    }
    public void attacked(){
        hp -= 1;
    }
    public int[][] attack(){
        int center = new Scanner(System.in).nextInt();
        if(type == 'D') return new int[][]{new int[]{center}};
        //if(type == 'R' || type == 'B') return new int
        return null;
    }

}
public class Battleship {
    public static void main(String[] args) {

    }
}
