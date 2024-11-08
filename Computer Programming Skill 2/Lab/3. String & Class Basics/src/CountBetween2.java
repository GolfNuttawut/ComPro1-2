import java.util.Scanner;

public class CountBetween2 
{
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a[] = str.toCharArray();
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(a[i]))
            {
                sum1++;
            }
            else if(Character.isUpperCase(a[i]))
            {
                sum2++;
            }
            else
            {
                sum3++;
            }
        }
        System.out.print(sum1+"\n"+sum2+"\n"+sum3);
    }
}
