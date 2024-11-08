import java.util.Scanner;

public class Reserve3_Vans

{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int order = scan.nextInt();
        for(int i=0;i<order;i++){
            int day = scan.nextInt();
            if(a<=b && a<=c){
                System.out.println("A");
                a+=day;
            }
            else if(b<a && b<=c){
                System.out.println("B");
                b+=day;
            }
            else{
                System.out.println("C");
                c+=day;
            }
        }
    }  
} 