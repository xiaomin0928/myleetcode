//Given two strings s and t, return true if t is an anagram of s, and false 
//otherwise. 
//
// An Anagram is a word or phrase formed by rearranging the letters of a 
//different word or phrase, typically using all the original letters exactly once. 
//
// 
// Example 1: 
// Input: s = "anagram", t = "nagaram"
//Output: true
// 
// Example 2: 
// Input: s = "rat", t = "car"
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s and t consist of lowercase English letters. 
// 
//
// 
// Follow up: What if the inputs contain Unicode characters? How would you 
//adapt your solution to such a case? 
//
// Related Topics 哈希表 字符串 排序 👍 619 👎 0


package leetcode.editor.cn.Hash;

import java.util.ArrayList;

class ValidAnagram{
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        //solution 1: sort
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);

        //solution 2: hash map
        Map<Character,Integer> map = new HashMap<>();
        for(char sChar: s.toCharArray()){
            map.put(sChar,map.getOrDefault(sChar,0)+1);
        }
        for(char tChar: t.toCharArray()){
            Integer count = map.get(tChar);
            if( count == null ){
                return false;
            }else if( count > 1 ){
                map.put(tChar,count-1);
            }else{
                map.remove(tChar);
            }
        }
        return map.isEmpty();
        */
        //solution 3
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for(char c: s.toCharArray()){
            sCounts[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            tCounts[c - 'a']++;
        }
        for(int i = 0;i<sCounts.length;i++){
            if( sCounts[i] != tCounts[i] ){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}