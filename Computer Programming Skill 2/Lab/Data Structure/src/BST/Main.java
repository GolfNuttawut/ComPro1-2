package BST;

public class Main {
   /* public static void main(String [] args){
        int n = 10 + (int) (Math.random() * 11);//ramdom 10-20 : count = 1 --> 10 max 11 --> 20
        System.out.println("---Random numbers ["+n+"] ---");
        BinaryTree b = new BinaryTree();
        TreeNode root;
        for(int i=0;i<n;i++){//n = randomNumber
            int num = 0 + (int) (Math.random() * 51);//ramdom 0-50 : count = 1 --> 0 max 51 --> 50
            if(i==0){
                root = b.insert(num);
                continue;
            }
            b.insert(num);
            System.out.print(num+" ");
        }
        System.out.println("");
        
    }
}
