import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int howManyGames(int p, int d, int m, int s) {
        int ans=0,num=0,fakeP=p;
        while(fakeP > m){
            fakeP=fakeP-d;
        }
        while(ans<s){
            if(p>m && ans+p<=s){
                ans=ans+p;
                p=p-d;
                num++;
            }
            else {
                System.out.println(fakeP +" "+p);
                if(fakeP == p){      
                    if(ans+m<=s){
                        ans=ans+m;
                        num++;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }            
            }
        }    
        return num;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv          ("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
