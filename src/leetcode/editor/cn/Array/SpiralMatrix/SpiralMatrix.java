//Given an m x n matrix, return all elements of the matrix in spiral order. 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
// Related Topics 数组 矩阵 模拟 👍 1147 👎 0


package leetcode.editor.cn.Array.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix{
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        /* solution 1: similar to 54 spiral matrix
        List<Integer> res = new ArrayList<Integer>();
        int startx = 0;
        int starty = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int mid = Math.min(rows,columns)/2;
        int loop = 0;
        int offset = 1;
        int i,j;

        while( loop < mid ){
            // left -> right
            for( j = startx; j < startx + columns - offset; j++ ){
                res.add(matrix[startx][j]);
            }
            // up -> down
            for( i = starty; i < starty + rows - offset; i++ ){
                res.add(matrix[i][j]);
            }
            // right -> left
            for( ;j > startx; j-- ){
                res.add(matrix[i][j]);
            }
            // up -> down
            for( ;i > starty; i--){
                res.add(matrix[i][j]);
            }
            startx++;
            starty++;
            loop++;
            offset += 2;
        }
        // remained row/column
        if ( Math.min(rows,columns)%2 != 0) {
            if ( rows < columns ){
                for( j = mid;j < mid + columns - rows + 1;++j){
                    res.add(matrix[mid][j]);
                }
            }else{
                for( i = mid;i < mid + rows - columns + 1;++i ){
                    res.add(matrix[i][mid]);
                }
            }
        }
        return res;
        */
        // solution 2
        List<Integer> res = new ArrayList<Integer>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int len = rows * columns;
        int i = 0;
        int j = -1;
        String flag = "right"; //traverse direction
        final int  TRAVERSED = 200;

        while( len > 0){
            if( flag.equals("right") ){
                j++;
                if( j + 1 >= columns || matrix[i][j+1] == TRAVERSED){
                    flag = "down";
                }
            }else if( flag.equals("down") ){
                i++;
                if( i + 1 >= rows || matrix[i+1][j] == TRAVERSED){
                    flag = "left";
                }
            }else if( flag.equals("left")){
                j--;
                if( j - 1 < 0 || matrix[i][j-1] == TRAVERSED ){
                    flag = "up";
                }
            }else if( flag.equals("up")){
                i--;
                if( i - 1 < 0 || matrix[i-1][j] == TRAVERSED){
                    flag = "right";
                }
            }
            res.add(matrix[i][j]);
            matrix[i][j] = TRAVERSED;
            len--;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}