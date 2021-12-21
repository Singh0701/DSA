package Dynamic_Programming;
import java.util.*;



//Knapsack DP approach using Memoization
public class Knapsack_01_DP {
    static int[][] t = new int[100][1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of itmes");
        int n = sc.nextInt();
        int[] wt = new int[n], val = new int[n];
        System.out.println("Enter the size of knapsack");
        int w = sc.nextInt();
        System.out.println("Enter the weight and value of item");
        for(int i = 0;i<n;i++)
        {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        int[][] t = new int[n+1][w+1];
        for(int i = 0;i<=n;i++)
        {
            for(int j = 0;j<=w;j++)
            {
                t[i][j] = -1;
            }
        }
        int max = knapsack(wt,val,w,n);
        System.out.println("Maximum profit is = "+ max);
    }

    public static int knapsack(int[] wt, int[] val, int w, int n) {
        if(n==0||w==0)
            return 0;
        if(wt[n-1]<=w)
            t[w][n] = Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        else if(wt[n-1]>w)
            t[w][n] = knapsack(wt,val,w,n-1);
        return t[w][n];
    }
}
