<p>Write a function that reverses a string. The input string is given as an array of characters <code>s</code>.</p>

<p>You must do this by modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> with <code>O(1)</code> extra memory.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<pre><strong>Input:</strong> s = ["h","e","l","l","o"]
<strong>Output:</strong> ["o","l","l","e","h"]
</pre>
<p><strong>Example 2:</strong></p> 
<pre><strong>Input:</strong> s = ["H","a","n","n","a","h"]
<strong>Output:</strong> ["h","a","n","n","a","H"]
</pre> 
<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>s[i]</code> is a <a href="https://en.wikipedia.org/wiki/ASCII#Printable_characters" target="_blank">printable ascii character</a>.</li> 
</ul>

<div><div>Related Topics</div><div><li>递归</li><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 624</li><li>👎 0</li></div>

#### 解题思路
<ul> 
 <li>分别使用i,j代表首尾的index，交换两个元素之后，不断向中间移动</li>
 <li>while( i < j )</li>
</ul>