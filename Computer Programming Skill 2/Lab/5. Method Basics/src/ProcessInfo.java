import java.util.Scanner;
public class ProcessInfo 
{
    static boolean  listProcesses(String names[],int ramUses[],int ram) 
    {
        int cnt=0;
        for(int i=0;i<ramUses.length;i++)
        {
            if(ramUses[i]>=10)
            {
                System.out.println(names[i]+"* "+ramUses[i]);
                cnt += ramUses[i];
            }
            else
            {
                System.out.println(names[i]+" "+ramUses[i]);
                cnt += ramUses[i];
            }
        }
        System.out.println("RAM used = "+cnt+" out of "+ram);
        if(cnt>ram)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];
        for(int i=0;i<N;i++)
        {
            names[i] = scan.next();
            ramUses[i] = scan.nextInt();
        }
        int ram = scan.nextInt();
        boolean X =  listProcesses(names,ramUses,ram);
        if(X)
        {
            System.out.println("Sufficient RAM");
        }
        else
        {
            System.out.println("Not enough RAM");
        }
    }
}