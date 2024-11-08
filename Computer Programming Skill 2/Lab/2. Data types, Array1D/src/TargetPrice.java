import java.util.Scanner;

public class TargetPrice
{
    static void getPrice(int[] price, final int K, final int M,int N) 
    {
       int sum=0,fir=0,last=0,cnt=0;
       fir = M-(K/2);
       last = M+(K/2);
       for(int i=fir;i<=last;i++)
       {
           if(i<1)
           {
               continue;
           }
           else if(i>N)
           {
               continue;
           }
           else
           {
               sum += price[i];
               cnt++;
           }
       }
       if(cnt==K)
       {
           System.out.println(sum);
       }
       else
       {
           System.out.println("no "+sum);
       }
    }   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        int N = scan.nextInt();
        int[] price = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            price[i] = scan.nextInt();
        }
        int Q = scan.nextInt();
        for(int i=1;i<=Q;i++) 
        {
            final int K = scan.nextInt();
            final int M = scan.nextInt();
            getPrice(price, K, M,N);
        }
    }
}
