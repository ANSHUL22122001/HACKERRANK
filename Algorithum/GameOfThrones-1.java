import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s) {
        int[] arr=new int [256];
        for(int i=0;i<s.length();i++){
            int index=(int)s.charAt(i);
            arr[index]++;
        }
        int trigger=0;
        for(int i=0;i<256;i++){
            if(arr[i]%2!=0) trigger++;
            if(trigger>1) return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
