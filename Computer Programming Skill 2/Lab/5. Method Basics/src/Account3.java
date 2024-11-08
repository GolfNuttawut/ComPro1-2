import java.util.Scanner;

public class Account3 
{
    static int deposit(int N)
    {
        if(N>0)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = deposit(N);
        if(x==0)
        {
            System.out.print(N+10000);
        }
        else
        {
            System.out.print("Error"); 
        }
    }
}