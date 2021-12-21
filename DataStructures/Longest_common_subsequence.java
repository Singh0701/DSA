package Dynamic_Programming;
import java.util.*;
public class Longest_common_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string");
        String s1 = sc.nextLine();
        System.out.println("Enter Second string");
        String s2 = sc.nextLine();
        int l1=s1.length(),l2 = s2.length();
        System.out.println("LCS is "+LCS(s1,s2,l1,l2));
    }

    private static int LCS(String s1, String s2, int l1, int l2) {
        if(l1==0||l2==0)
            return 0;
        if(s1.charAt(l1-1) == s2.charAt(l2-1))
            return 1+LCS(s1,s2,l1-1,l2-1);
        else
            return Math.max(LCS(s1,s2,l1,l2-1),LCS(s1,s2,l1-1,l2));
    }
}
