import java.util.Scanner;
public class NumberOccurrence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] B = new int[A];
        for(int i =0;i<A;i++)
        {
            B[i] = sc.nextInt();
        }
         int T = sc.nextInt();
         int cnt=0;
        for(int i=0;i<A;i++)
        {
            if(B[i]==T)
            {
                System.out.print(i+1+" ");
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.print(0);
        }
    }
}
