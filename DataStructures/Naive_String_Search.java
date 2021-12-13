import java.util.Scanner;

public class Naive_String_Search {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String Test = "THIS IS A TEST TEXT";
        int s1 = Test.length();
        String pattern = "T";
        int s2 = pattern.length();
        for(int i = 0;i<=(s1-s2);i++)
        {
            int j;
            for(j = 0;j<s2;j++)
            {
                if(pattern.charAt(j)!=Test.charAt(i+j))
                    break;
            }
            if(j==s2)
                System.out.println("Pattern found at position = "+(i+1));
        }
    }
}
