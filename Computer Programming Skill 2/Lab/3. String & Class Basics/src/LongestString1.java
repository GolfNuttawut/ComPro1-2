import java.util.Scanner;

public class LongestString1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=0;
        for(int i=0;i<5;i++)
        {
            String str = sc.nextLine();
            if(str.length()>max)
            {
                max = str.length();
            }
        }
        System.out.print(max);
    }
}
