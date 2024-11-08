import java.util.Scanner;
class Ship
{
    int capacity;
    int cap;
    Ship(int cap)
    {
        this.cap = cap;
        if(cap>0)
        {
            this.capacity += cap;
        }
        else
        {
            this.capacity += 10;
        }
    }
    int load(int[] weight,int p1)
    {
        int cnt=p1;
        int count=0;
        if(p1<weight.length)
        {
            for(int i=p1;i<weight.length;i++)
            {
                if(count+weight[i]<=cap)
                {
                    count+=weight[i];
                    cnt++;
                }
                else
                {
                    break;
                }
            }
        }
        return cnt++;
    }
}
public class Cerry 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Ship[] ship = new Ship[m];
        for (int i=0;i<m;i++)
        {
            int cap = in.nextInt();
            ship[i] = new Ship(cap);
        }
        int p1 = 0;
        int[] weight = new int[n];
        for (int i=0;i<n;i++)
        {
            weight[i] = in.nextInt();
        }
        /*Enter your code here. 
        There may be 3 - 5 lines of code here.
        You will send array weight to method load, 
        along with another int parameter. */
        for(int i=0;i<m;i++)
        {
            p1 = ship[i].load(weight,p1);
        }
        // Do not change the following lines.
        System.out.print(p1+" ");
        int sum_weight = 0;
        for (int i=0;i<p1;i++)
        {
            sum_weight += weight[i];
        }
        System.out.println(sum_weight);
    }
}