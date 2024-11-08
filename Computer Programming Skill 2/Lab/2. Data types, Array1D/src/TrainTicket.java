import java.util.Scanner;

public class TrainTicket 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        int K = scan.nextInt();
        int[] count = new int[N+1];
        for(int i = 1; i < N; i++)
        {
            count[i] = 0;
        }
        for(int i = 0; i < K; i++) 
        {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
            boolean okay = true;
            for(int station = X; station < Y; ++station) 
            {
                if(count[station] + Z > P)
                okay = false;
            }
            if(okay) 
            {
                for(int station = X; station < Y; ++station)
                count[station] += Z;
                System.out.println("Y");
            } 
            else 
            {
                System.out.println("N");
            }
        }
    }
}
