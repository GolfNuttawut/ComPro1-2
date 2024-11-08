import java.util.Scanner;

public class LastDigit {
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int Number = scan.nextInt();
       System.out.print(Number%10);
    }
}