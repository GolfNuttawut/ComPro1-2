import java.util.Scanner;

public class CharPin 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        for(int i=str1.length()-1;i>=0;i--)
        {
            if(i>2 && ch1[i]==ch2[2] && ch1[i-1]==ch2[1] && ch1[i-2]==ch2[0])
            {
               System.out.print(str2);
               i-=2;
            }
            else
            {
                System.out.print(ch1[i]);
            }
        }
    }
}
