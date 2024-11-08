import java.util.Scanner;

public class PPAP1 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "PPAP";
        String str2 = "GOD";
        String text = sc.next();
        if(text.indexOf(str1)==-1)
        {
            System.out.println("clean");
        }
        else
        {
            if(text.indexOf(str2)<text.indexOf(str1) && text.lastIndexOf(str2)>text.lastIndexOf(str1))
            {
                System.out.println("safe");
            }
            else
            {
                System.out.println("danger");
            }
        }
    }
}
