
import java.util.Scanner;

public class KeyWord1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] words = new String[N];
        int count = 0;
        for (int i = 0; i < N; ++i) {
            String str = scan.next(); 
            boolean dup = false;
            for(int j = 0 ;j<count;j++)
            {
               if(str.equalsIgnoreCase(words[j])){
                   dup = true;
               }
            }
            if(dup==true){
                continue;
            }
            words[count] = str;
            count++;
            System.out.print(str+" ");
        }
    }
}