//Given a string s, check if it can be constructed by taking a substring of it 
//and appending multiple copies of the substring together. 
//
// 
// Example 1: 
//
// 
//Input: s = "abab"
//Output: true
//Explanation: It is the substring "ab" twice.
// 
//
// Example 2: 
//
// 
//Input: s = "aba"
//Output: false
// 
//
// Example 3: 
//
// 
//Input: s = "abcabcabcabc"
//Output: true
//Explanation: It is the substring "abc" four times or the substring "abcabc" 
//twice.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of lowercase English letters. 
// 
//
// Related Topics 字符串 字符串匹配 👍 740 👎 0


package leetcode.editor.cn.String;

class RepeatedSubstringPattern{
    public static void main(String[] args) {
        Solution solution = new RepeatedSubstringPattern().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] sChars = s.toCharArray();
        int[] next = getNext(s);
        int len = sChars.length;
        if( s.length() == 0 ){
            return false;
        }
        if( next[len-1] != -1 && len%(len - (next[len-1] + 1)) == 0 ){
            return true;
        }
        return false;
    }
    public int[] getNext(String s){
        char[] chars = s.toCharArray();
        int[] next = new int[chars.length];
        int j = -1;
        next[0] = j;

        for( int i = 1;i < chars.length;i++ ){
            while( j >= 0 && chars[i] != chars[j+1]  ){
                j = next[j];
            }
            if( chars[i] == chars[j+1] ){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}