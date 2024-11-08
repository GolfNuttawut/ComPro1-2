import java.util.Scanner;

public class Battleship2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int Arr[][] = new int[K][2];
        int Hit=0,Miss=0;
        for(int i=0;i<K;i++)
        {
            for(int j=0;j<2;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<K;i++)
        {
            if(Arr[i][0]<=R &&Arr[i][0]>0&& Arr[i][1]<=C&&Arr[i][1]>0)
            {
                Hit++;
            }
            else
            {
                Miss++;
            }
        }
        System.out.print(Hit+"\n"+Miss);
    }   
}