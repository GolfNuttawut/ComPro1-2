import java.util.Scanner;

public class NumMixer 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+1];
        int B[] = new int[N+1];
        int rev = N;
        for(int i=1;i<=N;i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i=1;i<=N;i++)
        {
            B[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        if(K>0)
        {
            for(int i=1;i<=N;i++)
            {
                System.out.print(A[i]+" "+B[rev]+" ");
                rev--;
            }
        }
        else
        {
            for(int i=1;i<=N;i++)
            {
                System.out.print(B[rev]+" "+A[i]+" ");
                rev--;
            }
        }
    }
}
