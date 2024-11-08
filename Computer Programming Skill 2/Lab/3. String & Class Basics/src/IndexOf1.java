import java.util.Scanner;

public class IndexOf1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String tar = sc.nextLine();
        int T = text.indexOf(tar);
        T = T+1;
        if(T>0)
        {
            System.out.println(T);
        }
       else
        {
            System.out.println("string not found");
        }
    }
}
