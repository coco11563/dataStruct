package minTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
	 public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
	        // Write your code here
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        List<Integer> list = new ArrayList<Integer>();
	        ret.addAll(bTPS (root , target , list));
	        return ret;
	    }
	    public List<List<Integer>> bTPS(TreeNode root , int target , List<Integer> list)
	    {
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        
	        if(target - root.val == 0)
	        {
	            list.add(root.val);
	            ret.add(list);
	            return ret;
	        }
	        else if(target - root.val > 0)
	        {
	            list.add(root.val);
	            ret.addAll(bTPS(root.left,target-root.val,list));
	            ret.addAll(bTPS(root.right,target-root.val,list));
	            return ret;
	        }
	        else
	        {
	            return ret;
	        }
	    }
}