import java.util.Scanner;

public class ReversePrint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] B = new int[A];
        for(int i =0;i<A;i++)
        {
            B[i] = sc.nextInt();
        }
        for(int i=A-1;i>=0;i--)
        {
            System.out.print(B[i]+" ");
        }
    }
}
