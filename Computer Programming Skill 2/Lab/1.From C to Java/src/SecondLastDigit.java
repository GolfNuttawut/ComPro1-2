import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        System.out.print((Number%100)/10);
    }
}