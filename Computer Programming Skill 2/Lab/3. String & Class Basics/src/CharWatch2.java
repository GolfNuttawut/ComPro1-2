import java.util.Scanner;

public class CharWatch2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        char ch3 = sc.next().charAt(0);
        int S = sc.nextInt();
        int sum1=0,sum2=0,sum3=0;
        String str[] = new String[S];
        for(int i=0;i<S;i++)
        {
            str[i] = sc.next();
        }
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int x = sc.nextInt();
            x-=1;
            for(int j=0;j<S;j++)
            {        
                if(x>=0 && x<str[j].length())
                {
                   if(str[j].charAt(x)==ch1)
                    {
                        sum1++;
                    }
                    else if(str[j].charAt(x)==ch2)
                    {
                        sum2++;
                    }
                    else if(str[j].charAt(x)==ch3)
                    {
                        sum3++;
                    }
                }
            }
        }
        System.out.print(sum1+"\n"+sum2+"\n"+sum3);
    }
}
