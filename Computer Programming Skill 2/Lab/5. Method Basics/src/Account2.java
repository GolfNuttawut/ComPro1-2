import java.util.Scanner;

public class Account2 
{
    static void deposit(int N)
    {
        System.out.print(N+10000);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        deposit(N);
    }
}
