import java.util.Scanner;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = scan.nextInt();
        }
        int cnt = 0;
        int jump = 0;
        for(int i=0;i<N;i++)
        {
            if(cnt >= 5)
            {
                break;
            }
            if(jump == i)
            {
                jump += Arr[i];
                System.out.println(i+1 + " " + Arr[i]);
                cnt++;
            }
        }
        if(cnt < 5)
        {
            System.out.println("out of bounds");
        }
    }
}