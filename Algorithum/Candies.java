import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        int srr[]=new int [arr.length];
        int drr[]=new int [arr.length];
        //made two array and increment the value by 1
        for(int i=0;i<arr.length;i++) {
            srr[i]++;
            drr[i]++;
        }
        //started from one and check whether the condition form left 
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]) srr[i]=srr[i-1]+1;
        }
	//started from one and check whether the condition form right
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]<arr[i-1]) drr[i-1]=drr[i]+1;
        }
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(srr[i]>=drr[i]) sum+=srr[i];
            else sum+=drr[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
