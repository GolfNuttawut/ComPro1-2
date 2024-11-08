package BST;

public class Tree {

    private Object info = null;
    private Tree left = null;
    private Tree right = null;

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

    public static void printPreOrder(Tree tree) {
        if (tree == null) { // empty tree
            System.out.print("-");
            return;
        }
        System.out.print(tree.getInfo());
        System.out.print("[");
        printPreOrder(tree.getLeft());
        printPreOrder(tree.getRight());
        System.out.print("]");
    }

    public static void printPostOrder(Tree tree) {
        if (tree == null) { // empty tree
            System.out.print("-");
            return;
        }
        System.out.print("[");
        printPostOrder(tree.getLeft());
        printPostOrder(tree.getRight());
        System.out.print("]");
        System.out.print(tree.getInfo());
    }

    public static void printInOrder(Tree tree) {
        if (tree == null) { // empty tree
            System.out.print("-");
            return;
        }
        System.out.print("[");
        printInOrder(tree.getLeft());
        System.out.print(tree.getInfo());
        printInOrder(tree.getRight());
        System.out.print("]");
    }

    public static int countNode(Tree tree) {
        if (tree == null) {
            return 0; // empty tree
        }
        int count = 1;
        count += countNode(tree.getLeft());
        count += countNode(tree.getRight());
        return count;
    }

    public static int totalInfo(Tree tree) {
        if (tree == null) {
            return 0; // empty tree
        }
        int info_val = (Integer) tree.getInfo(); // convert object to int
        return info_val + totalInfo(tree.getLeft()) + totalInfo(tree.getRight());
    }

}
