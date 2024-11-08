import java.util.Scanner;

public class AABBCC2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int max=1,cnt=0,t=0;
        for(int i=1;i<str.length();i++)
        {
            if((int)ch[i]==(int)ch[i+1] || (int)ch[i+1] - (int)ch[i] ==1)
            {
                cnt++;
            }
            else
            {
                if(cnt>max)
                {
                    max = cnt;
                    cnt=0;
                    t=i;
                }
                cnt=0;
            }
        }
    }
}
