//Given an integer array nums sorted in non-decreasing order, return an array 
//of the squares of each number sorted in non-decreasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
// 
//
// Example 2: 
//
// 
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in non-decreasing order. 
// 
//
// 
//Follow up: Squaring each element and sorting the new array is very trivial, 
//could you find an O(n) solution using a different approach? Related Topics 数组 双指针 
//排序 👍 497 👎 0


package leetcode.editor.cn.Array;

class SquaresOfASortedArray{
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = nums.length - 1;
        int[] res = new int[nums.length];
        int starIndex = 0, endIndex = i;
        while (starIndex <= endIndex) {
            int startSquare = nums[starIndex] * nums[starIndex];
            int endSquare = nums[endIndex] * nums[endIndex];
            if (startSquare > endSquare) {
                res[i--] = startSquare;
                starIndex++;
            }else {
                res[i--] = endSquare;
                endIndex--;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}