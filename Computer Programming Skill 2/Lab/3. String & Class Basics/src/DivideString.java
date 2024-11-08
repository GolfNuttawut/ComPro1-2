import java.util.Scanner;

public class DivideString 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isLowerCase(ch[i]) && !Character.isUpperCase(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
    }
}
