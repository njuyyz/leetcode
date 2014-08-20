/*
 * Given a binary tree, determine if it is a valid binary search tree.
 * Assume a BST is defined as follows:
 *  The left subtree of a node contains only nodes with keys less than the node's key
 *  The right subtree of a node contains only nodes with keys greater than the node's key.
 *  Both the left and right subtrees must also be binary search trees.
 */

 public class Solution{
     public boolean isValidBST( TreeNode root){
         if(root == null ){
             return true;
         }
         int max = Integer.MAX_VALUE;
         int min = Integer.MIN_VALUE;

         return isValid(min,root.val,root.right) && isValid(root.val,max,root.right);
     }

     private boolean isValid( int min, int max, TreeNode root){
         if(root == null){
             return true;
         }
         return min < root.val &&
                root.val < max &&
                isValid(min,root.val,root.left) &&
                isValid(root.val,max,root.right);
     }
 }
