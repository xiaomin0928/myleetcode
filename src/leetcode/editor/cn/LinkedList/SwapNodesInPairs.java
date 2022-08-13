////Given a linked list, swap every two adjacent nodes and return its head. You 
//
////must solve the problem without modifying the values in the list's nodes (i.
//e., 
////only nodes themselves may be changed.) 
////
//// 
//// Example 1: 
////
//// 
////Input: head = [1,2,3,4]
////Output: [2,1,4,3]
//// 
////
//// Example 2: 
////
//// 
////Input: head = []
////Output: []
//// 
////
//// Example 3: 
////
//// 
////Input: head = [1]
////Output: [1]
//// 
////
//// 
//// Constraints: 
////
//// 
//// The number of nodes in the list is in the range [0, 100]. 
//// 0 <= Node.val <= 100 
//// 
//// Related Topics 递归 链表 👍 1473 👎 0
//


package leetcode.editor.cn.LinkedList;

class SwapNodesInPairs{
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
        // TO TEST
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        /*
        //dummyNode
        ListNode dummyNode =  new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while( prev.next != null && prev.next.next != null ){
            ListNode temp = prev.next.next.next;
            prev.next = head.next;
            head.next.next = head;
            head.next = temp;
            prev = head;
            head = head.next;
        }
        return dummyNode.next;
        */
        //recursion
        if( head == null || head.next == null ){
            return head;
        }
        ListNode next = head.next;
        ListNode newNode = swapPairs(next.next);
        next.next = head;
        head.next = newNode;

        return next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}