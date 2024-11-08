import java.util.Scanner;

public class Team_Competition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] T1 = new int[N];
        int [] T2 = new int[N];
        for(int i=0;i<N;i++)
        {
            T1[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            T2[i] = sc.nextInt();
        }
        int S1=0;
        int S2=0;
        for(int i=0;i<N;i++)
        {
            if(T1[i]>T2[i])
            {
                S1 += 2;
            }
            else if(T1[i]<T2[i])
            {
                S2 += 2;
            }
             else if(T1[i]==T2[i])
            {
                S1++;
                S2++;
            }
        }
        if(S1>S2)
        {
            System.out.println("Team 1 wins");
            System.out.print("Score "+S1+" to "+S2);
        }
        else if(S1<S2)
        {
            System.out.println("Team 2 wins");
            System.out.print("Score "+S2+" to "+S1);
        }
        else if(S1==S2)
        {
            System.out.println("Draw game");
            System.out.print("Score "+S1+" to "+S2);
        }
    }
}
