import java.util.Scanner;

public class OutBound {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int cnt=0;
        for(int i=1;i<=N;i++)
        {
            if(Arr[i]>=x1 && Arr[i]<=x2)
            {
                continue;
            }
            else
            {
                System.out.print(Arr[i]+" ");
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.print("no data");
        }
    }
}
