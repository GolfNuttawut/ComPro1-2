import java.util.Scanner;
class House 
{
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price=0;
    House(int landSize,int quality,int floors,int houseArea)
    {
         this.landSize = landSize;
         this.quality = quality;
         this.floors = floors;
         this.houseArea = houseArea;
    }
    int computePrice(int limPrice,int limArea)
    {
        price += (10000*landSize);
        if(quality==1)
        {
            price += 10000*houseArea;
        }
        else if(quality==2)
        {
            price += 8000*houseArea;
        }
        else if(quality==3)
        {
            price += 5000*houseArea;
        }
        if(floors>1)
        {
            price += (floors-1)*200000;
        }
        if(price<=limPrice && houseArea>=limArea)
        {
            System.out.println(landSize + " " + quality + " " + floors + " " + houseArea+" "+price);
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
public class HousePrice2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        House[] house = new House[n];
        for(int i=0;i<n;i++)
        {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House(landSize, quality, floors, houseArea);
        }
        int limPrice = scan.nextInt();
        int limArea = scan.nextInt();
        int x=0;
        for(int i=0;i<n;i++)
        {
            x += house[i].computePrice(limPrice,limArea);           
        }
        if(x<=0)
        {
            System.out.println("none");
        }
    }
}