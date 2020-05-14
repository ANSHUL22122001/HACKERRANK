import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] quickSort(int[] arr) {
        int check=arr[0],pArray=0,qArray=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=check) pArray++;
            else qArray++;
        }

        int[] prr=new int[pArray];
        int[] qrr=new int[qArray];
        int p=0,q=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=check){
                prr[p]=arr[i];
                p++;
            }
            else{
                qrr[q]=arr[i];
                q++;
            }
        }

        int[] srr=new int[arr.length];
        int sArray=0;
        for(int i=0;i<p;i++,sArray++) srr[sArray]=prr[i];
        srr[sArray]=arr[0];
        sArray++;
        for(int i=0;i<q;i++,sArray++) srr[sArray]=qrr[i];
        
        return srr;
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

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
