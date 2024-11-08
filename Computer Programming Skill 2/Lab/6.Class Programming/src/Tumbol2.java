import java.util.Scanner;

class Tumbol
{
    public String name;
    public int x;
    public int y;
    public int population;
    public int  availBudget;
    public Tumbol(String name,int x,int y,int population )
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.population = population;
        this.availBudget = population*5000;
    }
    public int allocateBudget(int[] budget)
    {
        int cnt = 0;
        int sum=0;
        for(int i=0;i<budget.length;i++)
        {
            if(budget[i]+cnt< availBudget)
            {
                cnt += budget[i];
                sum += budget[i];
                System.out.print(i+1+" ");
            }
        }
        if(cnt == 0)
        {
            System.out.println("none");
        }
        else
        {
            System.out.println("");
        }
        return sum;
    }
}
public class Tumbol2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tumbol[] tumbols = new Tumbol[k];
        for(int i = 0; i < k; ++i) 
        {
            String name = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int population = scan.nextInt();
            tumbols[i] = new Tumbol(name,x,y,population);
        }
        int total = 0;
        for(int i = 0; i < k; ++i) 
        {
            int N = scan.nextInt();
            int[] budget = new int[N];
            for(int j=0;j<N;j++)
            {
                budget[j] = scan.nextInt();
            }
            total += tumbols[i].allocateBudget(budget);           
        }
        System.out.println(total);
    }  
}
