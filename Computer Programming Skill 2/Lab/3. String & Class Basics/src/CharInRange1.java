import java.util.Scanner;

public class CharInRange1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        char a1 = sc.next().charAt(0);
        char a2 = sc.next().charAt(0);
        char b1 = sc.next().charAt(0);
        char b2 = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        int cnt=0;
        for(int i=0;i<3;i++)
        {
            cnt=0;
            String str = sc.nextLine();
            char ch = str.charAt(0);
            if(ch >= a1 && ch<=a2)
            {
                System.out.print(1+" ");
                cnt++;
            }
            if(ch >= b1 && ch<=b2)
            {
                System.out.print(2+" ");
                cnt++;
            }
            if(ch >= c1 && ch<=c2)
            {
                System.out.print(3+" ");
                cnt++;
            }
            if(cnt==0)
            {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
