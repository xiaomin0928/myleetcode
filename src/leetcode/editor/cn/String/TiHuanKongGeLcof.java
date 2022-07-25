//English description is not available for the problem. Please switch to 
//Chinese. 
//
// Related Topics 字符串 👍 319 👎 0


package leetcode.editor.cn.String;

class TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        /*
        //solution1: copy to a new string
        if( s == null ){
            return null;
        }
        StringBuffer str = new StringBuffer();
        for( int i = 0; i < s.length();i++ ){
            if( s.charAt(i) == ' ' ){
                str.append("%20");
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
         */
        //solution2: double pointer
        if( s == null ){
            return null;
        }
        StringBuffer str = new StringBuffer();
        for( int i = 0; i < s.length();i++ ){
            if( s.charAt(i) == ' ' ){
                str.append("  "); //double whitespace
            }
        }
        s += str.toString();
        char[] cStr = s.toCharArray();
        int left = s.length() - str.length() - 1;
        int right = s.length() - 1;
        while( left >= 0 ){
            if( cStr[left] == ' ' ){
                cStr[right--] = '0';
                cStr[right--] = '2';
                cStr[right] = '%';
            }else{
                cStr[right] = cStr[left];
            }
            left--;
            right--;
        }
        return new String(cStr);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}