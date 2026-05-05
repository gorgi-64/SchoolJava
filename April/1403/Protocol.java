import java.util.Scanner;

public class Protocol {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String that = new Scanner(System.in).nextLine();
        String protocol = that.substring(0, that.indexOf("://"));
        System.out.println(protocol);
        String site = that.substring(that.indexOf("://") + 3, that.length());
        System.out.println(site.substring(0, site.indexOf('/')));
        System.out.println(site.substring(site.indexOf('/'), site.length()));

    }
}
