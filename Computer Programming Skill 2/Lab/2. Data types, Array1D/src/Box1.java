import java.util.Scanner;

public class Box1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        int P[] = new int[N+1];
        for(int i=1;i<N+1;i++)
        {
            Arr[i] = sc.nextInt();
            P[i] = 0;
        }
        int R = sc.nextInt();
        for(int i=1;i<R+1;i++)
        {
            int T = sc.nextInt();
            int Q = sc.nextInt();
            int B = sc.nextInt();
            if(T==1)
            {
                if(P[B]+Q <= Arr[B])
                {
                    P[B] += Q;
                    System.out.println(P[B]);
                }
                else
                {
                    System.out.println("-1");
                }
            }
            else if(T==2)
            {
                if(P[B]-Q >= 0)
                {
                    P[B] -= Q;
                    System.out.println(P[B]);
                }
                else
                {
                    System.out.println("-1");
                }
            }
        }
    }
}
