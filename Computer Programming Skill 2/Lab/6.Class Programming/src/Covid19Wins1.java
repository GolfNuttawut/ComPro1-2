
import java.util.Scanner;

class Visitation {
    int id;
    int date;
    int arr[];
    Visitation(int id, int date) {
        this.id = id;
        this.date = date;
        this.arr = arr = new int[24];
    }
    void visit(int time){
         if(time < 0 || time >23){
             System.out.println("invalid hour: "+time);
         }
         else{
            arr[time] += 1;
         }
    }
    int count(){
        int cnt=0;
        for(int i=0;i<24;i++){
            cnt += arr[i];
        }
        return cnt;
    }
    void printVisitHours(){
        int cnt2 =0;
        System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        for(int i=0;i<24;i++){
            if(arr[i]>0){
                System.out.print(i+" ");
                cnt2++;
            }
        }
        if(cnt2==0){
            System.out.println("no visit");
        }
    }
}

public class Covid19Wins1 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        int date = scan.nextInt();
        final int K = scan.nextInt();

        // Create object and correctly use it here
        Visitation vis = new Visitation(id, date);
        for(int i=0;i<K;i++){
            int time = scan.nextInt();
            vis.visit(time);
        }
        vis.printVisitHours();
    }
}
