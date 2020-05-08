import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int[] arr = new int [n];
        for(int i=0;i<n;i++) arr[i]=i+1;
        int LtoR=0;
        for(int i=0;i<n;i++){
            LtoR++;
            if(arr[i]==p) break;
        }
        int RtoL;
        if(n%2==0) RtoL=1;
        else RtoL=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==p) break;
            else RtoL++;
        }
        LtoR=LtoR/2 ;
        RtoL=RtoL/2 ;
        if(LtoR < RtoL) return LtoR;
        else return RtoL;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
