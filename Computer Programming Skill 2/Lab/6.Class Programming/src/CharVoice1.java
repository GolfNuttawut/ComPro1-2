/*import java.util.Scanner;

class Character 
{
    private String []msg;
    public Character(String []msg)
    {
        this.msg = msg;
    }
    public void speak(int N,int i)
    {
        System.out.println(msg[i%N]);    
    }
}
public class CharVoice1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] msg = new String[N];
        scan.nextLine(); // Skip end-line char
        for(int i = 0; i < N; ++i) 
        {
            msg[i] = scan.nextLine();
        }
        Character ch = new Character(msg);
        int K = scan.nextInt();
        for(int i=0;i<K;i++)
        {
            ch.speak(N,i);
        }
    }
}*/
