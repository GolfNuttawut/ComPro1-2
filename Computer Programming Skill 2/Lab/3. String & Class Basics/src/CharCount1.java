import java.util.Scanner;

public class CharCount1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int cnt=0;
        for(int i=65;i<=90;i++)
        {
            cnt=0;
            for(int j=0;j<text.length();j++)
            {
                char ch = text.charAt(j);
                if((int)ch==i)
                {
                    cnt++;
                }
            }
            if(cnt>0)
            {
                System.out.println((char)i+" "+cnt);
            }
        }
    }
}
