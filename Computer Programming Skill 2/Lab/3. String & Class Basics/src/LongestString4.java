import java.util.Scanner;

public class LongestString4 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0,t=0;
        String str[] = new String[1000];
        for(int i=0;true;i++)
        {
            str[i] = sc.nextLine();
            if(str[i].length()==0)
            {
                break;
            }
            else
            {
                if(str[i].length()>=max)
                {
                    max = str[i].length();
                    t = i;
                }
            }
        }
        System.out.print(str[t]);
    }
}
