import java.util.Scanner;
class Dept
{
    public int N;
    public int K;
    public Dept(int N,int K)
    {
        this.N = N;
        this.K = K;
    }
    public void computeIncome()
    {
        int ministryBudget = (N*500000)+(K*3000);
        int eduFee = 5000*K;
        int serviceFee = 300000;
        int donation = 100000;
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
    }
}
public class Department1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Dept D = new Dept(N,K);  
        D.computeIncome();
    }
}
