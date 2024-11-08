import java.util.Scanner;

public class WordStats1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str[] = new String[N];
        for(int i=0;i<N;i++)
        {
            str[i] = sc.next();
        }
        int cnt;
        for(int i=65;i<=90;i++)
        {
            cnt=0;
            for(int j=0;j<N;j++)
            {
                if(str[j].charAt(0)==(char)i)
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
