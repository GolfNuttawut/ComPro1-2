import java.util.Scanner;

public class ArrayOcc2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int K = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0 ; i < K ; i++) 
        {
            int k = sc.nextInt();
            if (k <= 0 || N < k) 
            { 
                sum2++;
                continue;
            }    
            if (arr[k] > 0) 
            { 
                sum3++;
            } 
            else 
            { 
                sum1++;
            }
            arr[k]++;
        }
        int max = 0;
        int L = 0;
        for (int i = 1 ; i <= N ; i++) 
        {
            if (arr[i] != 0) 
            {
                L = 0;
                continue;
            }
            L++;
            if (L > max) 
            {
                max = L;
            }
        }
        System.out.println(max);
        for (int i = 1 ; i <= N ; ++i) 
        {
            if (arr[i] != 0) 
            {
                L = 0;
                continue;
            }
            L++;
            if (L == max) 
            {
                System.out.print( i + " ");
            }
        }
    }
}