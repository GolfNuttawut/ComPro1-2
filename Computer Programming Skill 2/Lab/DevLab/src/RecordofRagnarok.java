import java.util.Scanner;
class HumanCharacters {
    String Name;
    String Age;
    boolean Death;
    String Abilities;
    String Personality;
    String Background;

    HumanCharacters(String Name, String Age, boolean Death, String Abilities, String Personality, String Background ){
    this.Name = Name;
    this.Age = Age;
    this.Death = Death;
    this.Abilities = Abilities;
    this.Personality = Personality;
    this.Background = Background;
    }
}
class GodCharacters {
    String Name;
    String Legend;
    String Abilities;
    String Personality;
    String Background;
    GodCharacters(Scanner sc){
        String Temp = sc.nextLine();
        Name = Temp.substring(0, Temp.indexOf('(')-1);
        Legend = Temp.substring(Temp.indexOf('(')+1, Temp.indexOf(')'));
        Abilities = sc.nextLine();
        Personality = sc.nextLine();
        Background = sc.nextLine();
    }
}
public class RecordofRagnarok {
    private static void battleROR( HumanCharacters Human, GodCharacters God, int count ) {
        System.out.println("<>---------- Record of Ragnarok ----------<>");
        System.out.println("<< { --------- ROUND ( " + count + " ) --------- } >>");
        System.out.println("<<==== GOD ====>>");
        System.out.println("Name : " + God.Name );
        System.out.println("Legend : [ " + God.Legend + " ]");
        System.out.println("- Abilities: " + God.Abilities );
        System.out.println("- Personality: " + God.Personality );
        System.out.println("- Background: " + God.Background );
        System.out.println("VS");
        System.out.println("<<==== HUMAN ====>>");
        System.out.println("Name : " + Human.Name );
        System.out.print("Age : " + Human.Age );
        if ( Human.Death ) {
            System.out.println(" at death");
        } else {
            System.out.println("");
        }
        System.out.println("- Abilities: " + Human.Abilities );
        System.out.println("- Personality: " + Human.Personality );
        System.out.println("- Background: " + Human.Background );
        System.out.println("<< { --------- ROUND ( " + count + " ) --------- } >>");
        System.out.println("<>---------- Record of Ragnarok ----------<>");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        String t = sc.nextLine();
        HumanCharacters[] Human = new HumanCharacters[round];
        GodCharacters[] God = new GodCharacters[round];
        for (int i = 0; i < round; i++) {
            String Age = null;
            boolean Death = false;
            String tmp1[] = sc.nextLine().split("Age: ");
            String Name = tmp1[0].substring(0, tmp1[0].length() - 2);
            if (tmp1[1].indexOf(" at death") > 0) {
                Death = true;
                Age = tmp1[1].substring(0, 2);
            } else if (tmp1[1].indexOf("Unknown") >= 0) {
                Age = "Unknown";
            } else {
                Age = tmp1[1].substring(0, 2);
            }
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();
            Human[i] = new HumanCharacters(Name, Age, Death, Abilities, Personality, Background);
        }
        for (int i = 0; i < round; i++) {
            God[i] = new GodCharacters(sc);
        }
        int count = 1;
        for (;;) {
            int h = sc.nextInt();
            int g = sc.nextInt();
            boolean booH = true;
            boolean booG = true;
            if ( h >= round || h<0 ) {
                booH = false;
            }
            if ( g >= round || g<0 ) {
                booG = false;
            }
            if (booH == true && booG == true) {
	        battleROR(Human[h],God[g],count );
                count++;
            } else {
                break;
            }
        } 
    }  
}