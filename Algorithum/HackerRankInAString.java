import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String hackerrankInString(String s) {
        String check="hackerrank";
        boolean condition=true;
        int j=0;
        for(int i=0;i<check.length();i++){
            condition = true;
            for(;j<s.length();j++){
                if(check.charAt(i) == s.charAt(j)){
                    System.out.print(s.charAt(j));
                    j++;
                    condition = false;
                    break;
                }
            }
            if(condition) return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
