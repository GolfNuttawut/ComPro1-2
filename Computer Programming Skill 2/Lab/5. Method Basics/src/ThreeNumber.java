import java.util.Scanner;
public class ThreeNumber 
{
    static int stat(int T)
    {
        if(T==0)
        {
            return 1;
        }
        else if(T==1)
        {
            return 0;
        }
        else
        {
            return 2;
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[3];
        for(int i=0;i<3;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int max=-1,swap;
        for(int i=0;i<3;i++)
        {
             for(int j=i;j<3;j++)
            {
                if(Arr[i]<Arr[j])
                {
                    swap = Arr[j];
                    Arr[j] = Arr[i];
                    Arr[i] = swap;
                }
            }
        }
        int T = sc.nextInt();
        int C = stat(T);
        System.out.print(Arr[C]);
    }
}
