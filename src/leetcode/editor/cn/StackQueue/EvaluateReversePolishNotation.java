//Evaluate the value of an arithmetic expression in Reverse Polish Notation. 
//
// Valid operators are +, -, *, and /. Each operand may be an integer or 
//another expression. 
//
// Note that division between two integers should truncate toward zero. 
//
// It is guaranteed that the given RPN expression is always valid. That means 
//the expression would always evaluate to a result, and there will not be any 
//division by zero operation. 
//
// 
// Example 1: 
//
// 
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
// 
//
// Example 2: 
//
// 
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
// 
//
// Example 3: 
//
// 
//Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//Output: 22
//Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22
// 
//
// 
// Constraints: 
//
// 
// 1 <= tokens.length <= 10⁴ 
// tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the 
//range [-200, 200]. 
// 
//
// Related Topics 栈 数组 数学 👍 583 👎 0


package leetcode.editor.cn.StackQueue;
import java.util.ArrayDeque;
import java.util.Deque;

class EvaluateReversePolishNotation{
    public static void main(String[] args) {
        Solution solution = new EvaluateReversePolishNotation().new Solution();
        // TO TEST
        String[] s = {"2","1","+","3","*"};
        solution.evalRPN(s);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res;
        for( int i = 0; i < tokens.length;i++ ){
            if( tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/") ){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if( tokens[i].equals("+") ){
                    stack.push(num1 + num2);
                }else if( tokens[i].equals("-") ){
                    stack.push(num1 - num2);
                }else if( tokens[i].equals("*")){
                    stack.push(num1 * num2);
                }else if( tokens[i].equals("/") ){
                    stack.push(num1 / num2);
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        res = stack.pop();
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}