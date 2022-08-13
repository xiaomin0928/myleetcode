//Given the root of a binary tree, return the inorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,null,2,3]
//Output: [1,3,2]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
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
// 
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1526 👎 0


package leetcode.editor.cn.BinaryTree;

import java.util.*;

class BinaryTreeInorderTraversal{
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

    public static void main(String[] args) {
        Solution solution = new BinaryTreeInorderTraversal().new Solution();
        // TO TEST
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
    public List<Integer> inorderTraversal(TreeNode root) {
        /*
        //solution 1: recursive
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
         */

        //solution 2: iteration
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if( root != null ){
            stack.push(root);
        }

        while( !stack.isEmpty() ){
            TreeNode node = stack.peek();
            if( node != null ){
                stack.pop();
                //right
                if( node.right != null ){
                    stack.push(node.right);
                }
                //root
                stack.push(node);
                stack.push(null);
                //left
                if( node.left != null ){
                    stack.push(node.left);
                }
            }else{
                stack.pop();
                node = stack.peek();
                stack.pop();
                res.add(node.val);
            }
        }
        return res;
    }

    /*
    public void traversal(TreeNode root, List<Integer> res){
        if( root == null ){
            return ;
        }
        traversal(root.left,res);
        res.add(root.val);
        traversal(root.right,res);
    }
    */
}
//leetcode submit region end(Prohibit modification and deletion)

}