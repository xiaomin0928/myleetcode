//Given a linked list, swap every two adjacent nodes and return its head. You 
//must solve the problem without modifying the values in the list's nodes (i.e., 
//only nodes themselves may be changed.) 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
// 
//
// Example 2: 
//
// 
//Input: head = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 100]. 
// 0 <= Node.val <= 100 
// 
// Related Topics 递归 链表 👍 1473 👎 0
#### 解题思路
方法1：使用虚节点
<ul>
<li>dummyNode.next -> head</li>  
<li>prev -> dummyNode</li>  
<li>两两交换的主要3个步骤：prev.next -> head.next; head.next.next -> head; head.next -> temp(prev.next.next.next)
完成交换之后，移动指针：prev -> head; head -> head.next</li>
</ul>

方法2：递归  
<ul>
<li>判断head和head.next是否为null,如果是null,return head,说明到了递归的起点</li>
<li>next -> head.next; newnode -> swap(next.next); next.next -> head; head.next -> newnode</li>
<li>return next</li>
</ul>