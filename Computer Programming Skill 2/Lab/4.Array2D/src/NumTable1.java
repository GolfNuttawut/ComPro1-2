import java.util.Scanner;

public class NumTable1 
{
    static void gettar(int Arr[][],int x,int y,int R,int C)
    {
        if(x>0 && x<=R && y>0 && y<=C)
        {
            System.out.print(Arr[x][y]);
        }
        else
        {
            System.out.print("-");
        }
    }
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
        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            gettar(Arr,x,y,R,C);
        }
    }
}
