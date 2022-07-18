//Given a non-negative integer x, compute and return the square root of x. 
//
// Since the return type is an integer, the decimal digits are truncated, and 
//only the integer part of the result is returned. 
//
// Note: You are not allowed to use any built-in exponent function or operator, 
//such as pow(x, 0.5) or x ** 0.5. 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part 
//is truncated, 2 is returned. 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
// Related Topics 数学 二分查找 👍 970 👎 0


package leetcode.editor.cn.Array.BinarySearch;

class Sqrtx{
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int mySqrt(int x) {
            int left = 1, right = x, middle;
            while (left <= right) {
                middle = left + ((right - left) >> 1);
                if (middle > x / middle) {
                    right = middle - 1;
                } else if (middle < x / middle) {
                    left = middle + 1;
                } else {
                    return middle;
                }
            }
            return right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}