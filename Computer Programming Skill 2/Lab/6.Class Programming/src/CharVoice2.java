import java.util.Scanner;

class Character 
{
    int p=0;
    private String []msg;
    public Character(String []msg)
    {
        this.msg = msg;
    }
    public void speak()
    {
        System.out.println(msg[p]);
        p++;
        if(p==msg.length)
        {
            p=0;
        }
    }
}
public class CharVoice2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Character[] ch = new Character[Q];
        for(int i=0;i<Q;i++)
        {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine(); // Skip end-line char
            for(int j = 0; j < N; j++) 
            {
                msg[j] = scan.nextLine();
            }
            ch[i] = new Character(msg);
        }
        int K = scan.nextInt();
        for(int i=0;i<K;i++)
        {
            int cet = scan.nextInt();
            ch[cet-1].speak();
        }
    }
}
/*            
import java.util.Scanner;

class Character 
{
// Enter your code here.
    int i=0;
    String[] voc;
    Character(String[] msg)
    {
        this.voc = msg;
    }
    void speak()
    {
        if(i<voc.length)
        {
            System.out.println(voc[i]);
            i++;
            if(i==voc.length)
            {
                i=0;
            }
        }
    }
}
public class CharVoice2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        final int C = scan.nextInt();
        Character[] ch = new Character[C];
        for(int g=0; g<C; g++)
        {
            final int N = scan.nextInt();
            String[] msg = new String[N];//create new size array in the same variable
            scan.nextLine(); // Skip end-line char
            for(int i = 0; i < N; ++i) 
            {
                msg[i] = scan.nextLine();
            }
            ch[g] = new Character(msg);//send array[msg] to class array
        }
        int K = scan.nextInt();
        for(int i=0; i<K; i++)
        {
            int who = scan.nextInt();
            ch[who-1].speak();
        }
   }
}
*/