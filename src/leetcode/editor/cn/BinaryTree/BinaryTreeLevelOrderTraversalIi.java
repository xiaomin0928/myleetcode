//Given the root of a binary tree, return the bottom-up level order traversal 
//of its nodes' values. (i.e., from left to right, level by level from leaf to root)
//. 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[15,7],[9,20],[3]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
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
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 607 👎 0


package leetcode.editor.cn.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeLevelOrderTraversalIi{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
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

    List<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        levelOrder(root);
        return res;
    }

    public void levelOrder(TreeNode root){
        Queue<TreeNode> que = new LinkedList<>();

        if( root == null ){
            return ;
        }else{
            que.offer(root);
        }

        while( !que.isEmpty() ){
            List<Integer> item = new LinkedList<>();
            int len = que.size();
            while( len > 0 ){
                TreeNode node = que.poll();
                item.add(node.val);
                if( node.left != null ){
                    que.offer(node.left);
                }
                if( node.right != null ){
                    que.offer(node.right);
                }
                len--;
            }
            res.add(0,item);
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}