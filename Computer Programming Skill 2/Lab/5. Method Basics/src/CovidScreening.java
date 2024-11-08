import java.util.Scanner;
public class CovidScreening 
{
    static void screenCovid(boolean Boo,int screenCovid,int age,int vaccines) 
    {
        if(Boo)
        {
            System.out.println("RT-PCR recommended");
        }
        if(screenCovid<=2 && age<70)
        {
            System.out.println("Home isolation");
        }
        else
        {
            System.out.println("Hospital admission");
        }
        if(vaccines>=2 && screenCovid==1)
        {
            System.out.println("Standard medicine package");
        }
        else
        {
            System.out.println("Favipiravia included");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int insurance = scan.nextInt();
        int severity = scan.nextInt();
        int age = scan.nextInt();
        int vaccines = scan.nextInt();
        boolean Boo = false;
        if(insurance==1)
        {
            Boo = true;
        }
        screenCovid(Boo,severity,age,vaccines);
    }
}
