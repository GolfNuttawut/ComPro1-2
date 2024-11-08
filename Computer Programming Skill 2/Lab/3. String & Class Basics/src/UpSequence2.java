
import java.util.Scanner;

public class UpSequence2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
           if(i==str.length()-1)
           {
               System.out.print(ch[i]); 
           }
           else
           {
                if(ch[i]>=ch[i+1])
                {
                    System.out.println(ch[i]);
                }
                else
                {
                     System.out.print(ch[i]);
                }
           }
        }
    }
}