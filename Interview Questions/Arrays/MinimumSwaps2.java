import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        long fakeindex=0,number;
        int temp,ans=0;
        boolean condition;
        int []srr=new int [arr.length];
        for(int i=0;i<arr.length;i++) srr[i]=arr[i];
        Arrays.sort(srr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(srr[i]==arr[i]){
                    break;
                }
                else if(srr[i]==arr[j]){
                    temp=arr[i];
                    arr[j]=arr[j];
                    arr[j]=temp;
                    ans++;
                    break;
                    //System.out.println(temp+" "+i);
                }
            }
        }
       


        /*for(int i=0;i<arr.length;i++){
            number=arr[i];
            condition=false;
            for(int j=i;j<arr.length;j++){
                if(number>arr[j]){
                    number=arr[j];
                    fakeindex=j;
                    condition=true;
                }
            }
            if(condition){
                temp=arr[i];
                arr[i]=arr[fakeindex];
                arr[fakeindex]=temp;
                ans++;
                //System.out.println(temp+" "+i);
            }
        }*/
        return ans;
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

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
