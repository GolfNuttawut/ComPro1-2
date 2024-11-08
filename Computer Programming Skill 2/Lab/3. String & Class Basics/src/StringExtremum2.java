import java.util.Scanner;

public class StringExtremum2 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=0;
        String c = sc.nextLine();
        String sc1 = sc.nextLine();
        String sc2 = sc.nextLine();
        String str[] = new String[10000];
        int max=0,min=1001,tmax=0,tmin=0;
        for(int i=0;true;i++)
        {
            str[i] = sc.nextLine();
            if(str[i].length()==0)
            {
                break;
            }
            if(str[i].indexOf(sc1)>-1 || str[i].indexOf(sc2)>-1)
            {
                //max
                if(str[i].length()>=max)
                {
                    max = str[i].length();
                    tmax = i;
                }
                if(str[i].length()<=min)
                {
                    min = str[i].length();
                    tmin = i;
                }
            }
        }
        if(N==1)
        {
            System.out.println(max);
            System.out.println(str[tmax]);
        }
        else
        {
            System.out.println(min);
            System.out.println(str[tmin]);
        }
    }
}
