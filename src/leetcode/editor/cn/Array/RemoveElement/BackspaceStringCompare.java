//Given two strings s and t, return true if they are equal when both are typed 
//into empty text editors. '#' means a backspace character. 
//
// Note that after backspacing an empty text, the text will continue empty. 
//
// 
// Example 1: 
//
// 
//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
// 
//
// Example 2: 
//
// 
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
// 
//
// Example 3: 
//
// 
//Input: s = "a#c", t = "b"
//Output: false
//Explanation: s becomes "c" while t becomes "b".
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 200 
// s and t only contain lowercase letters and '#' characters. 
// 
//
// 
// Follow up: Can you solve it in O(n) time and O(1) space? 
// Related Topics 栈 双指针 字符串 模拟 👍 407 👎 0


package leetcode.editor.cn.Array.RemoveElement;

class BackspaceStringCompare{
    public static void main(String[] args) {
        Solution solution = new BackspaceStringCompare().new Solution();
        // TO TEST
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(solution.backspaceCompare(s,t));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sSlowIndex, tSlowIndex;
        char[] sChars = s.toCharArray(), tChars = t.toCharArray();
        sSlowIndex = removeBackspace(sChars);
        tSlowIndex = removeBackspace(tChars);
        if (sSlowIndex != tSlowIndex) {
            return false;
        }
        for (int i = 0; i < sSlowIndex; i++) {
            if ( sChars[i] != tChars[i]) return false;
        }
        return true;
    }

    public int removeBackspace(char[] chars) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < chars.length; fastIndex++) {
            if ( '#' != chars[fastIndex]) {
                chars[slowIndex++] = chars[fastIndex];
            }else if (slowIndex > 0) {
                slowIndex--;
            }
        }
        return slowIndex;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}