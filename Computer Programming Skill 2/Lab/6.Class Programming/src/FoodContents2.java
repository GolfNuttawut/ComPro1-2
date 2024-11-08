import java.util.Scanner;

class Food 
{
    String foodName;
    String content1;
    int w1;
    int cal;
    int calsum;
    Food(String foodName,String content1,int w1,int cal)
    {
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
        this.cal = cal;
        this.calsum = w1*cal;
    }
    void addContent(String content1,int w1,int cal)
    {
        this.content1+=" "+content1;
        this.w1 += w1;
        this.cal = cal;
        this.calsum += cal*w1;
    }
    void printInfo()
    {
        System.out.println(foodName);
        System.out.println(w1+" "+calsum);
        System.out.println(content1);
    }
}

public class FoodContents2 
{
    
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	String foodName = scan.next();
    	String content1 = scan.next();
    	int w1 = scan.nextInt();
        int cal = scan.nextInt();
    
        Food food = new Food(foodName,content1,w1,cal);
    	
    	int q = scan.nextInt();
		    
	while(q != 0) 
        {
            if(q == 1) 
            {
        	food.printInfo();
	    } 
    	    else if(q == 2) 
            {
                content1 = scan.next();
                w1 = scan.nextInt();
                cal = scan.nextInt();
    		food.addContent(content1,w1,cal);
    	    }
 	    q = scan.nextInt();
        }
    }
}