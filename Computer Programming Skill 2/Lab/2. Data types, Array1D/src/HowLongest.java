import java.util.Scanner;

public class HowLongest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<N+1;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int cnt=0;
        int max=0;
        for(int i=1;i<N+1;i++)
        {
            if(Arr[i]==1)
            {
                cnt++;
            }
            else
            {
                if(cnt >= max)
                {
                    max=cnt;
                }
                cnt=0;
            }
        }
        System.out.println(max);
        int T=0;
        for(int i=1;i<N+1;i++)
        {
            if(Arr[i]==1)
            {
                cnt++;
            }
            else
            {
                if(cnt >= max && i>max)
                {
                    System.out.print(i-max+" ");
                }
                cnt=0;
            }
        }
        if(cnt >= max)
        {
            System.out.print(N+1-cnt);
        }
    }
}
