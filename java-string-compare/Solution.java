import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        SortedSet<String> st=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
                st.add(s.substring(i,i+k));
        }
        smallest=st.first();
        largest=st.last();
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}