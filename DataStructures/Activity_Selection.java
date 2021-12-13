import java.util.*;
public class Activity_Selection {

    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of jobs to be done: ");
        int n = sc.nextInt();
        int[] start = new int[n],finish = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("\nEnter the start and finish time for process no. "+i);
            start[i] = sc.nextInt();
            finish[i] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(finish[i]>finish[j])
                {
                    int temp = finish[i];
                    finish[i] = finish[j];
                    finish[j] = temp;
                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }
        SelectMax(start,finish,n);
    }

    private static void SelectMax(int[] start, int[] finish, int n) {
        System.out.print("Selected activities are: \n");
        int j = 0;
        System.out.println("Job No. = 0"+" Start = "+start[0]+" Finish = "+finish[0]);
        for(int i = 1;i<n;i++)
        {
            if(start[i]>=finish[j]) {
                System.out.println("Job No. = "+i+" Start = " + start[i] + " Finish = " + finish[i]);
                j = i;
            }
        }

    }
}
