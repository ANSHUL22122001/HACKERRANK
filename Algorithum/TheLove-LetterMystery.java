import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s) {
        int length=s.length(),mid,sum=0,times;
        
        if(length%2==0) mid=length/2;
        else mid=length/2+1;

        for(int i=0;i<mid;i++){
            if(s.charAt(i) != s.charAt(length-i-1)){
                times=(int)s.charAt(length-i-1) - (int)s.charAt(i);
                times=Math.abs(times);
                sum=sum+times;
            }
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
