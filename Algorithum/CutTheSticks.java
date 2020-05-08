import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int i,min=0,k=0;
        int[] srr=new int [1000];
        boolean condition=true;
        while(condition){
            int sum=0;
            for(i=0;i<arr.length;i++){
                if(arr[i]!=0) sum++;
            }
            srr[k]=sum;
            k++;
            
            for(i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    min=arr[i];
                    break;
                }
            }

            for(;i<arr.length;i++) arr[i] = arr[i]-min;
            
            if(arr[arr.length-1]<=0) condition=false;
        }
        int[] drr=new int [k];
        for(i=0;i<srr.length;i++){
            if(srr[i]!=0) drr[i]=srr[i];
            else break;
        }  
        return drr;
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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
