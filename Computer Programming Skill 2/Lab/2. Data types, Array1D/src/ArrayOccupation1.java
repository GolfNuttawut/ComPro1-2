//Time Out
import java.util.Scanner;

public class ArrayOccupation1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Arr[] = new int[K+1];
        for(int i=1;i<=K;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int A[] = new int[K+1];
        int cntA1=1,cntA2=0;
        int cntB=0;
        int cntC=0;
        for(int i=1;i<=K;i++)
        {
            if(Arr[i]>0 && Arr[i]<=N)
            {
                A[cntA1] = Arr[i];
                cntA1++;
            }
            else
            {
                cntB++;
            }
        }
        int st=0;
        for(int i=1;i<=cntA1;i++)
        {
            st=0;
            for(int j=i-1;j>0;j--)
            {
                if(A[i]!=A[j])
                {
                    continue;
                }
                else
                {
                    st++;
                    cntC++;
                    break;
                }
            }
            if(st==0)
            {
                cntA2++;
            }
        }
        System.out.println(cntA2-1+"\n"+cntB+"\n"+cntC);
        int cnt=0,max=0;
        int A1[] = new int[cntA1];
        for(int i=1;i<=cntA1;i++)
        {
            cnt=0;
            for(int j=i-1;j<=cntA1;j++)
            {
               if(A[i]==A[j])
               {
                   cnt++;
               }
            }
            if(cnt>max)
            {
                max = cnt;
            }
        }
        int swap=0;
        for(int i=1;i<cntA1;i++)
        {
            for(int j=i;j<cntA1;j++)
            {
               if(A[j]<A[i])
               {
                   swap = A[j];
                   A[j] = A[i];
                   A[i] = swap;
               }
            }
        }
        for(int i=1;i<cntA1;i++)
        {
            cnt=0;
            for(int j=i;j<cntA1;j++)
            {
               if(A[j]==A[i])
               {
                   cnt++;
               }
            }
            if(cnt==max)
            {
                System.out.print(A[i]+" ");
            }
        }
    }
}
