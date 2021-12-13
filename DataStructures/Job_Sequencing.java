import java.util.*;
public class Job_Sequencing {
    public static void main(String[] args) {
        System.out.println("Enter the no. of jobs to be done: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] profit = new int[n],deadline = new int[n];
        int max_slots=0;
        for(int i = 0;i<n;i++)
        {
            profit[i] = sc.nextInt();
            deadline[i] = sc.nextInt();
            if(deadline[i]>max_slots)
                max_slots = deadline[i];
        }
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(profit[i]<profit[j])
                {
                    int temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;
                    temp = deadline[i];
                    deadline[i] = deadline[j];
                    deadline[j] = temp;
                }
            }
        }
        boolean[] slots = new boolean[max_slots];
        int profits = 0;
        System.out.println("Sequence of the Jobs: ");
        for(int i = 0;i<n;i++)
        {
            for(int j =max_slots-1;j>=0;j--)
            {
                if(deadline[i]>=(j+1) && !slots[j])
                {
                    System.out.print(i+", ");
                    slots[j] = true;
                    profits +=profit[i];
                    break;
                }
            }
        }
        System.out.println("\n"+profits);
    }
}
