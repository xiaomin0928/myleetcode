//Given two integers n and k, return all possible combinations of k numbers 
//chosen from the range [1, n]. 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//Explanation: There are 4 choose 2 = 6 total combinations.
//Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to 
//be the same combination.
// 
//
// Example 2: 
//
// 
//Input: n = 1, k = 1
//Output: [[1]]
//Explanation: There is 1 choose 1 = 1 total combination.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1088 👎 0


package leetcode.editor.cn.BackTracking;

import java.util.ArrayList;
import java.util.List;

class Combinations{
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return res;
    }

    public void backTracking(int n, int k, int startIndex){
        //end condition
        if( item.size() == k ){
            res.add(new ArrayList<>(item));
            return ;
        }
        for( int i = startIndex; i <= n - (k - item.size()) + 1; i++ ){
            item.add(i);
            backTracking(n,k,i+1); //recursive
            item.remove(item.size()-1); //back tracking
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}