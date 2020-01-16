package SWEA_D3;

import java.io.*;
import java.util.Arrays;

public class Q1221 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int TESTSIZE = Integer.parseInt(br.readLine());

        for (int TEST = 0; TEST < TESTSIZE; TEST++) {
            String[] inputs = br.readLine().split(" ");
            String testNumber = inputs[0];
            int length = Integer.parseInt(inputs[1]);
            int[] arr = new int[length];
            inputs = br.readLine().split(" ");
            for (int i = 0; i < length; i++) {
                arr[i] = stringToInteger(inputs[i]);
            }

            Arrays.sort(arr);
            bw.write(testNumber);
            bw.newLine();
            bw.write(intToString(arr[0]));
            for(int i = 1; i < length; i++) {
                bw.write(" " + intToString(arr[i]));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static String intToString(int val) {
        if(val == 0) return "ZRO";
        else if(val == 1) return "ONE";
        else if(val == 2) return "TWO";
        else if(val == 3) return "THR";
        else if(val == 4) return "FOR";
        else if(val == 5) return "FIV";
        else if(val == 6) return "SIX";
        else if(val == 7) return "SVN";
        else if(val == 8) return "EGT";
        else if(val == 9) return "NIN";
        else return "NULL";
    }

    static int stringToInteger(String val) {
        if(val.equals("ZRO")) return 0;
        else if(val.equals("ONE")) return 1;
        else if(val.equals("TWO")) return 2;
        else if(val.equals("THR")) return 3;
        else if(val.equals("FOR")) return 4;
        else if(val.equals("FIV")) return 5;
        else if(val.equals("SIX")) return 6;
        else if(val.equals("SVN")) return 7;
        else if(val.equals("EGT")) return 8;
        else if(val.equals("NIN")) return 9;
        else return -1;
    }
}
