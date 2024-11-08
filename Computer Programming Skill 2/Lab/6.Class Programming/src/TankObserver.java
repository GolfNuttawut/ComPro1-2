import java.util.Scanner;
class WaterTank 
{
    public int capacity;
    public int volume =0;
    public WaterTank(int width,int length,int height)
    {
        this.capacity = width*length*height;
        this.volume = volume;
    }
    public int fill(int amount)
    {   
        volume += amount;
        if(volume>capacity)
        {
            System.out.println("Cannot fill the tank");
            volume -= amount;
            return -1;
        }
        else
        {
            return volume;
        }
    }
}
public class TankObserver 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width,length,height);
        for(int i = 0; i < 5; ++i) 
        {
            int amount = scan.nextInt();
            int x = tank.fill(amount);
            System.out.println(x);
        }
    }
}
