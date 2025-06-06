////Given the head of a singly linked list, reverse the list, and return the 
////reversed list. 
////
//// 
//// Example 1: 
////
//// 
////Input: head = [1,2,3,4,5]
////Output: [5,4,3,2,1]
//// 
////
//// Example 2: 
////
//// 
////Input: head = [1,2]
////Output: [2,1]
//// 
////
//// Example 3: 
////
//// 
////Input: head = []
////Output: []
//// 
////
//// 
//// Constraints: 
////
//// 
//// The number of nodes in the list is the range [0, 5000]. 
//// -5000 <= Node.val <= 5000 
//// 
////
//// 
//// Follow up: A linked list can be reversed either iteratively or recursively.
// 
////Could you implement both? 
//// Related Topics 递归 链表 👍 2632 👎 0
//


package leetcode.editor.cn.LinkedList;

class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
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
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
           /* double pointer
           ListNode prev = null;
           ListNode cur = head;
           ListNode temp = null;
           while( cur != null ){
               temp = cur.next;
               cur.next = prev;
               prev = cur;
               cur = temp;
           }
           return prev;
           */
            return reverse(null, head);
        }

        private ListNode reverse(ListNode prev, ListNode cur) {
            // recursion
            if (cur == null) {
                return prev;
            }
            ListNode temp = null;
            temp = cur.next;
            cur.next = prev;
            return reverse(cur, temp);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}