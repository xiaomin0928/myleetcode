//You are given a string s consisting of lowercase English letters. A duplicate 
//removal consists of choosing two adjacent and equal letters and removing them. 
//
// We repeatedly make duplicate removals on s until we no longer can. 
//
// Return the final string after all such duplicate removals have been made. It 
//can be proven that the answer is unique. 
//
// 
// Example 1: 
//
// 
//Input: s = "abbaca"
//Output: "ca"
//Explanation: 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent 
//and equal, and this is the only possible move.  The result of this move is that 
//the string is "aaca", of which only "aa" is possible, so the final string is 
//"ca".
// 
//
// Example 2: 
//
// 
//Input: s = "azxxzy"
//Output: "ay"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s consists of lowercase English letters. 
// 
//
// Related Topics 栈 字符串 👍 413 👎 0


package leetcode.editor.cn.StackQueue;

class RemoveAllAdjacentDuplicatesInString{
    public static void main(String[] args) {
        Solution solution = new RemoveAllAdjacentDuplicatesInString().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        // solution 1 : stack
        /*
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for( int i = 0; i < chars.length; i++ ){
            if( deque.isEmpty() || deque.peek() != chars[i] ){
                deque.push(chars[i]);
            }else{
                deque.pop();
            }
        }
        String str = "";
        while( !deque.isEmpty() ){
            str = deque.pop() + str;
        }
        return str;
        */

        //solution 2 : Double pointer
        char[] chars = s.toCharArray();
        int fast = 0, slow = 0;
        for( int i = 0; i < chars.length; i++ ){
            chars[slow] = chars[fast];
            if( slow > 0 && chars[slow] == chars[slow-1] ){
                slow--;
            }else{
                slow++;
            }
            fast++;
        }
        return new String(chars,0,slow);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}