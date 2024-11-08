/*class Triangle{
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

    }
    Triangle(double side, String title){

    }
    Triangle(double side){
        this.side = side;
        this.title = "C";
    }
    Triangle(String title){

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
}
public class Lab2P2 {
    public static void main(String[] args) {
        Triangle TriA = new Triangle();
        TriA.setBase(4);
        TriA.setHeight(6);
        TriA.setTitle("A");
        Triangle TriB = new Triangle(3,5,"B");
        Triangle TriC = new Triangle(TriA.getBase()+TriB.getHeight());
        TriA.isEquilateral();
        TriB.isEquilateral();
        TriC.isEquilateral();
        System.out.println(TriA);
        System.out.println(TriB);
        System.out.println(TriC);
    }
}*/
