import java.util.*;

public class Solution{
    public static void main(String[] args){
        int i,j,arr[][],sum=0,ans=0;
        arr = new int [6][6];
        Scanner object = new Scanner(System.in);
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                arr[i][j]=object.nextInt();
            }
        }
        i=0;
        j=0;
        ans=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
            sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(ans<sum) ans=sum;
            }
        }
        System.out.println(ans);
    }
}
