package Dynamic_Programming;
import java.util.*;

public class Subset_Sum_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum");
        int sum = sc.nextInt();
        boolean[][] t= new boolean[n+1][sum+1];
        for(int i =0;i<sum+1;i++)
            t[0][i] = false;
        for(int i =0;i<n+1;i++)
            t[i][0] = true;
        for(int i = 1;i<n+1;i++)
        {
            for(int j = 1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else if(arr[i-1]>j)
                    t[i][j] = t[i-1][j];
            }
        }
        System.out.println("Is subset present? = "+t[n][sum]);
    }
}
