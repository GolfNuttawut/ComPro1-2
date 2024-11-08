
import java.util.Scanner;

public class Tree {

    private Object info = null;
    private Tree left = null;
    private Tree right = null;
    private int height = 0;/////// how to get height
    private String text = "";
    private static int target;

    public Tree(Object info, Tree left, Tree right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public Tree(Object info) {
        this(info, null, null);
    }

    public Tree() {
        this(null, null, null);
    }

    public Object getInfo() {
        return this.info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Tree getLeft() {
        return this.left;
    }

    public Tree getRight() {
        return this.right;
    }

    public void setLeft(Tree node) {
        this.left = node;
    }

    public void setRight(Tree node) {
        this.right = node;
    }

    public int getHeight() {
        return height;
    }

    public static void printPreOrder(Tree tree) {
        System.out.print(tree.getInfo() + " ");
        if (tree.getLeft() == null && tree.getRight() == null) {

        } else {
            if (tree.getLeft() != null) {
                System.out.print(" [ ");
                printPreOrder(tree.getLeft());
            } else {
                System.out.print(" [ - ");
            }
            if (tree.getRight() != null) {
                printPreOrder(tree.getRight());
                System.out.print(" ] ");
            } else {
                System.out.print(" - ] ");
            }
        }
    }
    public void insert(Object inf) {
        if (info == null) {
            info = inf;//height++;
        } else if ((int) inf < (int) info) {
            if (left != null) {
                left.insert(inf);//height++;
            } else {
                left = new Tree(inf);//height++;
            }
        } else {
            if (right != null) {
                right.insert(inf);//height++;
            } else {
                right = new Tree(inf);//height++;
            }
        }
    }

    public int search(int inf, Tree t) {//how to check it done found or not found?
        if (right == null && (int) inf > (int) info) {
            System.out.println(text + ") Not Found!");
        } else if (left == null && (int) inf < (int) info) {
            System.out.println(text + ") Not Found!");
        } else if ((int) inf < (int) info) {
            if (left != null) {
                text = text + "L";
                System.out.print("L");
                left.search(inf, left);
            }
        } else if ((int) inf > (int) info) {
            if (right != null) {
                text = text + "R";
               
                System.out.print("R");
                right.search(inf, right);
            }
        } else if ((int) inf == (int) info) {// = 
            System.out.println(text + ") Found!");
            target = inf;
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 0+(int)(Math.random()*21);
        System.out.println("--- Random numbers [" + n + "] ---");
        Tree t = new Tree();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
//            int x = 0+(int)(Math.random()*51);
            System.out.print(x + " ");
            t.insert(x);
        }
        System.out.println();
        System.out.println("--- Tree (Height=" + t.getHeight() + ") --- ");
        Tree.printPreOrder(t);
        System.out.println();
        System.out.println("--- Search --- ");
        while (true) {
            int k = sc.nextInt();
            System.out.print(k + ": ("); 
            if(k==t.search(k, t)){
                break;
            }
        }
    }
}
