import java.util.Scanner;

public class Partition2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<N+1;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int mid=N/2+1;
        int Brr[] = new int[N+4];
        int cnt=1;
        for(int i=1;i<N+1;i++)
        {
           if(Arr[i]<=Arr[mid])
           {
               Brr[cnt] = Arr[i];
               cnt++;
           }
        }
        if(cnt%2==0)
        {
            mid = cnt/2;
        }
        else if(cnt%2!=0)
        {
            mid = cnt/2+1;
        }
        for(int i=1;i<cnt;i++)
        {
            if(Brr[i] <= Brr[mid])
            {
                System.out.print(Brr[i]+" ");
            }
        }
        System.out.println();
        for(int i=1;i<cnt;i++)
        {
            if(Brr[i] > Brr[mid])
            {
                System.out.print(Brr[i]+" ");
            }
        }
    }
}
