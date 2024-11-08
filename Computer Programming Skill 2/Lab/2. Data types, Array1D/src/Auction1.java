import java.util.Scanner;

public class Auction1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []Arr = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int R = sc.nextInt();
        int []Brr = new int[N];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<N;j++)
            {
                Brr[j] = sc.nextInt();
                if(Arr[j]<Brr[j])
                {
                    System.out.print(Brr[j]+" ");
                    Arr[j] = Brr[j];
                }
                else
                {
                    System.out.print(Arr[j]+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
