import java.util.Scanner;

public class UpSequence0 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
           if(i>0 && Arr[i]<=Arr[i-1])
           {
               System.out.println(Arr[i-1]);
           }
           if(i==N-1)
           {
               System.out.println(Arr[i]); 
           }
        }
    }
}
