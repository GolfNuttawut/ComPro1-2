
import java.util.Scanner;

public class NoDividebyZero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if(z==0)
        {
            System.out.print("cannot divide by zero");
        }
        else
        {
            System.out.printf("%.6f",(x+y)/z);
        }
    } 
}