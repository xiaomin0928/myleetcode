//English description is not available for the problem. Please switch to 
//Chinese. 
//
// Related Topics 数学 双指针 字符串 👍 274 👎 0


package leetcode.editor.cn.String;

class ZuoXuanZhuanZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] cStr = s.toCharArray();
        reverse(cStr,0,n-1);
        reverse(cStr,n,cStr.length-1);
        reverse(cStr,0,cStr.length-1);
        return new String(cStr);
    }
    public void reverse(char[] chars,int start,int end){
        while( start < end ){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}