import java.util.Scanner;
class ZooTicketA 
{
    boolean tour;
    boolean kak;
    ZooTicketA(boolean tour)
    {
        this.tour = tour;
        this.kak = true;
    }
    boolean enterZoo(int height)
    {
        if(height<=120)
        {
            if(tour)
            {
                if(kak)
                {
                    this.kak = false;
                    return true;
                }
                else
                {
                    return false; 
                }
            }
            else
            {
                if(kak)
                {
                    this.kak = false;
                    return true;
                }
                else
                {
                    return false; 
                }
            }
        }
        else
        {
            if(tour)
            {
                return false;
            }
            else
            {
                if(kak)
                {
                    this.kak = false;
                    return true;
                }
                else
                {
                    return false; 
                }
            }
        }
    }
}
public class ZooTicketAgain1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        ZooTicketA[] tickets = new ZooTicketA[N];
        for(int i = 0; i < N; ++i) 
        {
            int type = scan.nextInt();
            if(type == 1)
            {
                boolean tour = true;
                tickets[i] = new ZooTicketA(tour);
            }
            else
            {
                boolean tour = false;
                tickets[i] = new ZooTicketA(tour);
            }
        }

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) 
        {
            int id = scan.nextInt();
            int height = scan.nextInt();
            System.out.println(tickets[id-1].enterZoo(height));
        }
    }
}