import java.util.Scanner;

public class fileExtensionAndName {
    public static String findNameRecursive(String that, char delimeter){
        if(that.indexOf(delimeter) == -1) return that;
        return findNameRecursive(that.substring(that.indexOf(delimeter) + 1), delimeter);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        path = findNameRecursive(path, '/');

        System.out.println(path.substring(0, path.indexOf('.')));
        System.out.println(findNameRecursive(path, '.'));

    }
}
