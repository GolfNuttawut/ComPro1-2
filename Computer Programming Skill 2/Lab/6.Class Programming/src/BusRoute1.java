import java.util.Scanner;
class Route1 
{
    public String []names;
    public int []distances;
    public Route1(String []names,int[] distances)
    {
        this.names=names;
        this.distances=distances;
    }
    public void getStopInfo(int X)
    {
        if(X<1 || X>distances.length)
        {
            System.out.println("invalid number");
        }
        else
        {
            System.out.println(names[X-1]+" "+distances[X-1]);
        }
    }
}
public class BusRoute1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for(int i=0;i<N;i++) 
        {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route1 R = new Route1(names,distances); // Create a Route object here.
        final int K = scan.nextInt();
        for(int i = 0; i < K; ++i) 
        {
            int X = scan.nextInt();
            R.getStopInfo(X);
        }
    }
}

