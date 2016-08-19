package flatten;
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public static void flatten(TreeNode root) {
        // write your code here
       root = f(root);
        
    }
    public static TreeNode f(TreeNode root)
    {
        TreeNode r = root;
        do
        {
        	   if(r != null)
               {

            if(r.left == null)
            {
                r = r.right;
                continue;
            }
            TreeNode temp = r.right;
            r.right = r.left;
            r.left = null;
            TreeNode bottom = r;
            while(bottom.right != null)
            {
                bottom = bottom.right;
            }
            bottom.right = temp;
            if(r.right != null)
            {
                 r = r.right;
            }
            else
            {
                break;
            }
        }
        	   else{break;}
        }
        while(true);
        
        return root;
    }
    public static void main(String args[])
    {
    	TreeNode root = new TreeNode(98);
    	root.left = new TreeNode(97);
    	root.left.left = new TreeNode(88);
    	root.left.left.left = new TreeNode(76);
    	flatten(root);
    }
}