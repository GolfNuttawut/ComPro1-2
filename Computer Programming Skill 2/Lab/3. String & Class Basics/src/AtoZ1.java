import java.util.Scanner;

public class AtoZ1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int t1 = 0,t2 = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A')
            {
                t1 = i;
            }
            if(str.charAt(i)=='Z')
            {
                t2 = i;
            }
        }
        if(t1<t2)
        {
            for(int i=t1;i<=t2;i++)
            {
                System.out.print(str.charAt(i));
            }
        }
        else
        {
            for(int i=t1;i>=t2;i--)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
