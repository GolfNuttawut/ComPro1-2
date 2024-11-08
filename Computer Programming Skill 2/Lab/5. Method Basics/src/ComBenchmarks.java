import java.util.Scanner;
class ComAndBench 
{
    public int cpuPow;
    public int gpuPow;
    public int ramAmt;
    public int cpuPrc;
    public int gpuPrc;
    public int ramPrc;
    public ComAndBench(int cpuPow,int gpuPow,int ramAmt,int cpuPrc ,int gpuPrc,int ramPrc)
    {
        this.cpuPow = cpuPow;
        this.gpuPow = gpuPow;
        this.ramAmt = ramAmt;
        this.cpuPrc = cpuPrc;
        this.gpuPrc = gpuPrc;
        this.ramPrc = ramPrc; 
    }
    public int totalPrice = cpuPrc+gpuPrc+ramPrc;
    public int WindStrike;
    public int PastMark;
    public int Soreal;
    public int SiSandro;
    public boolean boo = true;
    public void runWindStrike()
    {
        WindStrike = cpuPow+gpuPow;
        if(ramAmt<=4)
        {
            WindStrike /= 2;
        }
        else if(ramAmt>8)
        {
            WindStrike *= 2;
        }
    }
    public void runPastMark()
    {
        if(cpuPow>gpuPow)
        {
            PastMark = cpuPow;
        }
        else
        {
           PastMark = gpuPow;
        }
    }
    public void runSoreal()
    {
        Soreal = gpuPow+(cpuPow/2);
        if(PastMark<300)
        {
            Soreal /=2;
        }
    }
    public boolean runSiSandro()
    {
        if(ramAmt<4)
        {
            System.out.println("SiSandro Failed");
            boo = false;
        }
        else
        {
            SiSandro = (ramAmt*100)+cpuPow;
            
        }
        return true;
    }
    public void runAllBenches()
    {
        System.out.println("WindStrike: "+WindStrike);
        System.out.println("PastMark: "+PastMark);
        System.out.println("Soreal: "+Soreal);
        if(boo==true)
        {
            System.out.println("SiSandro: "+SiSandro);
        }
        else
        {
            System.out.println("SiSandro: Failed");
        }  
    }
    public void reportPerfPerPrice()
    {
        int K = WindStrike + PastMark + Soreal;
        int P = cpuPrc + gpuPrc + ramPrc;
        int Pc = K/P;
        System.out.println("Performance per Price = "+Pc);
    }
}
public class ComBenchmarks 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int cpuPow = scan.nextInt();
        int gpuPow = scan.nextInt();
        int ramAmt = scan.nextInt();
        int cpuPrc = scan.nextInt();
        int gpuPrc = scan.nextInt();
        int ramPrc = scan.nextInt(); 
        ComAndBench comB = new ComAndBench(cpuPow,gpuPow,ramAmt,cpuPrc,gpuPrc,ramPrc);
        comB.runWindStrike();
        comB.runPastMark();
        comB.runSoreal();
        comB.runSiSandro();
        comB.runAllBenches();
        comB.reportPerfPerPrice();
    } 
}
