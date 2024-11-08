import java.util.*;

public class Anime {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print(str1.substring(0,str1.indexOf(':')+2));
        String str2 = str1.substring(str1.indexOf(':')+2);
                if(str2.indexOf("Shack", 0)>=0){
                    System.out.print("Yes ");
                }
                if(str2.indexOf("Okaka",0)>=0){
                    System.out.print("No ");
                }
                if(str2.indexOf("Konbu",0)>=0){
                    System.out.print("Hi ");
                }
                if(str2.indexOf("Takana",0)>=0){
                    System.out.print("Are you okay? ");
                }
                if(str2.indexOf("Tuna",0)>=0){
                    System.out.print("Focus ");
                }
                if(str2.indexOf("Tunamayo",0)>=0){
                    System.out.print("Serious matter ");
                }
                if(str2.indexOf("Sujiko",0)>=0){
                    System.out.print("Mmm ");
                }
                if(str2.indexOf("Mentaiko",0)>=0){
                    System.out.print("Combat ");
                }
    }
}