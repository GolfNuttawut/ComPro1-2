import java.util.Scanner;
class ZooTicket 
{
    String name;
    boolean ride;
    boolean seal;
    boolean tiger;
    ZooTicket(String name)
    {
        this.name = name;
        this.ride = ride;
        this.seal = seal;
        this.tiger = tiger;
    }
    void bookRide()//ride
    {
        ride = true;
    }
    void bookSealShow()//seal
    {
        seal = true;
    }
    void  bookTigerShow()//tiger
    {
        tiger = true;
    }
    void summarize()
    {
        int sum=100;
        System.out.println(name);
        if(ride)
        {
            System.out.println("Ride");
            sum += 40;
        }
        if(seal)
        {
            System.out.println("Seal");
            sum += 50;
        }
        if(tiger)
        {
            System.out.println("Tiger");
            sum += 65;
        }
        System.out.println(sum);
    }
    boolean useRide()
    {
        if(ride)
        {
            System.out.println("okay");
            ride = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }
    boolean enterSealShow()
    {
        if(seal)
        {
            System.out.println("okay");
            seal = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }
    boolean enterTigerShow()
    {
        if(tiger)
        {
            System.out.println("okay");
            tiger = false;
            return true;
        }
        else
        {
            System.out.println("no");
            return false;
        }
    }
}
public class ZooTicket2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        ZooTicket ticket = new ZooTicket(name);

        while(true) 
        {
            int service = scan.nextInt();
            if(service == 0)
            break;
            else if(service == 1)
            {
                ticket.bookRide();
            }
            else if(service == 2)
            {
                ticket.bookSealShow();
            }
            else if(service == 3)
            {
                ticket.bookTigerShow();
            }
        } 
        ticket.summarize();
        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) 
        {
            int service = scan.nextInt();
            if(service == 1)
            {
                System.out.println(ticket.useRide());
            }
            else if(service == 2)
            {
                System.out.println(ticket.enterSealShow());
            }
            else if(service == 3)
            {
                System.out.println(ticket.enterTigerShow());
            }
        }
    }
}