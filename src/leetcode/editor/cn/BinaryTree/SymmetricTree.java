//Given the root of a binary tree, check whether it is a mirror of itself (i.e.,
// symmetric around its center). 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,2,2,3,4,4,3]
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: root = [1,2,2,null,3,null,3]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Could you solve it both recursively and iteratively?
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 2062 👎 0


package leetcode.editor.cn.BinaryTree;

class SymmetricTree{
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
        // TO TEST
    }

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

    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if( root == null ){
            return false;
        }

        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left,TreeNode right){
        if( left == null && right != null ){
            return false;
        }else if( left != null && right == null ){
            return false;
        }else if( left ==null && right == null ){
            return true;
        }else if( left.val != right.val ){
            return false;
        }

        boolean outside = compare(left.left,right.right);
        boolean inside = compare(left.right,right.left);
        if( outside && inside){
            return true;
        }else{
            return false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}