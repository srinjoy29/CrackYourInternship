import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private List<Integer> res = new ArrayList<>();

    // Inorder Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        res.clear(); // Clear the result list before traversal
        inorder(root);
        return res;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

    // Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        res.clear(); // Clear the result list before traversal
        preorder(root);
        return res;
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        res.clear(); // Clear the result list before traversal
        postorder(root);
        return res;
    }

    private void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        res.add(root.val);
    }
}
