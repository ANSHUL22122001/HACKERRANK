import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s) {
        int mid;
        if(s.length()%2==0)mid=(s.length()/2)+1;
        else mid=(s.length()/2)+2;
        System.out.println(mid);

        for(int i=0;i<mid;i++){
            int dif1=(int)s.charAt(i)-(int)s.charAt(i+1);
            int dif2=(int)s.charAt(s.length()-1-i)-(int)s.charAt(s.length()-2-i);
            dif1=Math.abs(dif1);
            dif2=Math.abs(dif2);
            System.out.println(dif1+" "+dif2);
            if(dif1!=dif2) return "Not Funny";
        } 
        return "Funny";
    }
 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
