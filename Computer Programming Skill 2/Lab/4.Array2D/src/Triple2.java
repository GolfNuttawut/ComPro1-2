import java.util.Scanner;

public class Triple2 
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
        int V = scan.nextInt(),cnt=0,fir=0,las=0,min=99,max=0,avg=0;
        for(int row=1;row<=R;row++)
        {
            cnt=0;
            avg=0;
            max=0;
            min=99999;
            for(int col=1;col<=C;col++)
            {
                if(Arr[row][col]==V)
                {
                    cnt++;
                }
                else
                {
                    cnt=0;
                }
                if(cnt==3)//Min
                {
                    avg++;
                    if(col-2<min)
                    {
                        min = col-2;
                        fir = min;
                    }
                }
                if(cnt>=3)//Max
                {
                    if(col-2>max)
                    {
                        max = col-2;
                        las = max;
                    }
                }
            }
            if(avg==0)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(fir+" "+las);
            }
        }
    }
}