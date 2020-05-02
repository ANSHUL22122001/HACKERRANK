import java.util.Scanner;

public class Solution {
    public static String sortString(String inputString) 
    { 
         
        char tempArray[] = inputString.toCharArray(); 
        char temp;  
        for(int i=0;i<tempArray.length;i++){
            for(int j=0;j<tempArray.length;j++){
                if(tempArray[i]>tempArray[j]){
                    temp=tempArray[i];
                    tempArray[i]=tempArray[j];
                    tempArray[j]=temp;
                }
            } 
        } 
          
        return new String(tempArray); 
    } 
    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        String newAstring = sortString(a);
        String newBstring = sortString(b);
        if(a.length()>b.length() || a.length()<b.length()){
            return false;
        }
        else{
            for(int i =0;i<newAstring.length();i++){
                if(newAstring.charAt(i)!= newBstring.charAt(i)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {