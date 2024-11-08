import java.util.Scanner;
public class Account1 {
    int balance = 10000;
    int deposit(int n){
        return n+balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Account1 ac = new Account1();
        System.out.println(ac.deposit(n));
    }
}