
import java.util.Scanner;

class Item {
    String name;
    String id;
    int price;
    int shipping; 
    int volume;
    int quan;
    boolean valid;
    public Item(String name, String id, int price, int shipping, int volume, int quan) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.shipping = shipping;
        this.volume = volume;
        this.quan = quan;
        this.valid = basicCheck( name, id, price, shipping, volume);
    }
    public boolean basicCheck (String name, String id, int price, int shipping, int volume){
        if(name != null && name.length() >= 3 && id != null && id.length() >= 3 && price > 0 && shipping > 0 && volume >= 0) {
            return true;
        }
        else {
            
            return false;
        }
    }
    public boolean cutStock(int q) {
        if(q>quan) {
            return false;
        }
        else {
            quan -= q;
            return true;
        }
    }
    public void printInfo() {
        System.out.println(name+" "+id+" "+price);
        System.out.println(shipping+" "+volume+" "+quan+" "+valid);
    }
}

public class ItemAndCart1 {
    // Do not change the code below this line.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String id = scan.next();
        int price = scan.nextInt();
        int shipping = scan.nextInt();
        int volume = scan.nextInt();
        int quan = scan.nextInt();
        Item item = new Item(name, id, price,shipping, volume, quan);
        item.printInfo();

        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = scan.nextInt();
            System.out.println(item.cutStock(q));
            item.printInfo();
        }
    }
}
