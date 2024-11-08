
import java.util.Scanner;

class GasStation{
    double []OilType;
    GasStation(double[] OilType){
        this.OilType = OilType;
    }
    void fillTank(){
        
    }
    void refuel(double []OilRe){
        for(int i=0;i<OilRe.length;i++){
            this.OilType[i] += OilRe[i];
        }
    }
    void print(){
        for(int i=0;i<OilType.length;i++){
            System.out.print(OilType[i]+" ");
        }
        System.out.println("");
    }
}

public class TestGasStation {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight[] = new int[n];
        int feul[] = new int[n];
        for(int i=0;i<n;i++){
            weight[i] = sc.nextInt();
            feul[i] = sc.nextInt();
        }
        int k = sc.nextInt();// OilType(n)
        double[] OilType = new double[k]; 
        for(int i=0;i<k;i++){
            OilType[i] = sc.nextDouble();
        }
        GasStation gas = new GasStation(OilType);
        int m = sc.nextInt();// Order(n)
        for(int i=0;i<m;i++){
            int Order = sc.nextInt();
            if(Order==0){
                int A = sc.nextInt();
                int T = sc.nextInt();
                int D = sc.nextInt();
                gas.fillTank();
            }
            else{
                double []OilRe = new double[k];
                for(int j=0;j<k;j++){
                    OilRe[j] = sc.nextDouble();
                }
                gas.refuel(OilRe);
            }
            gas.print();
        }
    }
}
