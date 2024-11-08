
import java.util.Scanner;

class Car {
    String name;
    int price;
    int labor;
    Car(String name ,int price, int labor)
    {
       this.name = name;
       this.price = price;
       this.labor = labor;
    }
    static boolean check(String name ,int price, int labor){
        if(name.length()==0 || price<=0 || labor<=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }    
}

class Factory{
    Factory(){
        
    }
}
public class AliCarCar2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        int cnt=0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (Car.check(name,price,labor)) {
                cnt++;
                cars[cnt] = new Car(name,price,labor) ;
                //System.out.println("valid");
            } else {
                //System.out.println("invalid");
            }
        }

        /*for (int i=1;i<=cnt;i++)
            System.out.println(i + " " + cars[i].name);
        */
        for(int i=0;i<5;i++)
        {
            int power = scan.nextInt();
            for(int j=0;j<N;j++)
            {
                
            }
        }
    }
}