import java.util.Scanner;
public class CookiePlan 
{
    static int planCookie(int flours[],int butters[]) 
    {
        int B=3*10,F=6*10,cnt=0;
        for(int i=0;i<flours.length;i++)
        {
            if(flours[i]<F || butters[i]<B)
            {
                System.out.println(i+1);
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for(int i=0;i<N;i++)
        {
            flours[i] = scan.nextInt();
            butters[i] = scan.nextInt();
        }
        int Out = planCookie(flours,butters);
        System.out.println("There are "+Out+" days that ingredients are insufficient");
    }
}