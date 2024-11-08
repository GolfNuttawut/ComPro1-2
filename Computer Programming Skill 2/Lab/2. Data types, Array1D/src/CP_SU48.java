
import java.util.Scanner;

public class CP_SU48 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K1 = sc.nextInt();
        int K2 = sc.nextInt();
        int P = sc.nextInt();
        int A[] = new int[N+1];
        int B[] = new int[N+1];
        for(int i=0;i<P;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==1)
            {
                if(A[x]+1<=K1)
                {
                    A[x]++;
                    System.out.println("1");
                }
                else if(A[x]+1>K1)
                {
                    if(B[x]+1<=K2)
                    {
                        B[x]++;
                        System.out.println("2");
                    }
                     else
                    {
                        System.out.println("0");
                    }
                }
            }
            else if(y==2) 
            {
                if(B[x]+1<=K2)
                {
                    B[x]++;
                    System.out.println("2");
                }
                else if(B[x]+1>K2)
                {
                    if(A[x]+1<=K1)
                    {
                        A[x]++;
                        System.out.println("2");
                    }
                    else
                    {
                        System.out.println("0");
                    }
                }
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

