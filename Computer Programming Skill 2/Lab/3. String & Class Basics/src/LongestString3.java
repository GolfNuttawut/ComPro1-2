import java.util.Scanner;

public class LongestString3 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0,t=0;
        String str[] = new String[5];
        for(int i=0;i<5;i++)
        {
            str[i] = sc.nextLine();
            if(str[i].length()>=max)
            {
                max = str[i].length();
                t = i;
            }
        }
        System.out.print(str[t]);
    }
}
