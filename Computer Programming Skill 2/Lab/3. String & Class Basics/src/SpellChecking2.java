import java.util.Scanner;

public class SpellChecking2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str1[] = new String[N];
        for(int i=0;i<N;i++)
        {
            str1[i] = sc.next();
        }
        int K = sc.nextInt();
        int cnt=0,max=0,tar=-1,s=0;
        for(int i=0;i<K;i++)
        {
            max=0;
            tar=-1;
            s=0;
            String str2 = sc.next();
            for(int j=0;j<N;j++)
            {
                if(str2.equals(str1[j]))
                {
                    System.out.println(str2);
                    s++;
                }
            }
            if(s==0)
            {
                int R;
                for(int j=0;j<N;j++)
                {
                    cnt=0;
                    if(str1[j].length()<str2.length())
                    {
                        R = str1[j].length();
                    }
                    else
                    {
                        R = str2.length();
                    }
                    for(int k=0;k<R;k++)
                    {
                        if(str2.charAt(k)==(str1[j].charAt(k)))
                        {
                            cnt++;
                        }
                    }
                    if(cnt>max)
                    {
                        max = cnt;
                        tar =  j;
                    } 
                }
                if(tar>-1)
                {
                    System.out.println(str1[tar]);
                }
                else
                {
                    System.out.println(str1[0]);
                }
            }
        }
    }
}
