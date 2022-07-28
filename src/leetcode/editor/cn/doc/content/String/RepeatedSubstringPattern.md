<p>Given a string <code>s</code>, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "abab"
<strong>Output:</strong> true
<strong>Explanation:</strong> It is the substring "ab" twice.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "aba"
<strong>Output:</strong> false
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "abcabcabcabc"
<strong>Output:</strong> true
<strong>Explanation:</strong> It is the substring "abc" four times or the substring "abcabc" twice.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>s</code> consists of lowercase English letters.</li> 
</ul>

<div><div>Related Topics</div><div><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 740</li><li>👎 0</li></div>

#### 解题思路
KMP算法  
当出现字符串不匹配时，可以知道一部分之前已经匹配的文本内容，可以利用这些信息避免从头再去做匹配了
<ul>
 <li>构造next数组</li>
 <li>判断是否由重复子字符串的条件：next[len-1]!=-1 && len%(len-(next[len-1]+1))==0</li>
 <li>数组长度减去最长相同前后缀的长度相当于是第一个周期的长度，也就是一个周期的长度，如果这个周期可以被整除，就说明整个数组就是这个周期的循环</li>
</ul>