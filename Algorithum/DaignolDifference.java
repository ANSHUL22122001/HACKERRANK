import java.util.*;


public class Solution {
    
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int limit = object.nextInt();
        int arr[][] = new int [limit][limit];
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                arr[i][j] = object.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                if(i==j) sum1=sum1+arr[i][j];
                if(j==limit-i-1) sum2=sum2+arr[i][j];
            }
        }
        int sum=sum1-sum2;
        if(sum<0) sum=sum*(-1);
        System.out.println(sum);
    }       
}

