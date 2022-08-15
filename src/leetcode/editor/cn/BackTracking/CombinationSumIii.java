//Find all valid combinations of k numbers that sum up to n such that the 
//following conditions are true: 
//
// 
// Only numbers 1 through 9 are used. 
// Each number is used at most once. 
// 
//
// Return a list of all possible valid combinations. The list must not contain 
//the same combination twice, and the combinations may be returned in any order. 
//
// 
// Example 1: 
//
// 
//Input: k = 3, n = 7
//Output: [[1,2,4]]
//Explanation:
//1 + 2 + 4 = 7
//There are no other valid combinations. 
//
// Example 2: 
//
// 
//Input: k = 3, n = 9
//Output: [[1,2,6],[1,3,5],[2,3,4]]
//Explanation:
//1 + 2 + 6 = 9
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//There are no other valid combinations.
// 
//
// Example 3: 
//
// 
//Input: k = 4, n = 1
//Output: []
//Explanation: There are no valid combinations.
//Using 4 different numbers in the range [1,9], the smallest sum we can get is 1
//+2+3+4 = 10 and since 10 > 1, there are no valid combination.
// 
//
// 
// Constraints: 
//
// 
// 2 <= k <= 9 
// 1 <= n <= 60 
// 
//
// Related Topics 数组 回溯 👍 523 👎 0


package leetcode.editor.cn.BackTracking;

import java.util.ArrayList;
import java.util.List;

class CombinationSumIii{
    public static void main(String[] args) {
        Solution solution = new CombinationSumIii().new Solution();
        // TO TEST
        solution.combinationSum3(3,7);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n, k, 0, 1);
        return res;
    }
    public void backTracking(int targetSum, int k, int sum, int startIndex){
        if( sum > targetSum ){
            return ;
        }

        if( item.size() == k ){
            if( sum == targetSum ){
                res.add(new ArrayList<>(item));
            }
            return ;
        }

        for( int i = startIndex; i <= 9 - (k - item.size())+1; i++ ){
            sum += i;
            item.add(i);
            backTracking(targetSum, k, sum, i+1);
            sum -= i;
            item.remove(item.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}