import java.util.Scanner;
public class MakeCookie 
{
    static void  calCookieBags(int flour,int butter) 
    {
        int cook=0;
        if(flour< 0 || flour > 100000 || butter < 0 || butter > 100000)
        {
            System.out.println("Cookie bags: Error");
            if(flour<0 || flour > 100000 )
            {
                System.out.println("Flour left: Invalid");
            }
            else
            {
                System.out.println("Flour left: "+flour);
            }
            if(butter < 0 || butter > 100000)
            {
                System.out.println("Butter left: Invalid");
            }
            else
            {
                System.out.println("Butter left: "+butter);
            }
        }
        else
        {
            int F=0,B=0;
            if(flour/6 <= butter/3)
            {
                cook = flour/6;
                F = flour-(cook*6);
                B = butter-(cook*3);
                System.out.println("Cookie bags: "+cook);
                System.out.println("Flour left: "+F);
                System.out.println("Butter left: "+B);
            }
            else
            {
                cook = butter/3;
                F = flour-(cook*6);
                B = butter-(cook*3);
                System.out.println("Cookie bags: "+cook);
                System.out.println("Flour left: "+F);
                System.out.println("Butter left: "+B);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int flour = scan.nextInt();
        int butter = scan.nextInt(); 
        calCookieBags(flour,butter);
    }
}
