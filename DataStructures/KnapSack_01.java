import java.util.*;
public class KnapSack_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float c = sc.nextInt();
        float[] p = new float[n],w = new float[n],r = new float[n];
        for(int i = 0;i<n;i++)
        {
//            w[i] = sc.nextFloat();
            p[i] = sc.nextFloat();
            w[i] = sc.nextFloat();
            r[i] = p[i]/w[i];
        }
        for(int i = 0;i < n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(r[i]<r[j])
                {
                    float temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                    temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }
        float profit = 0;
        for(int i = 0;i<n;i++)
            System.out.println((i+1)+"\tweight = "+w[i]+"\tprofit = "+p[i]+"\tratio = "+r[i]);
        System.out.println("\n\n\n\n");
        for(int i = 0;i<n;i++)
        {
            if(c==0) {
                System.out.println("KnapSack is Full");
                break;
            }
                if(c>0)
            {
                if(w[i]<=c) {
                    profit = profit + p[i];
                    c-=w[i];
                }
                else if(w[i]>c)
                {
                    float rem = c;
                    c -=c;
                    profit+=rem*r[i];
                }
            }
            System.out.println((i+1)+"\tweight = "+w[i]+"\tprofit = "+p[i]+"\t\tratio = "+r[i]+"\t\t\tcurr profit = "+profit+"\tcapacity = "+c);

        }
        }
    }

