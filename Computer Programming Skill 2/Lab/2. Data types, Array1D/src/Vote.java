import java.util.Scanner;

public class Vote {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int ans = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] Arr = new int[K];
        for(int i=0;i<K;i++)
        {
            Arr[i] = sc.nextInt();
        }
        for(int i=1;i<=N;i++)
        {
            int cnt=0;
            for(int j=0;j<K;j++)
            {
                if(i==Arr[j])
                {
                    cnt++;
                }
            }
            if(cnt>max)
            {
                max = cnt;
                ans = i;
            }
        }  
        System.out.println(ans);
        System.out.print(max);
    }
}
