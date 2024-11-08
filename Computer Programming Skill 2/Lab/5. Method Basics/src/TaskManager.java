import java.util.Scanner;
public class TaskManager 
{
    static void reportLoad(int cpuAll,int ramAll,int cpuUsed,int ramUsed) 
    {
        int cput = (cpuUsed*100)/cpuAll,ramt = (ramUsed*100)/ramAll;
        System.out.println("CPU: "+cpuUsed+"/"+cpuAll+" ("+cput+"%)");
        System.out.println("RAM: "+ramUsed+"/"+ramAll+" ("+ramt+"%)");
        if(cput >= 80)
        {
            System.out.println("Limited CPU power");
        }
        if(ramt >= 80)
        {
            System.out.println("Limited RAM availability");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int cpuAll = scan.nextInt(); 
        int ramAll = scan.nextInt(); 
        int cpuUsed = scan.nextInt();
        int ramUsed = scan.nextInt();

        // Call the method with parameters
        reportLoad(cpuAll,ramAll,cpuUsed,ramUsed);
    }
}
