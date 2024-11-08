import java.util.Scanner;

public class Battleship1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Arr[][] = new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        int T = sc.nextInt();
        System.out.println(T);
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

