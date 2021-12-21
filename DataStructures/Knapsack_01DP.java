package Dynamic_Programming;
import java.util.*;
//Iterative approach with memoization
public class Knapsack_01DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items");
        int n = sc.nextInt();
        System.out.println("Enter the size of knapsack");
        int w = sc.nextInt();
        int[] wt = new int[n], val = new int[n];
        System.out.println("Enter weight and value of each item");
        for(int i = 0;i<n;i++)
        {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        int[][] t = new int[n+1][w+1];
        for(int i = 1;i<n+1;i++)
        {
            for (int j = 1; j < w + 1; j++)
            {
                if(wt[i-1]<=j)
                    t[i][j] = Math.max((val[i-1]+t[i-1][j-wt[i-1]]),(t[i-1][j]));
                else if(wt[i-1]>j)
                    t[i][j] = t[i-1][j];
            }
        }
        System.out.println("Maximum profit is = "+t[n][w]);
    }
}
