//Given an input string s, reverse the order of the words. 
//
// A word is defined as a sequence of non-space characters. The words in s will 
//be separated by at least one space. 
//
// Return a string of the words in reverse order concatenated by a single space.
// 
//
// Note that s may contain leading or trailing spaces or multiple spaces 
//between two words. The returned string should only have a single space separating the 
//words. Do not include any extra spaces. 
//
// 
// Example 1: 
//
// 
//Input: s = "the sky is blue"
//Output: "blue is sky the"
// 
//
// Example 2: 
//
// 
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing 
//spaces.
// 
//
// Example 3: 
//
// 
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single 
//space in the reversed string.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s contains English letters (upper-case and lower-case), digits, and spaces ' 
//'. 
// There is at least one word in s. 
// 
//
// 
// Follow-up: If the string data type is mutable in your language, can you 
//solve it in-place with O(1) extra space? 
//
// Related Topics 双指针 字符串 👍 602 👎 0


package leetcode.editor.cn.String;

class ReverseWordsInAString{
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAString().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        /*
        //solution1: copy to a new string
        char[] cStr = s.toCharArray();
        char[] newcStr = new char[cStr.length+1]; //one more space for whitespace

        int i = cStr.length - 1;
        int k = 0;
        while( i >= 0 ){
            while( i >=0 && cStr[i] == ' ' ) i--;
            int boundary = i;
            while( i >= 0 && cStr[i] != ' ' ) i--;
            for( int j = i + 1; j <= boundary; j++){
                newcStr[k++] = cStr[j];
                if( j == boundary){
                    newcStr[k++] = ' ';
                }
            }
        }
        return new String(newcStr,0,k-1); // remove last whitespace
        */
        //solution2
        //1.reverse the whole string
        //2.reverse each word
        //3.remove whitespace
        char[] cStr = s.toCharArray();

        reverseStr(cStr,0,cStr.length - 1);
        reverseWord(cStr);
        return cleanSpace(cStr);
    }
    public void reverseStr(char[] chars,int start,int end){
        int left = start;
        int right = end;
        while( left < right ){
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
    }
    public void reverseWord(char[] chars){
        int i = chars.length - 1;
        while( i >= 0 ){
            while( i >= 0 && chars[i] == ' ' ) i--;
            int boundray = i;
            while( i >= 0 && chars[i] != ' ' ) i--;
            reverseStr(chars,i+1,boundray);
        }
    }
    public String cleanSpace(char[] chars){
        int i = 0;
        int j = 0;
        int len = chars.length;
        while( j < len ){
            while( j < len && chars[j] == ' ') j++; // remove space before word
            while( j < len && chars[j] != ' ' ) chars[i++] = chars[j++];
            while( j < len && chars[j] == ' ') j++; //remove space after word
            if( j < len ) chars[i++] = ' ';
        }
        return new String(chars,0,i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}