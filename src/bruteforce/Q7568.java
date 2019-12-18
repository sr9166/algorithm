package bruteforce;

import java.util.Scanner;

public class Q7568 {
    static class Pair {
        int weight;
        int height;
        int rank;

        Pair(int weight, int height) {
            this.weight = weight;
            this.height = height;
            this.rank = 1;
        }

        public boolean isBigger(Pair pair) {
            if(this.weight > pair.weight && this.height > pair.height)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Pair[] ary = new Pair[t];
        for(int i = 0; i < t; i++) {
            int weight = scanner.nextInt();
            int height = scanner.nextInt();
            ary[i] = new Pair(weight,height);
        }
        scanner.close();

        for(int i = 0; i < t; i++) {
            for(int j = 0; j < t; j++) {
                if(i == j)
                    continue;
                else if(ary[i].isBigger(ary[j]))
                    ary[j].rank++;
            }
        }

        for(int i = 0; i < t; i++) {
            System.out.print(ary[i].rank + " ");
        }
    }
}
