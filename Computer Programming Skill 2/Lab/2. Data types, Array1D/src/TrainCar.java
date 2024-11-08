import java.util.Scanner;

public class TrainCar 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new  int[C+P+1];
        for(int i=1;i<=C+P;i++)
        {
            A[i] = 0;
        }
        for(int i=1;i<=K;i++)
        {
            int V = sc.nextInt();
            int O = sc.nextInt();
            int T = sc.nextInt();
            if(V==1 && O<=C)
            {
                if(T+A[O]<=50)
                {
                    A[O] += T;
                }
            }
            else if(V==2 && O>C)
            {
                if(T+A[O]<=60)
                {
                    A[O] += T;
                }
            }
            for(int a=1;a<=C+P;a++)
            {
                System.out.print(A[a]+" ");
            }
            System.out.println();
        }
    }
}
