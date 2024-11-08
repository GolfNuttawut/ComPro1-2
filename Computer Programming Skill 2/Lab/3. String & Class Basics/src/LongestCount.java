import java.util.Scanner;

public class LongestCount 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0,cnt=0,count=0;
        String str[] = new String[100];
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
                }
            }
            count++;
        }
        for(int i=0;i<=count;i++)
        {
            if(str[i].length()==max)
            {
                cnt++;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
