import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float negetive=0,positive=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) positive++;
            if(arr[i]<0) negetive++;
            if(arr[i]==0) zero++;
        }
        int length=arr.length;
        positive=(float)positive/(float)length;
        negetive=(float)negetive/(float)length;
        zero=(float)zero/(float)length;
        System.out.println(positive+"\n"+negetive+"\n"+zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
