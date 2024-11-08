import java.util.Scanner;

public class ABC2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt=0,fir=99999;
        for(int i=0;i<str.length()-2;i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);
            if((int)ch3 - (int)ch2 == 1 && (int)ch2 - (int)ch1 == 1)
            {
                if(i<fir)
                {
                    fir=i+1;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
        if(fir<99999)
        {
            System.out.println(fir);
        }
        else
        {
            System.out.println("-1");
        }
    }
}