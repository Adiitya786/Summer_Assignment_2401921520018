import java.util.ArrayList;

public class tarsumBtree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }
    // static int sum =0;
    public static void ans(Node root, ArrayList<ArrayList<Integer>> ls, ArrayList<Integer> ds ,int target,int sum){
        if(root ==null) return ;
        sum+=root.data;
        ds.add(root.data);
        if(root.left==null && root.right==null){
            if(sum==target){
                ls.add(new ArrayList<>(ds));
               
            }
        }
        ans(root.left, ls, ds, target,sum);
        ans(root.right, ls, ds, target,sum);
        ds.remove(ds.size()-1);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.left = new Node(5);
        root.right.right.right  = new Node(1);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        ans(root,ls,ds,22,0);

       for(int i =0;i<ls.size();i++){
            ArrayList<Integer>curr = ls.get(i);
            for(int j =0;j<curr.size();j++){
                System.out.print(curr.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(ls);
    }
}
