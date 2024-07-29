class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(root!=null){
            helper(root, list,sb);
        }
        
        return list;
    }

    public void helper(TreeNode root, List<String> list, StringBuilder sb){
        if(root==null){
            return;
        }
        int length = sb.length();
        sb.append(root.val);
        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }else{
            sb.append("->");
            helper(root.left, list,sb);
            helper(root.right, list,sb);
        }

        sb.setLength(length);
        
        

        
    }
}
