import java.util.Scanner;

public class Lease1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] B = new int[A];
        for(int i =0;i<A;i++)
        {
            B[i] = sc.nextInt();
        }
       int Year = sc.nextInt();
        for(int i =0;i<A;i++)
        {
            System.out.print(Year+B[i]-1+" ");
        }
    }
}

/*
import java.util.Scanner;

public class Lease1{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++){
            Arr[i] = scan.nextInt();
        }
        int year = scan.nextInt();
        for(int data : Arr){
            System.out.print(year-1+data+" ");
        }
    }
}
*/