import java.util.Scanner;

public class NumTable2 
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
        int N = sc.nextInt();
        int af=-1,cnt=0,begin=0;
        for(int i=1;i<=N;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>0 && x<=R && y>0 && y<=C)
            {
                begin=1;
                if(Arr[x][y]==af)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(Arr[x][y]);
                    af = Arr[x][y];
                }
                cnt=0;
            }
            else
            {
                if(cnt>0)
                {
                    continue; 
                }
                else
                {
                    if(begin>=1)
                    {
                        System.out.println();
                        cnt++;
                    }
                }
                af = -1;
            }
        }
    }
}
