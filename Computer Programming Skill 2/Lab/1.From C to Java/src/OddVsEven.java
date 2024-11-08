import java.util.Scanner;

public class OddVsEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        for(int i=0;i<8;i++){
            int input = scan.nextInt();
            if(input%2!=0){
                odd += input;
                continue;
            }
            even += input;
        }
        if(odd>even){
            System.out.println("odd");
            System.out.println(even);
            System.out.println(odd);
        }
        else if(odd<even){
            System.out.println("even");
            System.out.println(even);
            System.out.println(odd);
        }
        else{
            System.out.println("equal");
            System.out.println(even);
            System.out.println(odd);
        }
    }
}