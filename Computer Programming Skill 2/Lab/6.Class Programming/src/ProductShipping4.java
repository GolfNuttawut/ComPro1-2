/*
import java.util.Scanner;

class Product {// from ProductShipping1 
    String name;
    int weight;
    int price;
    Product( String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    void printInfo() {
        System.out.println(weight+" grams of "+name+" costs "+price+" baht.");
    }
}

class PurchaseOrder {
    int n;
    Product[] products;
    int[] amount;
    int AllPrice;
    int AllWeight;
    PurchaseOrder(int n,Product[] products,int[] amount) {
        this.n = n;
        this.products = products;
        this.amount = amount;
        this.AllPrice = AllPrice;
        this.AllWeight = AllWeight;
        for(int i=0;i<n;i++)
        {
            AllPrice += products[i].price*amount[i];
            AllWeight += products[i].weight*amount[i];
        }
    }
    void  printInfo() {
        System.out.println(n+" items = "+AllPrice+" baht "+AllWeight+" grams");
        for(int i=0;i<n;i++)
        {
            System.out.println(products[i].name+" "+amount[i]+"x"+products[i].price+" = "+(amount[i]*products[i].price));
        }
    }
}

class Truck {
    // write your code here
    int netWeight;
    PurchaseOrder po;
    int dest;
    double ps;//price send
    Truck(int netWeight){
        this.netWeight = netWeight;
        dest = 0;
        ps = 0;
    }
    void add(PurchaseOrder po,int dest){
        this.po = po;
        this.dest = dest;
        setFee();
    }
    void setFee(){
        ps = po.AllWeight * dest / 1000.0;
    }
    double getFee(){
        return ps;
    }
}

class SpecialTruck extends Truck{
 // write your code here

    public SpecialTruck(int netWeight) {
        super(netWeight);
    }
 // write your code here
    void setFee(){
        ps = (po.AllWeight * dest / 1000.0)*2;
    }
}
public class ProductShipping4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            int type = in.nextInt();
            if (type == 1) {
                trucks[i] = new Truck(capacity);
            } else {
                trucks[i] = new SpecialTruck(capacity);
            }
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {
            if ((trucks[i].netWeight >= po.AllWeight) && (minvalue > trucks[i].netWeight)){
                minvalue = trucks[i].netWeight;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            double fee = po.AllWeight * dest / 1000.0;
            System.out.println("Fee=" + fee + " " + (2*fee));
        }       
    }
}
*/