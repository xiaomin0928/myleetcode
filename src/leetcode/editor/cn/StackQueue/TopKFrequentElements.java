//Given an integer array nums and an integer k, return the k most frequent 
//elements. You may return the answer in any order. 
//
// 
// Example 1: 
// Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
// 
// Example 2: 
// Input: nums = [1], k = 1
//Output: [1]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// k is in the range [1, the number of unique elements in the array]. 
// It is guaranteed that the answer is unique. 
// 
//
// 
// Follow up: Your algorithm's time complexity must be better than O(n log n), 
//where n is the array's size. 
//
// Related Topics 数组 哈希表 分治 桶排序 计数 快速选择 排序 堆（优先队列） 👍 1283 👎 0


package leetcode.editor.cn.StackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class TopKFrequentElements{
    public static void main(String[] args) {
        Solution solution = new TopKFrequentElements().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        //solution 1: max heap
        int[] res = new int[k];
        //map<num,frequency>
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0;i < nums.length;i++ ){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        //construct a max heap
        PriorityQueue<Map.Entry<Integer,Integer>> que = new PriorityQueue<>((o1,o2) -> o2.getValue()-o1.getValue());
        for( Map.Entry<Integer,Integer> entry:entries ){
            que.offer(entry);
        }

        for( int i = 0;i < k;i++ ){
            res[i] = que.poll().getKey();
        }
        return res;
      */
      //solution 2: min heap
      int[] res = new int[k];
      //map<num,frequency>
      HashMap<Integer,Integer> map = new HashMap<>();
      for( int i = 0;i < nums.length;i++ ){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }

      Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
      PriorityQueue<Map.Entry<Integer,Integer>> que = new PriorityQueue<>((o1,o2)->o1.getValue()- o2.getValue());
        int size = 0;
        for( Map.Entry<Integer,Integer> entry:entries){
            if( size < k ){
                que.offer(entry);
            }else{
                if( entry.getValue().compareTo(que.peek().getValue()) > 0 ){
                    que.poll();
                    que.offer(entry);
                }
            }
            size++;
        }

        for( int i = k-1; i >= 0;i--  ){
            res[i] = que.poll().getKey();
        }
      return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}