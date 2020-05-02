import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int product=1;
            for(int j=0;j<n;j++){
                a=a+(product)*b;
                System.out.print(a+" ");
                product=product*2;
            }
            System.out.println("");
        }
        in.close();
    }
}
