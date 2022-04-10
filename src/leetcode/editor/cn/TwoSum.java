//////Given an array of integers nums and an integer target, return indices of
////the 
//////two numbers such that they add up to target. 
//////
////// You may assume that each input would have exactly one solution, and you 
////may 
//////not use the same element twice. 
//////
////// You can return the answer in any order. 
//////
////// 
////// Example 1: 
//////
////// 
//////Input: nums = [2,7,11,15], target = 9
//////Output: [0,1]
//////Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
////// 
//////
////// Example 2: 
//////
////// 
//////Input: nums = [3,2,4], target = 6
//////Output: [1,2]
////// 
//////
////// Example 3: 
//////
////// 
//////Input: nums = [3,3], target = 6
//////Output: [0,1]
////// 
//////
////// 
////// Constraints: 
//////
////// 
////// 2 <= nums.length <= 10⁴ 
////// -10⁹ <= nums[i] <= 10⁹ 
////// -10⁹ <= target <= 10⁹ 
////// Only one valid answer exists. 
////// 
//////
////// 
//////Follow-up: Can you come up with an algorithm that is less than O(n²) time 
//
//////complexity? Related Topics 数组 哈希表 👍 14078 👎 0
////
//

package leetcode.editor.cn;
import java.util.HashMap;

class TwoSum{
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] res = solution.twoSum(nums,target);
        System.out.println(res[0] + " " + res[1]);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i]))
                {
                    res[0] = map.get(nums[i]);
                    res[1] = i;
                }
                map.put(target-nums[i],i);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}