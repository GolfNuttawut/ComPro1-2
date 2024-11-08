import java.util.Scanner;

public class CharWatch1 
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        char char1 = s1.charAt(0);
        char char2 = s2.charAt(0);
        char char3 = s3.charAt(0);
        String major = scan.next();
        int N = scan.nextInt();
        int sum1=0,sum2=0,sum3=0,sum4=0;
        for(int i=0;i<N;i++)
        {
            int x = scan.nextInt();
            x-=1;
            if(x>=0 && x<major.length())
            {
                if(major.charAt(x)==char1)
                {
                    sum1++;
                }
                else if(major.charAt(x)==char2)
                {
                    sum2++;
                }
                else if(major.charAt(x)==char3)
                {
                    sum3++;
                }
            }
            else
            {
                sum4++;
            }
        }
        System.out.print(sum1+"\n"+sum2+"\n"+sum3+"\n"+sum4);
    }
}