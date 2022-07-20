//Given the head of a singly linked list, reverse the list, and return the 
//reversed list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2]
//Output: [2,1]
// 
//
// Example 3: 
//
// 
//Input: head = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is the range [0, 5000]. 
// -5000 <= Node.val <= 5000 
// 
//
// 
// Follow up: A linked list can be reversed either iteratively or recursively. 
//Could you implement both? 
// Related Topics 递归 链表 👍 2632 👎 0

#### 思路总结
方法1：双指针  
prev和cur同时移动，注意使用temp保存cur.next，转置cur.next->prev，prev->cur,cur->temp;  
方法2：递归  
递归函数reverse(prev,cur),转置前后两个节点，reverse的操作：temp保存cur.next，cur.next->prev, reverse(prev,cur);  