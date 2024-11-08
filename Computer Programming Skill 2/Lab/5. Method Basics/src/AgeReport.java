import java.util.Scanner;
public class AgeReport 
{
    static int reportAge(int []IDs,int []ages,int Y1,int Y2)
    {
        int cnt=0;
        for(int i=0;i<IDs.length;i++)
        {
            if(ages[i]>=Y1 && ages[i]<=Y2)
            {
                System.out.println(IDs[i]);
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] IDs = new int[N];
        int[] ages = new int[N];
        for(int i=0;i<N;i++)
        {
            IDs[i] = scan.nextInt();
            ages[i] = scan.nextInt();
        }
        int Y1 = scan.nextInt();
        int Y2 = scan.nextInt();
        int A = reportAge(IDs,ages,Y1,Y2);
        System.out.print("There are "+A+" persons in age range of "+Y1+" to "+Y2);
    }
}
