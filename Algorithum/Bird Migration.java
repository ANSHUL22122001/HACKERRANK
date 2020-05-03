import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner object= new Scanner(System.in);
        int times=0,ans=0,sum;
        int limit = object.nextInt();
        int arr[] = new int[limit];
        for(int i=0; i<limit; i++) arr[i] = object.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i<limit; i++){
            sum=0;
            for(int j=i+1;j<limit; j++){
              if(arr[i] == arr[j]) sum++;
              else break;
            }
            if(sum > times){
                ans=arr[i];
                times=sum;
            }
        } 
        System.out.println(ans);
    }
}
