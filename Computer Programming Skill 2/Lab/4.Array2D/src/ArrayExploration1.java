import java.util.Scanner;

public class ArrayExploration1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(),C = sc.nextInt();
        int Arr[][] = new int[R+1][C+1];
        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=C;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        int L = sc.nextInt();
        int sum1=0,sum2=0,sum3=0,sum4=0;
        for(int i=1;i<=L;i++)
        {
            int A = sc.nextInt(),B = sc.nextInt();
            if(A>0 && A<=R && B>0 && B<=C)
            {   
                if(Arr[A][B]>0)
                {
                    sum1++;
                }
                else if(Arr[A][B]<0)
                {
                    sum2++;
                }
                if(Arr[A][B]%2==0)
                {
                    sum3++;
                }
                else if(Arr[A][B]%2!=0)
                {
                    sum4++;
                }
            }
        }
        System.out.println(sum1+" "+sum2+" "+sum3+" "+sum4);
    }           
}
