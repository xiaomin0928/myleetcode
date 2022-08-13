//Given the root of a binary tree, return the postorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,null,2,3]
//Output: [3,2,1]
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
// The number of the nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively?
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 900 👎 0


package leetcode.editor.cn.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BinaryTreePostorderTraversal{
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
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        /*
        //solution 1: recursive
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
        */

        //solution 2: iterator
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if( root != null ){
            stack.push(root);
        }

        while( !stack.isEmpty() ){
            TreeNode node = stack.peek();
            if( node != null ){
                stack.pop();
                //root
                stack.push(node);
                stack.push(null);
                //right
                if( node.right != null ){
                    stack.push(node.right);
                }
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
        traversal(root.right,res);
        res.add(root.val);
    }
   */
}
//leetcode submit region end(Prohibit modification and deletion)

}