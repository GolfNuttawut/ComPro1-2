import java.util.Scanner;

public class ArrayCompress1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []Arr = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int sum=0;
        for(int i=0;i<N;i++)
        {
            if(Arr[i]==K)
            {
                System.out.print(sum+" ");
                System.out.print(K+" ");
                sum = 0;
            }
            else if(i==N-1 && Arr[i]!=K)
            {
                sum += Arr[i];
                System.out.print(sum+" ");
            }
            else
            {
                sum += Arr[i];
            }
        }
    }
    
}