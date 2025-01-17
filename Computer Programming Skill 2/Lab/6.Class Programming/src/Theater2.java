import java.util.Scanner;
class Theater 
{
    boolean threeD;
    boolean luxury;
    int numSeats;
    String title;
    int basePrice;
    boolean seats[];
    Theater(boolean threeD,boolean luxury,int numSeats)
    {
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        this.title = title;
        this.basePrice = basePrice;
        this.seats = seats;
    }
    void setTitle(String title)
    {
        if(title == null || title.length()==0)
        {
            System.out.println("invalid title");
        }
        else
        {
            this.title = title;
        }
    }
    void setBasePrice(int basePrice)
    {
        if(basePrice <=0)
        {
            System.out.println("invalid price");
        }
        else
        {
            this.basePrice = basePrice;
        }
    }
    void printInfo()
    {
        if(threeD)
        {
            System.out.println("3D");
        }
        else
        {
            System.out.println("No 3D");
        }
        if(luxury)
        {
            System.out.println("Luxury");
        }
        else
        {
            System.out.println("Standard");
        }
        System.out.println(numSeats);
        if(title == null || title.length()==0)
        {
            System.out.println("title is not set");
        }
        else
        {
            System.out.println(title);
        }
        if(basePrice <=0)
        {
            System.out.println("price is not set");
        }
        else
        {
            System.out.println(basePrice);
        }
    }
    //New
    int reserveOne(int seatNumber)
    {
       /* if(seats[seatNumber]==false && seatNumber>0 && seatNumber <= numSeats)
        {
            seats[seatNumber] = true;
            return basePrice;
        }
        else
        {
            return 0;
        }*/
        System.out.println(this.seats.length);
        return 0;
    }
    int reserveMultiple(int numSeats, int seatNumber)
    {
        return 1;
    }
    // You can enter your code here and only here.
}
// Do not modify the code below. You must leave it as is.
public class Theater2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
        threeD = true;
        if(luxury1 == 1)
        luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) 
        {
            int numberOfSeats = scan.nextInt();int seatNumber = scan.nextInt();int totalPrice;

            if(numberOfSeats == 1)
            totalPrice = t.reserveOne(seatNumber);

            else
            totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);

            if(totalPrice > 0)
            System.out.println(totalPrice);
        }

        t.printInfo();
    }
}
