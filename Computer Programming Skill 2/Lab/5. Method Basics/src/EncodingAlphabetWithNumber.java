import java.util.Scanner;

public class EncodingAlphabetWithNumber 
{
    static char conver(int X,String str,int i)
    {
        char ch = str.charAt(i);
        int N = X + (int)ch;
        if(N>90)
        {
            N -= 26;
        }
        ch = (char)N;
        return ch;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            int X = sc.nextInt();
            char C = conver(X,str,i);
            System.out.print(C);
        }
    }
}
