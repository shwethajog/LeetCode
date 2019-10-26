/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
 Different Test Cases are:
    [1,2,2,3,4,4,3]
    []
    [1,2,3]
    [1,null,2,3]
    [5,4,7,3,null,2,null,-1,null,9]
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null) return true;
        
        return helperSymmetric(root.left, root.right);
        
        
    }
    
    public static boolean helperSymmetric(TreeNode left, TreeNode right){
        
        if(left==null && right==null ) return true;
        
        if(left!=null && right!=null){
        
            if(left.val!=right.val) return false;

            if((left.left!=null && right.right==null) || (left.left==null && right.right!=null) )
                return false;
                

            if( (left.right!=null && right.left==null) || (left.right==null && right.left!=null))
                return false;
                
                
            return (helperSymmetric(left.left, right.right) && helperSymmetric(left.right, right.left));

        }
        return false;
    }
}
