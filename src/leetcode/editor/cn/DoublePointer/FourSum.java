//Given an array nums of n integers, return an array of all the unique 
//quadruplets [nums[a], nums[b], nums[c], nums[d]] such that: 
//
// 
// 0 <= a, b, c, d < n 
// a, b, c, and d are distinct. 
// nums[a] + nums[b] + nums[c] + nums[d] == target 
// 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// Example 2: 
//
// 
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 200 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 双指针 排序 👍 1307 👎 0


package leetcode.editor.cn.DoublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum{
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
        // TO TEST
        System.out.println(solution.fourSum(new int[]{-1, 0, 0, 1},0));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int left, right;
        long sum;

        Arrays.sort(nums);

        // a = nums[i], b = nums[j], c = nums[left], d = nums[right]
        for( int i = 0; i < nums.length; i++ ){
            // no result
            if( nums[i] > target && (nums[i]>=0 || target >= 0) ){
                return result;
            }

            // remove redundant of a
            if( i > 0 && nums[i] == nums[i-1] ){
                continue;
            }
            for( int j = i + 1; j < nums.length; j++ ){

                // remove redundant of b
                if( (j > i+1) && nums[j] == nums[j-1] ){
                    continue;
                }
                left = j + 1;
                right = nums.length - 1;
                while( left < right ){
                    sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if( sum > target ){
                        right--;
                    }else if( sum < target ){
                        left++;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // remove redundant of nums[left], nums[right]
                        while( right > left && nums[right] == nums[right-1] ){
                            right--;
                        }
                        while( right > left && nums[left] == nums[left+1] ){
                            left++;
                        }

                        // find next group
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}