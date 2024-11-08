import java.util.Scanner;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int jump = scan.nextInt();
        int Arr[] = new int[N+1];
        for(int i=1;i<N+1;i++)
        {
            Arr[i] = scan.nextInt();
        }
        for(int i=1;i<N+1;i++)
        {
            if(jump == i)
            {
                jump += Arr[i];
                System.out.println(i + " " + Arr[i]);
            }
        }
        System.out.println("out of bounds");
    }
    
}
