import java.util.Scanner; 
class Employee 
{ 
    public String name;
    public String ID;
    public int type;      
    public int wage;   
    public int exWork=0;
    public int opWork=0;
    public int M=0;
    public Employee(String name,String ID,int type,int wage)
    {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.wage = wage; 
    }
    public boolean workExecutive(int hour)
    {
        if(hour<=0)
        {
            System.out.println("Invalid hour for executive work");
            return false;
        }
        else
        {
            exWork += hour;
            return true;
        }
    }
    public boolean workOperation(int hour)
    {
        if(hour<=0)
        {
            System.out.println("Invalid hour for operation work");
            return false;
        }
        else
        {
            opWork += hour;
            return true;
        }
    }
    public int calPayment()
    {
        if(type==1)
        {
            M = (exWork*wage)+(opWork*(wage*2));
        }
        else
        {
            M = (exWork*wage*2)+(opWork*(wage));
        }
        return M;
    }
    public void printStats()
    {
        System.out.println("ID: "+ID);
        System.out.println("Name: "+name);
        if(type==1)
        {
            System.out.println("Position: Executive");
        }
        else
        {
            System.out.println("Position: Operation");
        }
        System.out.println("Ex Hour: "+exWork);
        System.out.println("Op Hour: "+opWork);
        System.out.println("Wage: "+wage);
        System.out.println("Payment: "+M);
    }
} 
public class HR 
{ 
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in); 
        String name = scan.next(); 
        String ID = scan.next(); 
        int type = scan.nextInt(); 
        int wage = scan.nextInt(); 
        Employee employee = new Employee(name,ID,type,wage); 
        final int N = scan.nextInt(); 
        for(int i = 0; i < N; ++i) 
        { 
            int workType = scan.nextInt(); 
            int hour = scan.nextInt(); 
            if(workType==1)
            {    
                boolean X = employee.workExecutive(hour);
                int Z1 = employee.calPayment();
                System.out.println(X+" "+Z1);
            }
            else
            {
                boolean Y = employee.workOperation(hour);
                int Z2 = employee.calPayment();
                System.out.println(Y+" "+Z2);
            }
        }
        employee.printStats();
    } 
}