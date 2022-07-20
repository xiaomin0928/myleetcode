//////Design your implementation of the linked list. You can choose to use a 
////singly 
//////or doubly linked list. 
//////A node in a singly linked list should have two attributes: val and next. 
////val 
//////is the value of the current node, and next is a pointer/reference to the 
////next 
//////node. 
//////If you want to use the doubly linked list, you will need one more 
//attribute 
////
//////prev to indicate the previous node in the linked list. Assume all nodes 
//in 
////the 
//////linked list are 0-indexed. 
//////
////// Implement the MyLinkedList class: 
//////
////// 
////// MyLinkedList() Initializes the MyLinkedList object. 
////// int get(int index) Get the value of the indexᵗʰ node in the linked list. 
//
////If 
//////the index is invalid, return -1. 
////// void addAtHead(int val) Add a node of value val before the first element 
//
////of 
//////the linked list. After the insertion, the new node will be the first node 
//
////of the 
//////linked list. 
////// void addAtTail(int val) Append a node of value val as the last element 
//of 
//////the linked list. 
////// void addAtIndex(int index, int val) Add a node of value val before the 
////indexᵗ
//////ʰ node in the linked list. If index equals the length of the linked list, 
//
////the 
//////node will be appended to the end of the linked list. If index is greater 
////than the 
//////length, the node will not be inserted. 
////// void deleteAtIndex(int index) Delete the indexᵗʰ node in the linked list,
// 
////if 
//////the index is valid. 
////// 
//////
////// 
////// Example 1: 
//////
////// 
//////Input
//////["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", 
//////"deleteAtIndex", "get"]
//////[[], [1], [3], [1, 2], [1], [1], [1]]
//////Output
//////[null, null, null, null, 2, null, 3]
//////
//////Explanation
//////MyLinkedList myLinkedList = new MyLinkedList();
//////myLinkedList.addAtHead(1);
//////myLinkedList.addAtTail(3);
//////myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
//////myLinkedList.get(1); // return 2
//////myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
//////myLinkedList.get(1); // return 3
////// 
//////
////// 
////// Constraints: 
//////
////// 
////// 0 <= index, val <= 1000 
////// Please do not use the built-in LinkedList library. 
////// At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex 
//
////and 
//////deleteAtIndex. 
////// 
////// Related Topics 设计 链表 👍 504 👎 0
////
//


package leetcode.editor.cn.LinkedList.DesignLinkedList;

class DesignLinkedListDouble {
    public static void main(String[] args) {
        //Solution solution = new DesignLinkedList().new Solution();
        // TO TEST
        /*
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        System.out.println(myLinkedList.get(0));
        myLinkedList.addAtTail(3);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        myLinkedList.addAtIndex(1, 2); // linked list becomes 1->2->3
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.get(1); // return 2
        myLinkedList.deleteAtIndex(1); // now the linked list is 1->3
        myLinkedList.get(1); // return 3
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
         */
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class MyLinkedList {
    class Node{
        int val;
        Node prev,next;
        Node(){}
        Node(int x){
            this.val = x;
        }
    }

    int size;
    Node head,tail;

    public MyLinkedList() {
        size = 0;
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        if( index < 0 || index >= size ){
            return -1;
        }
        Node cur;
        if( index < ( size-1 )/2 ){
            cur = head;
            for(int i = 0; i <= index;i++){
                cur = cur.next;
            }
        }else{
            cur = tail;
            for(int j = 0; j <= size - index - 1;j++){
                cur = cur.prev;
            }
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        size++;
        Node cur = head;
        Node newnode = new Node(val);
        newnode.next = cur.next;
        cur.next.prev = newnode;
        cur.next = newnode;
        newnode.prev = cur;
    }
    
    public void addAtTail(int val) {
        size++;
        Node cur = tail;
        Node newnode = new Node(val);
        newnode.next = tail;
        newnode.prev = cur.prev;
        cur.prev.next = newnode;
        cur.prev = newnode;
    }
    
    public void addAtIndex(int index, int val) {
        if( index > size ){
            return;
        }
        if( index < 0 ){
            index = 0;
        }
        Node cur;
        // find the previous one of cur
        if( index < (size-1)/2 ){
            cur = head;
            for(int i = 0; i <= index - 1;i++){
                cur = cur.next;
            }
        }else{
            cur = tail;
            for(int j = 0; j <= size - index;j++){
                cur = cur.prev;
            }
        }
        size++;
        Node newnode = new Node(val);
        newnode.next = cur.next;
        cur.next.prev = newnode;
        cur.next = newnode;
        newnode.prev = cur;
    }
    
    public void deleteAtIndex(int index) {
        if( index < 0 || index >= size ){
            return;
        }
        Node cur;
        // find the previous one of cur
        if( index < (size-1)/2 ){
            cur = head;
            for(int i = 0; i <= index - 1;i++){
                cur = cur.next;
            }
        }else {
            cur = tail;
            for (int j = 0; j <= size - index; j++) {
                cur = cur.prev;
            }
        }
        size--;
        cur.next.next.prev = cur;
        cur.next = cur.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}