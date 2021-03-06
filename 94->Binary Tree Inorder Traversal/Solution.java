/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> result=new ArrayList<>();
        traversal(root,result);
          return result;  
    }
    public void traversal(TreeNode root,List<Integer> result)
    {
        if(root!=null)
        {
            if(root.left!=null)
            {
                traversal(root.left,result);
            }
            result.add(root.val);
            if(root.right!=null)
            {
                traversal(root.right,result);
            }
        }
        
    }
    
}