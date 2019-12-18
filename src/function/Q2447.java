package function;

public class Q2447 {
    public static void main(String[] args) {
        star(27, "***\n" +
                "\n" +
                "* *\n" +
                "\n" +
                "***");
    }

    private static void star(int n, String pattern) {
        StringBuilder sb = new StringBuilder();
        sb.append(pattern);
        sb.append(pattern);
        sb.append(pattern);
        sb.append("\n\n");

        sb.append(pattern);
        for(int i = 0; i < pattern.length(); i++) {
            sb.append(" ");
        }
        sb.append(pattern);
        sb.append("\n\n");

        sb.append(pattern);
        sb.append(pattern);
        sb.append(pattern);
        sb.append("\n\n");

        System.out.println(sb.toString());
    }
}
