class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) { 
        helper(root,false);
        return sum;
    }
    public void helper(TreeNode root,boolean isLeft)
    {
        if(root==null ) return;    
        if(root.left==null && root.right==null)
        {
            if(isLeft)
            sum+=root.val;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
}