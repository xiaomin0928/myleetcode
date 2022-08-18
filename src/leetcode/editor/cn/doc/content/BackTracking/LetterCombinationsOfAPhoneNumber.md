<p>Given a string containing digits from <code>2-9</code> inclusive, return all possible letter combinations that the number could represent. Return the answer in <strong>any order</strong>.</p>

<p>A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.</p> 
<img alt="" src="https://assets.leetcode.com/uploads/2022/03/15/1200px-telephone-keypad2svg.png" style="width: 300px; height: 243px;" /> 
<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> digits = "23"
<strong>Output:</strong> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> digits = ""
<strong>Output:</strong> []
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> digits = "2"
<strong>Output:</strong> ["a","b","c"]
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>0 &lt;= digits.length &lt;= 4</code></li> 
 <li><code>digits[i]</code> is a digit in the range <code>['2', '9']</code>.</li> 
</ul>

<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>回溯</li></div></div><br><div><li>👍 2061</li><li>👎 0</li></div>

#### 解题思路
电话按键组合
<ul>
 <li>回溯算法</li>
 <li>参数：digits, index</li>
 <li>结束条件：item.size == index, return res</li>
 <li>构造字母和数字的映射，前两个位置为“”，由于1没有字母对应，数组的index从0开始，每个item是个SringBuffer</li>
 <li>首先获取字母对应的字符串：str = lettersMap[digits.charAt(index)-'0']</li>
 <li>for循环横向展开，展开的范围：str.length，递归函数向下遍历，index+1</li>
</ul>