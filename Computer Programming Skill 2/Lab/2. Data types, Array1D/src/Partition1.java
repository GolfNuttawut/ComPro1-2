import java.util.Scanner;

public class Partition1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []Arr = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = sc.nextInt();
        }
        int K = N/2;
        int Mid = Arr[K]; 
        for(int i=0;i<N;i++)
        {
            if(Arr[i]<=Mid)
            {
                System.out.print(Arr[i]+" ");
            }
        }
        System.out.print("\n");
        for(int i=0;i<N;i++)
        {
            if(Arr[i]>Mid)
            {
                System.out.print(Arr[i]+" ");
            }
        }
        
    }
}
