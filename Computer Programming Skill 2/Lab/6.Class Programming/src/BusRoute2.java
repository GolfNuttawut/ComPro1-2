import java.util.Scanner;
class Route2 
{
    public String []names;
    public int []distances;
    public Route2(String []names,int[] distances)
    {
        this.names=names;
        this.distances=distances;
    }
    public void  summarizeRoute()
    {
        int cnt=0;
        for(int i=0;i<distances.length;i++)
        {
            cnt += distances[i];
        }
        System.out.println(names[0]+" "+names[distances.length-1]+" "+cnt);
    }
}
public class BusRoute2
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
        Route2 R = new Route2(names,distances);
        R.summarizeRoute();
    }
}