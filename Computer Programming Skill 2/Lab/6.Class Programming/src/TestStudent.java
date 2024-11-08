import java.util.Scanner;

class Student 
{
    final static int NUM_TEST = 4;
    public String fname;
    public String lname;
    private int[] stepscore = new int[4];
    public Student(String fname,String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }
    public int getTestScore(int score)
    {
        return stepscore[score-1];
    }
    public void setTestScore(int j,int score)
    {
        if(j==1)
        {
            this.stepscore[0] +=score;
        }
        else if(j==2)
        {
            this.stepscore[1] +=score; 
        }
        else if(j==3)
        {
            this.stepscore[2] +=score; 
        }
        else if(j==3)
        {
            this.stepscore[3] +=score; 
        }
    }
    public int  computeTotal()
    {
        int sum=0;
        for(int i=0;i<4;i++)
        {
            sum += stepscore[i];
        }
        return sum;
    }
    public void  printInfo()
    {
        System.out.print(fname+" ");
        System.out.print(lname+" ");
    }
}
public class TestStudent 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];
        for (int i = 0; i < N; i++) 
        {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname,lname);
            for (int j = 1; j <= 4; j++) 
            {
                int score = scan.nextInt();
                roster[i].setTestScore(j,score);
            }
            roster[i].printInfo();
            System.out.println(roster[i].computeTotal());
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) 
        {
            int rosterNum = scan.nextInt();
            int testNum = scan.nextInt();
            System.out.println(roster[rosterNum-1].getTestScore(testNum));
        }
    }
}