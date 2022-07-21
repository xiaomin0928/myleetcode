//Given the head of a linked list, remove the nᵗʰ node from the end of the list 
//and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1], n = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1,2], n = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is sz. 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
// Follow up: Could you do this in one pass? 
// Related Topics 链表 双指针 👍 2136 👎 0


package leetcode.editor.cn.LinkedList;

class RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        // TO TEST
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        while( n-- > 0 && fast != null ){
            fast = fast.next;
        }
        // gap is n+1, find the prev of slow
        fast = fast.next;
        while( fast != null ){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}