import java.util.Scanner;
class  Party
{
    String []team;
    int []Numteam;
    Party(String []team,int []Numteam,Scanner scan)
    {
        this.team = team;
        this.Numteam = Numteam;
    }
    void printInfo(int regionNumber)
    {
        
    }
}
public class KorKorTor1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String []team = new String[N];
        int []Numteam = new int[N];
        Party[] party = new Party[N];
        for(int i=0;i<N;i++)
        {
            team[i] = scan.next();
            Numteam[i] = scan.nextInt();
            party[i] = new Party(team,Numteam,scan);
        }
        //printInfo 
        final int K = scan.nextInt();
        for(int i = 0; i < K; ++i) 
        {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }
}