package Q20190911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2842 {

    static class Pair{
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(br.readLine());
        char[][] chMap = new char[n][n];
        int[][] heightMap = new int[n][n];
        boolean[][] isVisit = new boolean[n][n];
        ArrayList<Pair> Klist = new ArrayList<>();
        Pair curXY = new Pair(0,0);
        int high = -1;
        int low = 1000001;
        int Kcnt = 0;

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < n; j++) {
                chMap[i][j] = line.charAt(j);
                if(chMap[i][j] == 'K') Klist.add(new Pair(i,j));
                if(chMap[i][j] == 'P') {
                    curXY.setXY(i,j);
                }
            }
        }
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                heightMap[i][j] = parseInt(line[j]);
            }
        }
        high = heightMap[curXY.x][curXY.y];
        low = heightMap[curXY.x][curXY.y];
        for(Pair p : Klist) {
            if(high < heightMap[p.x][p.y]) high = heightMap[p.x][p.y];
            if(low > heightMap[p.x][p.y]) low = heightMap[p.x][p.y];
        }

        isVisit[curXY.x][curXY.y] = true;

    }



    private static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
