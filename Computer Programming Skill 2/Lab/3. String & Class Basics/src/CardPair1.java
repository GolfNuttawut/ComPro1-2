import java.util.Scanner;

public class CardPair1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            int p1=1000,p2=1000;
            for(int j=0;j<2;j++)
            {
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);
                if((int)ch1<p1)//1
                {
                    p1 = (int)ch1;
                }
                if((int)ch2<p2)//2
                {
                    p2 = (int)ch2;
                }
            }
            if(p1>p2)
            {
                System.out.print("L");
            }
            else if(p1<p2)
            {
                System.out.print("W");
            }
            else
            {
                System.out.print("D");
            }
        }
    }
}
