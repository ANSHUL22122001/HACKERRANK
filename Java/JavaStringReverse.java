import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        boolean cond = false;
        String oldString,newString="";
        Scanner sc=new Scanner(System.in);
        oldString=sc.next();

        int length = oldString.length();
        for(int i=length-1;i>=0;i--) newString=newString+oldString.charAt(i);

        for(int i=0;i<length;i++){
        if(newString.charAt(i)!=oldString.charAt(i)) cond=true;
        }

        if(cond) System.out.println("No");
        else System.out.println("Yes");
        
    }
}



