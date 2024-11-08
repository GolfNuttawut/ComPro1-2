import java.util.Scanner;

public class Cumulation 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<=N-1;i++)
        {
            Arr[i] = 0;
        }
        for(int i=1;i<=K;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j=1;j<=N-1;j++)
            {
                if(j>=x && j<=y)
                {
                    Arr[j] += z;
                }
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }
    }
}
