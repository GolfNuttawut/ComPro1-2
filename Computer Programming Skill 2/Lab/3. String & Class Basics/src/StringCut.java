import java.util.Scanner;

public class StringCut 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        char T = sc.next().charAt(0);
        int cnt=0;
        for(int i=0;i<text1.length();i++)
        {
            char ch = text1.charAt(i);
            if(ch==T)
            {
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.println("no target character found");
        }
        else if(cnt==text1.length())
        {
            System.out.println("no output");
        }
        else
        {
            int count=1;
            for(int i=0;i<text1.length();i++)
            {
                char ch = text1.charAt(i);
                if(ch==T)
                {
                    if(count==0)
                    {
                        System.out.println();
                        count++;
                    }
                    else
                    {
                        continue;
                    }
                }
                else
                {
                    System.out.print(ch);
                    count=0;
                }
            }
        }
    }
}
