
import java.util.Scanner;

class Station {
    int benzin;
    int diesel;
    Station(int benzin, int diesel){
        this.benzin = benzin;
        this.diesel = diesel;
    }
    void dispense(){
        
    }
}

class Car {
    int gasType;
    int C;
    int D;
    Car(int B,int C,int D)
    {
        this.gasType = B;
        this.C = C;
        this.D = D;
    }
    int getNeededVol(){
        return C-D;
    }
}

public class StationAndCar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station sta = new Station(benzin ,diesel);
        //
        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            Car car = new Car(B,C,D);
            if(A==1){
                sta.dispense();
            }
            else{
                
            }
            //
       }
    }
}