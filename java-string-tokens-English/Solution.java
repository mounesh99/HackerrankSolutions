import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String delm="[^a-zA-Z]+";
        s=s.trim();
        String [] arr=s.split(delm);
        if(s.length()==0){
            System.out.println("0");
            return ;
        }
        else if(s.length()>400000){
            return;
        }
        else
        {
            System.out.println(arr.length);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}

