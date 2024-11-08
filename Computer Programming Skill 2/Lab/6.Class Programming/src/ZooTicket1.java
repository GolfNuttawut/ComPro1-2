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
}
public class ZooTicket1 
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
    }
}