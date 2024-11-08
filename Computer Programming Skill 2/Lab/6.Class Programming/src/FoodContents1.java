import java.util.Scanner;

class Food 
{
    String foodName;
    String content1;
    int w1;
    Food(String foodName,String content1,int w1)
    {
        this.foodName = foodName;
        this.content1 = content1;
        this.w1 = w1;
    }
    void addContent(String content1,int w1)
    {
        this.content1+=" "+content1;
        this.w1 += w1;
    }
    void printInfo()
    {
        System.out.println(foodName);
        System.out.println(w1);
        System.out.println(content1);
    }
}

public class FoodContents1 
{
    
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	String foodName = scan.next();
    	String content1 = scan.next();
    	int w1 = scan.nextInt();
    
        Food food = new Food(foodName,content1,w1);
    	
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
    		food.addContent(content1,w1);
    	    }
 	    q = scan.nextInt();
        }
    }
}