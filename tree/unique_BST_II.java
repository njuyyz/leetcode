/*
 * Give n, generate all structurally unique BSt's (binary search trees) that store value 1..n
 */

 public class Solution{
     public ArrayList<TreeNode> generateTrees(int n){
         ArrayList<TreeNode> list;
         list = generate(1,n);
         return list;
     }
     public ArrayList<TreeNode> generate( int start, int end){
         ArrayList<TreeNode> list = new ArrayList<TreeNode>();

         if( start > end){
             list.add(null);
             return list;
         }

         for( int i = start; i <= end; i++){
             ArrayList<TreeNode> leftList = generate( start, i-1);
             ArrayList<TreeNode> rightList = generate( i+1, end):

             for( int j = 0; j < leftList.size(); j++){
                 for( int k = 0 ; k < rightList.size(); k++){
                     TreeNode root = new TreeNode(i);
                     root.left = leftList.get(j);
                     root.right = rightList.get(k);
                     list.add(root);
                 }
             }
         }
         return list;
     }
 }
