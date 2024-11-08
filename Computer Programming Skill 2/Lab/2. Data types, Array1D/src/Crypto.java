import java.util.Scanner;
public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for(int i = 0; i < N; ++i) {
            Arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int key = sc.nextInt();
        boolean b1 = (Arr[pos] + key <= 51743);
        boolean b2 = (Arr[pos+1] - key > 7832);
        boolean b3 = (Arr[pos+2] - key < 2394);
        boolean b4 = (Arr[pos+3] + key > 9213);
        if(b1 || b2) 
            System.out.println("pass");
        else 
            System.out.println("fail");
        if(b3 || b4)
            System.out.println("pass");
        else 
            System.out.println("fail");
        
        if((b1 || b2) && (b3 || b4))
            System.out.println("pass");
        else 
            System.out.println("fail");
    }
}