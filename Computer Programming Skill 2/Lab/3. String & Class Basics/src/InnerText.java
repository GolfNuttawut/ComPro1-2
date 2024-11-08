
import java.util.Scanner;

public class InnerText {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String str = scan.nextLine();
        int count = 0;
        int numOfChar = 0;
        for (int i = 0; i < text.length(); i++) {
            if(i+str.length()<=text.length()){
                if(text.substring(i,i+str.length()).indexOf(str)==0){
                    count++;
                    i=i+str.length()-1;
                }
            }
        }
        System.out.println(count/2);
        int max = count/2;
        count = 1;
        boolean status = false;
        for (int i = 0; i < text.length(); i++) {
            if(i+str.length()<=text.length()){
                if(text.substring(i,i+str.length()).indexOf(str)==0){
                    if(status==true){
                        status = false;
                        i=i+str.length()-1;
                        if(numOfChar==0){
                            System.out.println("_");
                        }
                        else{
                            System.out.println("");
                            numOfChar=0;
                        }
                    }
                    else if(status==false){
                        status = true;
                        if(count>max){
                            break;
                        }
                        System.out.print(count+" ");
                        count++;
                        i=i+str.length()-1;
                        continue;
                    }
                }
            }
            if(status==true){
                System.out.print(text.charAt(i));
                numOfChar++;
            }
        }
    }
}
