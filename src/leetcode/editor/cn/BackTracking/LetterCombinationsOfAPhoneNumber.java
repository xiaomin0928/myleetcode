//Given a string containing digits from 2-9 inclusive, return all possible 
//letter combinations that the number could represent. Return the answer in any order. 
//
//
// A mapping of digits to letters (just like on the telephone buttons) is given 
//below. Note that 1 does not map to any letters. 
// 
// 
// Example 1: 
//
// 
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// Example 2: 
//
// 
//Input: digits = ""
//Output: []
// 
//
// Example 3: 
//
// 
//Input: digits = "2"
//Output: ["a","b","c"]
// 
//
// 
// Constraints: 
//
// 
// 0 <= digits.length <= 4 
// digits[i] is a digit in the range ['2', '9']. 
// 
//
// Related Topics 哈希表 字符串 回溯 👍 2061 👎 0


package leetcode.editor.cn.BackTracking;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        String[] lettersMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res =new ArrayList<>();
        StringBuffer item = new StringBuffer();

    public List<String> letterCombinations(String digits) {
        if( digits == null || digits.length() == 0 ){
            return res;
        }
        backTracking(digits,0);
        return res;
    }
    public void backTracking(String digits, int index){

        if( index == digits.length() ){
            res.add(item.toString());
            return ;
        }

        int digit = digits.charAt(index) - '0';
        String letter = lettersMap[digit];
        for( int i = 0;i < letter.length();i++ ){
            item.append(letter.charAt(i));
            backTracking(digits,index+1);
            item.deleteCharAt(item.length()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}