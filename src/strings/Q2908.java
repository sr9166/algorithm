package strings;

        import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sa = scanner.next();
        String sb = scanner.next();
        scanner.close();
        int ia = (sa.charAt(0) - '0') + (sa.charAt(1) - '0')*10 + (sa.charAt(2) - '0')*100;
        int ib = (sb.charAt(0) - '0') + (sb.charAt(1) - '0')*10 + (sb.charAt(2) - '0')*100;
        System.out.println(Math.max(ia, ib));
    }
}
