import java.util.Scanner;

public class AABBCC1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt=0,max=0;
        for(int i=1;i<str.length();i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if((int)ch1==(int)ch2 || (int)ch1 - (int)ch2 ==1)
            {
                cnt++;
            }
            else
            {
                if(cnt>max)
                {
                    max = cnt;
                    cnt=0;
                }
                cnt=0;
            }
            if(i==str.length()-1)
            {
                if(cnt>max)
                {
                    max = cnt;
                    cnt=0;
                }
            }
        }
        System.out.println(max+1);
    }
}
