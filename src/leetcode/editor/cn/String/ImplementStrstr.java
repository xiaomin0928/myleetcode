//Implement strStr(). 
//
// Given two strings needle and haystack, return the index of the first 
//occurrence of needle in haystack, or -1 if needle is not part of haystack. 
//
// Clarification: 
//
// What should we return when needle is an empty string? This is a great 
//question to ask during an interview. 
//
// For the purpose of this problem, we will return 0 when needle is an empty 
//string. This is consistent to C's strstr() and Java's indexOf(). 
//
// 
// Example 1: 
//
// 
//Input: haystack = "hello", needle = "ll"
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack and needle consist of only lowercase English characters. 
// 
//
// Related Topics 双指针 字符串 字符串匹配 👍 1512 👎 0


package leetcode.editor.cn.String;

class ImplementStrstr{
    public static void main(String[] args) {
        Solution solution = new ImplementStrstr().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        char[] hChars = haystack.toCharArray();
        char[] nChars = needle.toCharArray();
        int[] next = getNext(needle);
        int j = -1;
        for( int i = 0;i < haystack.length();i++ ){
            while( j >= 0 && hChars[i] != nChars[j+1] ){
                j = next[j];
            }
            if( hChars[i] == nChars[j+1] ){
                j++;
            }
            if( j+1 == nChars.length ){
                return i - nChars.length + 1;
            }
        }
        return -1;
    }

    public int[] getNext(String str){
        char[] chars = str.toCharArray();
        int[] next = new int[chars.length];
        int j = -1;
        next[0] = j;

        for( int i = 1; i < chars.length;i++ ){
            while( j >= 0 && chars[i] != chars[j+1] ){
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