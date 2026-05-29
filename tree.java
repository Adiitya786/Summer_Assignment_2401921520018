

public class tree {
     static class Node{
        int data ;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
     }

    
     static int anss =-1;
     public static void  level(Node root,int x, int k){
     if(root == null) return;
     if(root.data==x)  {anss = k;
     return;}
      level(root.left, x, k+1);
     level(root.right, x, k+1);
     
     }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right = new Node(30);
        root.right.right = new Node(40);
         level(root, 8, 0);
         System.out.println(anss);

    }
}