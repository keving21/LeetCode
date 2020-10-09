public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == q || root ==p) return root;

        else if(q.val<root.val && p.val < root.val) root = lowestCommonAncestor(root.left, p, q);

        else if(q.val>root.val && p.val > root.val) root = lowestCommonAncestor(root.right, p, q);

        return root;


    }
}