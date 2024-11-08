import java.util.Scanner;

public class CharCount2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        char chars[] = new char[26];
        int K = sc.nextInt();
        for(int i=1;true;i++)
        {
            String str = sc.next();
            for(int j=0;j<str.length();j++)
            {
                char ch = str.charAt(j);
                int index = ch - 'A';
                chars[index]++;
                if(chars[index]==K)
                {
                    System.out.print(ch+"\n"+i);
                    return;
                }
            }
        }
    }
}
