package strings;

        import java.util.Scanner;

public class Q11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        char ch = str.charAt(0);
        int ascii = ch;
        System.out.println(ascii);
    }
}
