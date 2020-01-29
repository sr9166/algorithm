package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1924 {
    public static int getMonth(String m) {
        if(m.equals("1")) return 0;
        else if(m.equals("2")) return 31;
        else if(m.equals("3")) return 59;
        else if(m.equals("4")) return 90;
        else if(m.equals("5")) return 120;
        else if(m.equals("6")) return 151;
        else if(m.equals("7")) return 181;
        else if(m.equals("8")) return 212;
        else if(m.equals("9")) return 243;
        else if(m.equals("10")) return 273;
        else if(m.equals("11")) return 304;
        else if(m.equals("12")) return 334;
        else return -1;
    }
    public static String getDay(int day) {
        //SUN, MON, TUE, WED, THU, FRI, SAT
        if(day == 0) return "SUN";
        else if(day == 1) return "MON";
        else if(day == 2) return "TUE";
        else if(day == 3) return "WED";
        else if(day == 4) return "THU";
        else if(day == 5) return "FRI";
        else if(day == 6) return "SAT";
        else return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();

        String m = line.split(" ")[0];
        int d = Integer.parseInt(line.split(" ")[1]);
        System.out.println(getDay((getMonth(m)+d)%7));
    }
}
