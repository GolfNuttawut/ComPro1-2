import java.util.Scanner;

public class UpSequence1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
           if(i>0 && ch[i]<=ch[i-1])
           {
               System.out.println(ch[i-1]);
           }
           if(i==str.length()-1)
           {
               System.out.println(ch[i]); 
           }
        }
    }
}
