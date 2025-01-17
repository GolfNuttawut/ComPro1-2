
import java.util.Scanner;

class CPU{
    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;
    CPU(String model, int clocks, int socket, int memType){
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
    }
    boolean isValidSpec(String model, int clocks, int socket, int memType){
        if(model == null || model.length()==0 || clocks <= 0 || socket <= 0 && memType <= 0 || memType > 10){
            return false;
        }
        else{
            return true;
        }
    }
    void printInfo()
    {
        System.out.println(model);
        System.out.println(clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(isValidSpec(model, clocks, socket, memType));
    }
    //
}

public class CPUSpec {
   //Do not chang the main methid.
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        
        if(model.length() == 0 && socket % 2 == 0)
            model = null;
        CPU cpu = new CPU(model, clocks, socket, memType);
        cpu.printInfo();
    }
}
