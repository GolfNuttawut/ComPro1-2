import java.util.Scanner;

public class IntToChar 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>=65 && N<=90)
        {
            System.out.println((char) N); 
        }
        else
        {
             System.out.println("unsupported code"); 
        }
    }
}
