public class FileFromPath {
    public static String findNameRecursive(String that, char delimiter){
        if(that.indexOf(delimiter) == -1) return that;
        return findNameRecursive(that.substring(that.indexOf(delimiter) + 1), delimiter);
    }
    public static void main(String[] args) {
        System.out.println(findNameRecursive(args[0], '/'));
    }
}
