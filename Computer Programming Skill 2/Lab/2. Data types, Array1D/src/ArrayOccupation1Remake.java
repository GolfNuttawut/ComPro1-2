import java.util.Scanner;
public class ArrayOccupation1Remake 
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
        int max = -1;
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
            ++arr[k];
            if (arr[k] > max) 
            {
                max = arr[k];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        for (int i = 1 ; i <= N ; i++) 
        {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}