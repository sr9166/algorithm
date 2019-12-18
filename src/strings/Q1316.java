package strings;

import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int ans = 0;
        for(int i = 0; i < cnt; i++) {
            String word = scanner.next();
            boolean[] isUsed = new boolean[26];
            char ch = word.charAt(0);
            isUsed[ch-97] = true;
            boolean flag = true;
            for(int j = 1; j < word.length(); j++) {
                if(ch != word.charAt(j)) {
                    ch = word.charAt(j);
                    if(isUsed[ch-97]) {
                        flag = false;
                        break;
                    }
                    else isUsed[ch-97] = true;
                }
            }
            if(flag) ans++;
        }
        System.out.println(ans);
    }
}
