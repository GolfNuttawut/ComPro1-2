import java.util.Scanner;

public class Sum2D 
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
        int sum=0;
        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=C;j++)
            {
                for(int k=1;k<=R;k++)//row
                {
                    sum += Arr[k][j];
                }
                for(int k=1;k<=C;k++)
                {
                    if(k!=j)
                    {
                        sum += Arr[i][k];
                    }
                }
                System.out.print(sum+" ");
                sum=0;
            }
            System.out.println();
        }
    }        
}
