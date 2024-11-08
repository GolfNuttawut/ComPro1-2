import java.util.Scanner;

public class TheVoice_SU{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = scan.nextInt();
        int team1 = 0;
        int team2 = 0;
        for(int i=0;i<n;i++){
            int target = scan.nextInt();
            int score1 = scan.nextInt();
            int score2 = scan.nextInt();
            if(target==1){
                if(score1>8 && team1<max){
                    team1++;
                    System.out.println((i+1)+" 1");
                }
                else if(score2>8 && team2<max){
                    team2++;
                    System.out.println((i+1)+" 2");
                }
            }
            else if(target==2){
                if(score2>8 && team2<max){
                    team2++;
                    System.out.println((i+1)+" 2");
                }
                else if(score1>8 && team1<max){
                    team1++;
                    System.out.println((i+1)+" 1");
                }
            }
        }
    }
}