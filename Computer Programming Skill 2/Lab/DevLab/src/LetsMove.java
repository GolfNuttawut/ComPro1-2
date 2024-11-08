import java.util.*;

public class LetsMove {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        char arr[][] = new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = 'B';
            }
        }
        int sta_row = scan.nextInt();
        int sta_col = scan.nextInt();
        String str[] = new String[3];
        String point = "V";
        for(int i=0;i<3;i++){
            str[i] = scan.next();
            if(str[i].equals("F")){
                if(point.equals("^")){
                    sta_row -= 1;
                }
                else if(point.equals("<")){
                    sta_col -= 1;
                }
                else if(point.equals("V")){
                    sta_row += 1;
                }
                else{
                    sta_col += 1;
                }
            }
            else if(str[i].equals("L")){
                if(point.equals("^")){
                    point = "<";
                }
                else if(point.equals("<")){
                    point = "V";
                }
                else if(point.equals("V")){
                    point = ">";
                }
                else{
                    point = "^";
                }
            }
            else if(str[i].equals("R")){
                if(point.equals("^")){
                    point = ">";
                }
                else if(point.equals(">")){
                    point = "V";
                }
                else if(point.equals("V")){
                    point = "<";
                }
                else{
                    point = "^";
                }
            }
        }
        arr[sta_row-1][sta_col-1] = 'P';
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println(point);
    }
}
