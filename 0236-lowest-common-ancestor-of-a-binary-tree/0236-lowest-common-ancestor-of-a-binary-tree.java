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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /* List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        // find paths
        findPath(root, p, pathP);
        findPath(root, q, pathQ);

        TreeNode lca = null;

        // compare paths
        int i = 0;
        while (i < pathP.size() && i < pathQ.size()) {
            if (pathP.get(i) == pathQ.get(i)) {
                lca = pathP.get(i);
            } else {
                break;
            }
            i++;
        }

        return lca;
    }

    // DFS to find path from root to target
    private boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null) return false;

        path.add(root);

        if (root == target) return true;

        if (findPath(root.left, target, path) ||
            findPath(root.right, target, path)) {
            return true;
        }

        // backtrack
        path.remove(path.size() - 1);
        return false;*/
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode leftLCA=lowestCommonAncestor(root.left,p,q);
        TreeNode rightLCA=lowestCommonAncestor(root.right,p,q);
        if(leftLCA!=null && rightLCA!=null){
            return root;
        }
        else if(leftLCA !=null){
            return leftLCA;
        }
        else
        return rightLCA;
    }
}