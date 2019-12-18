package Q20190925;

import java.io.*;

public class Q11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        long[][] DP = new long[n][n];

        for(int i = 0; i < n; i++) {
            line = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                DP[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = 1; i < n; i++) {
            DP[0][i] += DP[0][i-1];
        }
        for(int i = 1; i < n; i++) {
            DP[i][0] += DP[i-1][0];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                DP[i][j] += (DP[i-1][j] + DP[i][j-1] - DP[i-1][j-1]);
            }
        }

        int x1,y1,x2,y2;
        for(int i = 0; i < m; i++) {
            line = br.readLine().split(" ");
            x1 = Integer.parseInt(line[0])-1;
            y1 = Integer.parseInt(line[1])-1;
            x2 = Integer.parseInt(line[2])-1;
            y2 = Integer.parseInt(line[3])-1;

            if(x1==0 && y1==0) {
                bw.write(DP[x2][y2] + "\n");
            } else if(x1>0 && y1==0) {
                bw.write(DP[x2][y2] - DP[x1-1][y2] + "\n");
            } else if(x1==0 && y1>0) {
                bw.write(DP[x2][y2] - DP[x2][y1-1] + "\n");
            } else { // x1>1, y1>1
                bw.write(DP[x2][y2] - DP[x2][y1-1] - DP[x1-1][y2] + DP[x1-1][y1-1] + "\n");
            }
        }
        bw.flush();
    }
}
