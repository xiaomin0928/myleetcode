//Given the root of a binary tree, invert the tree, and return its root. 
//
// 
// Example 1: 
// 
// 
//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]
// 
//
// Example 2: 
// 
// 
//Input: root = [2,1,3]
//Output: [2,3,1]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1383 👎 0


package leetcode.editor.cn.BinaryTree;

class InvertBinaryTree{
    public static void main(String[] args) {
        Solution solution = new InvertBinaryTree().new Solution();
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
    public TreeNode invertTree(TreeNode root) {
        // traverse tree by preOrder
        traversalTree(root);
        return root;
    }
    public void traversalTree(TreeNode root){
        if( root == null ){
            return ;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        traversalTree(root.left);
        traversalTree(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}