import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String newString ="";
        int SI;
        if(k>=26) k=k%26;
        for(int i=0;i<s.length();i++){
            SI=(int)s.charAt(i);

            if((SI>=65 && SI<=90)){
                SI=SI+k;
                if(SI>90) SI=SI-26;
            }
            if(SI>=97 && SI<=122){ 
                SI=SI+k;
                if(SI>122) SI=SI-26;
            }

            newString=newString+(char)SI;
        }
        return newString;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
