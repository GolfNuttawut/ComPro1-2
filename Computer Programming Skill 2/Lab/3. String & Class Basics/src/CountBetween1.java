import java.util.Scanner;

public class CountBetween1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(),y = sc.nextInt();
        int a = sc.nextInt(),b = sc.nextInt();
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<N;i++)
        {
            if(Arr[i]>=x && Arr[i]<=y)
            {
                sum1++;
            }
            else if(Arr[i]>=a && Arr[i]<=b)
            {
                sum2++;
            }
            else
            {
                sum3++;
            }
        }
        System.out.print(sum1+"\n"+sum2+"\n"+sum3);
    }
}
