//Given the root of a binary tree, return the level order traversal of its 
//nodes' values. (i.e., from left to right, level by level). 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]
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
// Related Topics 树 广度优先搜索 二叉树 👍 1424 👎 0


package leetcode.editor.cn.BinaryTree;

import java.util.*;

class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
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

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {

        //solution 1: recursive
        //levelOrderByRecursive(root,0);

        //solution 2: iteration
        levelOrderByInteration(root);
        return res;

    }

    public void levelOrderByRecursive(TreeNode root,int deep){
        if( root == null ){
            return ;
        }

        deep++;

        if( deep > res.size() ){
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        res.get(deep-1).add(root.val);

        levelOrderByRecursive(root.left,deep);
        levelOrderByRecursive(root.right,deep);
    }

    public void levelOrderByInteration(TreeNode root){
        Queue<TreeNode> que = new LinkedList<>();

        if( root == null ){
            return ;
        }else{
            que.offer(root);
        }

        while( !que.isEmpty() ){
            int len = que.size();
            List<Integer> item = new ArrayList<>();
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
            res.add(item);
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)

}