import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    public static String findDay(int month, int day, int year) {
        int D = year%100;
        int C = year/100;
        int ans=month+(((13*day)-1)/5) +D+ (D/4) +(C/4)-2*C;
        if(ans==0) return "SUNDAY";
        else if(ans==1) return "MONDAY";
        else if(ans==2) return "TUESDAY";
        else if(ans==3) return "WEDNESDAY";
        else if(ans==4) return "THRUSDAY";
        else if(ans==5) return "FRIDAY";
        else if(ans==6) return "SATURDAY";
        else return "0";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
