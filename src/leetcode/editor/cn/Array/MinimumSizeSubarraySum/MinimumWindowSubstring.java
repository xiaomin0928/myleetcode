//Given two strings s and t of lengths m and n respectively, return the minimum 
//window substring of s such that every character in t (including duplicates) is 
//included in the window. If there is no such substring, return the empty string 
//"". 
//
// The testcases will be generated such that the answer is unique. 
//
// A substring is a contiguous sequence of characters within the string. 
//
// 
// Example 1: 
//
// 
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' 
//from string t.
// 
//
// Example 2: 
//
// 
//Input: s = "a", t = "a"
//Output: "a"
//Explanation: The entire string s is the minimum window.
// 
//
// Example 3: 
//
// 
//Input: s = "a", t = "aa"
//Output: ""
//Explanation: Both 'a's from t must be included in the window.
//Since the largest window of s only has one 'a', return empty string.
// 
//
// 
// Constraints: 
//
// 
// m == s.length 
// n == t.length 
// 1 <= m, n <= 10⁵ 
// s and t consist of uppercase and lowercase English letters. 
// 
//
// 
//Follow up: Could you find an algorithm that runs in O(m + n) time? Related 
//Topics 哈希表 字符串 滑动窗口 👍 1827 👎 0


package leetcode.editor.cn.Array.MinimumSizeSubarraySum;

class MinimumWindowSubstring{
    public static void main(String[] args) {
        Solution solution = new MinimumWindowSubstring().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int sLen = sChar.length;
        int tLen = tChar.length;
        int left = 0, right = 0, num = 0;
        int[] array = new int[58];//z:122 A:56 122-65+1=58
        String result = "";
        for (int i = 0; i < tLen; i++) {
            array[tChar[i] - 'A'] --;
        }
        for (right = 0; right < sLen;right++) {
            array[sChar[right] - 'A']++;
            if (array[sChar[right] - 'A'] <= 0) {
                num++;
            }
            if (num == tLen) {
                while (array[sChar[left] - 'A'] > 0) {
                    array[sChar[left] - 'A']--;
                    left++;
                }
                if ("" == result || result.length() > right - left + 1) {
                    result = s.substring(left, right + 1);
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}