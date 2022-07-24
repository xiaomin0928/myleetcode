//Given two strings ransomNote and magazine, return true if ransomNote can be 
//constructed by using the letters from magazine and false otherwise. 
//
// Each letter in magazine can only be used once in ransomNote. 
//
// 
// Example 1: 
// Input: ransomNote = "a", magazine = "b"
//Output: false
// 
// Example 2: 
// Input: ransomNote = "aa", magazine = "ab"
//Output: false
// 
// Example 3: 
// Input: ransomNote = "aa", magazine = "aab"
//Output: true
// 
// 
// Constraints: 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote and magazine consist of lowercase English letters. 
// 
//
// Related Topics 哈希表 字符串 计数 👍 403 👎 0


package leetcode.editor.cn.Hash;

class RansomNote{
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];

        if( magazine.length() < ransomNote.length() ){
            return false;
        }
        // record the amount of alphabet in magazine
        for( int i: magazine.toCharArray() ){
            record[ i - 'a' ]++;
        }
        // find the alphabet of ransomNote in the magazine
        for( int i: ransomNote.toCharArray() ){
            record[ i - 'a' ]--;
        }
        // check if the record has the value < 0
        for( int i: record ){
            if( i < 0 ){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}