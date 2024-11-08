
import java.util.Scanner;

public class Box2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N+1];
        int P[] = new int[N+1];
        int cnt=0;
        int sum=0;
        for(int i=1;i<N+1;i++)
        {
            Arr[i] = sc.nextInt();
            P[i] = 0;
        }
        int R = sc.nextInt();
        for(int i=1;i<R+1;i++)
        {
            int T = sc.nextInt();
            if(T==1)
            {
                int Q = sc.nextInt();
                int B = sc.nextInt();
                if(P[B]+Q <= Arr[B])
                {
                    P[B] += Q;
                    sum +=Q;
                    System.out.println(P[B]);
                }
                else
                {
                    System.out.println("-1");
                }
            }
            else if(T==2)
            {
                int Q = sc.nextInt();
                for(int j=1;j<N+1;j++)
                {
                    for(int k=0;true;k++)
                    {
                        if(Q==0)
                        {
                            break;
                        }
                        if(P[N]==0 && j==N)
                        {
                            System.out.println(j+" "+P[j]);
                            break;
                        }
                        if(P[j]==0)
                        {
                             break;
                        }
                        else
                        {
                            P[j]--;
                            Q--;
                        }
                    }
                    if(Q==0)
                    {
                        System.out.println(j+" "+P[j]);
                        break;
                    }
                } 
            }
        }
    }
}

