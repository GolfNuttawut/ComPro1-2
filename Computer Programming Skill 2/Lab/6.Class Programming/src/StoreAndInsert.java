
import java.util.Scanner;
import java.util.ArrayList;

class ProductInfo {
    public String name;
    public int maxprice;
    public int minprice;
    public ProductInfo(String name,int[] prices) {
        this.name = name;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>max)
            {
                max = prices[i];
            }
            if(prices[i]<min)
            {
                min = prices[i];
            }
            this.maxprice = max;
            this.minprice = min;
        }
    }
    void printInfo() {
        System.out.println(name+" "+minprice+" "+maxprice);
    } 
}

class Store {
    private ArrayList<ProductInfo> products = new ArrayList<>();
    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for(int i = 0; i < N; ++i)
        {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        this.products.add(pInfo);
    }
    void printAllProductInfo() {
        int Lan = this.products.size();
        for(int i=0;i<Lan;i++)
        {
            ProductInfo pInfo = this.products.get(i);
            pInfo.printInfo();
        }
    }
}

public class StoreAndInsert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        store.printAllProductInfo();
    }
}
