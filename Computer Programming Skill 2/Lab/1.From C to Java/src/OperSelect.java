import java.util.Scanner;

public class OperSelect{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if(z==1){
            System.out.print(x+y);
        }
        else if(z==2){
            System.out.print(x-y);
        }
        else if(z==3){
            System.out.print(x*y);
        }
        else if(z==4 && y!=0){
            System.out.print(x/y);
        }
        else if(z==5 && y!=0){
            System.out.print(x%y);
        }
        else{
            System.out.print("cannot divide by zero");
        }
    }
}