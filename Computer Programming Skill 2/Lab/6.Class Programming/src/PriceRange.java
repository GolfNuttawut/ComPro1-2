/*
import java.util.Scanner;

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

public class PriceRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        pInfo.printInfo();
    }
}
*/