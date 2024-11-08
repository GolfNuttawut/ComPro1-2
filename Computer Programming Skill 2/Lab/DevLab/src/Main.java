
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = (str.length() * 2) - 1;
        int front = n;
        int back = n+1;
        char ch[][] = new char[str.length()][n];
        for (int k = 0; k < str.length(); k++) {
            for (int i = 0; i < str.length(); i++) {
                for (int  j = (n/2)-1; j < back; j++) {
                    ch[i][j] = str.charAt(k);
                }
                for (int  j = (n/2)-1; j >= front; j--) {
                    ch[i][j] = str.charAt(k);
                }
            }
            front--;
            back++;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println("");
        }

    }
}
