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

    public static boolean isidentical(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        else if(p==null || q==null || p.val != q.val){
            return false;
        }

        if(!isidentical(p.left,q.left))  return false;
        if(!isidentical(p.right,q.right))  return false;

        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isidentical(p,q);
    }
}