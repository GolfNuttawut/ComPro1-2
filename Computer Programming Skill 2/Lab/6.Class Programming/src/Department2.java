import java.util.Scanner;
class Dept
{
    public int N;
    public int K;
    public int ministryBudget = 0;
    public int eduFee = 0;
    public int serviceFee = 0; 
    public int donation = 0;
    public int salary = 0;
    public int elec = 0;
    public int eduCost = 0;        
    public Dept(int N,int K)
    {
        this.N = N;
        this.K = K;
    }
    public void computeIncome(int N,int K)
    {
        ministryBudget = (N*500000)+(K*3000);
        eduFee = 5000*K;
        serviceFee = 300000;
        donation = 100000;
    }
    public void computeExpense(int N,int K)
    {
        salary = N*600000;
        elec = (N+K)*2000;
        eduCost = K*4000;       
    }
    public void printReport()
    {
        System.out.println("total income = "+(ministryBudget+eduFee+serviceFee+donation));
        System.out.println("total expense = "+(salary+elec+eduCost));
        System.out.println("income - expense = "+((ministryBudget+eduFee+serviceFee+donation)-(salary+elec+eduCost)));
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("salary = "+salary);
        System.out.println("electricity = "+elec);
        System.out.println("educational cost = "+eduCost);
    }
}
public class Department2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Dept D = new Dept(N,K);
        D.computeIncome(N,K);
        D.computeExpense(N,K);
        D.printReport();
    }
}
