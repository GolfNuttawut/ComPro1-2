import java.util.Scanner;
class Route 
{
    public String []names;
    public int []distances;
    public Route(String []names,int[] distances)
    {
        this.names=names;
        this.distances=distances;
    }
    public void getTripInfo(int x,int y)
    {
        int cnt=0;
        if(x>=y || x<1 || x>distances.length || y<1 || y>distances.length )
        {
            System.out.println("invalid number");
        }
        else
        {
            for(int i=x;i<y;i++)
            {
                cnt += distances[i];
            }
            System.out.println(names[x-1]+" "+names[y-1]+" "+cnt);
        }
    }
}
public class BusRoute3
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
        Route R = new Route(names,distances);
        int K = scan.nextInt();
        for(int i=0;i<K;i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            R.getTripInfo(x,y);   
        }   
    }
}