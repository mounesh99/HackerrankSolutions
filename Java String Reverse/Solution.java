import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag=true;
        int l=A.length();
        for(int i=0;i<l;i++){
            if(A.charAt(i)!=A.charAt(l-i-1)){
                flag=false;
            }

        }
        if(flag==true){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }
        
    }
}



