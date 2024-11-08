import java.util.Scanner;

public class Spellchecking2Remake 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] dict = new String[N];
        for (int i = 0; i < N; ++i) 
        {
            dict[i] = sc.next();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) 
        {
            String word = sc.next();
            int maxScore = -1;
            String answer = "";
            boolean found = false;   
            for (int i = 0; i < N; ++i) 
            {
                String word2 = dict[i];
                boolean eq = word.equals(word2);
                if (eq) 
                {
                    found = true;
                } 
                int L = word.length();
                if (word2.length() < L) 
                {
                    L = word2.length();
                }
                int score = 0;
                for (int l = 0; l < L; l++) {
                    char c1 = word.charAt(l);
                    char c2 = word2.charAt(l);
                    if (c1 == c2) 
                    {
                        score++;
                    }
                }
                if (maxScore < score) 
                {
                    maxScore = score;
                    answer = word2;
                }
            } 
            if (found) 
            {
                System.out.println(word);
            } 
            else 
            {
                System.out.println(answer);
            }
        }
    }
}
