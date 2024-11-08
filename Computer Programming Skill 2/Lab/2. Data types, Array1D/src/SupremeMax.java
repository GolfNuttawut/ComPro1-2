import java.util.Scanner;

public class SupremeMax 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int max1=0,max2=0;
        for(int i=1;i<=N;i++)
        {
            if(Arr[i]==0 || i==N)
            {
                if(max1 !=0)
                {
                    System.out.print(max1+" ");
                    max1 = 0;
                }
            }
            else
            {
                if(Arr[i]>=max1)
                {
                    max1 = Arr[i];
                    if(max1>max2)
                    {
                        max2 = max1;
                    }
                }
            }
        }
        System.out.println("\n"+max2);
        int target=0;
        for(int i=1;i<=N;i++)
        {
            if(Arr[i]==max2)
            {
                target = i;
                break;
            }
        }
        int F=0,cnt=0;
        for(int i=target+1;true;i++)
        {
            if(Arr[i]==0)
            {
                break;
            }
            else
            {
                cnt++;
            }
        } 
        F = target+cnt;
        int B=0;
        cnt=0;
        for(int i=target-1;true;i--)
        {
            if(Arr[i]==0)
            {
                break;
            }
            else
            {
                cnt++;
            }
        } 
        B = target-cnt;
        for(int i=B;i<=F;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}
