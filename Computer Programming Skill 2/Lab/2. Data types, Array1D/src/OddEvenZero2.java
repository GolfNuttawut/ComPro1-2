
import java.util.Scanner;

public class OddEvenZero2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(Arr[i]%2!=0 || Arr[i]==0)
            {
                System.out.print(Arr[i]+" ");
            }
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            if(Arr[i]%2==0 || Arr[i]==0)
            {
                System.out.print(Arr[i]+" ");
            }
        }
    }
}
