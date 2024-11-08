import java.util.Scanner;

class Bus
{
    public int seatssum;
    public String id;
    public int type;
    public int seats;
    public boolean bus;
    public int currentSeat;
    public Bus(String id,int type,int seats)
    {
        this.id = id;
        this.type = type;
        this.seats = seats;
        this.bus = true;
        this.currentSeat = 0;
    }
    public void printStats()
    {
        System.out.println(id);
        if(type==1)
        {
            System.out.println("Fan");
        }
        else if(type==2){
            System.out.println("P1");
        }else if(type==3)
        {
            System.out.println("VIP");
        }
        System.out.println(currentSeat+" "+seats);
        if(bus==true)
        {
            System.out.println("Active");
        }
        else
        {
            System.out.println("Inactive");
        }    
    }
    public boolean reserve(int k)
    {
        boolean check = true;
        if(k>=0&&bus==true)
        {
            if(currentSeat+k>seats)
            {
                check = false;
            }
            else
            {
                this.currentSeat+=k;
            }
        }
            return check;
    }
    public void sendToRepair()
    {
        this.bus = false;
    }
    public void backToService()
    {
        this.bus = true;
    }
}
public class BusCompany3 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus[] B = new Bus[Q]; 
        for(int i=0;i<Q;i++)
        {
            String name = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            B[i] = new Bus(name,type,seats);
        }
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();
        }
    }
}

