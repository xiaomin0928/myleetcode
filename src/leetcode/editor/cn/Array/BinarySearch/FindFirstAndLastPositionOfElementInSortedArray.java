//////Given an array of integers nums sorted in non-decreasing order, find the 
//////starting and ending position of a given target value. 
//////
////// If target is not found in the array, return [-1, -1]. 
//////
////// You must write an algorithm with O(log n) runtime complexity. 
//////
////// 
////// Example 1: 
////// Input: nums = [5,7,7,8,8,10], target = 8
//////Output: [3,4]
////// Example 2: 
////// Input: nums = [5,7,7,8,8,10], target = 6
//////Output: [-1,-1]
////// Example 3: 
////// Input: nums = [], target = 0
//////Output: [-1,-1]
////// 
////// 
////// Constraints: 
//////
////// 
////// 0 <= nums.length <= 10⁵ 
////// -10⁹ <= nums[i] <= 10⁹ 
////// nums is a non-decreasing array. 
////// -10⁹ <= target <= 10⁹ 
////// 
////// Related Topics 数组 二分查找 👍 1602 👎 0
////
//


package leetcode.editor.cn.Array.BinarySearch;

class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = 0, right = nums.length - 1, middle;
        while (left <= right){
            middle = left + ((right-left) >> 1);
            if(nums[middle] > target){
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                res[0] = res[1] = middle;
                while (res[0] > left && nums[res[0] - 1] == target){
                    res[0]--;
                }
                while (res[1] < right && nums[res[1] + 1] == target){
                    res[1]++;
                }
                return res;
            }
        }
        return res;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}