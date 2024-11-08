import java.util.Scanner;

public class Auction2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []Arr = new int[N];
        int []cnt = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
            cnt[i] = 0;
        }
        int R = sc.nextInt();
        int []Brr = new int[N];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<N;j++)
            {
                Brr[j] = sc.nextInt();
                if(Arr[j]<Brr[j] && cnt[j]<3)
                {
                    System.out.print(Brr[j]+" ");
                    Arr[j] = Brr[j];
                    cnt[j] = 0;
                }
                else
                {
                    System.out.print(Arr[j]+" ");
                    cnt[j]++;
                }
            }
            System.out.print("\n");
        }
    }
}