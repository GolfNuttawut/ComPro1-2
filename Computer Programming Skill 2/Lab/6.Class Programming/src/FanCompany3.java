/*
import java.util.Scanner;

class Blade
{
 //put class variable here
    int size;
    int number;
    int angle;
    double hp;
    boolean valid;
    Blade(int size,int number,int angle,double hp)
    {
        this.size = size;
        this.number = number;
        this.angle = angle;
        this.hp = hp;
        if(!((size>=16)&&(size<=24)&&(size%2==0)))
        {
            valid = false;
            System.out.println("invalid size");
        }
        if(number<3 || number>5)
        {
            valid = false;
            System.out.println("invalid number of blades");
        }
        if(angle != 27 && angle != 30 && angle != 33)
        {
            valid = false;
            System.out.println("invalid angle");
        }
        if(hp<=0)
        {
            valid = false;
            System.out.println("invalid horsepower");
        }
    }
    void printInfo()
    {
        System.out.println(size+" "+number+" "+angle+" "+hp+" "+valid);
    }
}
class Motor {

    double V, I, eff;

    Motor(double V, double I, double eff) {
        this.V = V;
        this.I = I;
        this.eff =  eff/100;
    }

    Motor(double I, double eff) {
        //call constructor choose from these keywords
        this.I = I;
        this.eff = eff/100;
        this.V = 220;
        //(super,this,that)
        //(220,I,eff);
 }
    double horsepower() 
    {
        return  (V*I*eff)/746;
    }

    void printInfo() {
        double hp = horsepower();
        System.out.println(V + " " + I + " " + eff + " "+ String.format("%.2f", hp));
    }
}
class ElectricFan
{
    int productID; 
    Blade ablade;
    Motor motor;
    boolean status = true;
    static int count = 0;
    ElectricFan(Blade ablade,Motor motor)
    {
        count++;
        this.productID = count;
        this.ablade = ablade;
        this.motor = motor;
        this.status = status;
        
    }
    boolean changeBlade(Blade ablade)
    {
        
    }
    boolean changeMotor(Motor motor)
    {
       
    }
    void printinfo()
    {
        
    }
}
public class FanCompany3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan(ablade ,motor);
            } else if (cmd == 1) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                eFan.changeBlade(ablade);
            } else if (cmd == 2) {
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan.changeMotor(motor);
            }
             //???
            ablade.printInfo();
        }
    }
}*/