import java.util.Scanner;
class Runner
{
    String name;
    int type;
    static int cnt =0;
    public Runner(String name,int type)
    {
        this.name = name;
        this.type = type;
        this.cnt = cnt;
    }
    void printInfo()
    {
        cnt++;
        if(type==1)
        {
            System.out.print("A");
            System.out.printf("%03d",cnt);
            System.out.println(" "+name);
        }
        else if(type==2)
        {
            System.out.print("B");
            System.out.printf("%03d",cnt);
            System.out.println(" "+name);
        }
        else if(type==3)
        {
            System.out.print("C");
            System.out.printf("%03d",cnt);
            System.out.println(" "+name);
        }
        else if(type==4)
        {
            System.out.print("D");
            System.out.printf("%03d",cnt);
            System.out.println(" "+name);
        }
        else
        {
            cnt--;
            System.out.println("INVALID");
        }
    }
}
public class Marathon1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            String name = sc.next();
            int type = sc.nextInt();
            Runner run = new Runner(name,type);
            run.printInfo();
        }
    }
}
