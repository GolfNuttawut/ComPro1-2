import java.util.Scanner;

public class SlotReservation 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int A[] = new int[N+1];
        int B[] = new int[N+1];
        for(int i=0;i<P;i++)
        {
            int X = sc.nextInt();
            if(A[X]<K)
            {
                A[X]++;
                System.out.println("1");
            }
            else
            {
                B[X]++;
                System.out.println("2");
            }
        }
        for(int i=1;i<=N;i++)
        {
             System.out.print(A[i]+" ");
        }  
        System.out.println();
        for(int i=1;i<=N;i++)
        {
             System.out.print(B[i]+" ");
        }   
    }
}
