import java.util.Scanner;

public class PPAP2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "PPAP";
        String str2 = "GOD";
        String text = sc.next();
        int cnt=0;
        while(true)
        {
            int tar1 = text.indexOf(str1,cnt);//PPAP1
            int tar2 = text.indexOf(str1,tar1+1);//PPAP2
            int tar3 = text.indexOf(str2,cnt);//GOD
            if(tar3<tar2)//Mid
            {
                cnt = tar2;
            }
            else
            {
                System.out.println(tar2+4);
                break;
            }
        }
    }
}
