import java.util.Scanner;

public class Lease2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]Num = new int[N];
        for(int i=0;i<N;i++)
        {
            Num[i] = sc.nextInt();
        }
        int Y1 = sc.nextInt();
        int Year = sc.nextInt();
        for(int i=0;i<Year;i++)
        {
            int Y2 = sc.nextInt();
            int cnt=0;
            for(int j=0;j<N;j++)
            {
                if(Y1+Num[j]<=Y2)
                {
                    cnt++;
                    System.out.print(j+1+" ");
                }
            }
         if(cnt==0)
         {
            System.out.print("full");
         }
         System.out.print("\n");
         }
    }
}

/*
import java.util.Scanner;

public class Lease2{
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<N;i++){
            Arr[i] = scan.nextInt();
        }
        int year = scan.nextInt();
        int Y = scan.nextInt();
        int YearArr[] = new int[Y];
        for(int i=0;i<Y;i++){
            YearArr[i] = scan.nextInt();
        }
        for(int data1 : YearArr){
            int count = 0;
            for(int i=0;i<N;i++){
                if(year+Arr[i]<=data1){
                    count++;
                    System.out.print(i+1+" ");
                }
            }
            String check = "";
            check = count==0 ? "full" : "";
            System.out.println(check);
        }
    }
}
*/
