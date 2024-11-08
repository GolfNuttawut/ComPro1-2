
import java.util.Scanner;

public class CutAndHide2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (true) {
            int n = scan.nextInt();
            scan.nextLine();
            if (n == 0) {
                break;
            }
            else if(n == 1){
                String input = scan.nextLine();
                int index = text.indexOf(input);
                if(index!=-1){
                    text = text.substring(index);
                }
                System.out.println(text);
            }
            else if(n == 2){
                String input = scan.nextLine();
                int index = text.lastIndexOf(input);
                if(index!=-1){
                    text = text.substring(0,index+input.length());
                }
                System.out.println(text);
            }
            else if(n == 3){
                String input = scan.nextLine();
                int index = text.indexOf(input);
                if(index!=-1){
                    text = text.substring(index);
                }
                index = text.lastIndexOf(input);
                if(index!=-1){
                    text = text.substring(0,index+input.length());
                }
                System.out.println(text);
            }
        }
    }
}
