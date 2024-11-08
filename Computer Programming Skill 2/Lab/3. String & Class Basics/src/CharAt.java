import java.util.Scanner;

public class CharAt {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int T = sc.nextInt();
        if(T>0 && T-1<text.length())
        {
            char chT = text.charAt(T-1);
            System.out.print(chT);
        }
        else
        {
            System.out.print("0");
        }
    }
}
