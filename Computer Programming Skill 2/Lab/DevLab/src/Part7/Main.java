package Part7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack s = new Stack();
        int n = scan.nextInt();
        int copy = n;
        System.out.println("Input Base 10: "+n);
        try {
            while (n > 0) {
                int bit = n % 2;
                s.push(bit);
                if (s.isFullStack()) {
                    System.out.println("error");
                }
                n /= 2;
            }
            System.out.print(copy+" Basw 10 is ");
            while (!s.isEmptyStack()) {
                System.out.print(s.peek());
                s.pop();
            }
            System.out.println(" Base 2");
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
