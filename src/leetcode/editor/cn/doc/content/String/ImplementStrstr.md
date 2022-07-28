<p>Implement <a href="http://www.cplusplus.com/reference/cstring/strstr/" target="_blank">strStr()</a>.</p>

<p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.</p>

<p><strong>Clarification:</strong></p>

<p>What should we return when <code>needle</code> is an empty string? This is a great question to ask during an interview.</p>

<p>For the purpose of this problem, we will return 0 when <code>needle</code> is an empty string. This is consistent to C's <a href="http://www.cplusplus.com/reference/cstring/strstr/" target="_blank">strstr()</a> and Java's <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)" target="_blank">indexOf()</a>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> haystack = "hello", needle = "ll"
<strong>Output:</strong> 2
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> haystack = "aaaaa", needle = "bba"
<strong>Output:</strong> -1
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li> 
</ul>

<div><div>Related Topics</div><div><li>双指针</li><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 1512</li><li>👎 0</li></div>


#### 解题思路
KMP算法  
当出现字符串不匹配时，可以知道一部分之前已经匹配的文本内容，可以利用这些信息避免从头再去做匹配了
<ul>
 <li>构造next数组：每个元素是下标i之前（包括i）的字符串中，相同前缀后缀的长度 - 1</li>
 <li>j是next数组的下标，从-1开始，i是模式串数组的下标，从1开始，比较s[i]和s[i+1]，不相等时，回溯到上一次前后缀相同的位置：j=next[j];如果相同，移动j:j++</li>
 <li>遍历文本串haystack和模式串needle，如果不匹配，j回溯到上一次匹配的位置：j=next[j]；如果相同，移动j:j++;j+1移动到模式串needle的末尾时，存在匹配的子串，返回i-needle.length+1</li>
</ul>
