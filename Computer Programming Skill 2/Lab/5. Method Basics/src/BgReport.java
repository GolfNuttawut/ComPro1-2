import java.util.Scanner;
public class BgReport {
    static void reportBg(String name,int birthYear,int startYear) 
    {
        if(name.length()>=2)
        {
            System.out.println("Name: "+name);
        }
        else
        {
            System.out.println("Name: INVALID");
        }
        if(birthYear>=1900 && birthYear<=2022)
        {
            System.out.println("Birth year: "+birthYear);
        }
        else
        {
            System.out.println("Birth year: INVALID");
        }
        if(startYear>=birthYear+18 && birthYear>=1900 && birthYear<=2022 && startYear>=1900 && startYear<=2022)
        {
            System.out.println("Start year: "+startYear);
        }
        else
        {
            System.out.println("Start year: INVALID");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthYear = scan.nextInt(); 
        int startYear = scan.nextInt(); 
        reportBg(name,birthYear,startYear);
    }
}
