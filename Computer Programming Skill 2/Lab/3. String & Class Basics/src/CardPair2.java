import java.util.Scanner;

public class CardPair2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            int p1=1000,p2=1000;
            if(str1.charAt(0)==str1.charAt(1) && str2.charAt(0)==str2.charAt(1) )
            {
                p1 = str1.charAt(0);
                p2 = str2.charAt(0);
            }
            else if(str1.charAt(0)==str1.charAt(1))
            {
                p1 = 0;
                p2 = 100;
            }
            else if( str2.charAt(0)==str2.charAt(1) )
             {
                p1 = 100;
                p2 = 0;
            }
            else
            {
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
            }
            if(p1<p2)
            {
                System.out.print("W");
            }
            else if(p1>p2)
            {
                System.out.print("L");
            }
            else
            {
                System.out.print("D");
            }
        }
    }
}
