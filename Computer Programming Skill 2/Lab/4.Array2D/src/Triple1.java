import java.util.Scanner;

public class Triple1 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt(),C = scan.nextInt();
        int Arr[][] = new int[R+1][C+1];
        for(int row=1;row<=R;row++)
        {
            for(int col=1;col<=C;col++)
            {
                Arr[row][col] = scan.nextInt();
            }
        }
        int V = scan.nextInt(),cnt=0;
        for(int row=1;row<=R;row++)
        {
            cnt=0;
            for(int col=1;col<=C;col++)
            {
                if(Arr[row][col]==V)
                {
                   cnt++;
                }
                else
                {
                    if(cnt>=3)
                    {
                        System.out.print(row+" ");
                        break;
                    }
                    cnt=0;
                }
                if(col==C)
                {
                    if(cnt>=3)
                    {
                        System.out.print(row+" ");
                    } 
                }
            }
        }
    }
}