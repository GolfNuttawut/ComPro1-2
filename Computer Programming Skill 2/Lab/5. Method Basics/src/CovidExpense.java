import java.util.Scanner;
public class CovidExpense 
{
    static int[] calCovidExpense(int []rtpcr,int []med, int []inpat,int []breath) 
    {
        int Ar[] = new int[med.length];
        for(int i=0;i<med.length;i++)
        {
            if(rtpcr[i]==1)
            {
                Ar[0] += 1500;
            }
            if(med[i]==1)
            {
                Ar[1] += 130;
            }
            else
            {
                Ar[1] += 80;
            }
            if(inpat[i]==1)
            {
                Ar[2] += 800;
            }
            if(breath[i]==1)
            {
                Ar[3] += 2000;
            }
        }
      return Ar;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] rtpcr = new int[N];
        int[] med = new int[N]; 
        int[] inpat = new int[N];
        int[] breath = new int[N];
        for(int i=0;i<N;i++)
        {
            rtpcr[i] = scan.nextInt();
            med[i] = scan.nextInt(); 
            inpat[i] = scan.nextInt();
            breath[i] = scan.nextInt(); 
        }
        int Arr[] = calCovidExpense(rtpcr,med,inpat,breath);
        System.out.println("RT-PCR cost = "+Arr[0]);
        System.out.println("Medicine cost = "+Arr[1]);
        System.out.println("Inpatient cost = "+Arr[2]);
        System.out.println("Breath-aid equipment cost = "+Arr[3]);
    }
}
