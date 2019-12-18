import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        char [] input1=a.toCharArray();
        char [] input2=b.toCharArray();
        java.util.Arrays.sort(input1);
        java.util.Arrays.sort(input2);
        a=java.util.Arrays.toString(input1);
        b=java.util.Arrays.toString(input2);
        if(a.equals(b)){
            return true;
        }
        else
        {
            return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
