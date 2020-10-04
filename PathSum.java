public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root ==null) return false;
        if(root != null && root.left == null && root.right == null && root.val != sum) return false;

        return check(root, sum, 0, false);


    }

    public boolean check (TreeNode temp, int sum, int value, boolean match){
        if(temp != null){

            value += temp.val;
            match = check(temp.left, sum, value, match);
            match = check(temp.right, sum, value, match);
            if(temp.left == null && temp.right == null && sum == value) {
                match = true;
                return match;
            }
        }
        return match;
    }

}