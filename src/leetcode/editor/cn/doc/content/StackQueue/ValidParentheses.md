<p>Given a string <code>s</code> containing just the characters <code>'('</code>, <code>')'</code>, <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol> 
 <li>Open brackets must be closed by the same type of brackets.</li> 
 <li>Open brackets must be closed in the correct order.</li> 
</ol>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "()[]{}"
<strong>Output:</strong> true
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "(]"
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li> 
</ul>

<div><div>Related Topics</div><div><li>栈</li><li>字符串</li></div></div><br><div><li>👍 3425</li><li>👎 0</li></div>

#### 解题思路
<ul> 
 <li>使用栈来检查括号是否匹配</li>
 <li>遇到左括号时，把对应的右括号放入栈</li>
 <li>遇到右括号时，如果和栈顶的元素不相同，或者栈为空，则不匹配</li>
 <li>遍历完所有的字符串之后，判断栈是否为空，为空则匹配，否则不匹配</li>
</ul>