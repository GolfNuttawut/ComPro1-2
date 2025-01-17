import java.util.Scanner;
class Theater 
{
    boolean threeD;
    boolean luxury;
    int numSeats;
    String title;
    int basePrice;
    boolean []seats = new boolean[numSeats+1];
    Theater(boolean threeD,boolean luxury,int numSeats)
    {
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        this.title = title;
        this.basePrice = basePrice;
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
}
// Do not modify the code below. You must leave it as is.
public class Theater1 
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

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        
        if(title.compareTo("-1") == 0)
        t.setTitle(null);
        
        else
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();
    }
}