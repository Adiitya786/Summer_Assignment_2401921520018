package Week_4.Day_1;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public static TreeNode inver(TreeNode root){
        if(root == null) return null;
        
        TreeNode temp = root.right;
       root.right= root.left;
        root.left =temp;

        inver(root.left);
        inver(root.right);
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
         return inver(root);
    }
}
