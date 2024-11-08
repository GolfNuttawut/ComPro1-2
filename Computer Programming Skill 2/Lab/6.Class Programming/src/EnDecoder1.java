import java.util.Scanner;
class Encoder{
    String words[];
    int id[];
    Encoder(String words[],int id[]){
        this.words = new String[words.length];
        this.id = new int[id.length];
        for(int i=0;i<id.length;i++){
            this.words[i] = words[i];
            this.id[i] = id[i];
        }
    }
    private int encodeWord(String word){
        for(int i=0;i<words.length;i++){
            if(word.equals(words[i])){
                return id[i];
            }
        }
        return -1;
    }
    int[] encodeMsg(String search_word[]){
        int result[] = new int[search_word.length];
        for(int i=0;i<search_word.length;i++){
            result[i] = encodeWord(search_word[i]);
        }
        return result;
    }
}
public class EnDecoder1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i] = s.next();
        }
        int id[] = new int[n];
        for(int i=0;i<n;i++){
            id[i] = s.nextInt();
        }
        Encoder ec = new Encoder(words,id);
        int k = s.nextInt();
        String search_word[] = new String[k];
        for(int i=0;i<k;i++){
            search_word[i] = s.next();
        }
        int result[] = new int[k];
        result = ec.encodeMsg(search_word);
        for(int i=0;i<k;i++){
            System.out.print(result[i]+" ");
        }
    }
}