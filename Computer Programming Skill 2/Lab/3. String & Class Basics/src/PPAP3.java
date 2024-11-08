import java.util.Scanner;

public class PPAP3
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
            int tar3 = text.indexOf(str1,tar2+1);//PPAP3
            int tar4 = text.indexOf(str2,cnt);//GOD
            if(tar4<tar2)//Mid
            {
                cnt = tar2;
            }
            else if(tar4<tar3)//Mid
            {
                cnt = tar3;
            }
            else
            {
                System.out.println(tar3+4);
                break;
            }
        }
    }
}
