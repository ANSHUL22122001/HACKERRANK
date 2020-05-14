import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i%3==0 && s.charAt(i)!='S') ans++; 
            if(i%3==1 && s.charAt(i)!='O') ans++; 
            if(i%3==2 && s.charAt(i)!='S') ans++;
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
