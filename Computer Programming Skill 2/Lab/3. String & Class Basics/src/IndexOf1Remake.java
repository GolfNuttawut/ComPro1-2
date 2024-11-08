import java.util.Scanner;

public class IndexOf1Remake 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int T = text1.indexOf(text2);
        System.out.print(T);
        T += 1;
        if(T>0)
        {
            System.out.print(T);
        }
        else
        {
            System.out.print("string not found");
        }
    }
}
