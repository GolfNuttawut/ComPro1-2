import java.util.Scanner;

public class NumReduction {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            A[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for(int i=1;i<=Q;i++)
        {
            int pos = sc.nextInt();
            int k = sc.nextInt();
            for(int j=1;j<=N;j++)
            {
                if(j<=pos+2 && j>=pos-2)
                {
                    
                    if(A[j]-k>0)
                    {
                        A[j] -= k;
                    }
                    else if(A[j]<=0)
                    {
                        continue;
                    }
                    else if(A[j]-k<=0)
                    {
                        A[j] = 0;
                    }
                    
                }
            }
            for(int j=1;j<=N;j++)
            {
                System.out.print(A[j]+" ");
            }
            System.out.println();
        }
    }
}
