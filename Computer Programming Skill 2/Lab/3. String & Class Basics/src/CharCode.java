import java.util.Scanner;
public class CharCode 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char C = N.charAt(0);
        int Va = (int)C;
        System.out.println(Va);
    }
}
