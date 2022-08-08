//You are given an array of integers nums, there is a sliding window of size k 
//which is moving from the very left of the array to the very right. You can only 
//see the k numbers in the window. Each time the sliding window moves right by one 
//position. 
//
// Return the max sliding window. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
//Explanation: 
//Window position                Max
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
// 
//
// Example 2: 
//
// 
//Input: nums = [1], k = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 1 <= k <= nums.length 
// 
//
// Related Topics 队列 数组 滑动窗口 单调队列 堆（优先队列） 👍 1773 👎 0


package leetcode.editor.cn.StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

class SlidingWindowMaximum{
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class MyQueue{
        Deque<Integer> myque = new ArrayDeque<>();

        //if the first value of que equals to remove value, then pop
        public void pop(int value){
            if( !myque.isEmpty() && value == myque.peek() ){
                myque.pollFirst();
            }
        }

        //if the last value of que < inserted value, then push
        public void push(int value){
            while( !myque.isEmpty() && myque.peekLast() < value ){
                myque.pollLast();
            }
            myque.addLast(value);
        }

        int peek(){
            return myque.peekFirst();
        }
    }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*
        //solution 1
        Deque<Integer> que = new ArrayDeque<>();
        int len = nums.length;
        int[] res = new int[len - k + 1];
        int index = 0;
        //conduct a decreasing que with index of nums
        for( int i = 0; i < len; i++ ){
            //index should range in [i-k+1, i]
            while( !que.isEmpty() && que.peekFirst() < i - k + 1 ){
                que.pollFirst();
            }
            //keep que decreasing
            while( !que.isEmpty() && nums[que.peekLast()] < nums[i] ){
                que.pollLast();
            }
            que.offer(i);
            //save max value in res
            if( i >= k - 1){
                res[index++] = nums[que.peekFirst()];
            }
        }
        return res;
        */
        //solution 2
        int len = nums.length;
        int index = 0;
        int[] res = new int[len-k+1];

        MyQueue myque = new MyQueue();

        if( len == 1 ){
            return nums;
        }
        //add k elements into que
        for( int i = 0;i < k;i++ ){
            myque.push(nums[i]);
        }
        res[index++] = myque.peek();
        //move window
        for( int i = k;i < len;i++ ){
            myque.pop(nums[i-k]);
            myque.push(nums[i]);
            res[index++] = myque.peek();
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}