
import java.util.Scanner;

public class Battleship4 {
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Arr[][] = new int[R+1][C+1];
        int cnt=0;
        for(int i=1;i<=R;i++)
        {
            for(int j=1;j<=C;j++)
            {
                Arr[i][j] = sc.nextInt();
                if(Arr[i][j]==1)
                {
                    cnt++;
                }
            }
        }
        int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
        int fir=99,las=0,cnt1=cnt;
        int K = sc.nextInt();
        for(int i=1;i<=K;i++)
        {  
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<=R && X>0 && Y<=C && Y>0)//5
            {
                if(Arr[X][Y]<2 && Arr[X][Y]>0)//1
                {
                    sum1++;
                    Arr[X][Y]=2;
                    cnt1--;
                    if(i<fir)
                    {
                        fir=i;
                    }
                    if(cnt1==0)
                    {
                        las = i;
                    }
                }
                else if(Arr[X][Y]==0)//2
                {
                    sum2++;
                    Arr[X][Y] = -1;   
                }
                else if(Arr[X][Y]==2)//3
                {
                    sum3++;  
                }
                else if(Arr[X][Y]==-1)//4
                {
                    sum4++;  
                }
            } 
            else
            {
                sum5++;
                continue;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
        if(cnt1==0)
        {
            System.out.println("attacker "+las);
        }
        else if(cnt1==cnt)
        {
            System.out.println("battleship -1");
        }
        else
        {
            System.out.println("battleship "+fir);
        }
    } 
}