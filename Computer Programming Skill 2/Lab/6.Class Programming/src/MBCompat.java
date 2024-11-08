
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
        this.valid = isValidSpec(model, clocks, socket, memType);
    }
    boolean isValidSpec(String model, int clocks, int socket, int memType){
        if(model == null || model.length()==0 || clocks <= 0 || socket <= 0 || memType <= 0 || memType > 10){
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
        System.out.println(valid);
    }
}
class MainBoard{
    public String model;
    public int socket;
    public int memType;
    boolean valid;
    MainBoard(String model, int socket, int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, socket, memType);
    }
    boolean isValidSpec(String model, int socket, int memType){
        if(model == null || model.length()==0 || socket <= 0 || memType <= 0 || memType > 10){
            return false;
        }
        else{
            return true;
        }
    }
    void printInfo(){
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

class Computer{
    public CPU cpu;
    public MainBoard mb;
    public boolean valid;
    Computer(CPU cpu,MainBoard mb){
        this.cpu = cpu;
        this.mb = mb;
        this.valid = isValidCom(cpu, mb);
    }
    boolean isValidCom(CPU cpu,MainBoard mb){
        valid = true;
        if(cpu.memType != mb.memType || cpu.valid != true || mb.valid != true || cpu.valid != mb.valid || cpu.socket!=mb.socket){
            return false;
        }
        return valid;
    }
    void printInfo(){
        if(valid){
            System.out.println(cpu.model);
            System.out.println(cpu.clocks);
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(cpu.memType);
        }
        else{
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
    }
}

public class MBCompat {
    // Do not make change to the main method.
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String model = scan.nextLine();
        int clocks = scan.nextInt();
        int socket = scan.nextInt();
        int memType = scan.nextInt();
        
        if(model.length() == 0 && socket % 2 == 0)
            model = null;
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        scan.nextLine();// skip new line character
        model = scan.nextLine();
        socket = scan.nextInt();
        memType = scan.nextInt();
        if(model.length() == 0 && socket % 2 == 0)
            model = null;
        MainBoard mb = new MainBoard(model, socket, memType);
        
        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
