import java.util.Scanner;

public class TargetLand 
{
    static void getPrice(int[] price, final int K, final int M,int N) 
    {
       int sum=0;
       int A = K/2;
       if(K==1)
       {
           sum += price[M-1];
           System.out.println(sum);
       }
       else if(A+M<=N && M-A > 0)
       {
           for(int i=M-A-1;i<=M;i++)
           {
               sum += price[i];
           }
           for(int i=M+1;i<M+A;i++)
           {
               sum += price[i];
           }
           System.out.println(sum);
       }
       else
       {
           System.out.println("no");
       }
    }   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        int N = scan.nextInt();
        int[] price = new int[N];
        for(int i=0;i<N;i++)
        {
            price[i] = scan.nextInt();
        }
        int Q = scan.nextInt();
        for(int i=0;i<Q;i++) 
        {
            final int K = scan.nextInt();
            final int M = scan.nextInt();
            getPrice(price, K, M,N);
        }
    }
}