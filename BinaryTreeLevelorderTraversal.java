import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int size;
        TreeNode temp;

        if (root == null) return res;
        queue.add(root);

        while(!queue.isEmpty()){
            size = queue.size();
            List<Integer> level = new ArrayList<Integer>();

            for(int i=0;i<size;i++){
                temp = queue.poll();

                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                level.add(temp.val);
            }

            res.add(level);
        }

        return res;

    }
}