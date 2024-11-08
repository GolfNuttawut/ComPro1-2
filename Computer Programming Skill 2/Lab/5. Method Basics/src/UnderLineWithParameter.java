import java.util.Scanner;

public class UnderLineWithParameter 
{
    static void textline(String text,int point)
    {
        System.out.println(text);
        for(int i=0;i<point;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            String text = sc.next();
            int point = sc.nextInt();
            textline(text,point);
        }
    }
}
