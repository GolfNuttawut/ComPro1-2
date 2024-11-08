import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        for(int i = 1;i<N+1;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int T[] = new int[3];
        int cnt=0;
        for(int i=0;i<3;i++)
        {
            T[i] = sc.nextInt();
            cnt=0;
            for(int j=T[i];j<N+1;j++)
            {
                if(Arr[j]==1)
                {
                    cnt++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
