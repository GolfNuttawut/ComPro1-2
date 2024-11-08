import java.util.*;

class TriangleSet{
    private int maxItem = 10;
    private int noItem = 0;
    private Triangle []triangleArr = new Triangle[maxItem];
    private String title = "";
    private Scanner scan = new Scanner(System.in);
    public TriangleSet(int max){
        this.maxItem = max;
    }
    public TriangleSet(Triangle tri){
        triangleArr[noItem] = tri;
        noItem++;
    }
    public TriangleSet(Triangle tri, int max){
        this.maxItem = max;
        triangleArr[noItem] = tri;
        noItem++;
    }
    public TriangleSet(TriangleSet triSet){
        for(int i=0;i<triSet.triangleArr.length;i++){
            this.triangleArr[noItem] = triSet.triangleArr[i];
            noItem++;
        }
    }
    public TriangleSet(TriangleSet triSet, int max){
        this.maxItem = max;
        for(int i=0;i<triSet.triangleArr.length;i++){
            this.triangleArr[noItem] = triSet.triangleArr[i];
            noItem++;
        }
    }
    public TriangleSet(String title){
        this.title = title;
    }
    public TriangleSet(String title, int max){
        this.title = title;
        this.maxItem = max;
    }
    public TriangleSet(){
        
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void add(TriangleSet triSet){
        for(int i=0;i<triSet.triangleArr.length;i++){
            this.triangleArr[noItem] = triSet.triangleArr[i];
            noItem++;
        }
    }
    public void add(Triangle tri){
        triangleArr[noItem] = tri;
        noItem++;
    }
    public void merge(TriangleSet triSet){
        
    }
    public void removeTitle(String title){
        this.title = title;
    }
    public void removeItem(int no){
        triangleArr[no] = null;
    }
    public void removeAll(){
        for(int i = 0;i<noItem;i++){
            triangleArr[i] = null;
        }
    }
    public void inputData(){
        while(true){            
            System.out.print("Enter TriangleSet's title [Current: "+title+", - <NONE>, Return <Not Change> ] > ");
            String text1 = scan.nextLine();
            if((text1.equals("-"))){
                continue;
            }
            else{
                TriangleSet tri = new TriangleSet();
                tri.setTitle(text1);
                Triangle t = new Triangle();
                add(t);
                while(true){
                    System.out.print("["+noItem+"] Enter triangle’s title [Return <NONE>, - <END>] > ");
                    String text2 = scan.nextLine();
                    if((text2.equals("-"))){
                        break;
                    }
                    else{
                        t.setTitle(text2);
                        System.out.print("Is it a equilateral triangle (y/n) ? ");
                        String text3 = scan.nextLine();
                        if(text3.equals("y")){
                            t.getEquil(true);
                            System.out.print("Enter side length > ");
                            double length = scan.nextDouble();
                            t.setBase(length);
                        }
                        else{
                            t.getEquil(false);
                            System.out.print("Enter base length > ");
                            double length = scan.nextDouble();
                            System.out.print("Enter height > ");
                            double height = scan.nextDouble();
                            t.setBase(length);
                            t.setHeight(height);
                        }
                        noItem++;
                        scan.nextLine();
                        continue;
                    }
                }
                break;
            }
        }
    }
    public int getSize(){
        return triangleArr.length;
    }
    public int getMaxSize(){
        return maxItem;
    }
   public boolean isAllEquilatera(){
       return false;
   }
   public boolean isEmtpy(){
       return (noItem==0);
   }
   public boolean isFull(){
       return (noItem==maxItem);
   }
   public double getSumArea(){
       double sum = 0;
       for(int i = 0;i<triangleArr.length;i++){
           sum+=triangleArr[i].getArea();
       }
       return sum;
   }
   public Triangle getItem(int no){
       return triangleArr[no];
   }
   public String getTitle(){
       return title;
   }
   public String toString(){
       return "";
   }
}

class Triangle{
    private double base = 1;
    private double height = 1;
    private String title = "";
    private boolean equalSide = false;
    private double side;
    Triangle(double base, double height, String title){
        this.base = base;
        this.height = height;
        this.title = title;
    }
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    Triangle(double side, String title){
        base = side;
        this.title = title;
    }
    Triangle(double side){
        this.side = side;
        this.title = "C";
    }
    Triangle(String title){
        this.title = title;
    }
    Triangle(){
       
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setTitle(String title){
        this.title = title;
        this.equalSide = true;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double getSide(){
        return side;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return getTitle()+"["+String.format("%.2f", getBase())+":"+String.format("%.2f", getHeight())+"=>"+String.format("%.2f", getArea())+"]";//*************
    }
    public boolean isEquilateral(){
        return equalSide;
    }
    public double getArea(){
        return base*height/2.0;
    }
    public void getEquil(boolean eq){
        this.equalSide = eq;
    }
}

public class Lab3 {
    public static void main(String args[]){
        Triangle TriA = new Triangle(5,13,"A");
        Triangle TriB = new Triangle(5,13,"B");
        TriangleSet triSetA = new TriangleSet();
        triSetA.add(TriA);
        triSetA.add(TriB);
        triSetA.inputData();
        System.out.println(triSetA.toString());
        System.out.println(triSetA.getSize());
        System.out.println(triSetA.getSumArea());
    }
}
