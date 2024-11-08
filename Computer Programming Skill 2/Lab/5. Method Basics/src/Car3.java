import java.util.Scanner;

public class Car3 
{   
    static int calculatePrice(int year,int km)
    {
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(),km = sc.nextInt();
        int x = calculatePrice(year,km);
        Car3 cons = new Car3();
        System.out.print(x);
    }
}
