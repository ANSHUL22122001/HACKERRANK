import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        int lar=0,times=1,num=0,sum;
        for(int i=0;i<arr.length;i++){
            times=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) times++;
                else break;
            }
            if(times>lar) {
                num=arr[i];
                lar=times;
            }
        }
        sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num) sum++;
        }
        if(sum!=0) return (arr.length)-(sum);
        else return (arr.length)-(1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
