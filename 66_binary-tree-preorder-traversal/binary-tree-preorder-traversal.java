/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/binary-tree-preorder-traversal
@Language: Java
@Datetime: 16-02-27 12:57
*/

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
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }

        return result;
    }

    private void helper(TreeNode p) {
        result.add(p.val);

        if (p.left != null)
            helper(p.left);

        if (p.right != null)
            helper(p.right);
    }
}