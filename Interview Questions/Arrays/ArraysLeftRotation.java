import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        int i,j,temp,length,rotation;
        length = scanner.nextInt();
        rotation = scanner.nextInt();
        int arr[] = new int [length];
        
        for(i=0;i<length;i++) arr[i] = scanner.nextInt();
        
            while(rotation!=0){
                temp=arr[0];
                for(j=0;j<length-1;j++) arr[j]=arr[j+1];
                arr[length-1]=temp;
            
                rotation--;
            }

            for(i=0;i<length;i++) System.out.print(arr[i]+" ");
    }
}
