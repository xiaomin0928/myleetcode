<p>Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code><em> if </em><code>ransomNote</code><em> can be constructed by using the letters from </em><code>magazine</code><em> and </em><code>false</code><em> otherwise</em>.</p>

<p>Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<pre><strong>Input:</strong> ransomNote = "a", magazine = "b"
<strong>Output:</strong> false
</pre>
<p><strong>Example 2:</strong></p> 
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "ab"
<strong>Output:</strong> false
</pre>
<p><strong>Example 3:</strong></p> 
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "aab"
<strong>Output:</strong> true
</pre> 
<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters.</li> 
</ul>

<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>计数</li></div></div><br><div><li>👍 403</li><li>👎 0</li></div>

#### 解题思路
<ul> 
<li>定义数组record[26] = {0},统计magazine字符串中字符的个数：record[i-'a']++</li>
<li>遍历ransomNote字符串，减少record中对应字母的数量:record[i-'a']--</li>
<li>检查record中是否存在 < 0 的元素，如果存在就说明无法在magazine中找到该字母，return false，反之，return true</li>
</ul>
