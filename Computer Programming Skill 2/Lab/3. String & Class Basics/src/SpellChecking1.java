import java.util.Scanner;

public class SpellChecking1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str1[] = new String[N];
        String str2[] = new String[10];
        for(int i=0;i<N;i++)
        {
            str1[i] = sc.next();
        }
        for(int i=0;i<10;i++)
        {
            str2[i] = sc.next();
        }
        int cnt=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(str2[i].equals(str1[j]))
                {
                    cnt++;
                }
            }
            if(cnt>0)
            {
                System.out.print("1");
                cnt=0;
            }
            else
            {
                System.out.print("0");
            }
        }
    }
}
