import java.util.Scanner;

public class IndexOf2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        boolean Check = false;
        int P=0;
        for(int i=0;i<text1.length();i++)
        {
            int T = text1.indexOf(text2,i);
            T += 1;
            if(T>0)
            {
                if(T>P)
                {
                    System.out.print(T+" ");
                    P=T;
                    Check = true;
                }
            }
        }
        if(!Check)
        {
            System.out.println("string not found");
        }
    }
}
