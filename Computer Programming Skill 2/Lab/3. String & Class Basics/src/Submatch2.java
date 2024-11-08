
import java.util.Scanner;

public class Submatch2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int T=0;
        for(int i=0;i<text2.length()-2;i++)
        {
            T = text1.indexOf(text2.substring(i, i+3));
            T +=1;
            if(T>0)
            {
                System.out.println(T);
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
