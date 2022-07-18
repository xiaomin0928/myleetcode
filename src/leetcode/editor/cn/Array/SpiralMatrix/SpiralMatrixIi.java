//Given a positive integer n, generate an n x n matrix filled with elements 
//from 1 to n² in spiral order. 
//
// 
// Example 1: 
//
// 
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [[1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 
// Related Topics 数组 矩阵 模拟 👍 765 👎 0


package leetcode.editor.cn.Array.SpiralMatrix;

class SpiralMatrixIi{
    public static void main(String[] args) {
        Solution solution = new SpiralMatrixIi().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int start = 0;
        int count = 1; //filled number
        int loop = 0;
        int i,j; //index
        int[][] res = new int[n][n];
        while( loop++ < n/2 ){
            // left -> right
            for( j = start; j < n - loop; j++ ){
                res[start][j] = count++;
            }
            // up -> down
            for( i = start; i < n - loop; i++ ){
                res[i][j] = count++;
            }
            //right -> left
            for( ;j >= loop; j-- ){
                res[i][j] = count++;
            }
            // down -> up
            for( ;i >= loop; i-- ){
                res[i][j] = count++;
            }
            start++;
        }
        // center point
        if( n % 2 == 1 ){
            res[start][start] = count++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}