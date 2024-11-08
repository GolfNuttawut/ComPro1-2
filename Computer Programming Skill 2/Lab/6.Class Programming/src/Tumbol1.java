/*import java.util.Scanner;

class Tumbolza
{
    public String name;
    public int x;
    public int y;
    public int population;
    public int  availBudget = population*5000;
    public Tumbolza(String name,int x,int y,int population)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.population = population;
    }
    public void allocateBudget(int[] budget)
    {
        availBudget = population*5000;
        int cnt = 0;
        for(int i=0;i<budget.length;i++)
        {
            if(budget[i]+cnt< availBudget)
            {
                cnt += budget[i];
                System.out.print(i+1+" ");
            }
        }
        if(cnt == 0)
        {
            System.out.println("none");
        }
    }
}
public class Tumbol1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int population = sc.nextInt();
        Tumbolza tb = new Tumbolza(name,x,y,population);
        int N = sc.nextInt();
        int[]budget = new int[N];
        for(int i=0;i<N;i++)
        {
            budget[i] = sc.nextInt();
        }
        tb.allocateBudget(budget);
    }
}*/
